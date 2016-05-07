package MIPS;

import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lagoon0o0 on 5/5/16.
 */
public class RISCTranslator implements Visitor{
    FunctionBlock curFunc;
    BasicBlock nextBlock;
    PrintStream out;
    public RISCTranslator(PrintStream anOut) {
        out = anOut;
    }
    int depth = 0;
    String indent(int length) {
        String ret = "";
        for(int i = 1; i <= length; ++i)
            ret+="\t";
        return ret;
    }
    void print(String content) {
        out.print(indent(depth)+content + "\n");
    }
    void printInst(String opcode, Value dest, Value src1, Value src2) {
        print(opcode + " " + dest.toString() + ", " + src1.toString() + ", " + src2.toString());
    }
    void printInst(String opcode, Value dest, Value src1) {
        // ignore when move dest == src
        if(opcode.equals("move") && dest == src1)
            return;
        print(opcode + " " + dest.toString() + ", " + src1.toString());
    }
    void printInst(String opcode,  Value src1) {
        print(opcode + " "  + src1.toString());
    }
    void printInst(String opcode,  Value src1, Value src2, String label) {
        print(opcode + " "  + src1.toString() + ", " + src2.toString() + ", " + label);
    }
    void printInst(String opcode,  String label) {
        print(opcode + " "  + label);
    }
    void printPara(String opcode, Value src,ImmediateNumber offset, Value addr) {
        if(offset.value !=  0|| addr instanceof PhysicalRegister)
            print(opcode + " " + src.toString() + ", "+offset.toString() +  "(" + addr.toString() + ")");
        else {
            printInst(opcode, src, addr);
        }
    }
    Value curVal;

    static final int PhyRegOnly = 0;
    static final int ImmOrPhyReg = 1;

    // load immediate number and static data to curReg
    public void getValue(Value ctx, int state) {
        if(state != PhyRegOnly && state != ImmOrPhyReg)
            throw new RuntimeException("invalid state");
        if(ctx instanceof ImmediateNumber) {
            if(state == PhyRegOnly)
                printInst("li",curVal,ctx);
            else if(state == ImmOrPhyReg) {
                curVal = ctx;
            }
        } else if(ctx instanceof StaticData){
            printInst("la",curVal,ctx);
        } else if(ctx instanceof FrameAddr) {
            printInst("lw",curVal,ctx);
        } else if(ctx instanceof PhysicalRegister){
            curVal = ctx;
        } else {
            throw new RuntimeException("Invalid value trans");
        }
    }
    // get the corresponding physicalregister
    public void getPhyRegister(Value ctx) {
        if(ctx instanceof PhysicalRegister) {
            if (ctx != FunctionBlock.useless)
                curVal = ctx;
        } else if(ctx instanceof StaticData) {

        } else if(ctx instanceof FrameAddr) {

        } else  {
            throw new RuntimeException("invalid PhysicalRegister"+ctx.toString());
        }
    }

    // store reg to staticData or FrameAddr val
    public void storeValue(PhysicalRegister reg, Value val) {
        if(val instanceof StaticData) {
            printInst("sw", reg, val);
        } else if(val instanceof FrameAddr) {
            printInst("sw", reg, val);
        } else if(val instanceof PhysicalRegister) {
            throw new RuntimeException("invalid store");
        } else if(val instanceof ImmediateNumber)
            throw new RuntimeException("invalid store");
    }

    // move src to dest using temp
    public void moveValue(Value dest, PhysicalRegister src) {
        if(dest instanceof PhysicalRegister) {
            if(dest != FunctionBlock.useless)
                printInst("move",dest,src);
        } else if(dest instanceof  StaticData) {
            storeValue(src,dest);
        } else if (dest instanceof FrameAddr) {
            storeValue(src,dest);
        } else {
            print("haha " + dest.toString());
            throw new RuntimeException("Invalid move");
        }
    }

    PhysicalRegister callDest;
    public void backupReg(PhysicalRegister reg) {
        printInst("sw",reg,curFunc.frame.get(reg));
    }
    public void restoreReg(PhysicalRegister reg) {
        if(callDest != reg)
            printInst("lw",reg,curFunc.frame.get(reg));
    }
    // unescape the string s
    private String unescape(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\\') {
                sb.append(s.charAt(i));
            } else {
                ++i;
                switch (s.charAt(i)) {
                    case 't': sb.append('\t'); break;
                    case 'n': sb.append('\n'); break;
                    case 'r': sb.append('\r'); break;
                    case '\'':sb.append('\''); break;
                    case '"': sb.append('"');  break;
                    case '\\':sb.append('\\'); break;
                    default: sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }


    @Override
    public void visit(AllocInstruction ctx) {

        print("#" + ctx.toString());
        // size has to be a PhysicalRegister
        curVal = FunctionBlock.t[0];
        getValue(ctx.size, PhyRegOnly);
        PhysicalRegister size = (PhysicalRegister) curVal;

        // get dest
        curVal = FunctionBlock.t[0];
        getPhyRegister(ctx.destination);
        PhysicalRegister dest = (PhysicalRegister) curVal;

        //set call destination
        callDest = dest;

        //back up PhysicalRegister a[0] v[0]
        backupReg(FunctionBlock.v[0]);
        backupReg(FunctionBlock.a[0]);

        //system call sbrk
        printInst("move",FunctionBlock.a[0],size);
        printInst("li", FunctionBlock.v[0], new ImmediateNumber(9));
        print("syscall");

        // move return value to destination
        moveValue(ctx.destination,FunctionBlock.v[0]);

        // restore a[0] v[0]
        restoreReg(FunctionBlock.v[0]);
        restoreReg(FunctionBlock.a[0]);

    }

    @Override
    public void visit(BasicBlock ctx) {

        print(ctx.getName() + ":");
        depth++;
        ctx.list.stream().forEachOrdered(this::visit);
        depth--;
    }

    @Override
    public void visit(BinaryInstruction ctx) {
        print("#" + ctx.toString());
        // src1 has to be a PhysicalRegister
        curVal = FunctionBlock.t[0];
        getValue(ctx.source1, PhyRegOnly);
        PhysicalRegister src1 = (PhysicalRegister) curVal;

        // src2 can be either immediate number or PhysicalRegister
        curVal = FunctionBlock.t[1];
        getValue(ctx.source2, ImmOrPhyReg);
        Value src2 = curVal;

        //get Opcode
        String opcode = ctx.opCode.toString();
        if(opcode.equals("shl"))
            opcode = "sll";
        else if(opcode.equals("shr"))
            opcode = "sra";

        //get destination
        curVal = FunctionBlock.t[0];
        getPhyRegister(ctx.destination);
        PhysicalRegister dest = (PhysicalRegister) curVal;

        // print instruction
        printInst(opcode,dest,src1,src2);

        // move the destination value
        moveValue(ctx.destination, (PhysicalRegister) dest);

    }

    @Override
    public void visit(BranchInstruction ctx) {
        print("#" + ctx.toString());
        // condition can be either immediate number or PhysicalRegister
        curVal = FunctionBlock.t[0];
        getValue(ctx.condition, ImmOrPhyReg);
        Value cond = curVal;

        // print instruction
        if(ctx.ifFalse == nextBlock) {
            printInst("beq",cond, new ImmediateNumber(1), ctx.ifTrue.getName());
        } else if(ctx.ifTrue == nextBlock) {
            printInst("beq",cond, new ImmediateNumber(0), ctx.ifFalse.getName());
        } else {
            printInst("beq",cond, new ImmediateNumber(1), ctx.ifTrue.getName());
            printInst("j",ctx.ifFalse.getName());
        }


    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        print("#" + ctx.toString());
        // src1 has to be a PhysicalRegister
        curVal = FunctionBlock.t[0];
        getValue(ctx.source1, PhyRegOnly);
        PhysicalRegister src1 = (PhysicalRegister) curVal;

        // src2 can be either immediate number or PhysicalRegister
        curVal = FunctionBlock.t[1];
        getValue(ctx.source2, ImmOrPhyReg);
        Value src2 = curVal;

        //get Opcode
        String opcode = ctx.opCode.toString();

        //get destination
        curVal = FunctionBlock.t[0];
        getPhyRegister(ctx.destination);
        PhysicalRegister dest = (PhysicalRegister) curVal;

        // print instruction
        printInst(opcode,dest,src1,src2);

        // move the destination value
        moveValue(ctx.destination, (PhysicalRegister) dest);
    }

    @Override
    public void visit(VoidValue ctx) {

    }

    @Override
    public void visit(StaticString ctx) {
        print(".data");
        print(ctx.toString() + ":");
        depth++;
        print(".word" + " " + unescape(ctx.content).length());
        print(".asciiz" + " " + "\"" + ctx.content + "\"");
        print(".align 2");
        depth--;
    }

    @Override
    public void visit(StaticSpace ctx) {
        print(".data");
        print(ctx.toString() + ":");
        depth++;
        print(".space" + " " + ctx.size.toString());
        print(".align 2");
        depth--;
    }

    @Override
    public void visit(IRRoot ctx) {
        ctx.staticDatas.stream().forEachOrdered(this::visit);
        ctx.func.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(UnaryInstruction ctx) {
        print("#" + ctx.toString());
        // source has to be a PhysicalRegister
        curVal = FunctionBlock.t[0];
        getValue(ctx.source, PhyRegOnly);
        PhysicalRegister src = (PhysicalRegister) curVal;

        //get Opcode
        String opcode = ctx.opCode.toString();

        //get destination
        curVal = FunctionBlock.t[0];
        getPhyRegister(ctx.destination);
        PhysicalRegister dest = (PhysicalRegister) curVal;

        // print instruction
        printInst(opcode,dest,src);

        // move the destination value
        moveValue(ctx.destination, (PhysicalRegister) dest);


    }

    @Override
    public void visit(StoreInstruction ctx) {

        print("#" + ctx.toString());
        // source has to be a PhysicalRegister
        curVal = FunctionBlock.t[0];
        getValue(ctx.source, PhyRegOnly);
        PhysicalRegister src = (PhysicalRegister) curVal;


        // get the address
        Value addr;
        // if offset=0 then address can be static or immediate number
        if(ctx.offset.value == 0) {
            addr = ctx.address;
        } else {
        // if offset != 0 then address can only be PhysicalRegister
            curVal = FunctionBlock.t[1];
            getValue(ctx.address, PhyRegOnly);
            addr = curVal;
        }

        // get Opcode
        String opCode;
        switch (ctx.size.value) {
            case 1:
                opCode = "sb";
                break;
            case 4:
                opCode = "sw";
                break;
            default:
                throw new RuntimeException("Invalid Store size");
        }

        // print instruction
        printPara(opCode,src,ctx.offset,addr);
    }

    @Override
    public void visit(ReturnInstruction ctx) {
        print("#" + ctx.toString());
        // load the value to v[0]
        if(!(ctx.value instanceof VoidValue)){
            curVal = FunctionBlock.v[0];
            getValue(ctx.value, PhyRegOnly);
            moveValue(FunctionBlock.v[0],(PhysicalRegister) curVal);
        }
        // print instruction
        print("j " + "__" + curFunc.function.getName() + "_return_");
    }

    @Override
    public void visit(PhysicalRegister ctx) {

    }

    @Override
    public void visit(VirtualRegister ctx) {

    }

    @Override
    public void visit(MoveInstruction ctx) {
        print("#" + ctx.toString());

        if(ctx.destination == FunctionBlock.useless) {
            return;
        }
        //get destination
        curVal = FunctionBlock.t[0];
        getPhyRegister(ctx.destination);
        PhysicalRegister dest = (PhysicalRegister) curVal;

        //print instruction
        if(ctx.source instanceof ImmediateNumber) {
            printInst("li",dest,ctx.source);
        } else if(ctx.source instanceof StaticData) {
            printInst("la",dest,ctx.source);
        } else if(ctx.source instanceof FrameAddr) {
            printInst("lw",dest,ctx.source);
        } else if(ctx.source instanceof PhysicalRegister){
            printInst("move",dest,ctx.source);
        } else {
            throw new RuntimeException("Invalid move");
        }

        //move dest to destination
        moveValue(ctx.destination,dest);
    }

    @Override
    public void visit(LoadInstruction ctx) {
        print("#" + ctx.toString());
        // get the address
        Value addr;
        // if offset=0 then address can be static or immediate number
        if(ctx.offset.value == 0) {
            addr = ctx.address;
        } else {
            // if offset != 0 then address can only be PhysicalRegister
            curVal = FunctionBlock.t[0];
            getValue(ctx.address, PhyRegOnly);
            addr = curVal;
        }

        //get destination
        curVal = FunctionBlock.t[0];
        getPhyRegister(ctx.destination);
        PhysicalRegister dest = (PhysicalRegister) curVal;

        // get Opcode
        String opCode;
        switch (ctx.size.value) {
            case 1:
                opCode = "lb";
                break;
            case 4:
                opCode = "lw";
                break;
            default:
                throw new RuntimeException("Invalid Load size");
        }

        // print instruction
        printPara(opCode,dest,ctx.offset,addr);

        // move dest to destination
        moveValue(ctx.destination, dest);

    }

    @Override
    public void visit(JumpInstruction ctx) {
        print("#" + ctx.toString());
        if(ctx.destination != nextBlock)
            printInst("j",ctx.destination.getName());
    }

    @Override
    public void visit(IR ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(ImmediateNumber ctx) {

    }

    @Override
    public void visit(FunctionCallInstruction ctx) {
        print("#" + ctx.toString());
        // get dest
        PhysicalRegister dest;
        if(ctx.destination != null) {
            curVal = FunctionBlock.t[0];
            getPhyRegister(ctx.destination);
            dest = (PhysicalRegister) curVal;
        } else {
            dest = null;
        }

        //set call destination
        callDest = dest;


        Set<PhysicalRegister> outSet = new HashSet<>();

        // calculate the outSet of physical PhysicalRegister
        ctx.out.stream().map(curFunc::getVirtualRegister)
                .map(curFunc::getPhysicalRegister)
                .filter(x ->  x instanceof PhysicalRegister)
                .forEachOrdered(x->outSet.add((PhysicalRegister)x));

        // backup caller registers
        for(int i = 0; i <= 9; ++i) {
            if(outSet.contains(FunctionBlock.t[i])
                    && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.t[i])
                    ) {
                backupReg(FunctionBlock.t[i]);
            }
        }
        for(int i = 0; i <= 3; ++i) {
            if(outSet.contains(FunctionBlock.a[i])
                    && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.a[i])
                    || ctx.argumentList.size() > i
                    ) {
                backupReg(FunctionBlock.a[i]);
            }
        }
        if(outSet.contains(FunctionBlock.fp)
                && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.fp)
                ) {
            backupReg(FunctionBlock.fp);
        }
        for(int i = 0; i <= 1; ++i) {
            if(outSet.contains(FunctionBlock.v[i])
                    && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.v[i])
                    ) {
                backupReg(FunctionBlock.v[i]);
            }
        }

        // load the arguments
        for(int i = 0; i < ctx.argumentList.size(); ++i) {
            Value cur = ctx.argumentList.get(i);
            boolean clean = true;
            for(int j = 0; j < i && j <= 3; ++j) {
                if(cur == FunctionBlock.a[j])
                    clean = false;
            }
            if(!clean) {
                print("#" + i + " " + cur.toString()+" is dirty ->" + curFunc.frame.get((PhysicalRegister) cur).toString());
                cur = curFunc.frame.get((PhysicalRegister) cur);
            }
            if(i <= 3) {
                // load the data to a[i]
                if(cur instanceof PhysicalRegister) {
                    moveValue(FunctionBlock.a[i],(PhysicalRegister)cur);
                } else if(cur instanceof ImmediateNumber){
                    printInst("li",FunctionBlock.a[i],cur);
                } else if(cur instanceof StaticData) {
                    printInst("la",FunctionBlock.a[i],cur);
                } else if(cur instanceof FrameAddr) {
                    printInst("lw",FunctionBlock.a[i],cur);
                }
            } else {
                // load the data to stack
                int delta = ctx.function.functionBlock.frame.get(ctx.function.functionBlock.argumentList.get(i)).offset - ctx.function.functionBlock.frame.getSize();
                if(cur instanceof PhysicalRegister) {
                    storeValue((PhysicalRegister) cur, new FrameAddr(delta));
                } else if(cur instanceof ImmediateNumber){
                    curVal = FunctionBlock.t[0];
                    getValue(cur,PhyRegOnly);
                    storeValue((PhysicalRegister) curVal, new FrameAddr(delta));
                } else if(cur instanceof StaticData) {
                    curVal = FunctionBlock.t[0];
                    getValue(cur,PhyRegOnly);
                    storeValue((PhysicalRegister) curVal, new FrameAddr(delta));
                } else if(cur instanceof  FrameAddr) {
                    curVal = FunctionBlock.t[0];
                    getValue(cur,PhyRegOnly);
                    storeValue((PhysicalRegister) curVal, new FrameAddr(delta));
                }
            }
        }

        // print the call
        if(ctx.function.getName().equals("main")) {
            printInst("jal", ctx.function.getName());
        } else {
            printInst("jal","func_" + ctx.function.getName());
        }

        // move return value to destination
        if(ctx.destination != null)
            moveValue(ctx.destination,FunctionBlock.v[0]);


        //restore caller registers
        for(int i = 0; i <= 9; ++i) {
            if(outSet.contains(FunctionBlock.t[i])
                    && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.t[i])
                    ) {
                restoreReg(FunctionBlock.t[i]);
            }
        }
        for(int i = 0; i <= 3; ++i) {
            if(outSet.contains(FunctionBlock.a[i])
                    && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.a[i])
                    ) {
                restoreReg(FunctionBlock.a[i]);
            }
        }
        if(outSet.contains(FunctionBlock.fp)
                && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.fp)
                ) {
            restoreReg(FunctionBlock.fp);
        }
        for(int i = 0; i <= 1; ++i) {
            if(outSet.contains(FunctionBlock.v[i])
                    && ctx.function.functionBlock.usedPhysicalRegister.contains(FunctionBlock.v[i])
                    ) {
                restoreReg(FunctionBlock.v[i]);
            }
        }

    }
    public Register calc(Register ctx) {
        return curFunc.getPhysicalRegister(ctx);
    }
    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        // print func name
        print(".text");
        if(ctx.function.getName().equals("main")) {
            print(".globl main");
            print(ctx.function.getName() + ":");
        } else {
            print("func_" + ctx.function.getName() + ":");
        }
        curFunc = ctx;
        depth++;
        // move the sp
        printInst("sub", FunctionBlock.sp, FunctionBlock.sp,new ImmediateNumber(ctx.frame.getSize()));
        backupReg(FunctionBlock.ra);
        // backup the callee registers
        for(int i = 0; i <= 7; ++i) {
            if(ctx.usedPhysicalRegister.contains(FunctionBlock.s[i]))
                backupReg(FunctionBlock.s[i]);
        }
        // get the argumentlist
        for(int i = 4; i < ctx.argumentList.size(); ++i) {
            Register cur = ctx.argumentList.get(i);
            Register phy = calc(cur);
            if(phy instanceof PhysicalRegister) {
                printInst("lw",phy, curFunc.frame.get(cur));
            }
        }


        // visit the basic block list
        for(int i = 0; i < ctx.basicBlockList.size(); ++i) {
            if(i < ctx.basicBlockList.size() - 1) {
                nextBlock = ctx.basicBlockList.get(i + 1);
            }
            visit(ctx.basicBlockList.get(i));
        }

        print("__" + ctx.function.getName() + "_return_:");
        // restore the callee registers

        for(int i = 0; i <= 7; ++i) {
            if(ctx.usedPhysicalRegister.contains(FunctionBlock.s[i]))
                restoreReg(FunctionBlock.s[i]);
        }

        // move the sp restore the ra
        restoreReg(FunctionBlock.ra);
        printInst("add", FunctionBlock.sp, FunctionBlock.sp,new ImmediateNumber(ctx.frame.getSize()));
        printInst("jr",FunctionBlock.ra);
        depth--;
    }
}
