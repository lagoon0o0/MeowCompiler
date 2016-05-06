package MIPS;

import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lagoon0o0 on 5/2/16.
 */
public class CISCTranslator extends Translator{
    boolean global = true;
    PrintStream out;
    FunctionBlock curFunction;
    Value curValue;
    public CISCTranslator(PrintStream anOut) {
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
        out.print(content + "\n");
    }
    void printInst(String opcode, Value dest, Value src1, Value src2) {
        print(opcode + " " + dest.toString() + ", " + src1.toString() + ", " + src2.toString());
    }
    void printInst(String opcode, Value dest, Value src1) {
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
        if(offset.value !=  0|| addr instanceof Register)
            print(opcode + " " + src.toString() + ", "+offset.toString() +  "(" + addr.toString() + ")");
        else {
                printInst(opcode, src, addr);
            }
    }
    @Override
    public void visit(AllocInstruction ctx) {
        curValue = t[0];
        //visit(ctx.destination);
        Value dest =  curValue;

        curValue = t[1];
        if(ctx.size instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.size);
        } else if(ctx.size instanceof StaticData) {
            printInst("la",curValue,ctx.size);
        } else {
            visit(ctx.size);
        }
        Value size = curValue;
        printInst("li",v[0],new ImmediateNumber(9));
        printInst("move",a[0],size);

        print("syscall");
        printInst("sw",v[0],curFunction.frame.get(ctx.destination));
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
        curValue = t[0];
        //visit(ctx.destination);
        Value dest = curValue;

        curValue = t[1];
        if(ctx.source1 instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.source1);
        } else if (ctx.source1 instanceof StaticData){
            printInst("la",curValue,ctx.source1);
        } else {
            visit(ctx.source1);
        }
        Value src1 = curValue;

        curValue = t[2];
        visit(ctx.source2);
        Value src2 = curValue;


        String opcode = ctx.opCode.toString();
        if(opcode.equals("shl"))
            opcode = "sll";
        else if(opcode.equals("shr"))
            opcode = "sra";

        printInst(opcode,dest,src1,src2);
        printInst("sw",dest,curFunction.frame.get(ctx.destination));
    }

    @Override
    public void visit(BranchInstruction ctx) {
        curValue = t[0];
        visit(ctx.condition);
        Value cond = curValue;
        printInst("beq",curValue,new ImmediateNumber(1),ctx.ifTrue.getName());
        printInst("j",ctx.ifFalse.getName());
    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        curValue = t[0];
        //visit(ctx.destination);
        Value dest = curValue;

        curValue = t[1];
        if(ctx.source1 instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.source1);
        } else if (ctx.source1 instanceof StaticData){
            printInst("la",curValue,ctx.source1);
        } else {
            visit(ctx.source1);
        }
        Value src1 = curValue;

        curValue = t[2];
        visit(ctx.source2);
        Value src2 = curValue;

        String opcode = ctx.opCode.toString();
        printInst(opcode,dest,src1,src2);
        printInst("sw",dest,curFunction.frame.get(ctx.destination));
    }

    @Override
    public void visit(IRRoot ctx) {
        ctx.staticDatas.stream().forEachOrdered(this::visit);
        global = false;
        ctx.func.stream().forEachOrdered(this::visit);
        global = true;
    }
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
    public void visit(StaticString ctx) {
        if(global) {
            print(".data");
            print(ctx.toString() + ":");
            depth++;
            print(".word" + " " + unescape(ctx.content).length());
            print(".asciiz" + " " + "\"" + ctx.content + "\"");
            print(".align 2");
            depth--;
        } else {
            curValue = ctx;
        }

    }

    @Override
    public void visit(VoidValue ctx) {

    }

    @Override
    public void visit(StaticSpace ctx) {
        if(global) {
            print(".data");
            print(ctx.toString() + ":");
            depth++;
            print(".space" + " " + ctx.size.toString());
            print(".align 2");
            depth--;
        } else {
            curValue = ctx;
        }
    }

    @Override
    public void visit(UnaryInstruction ctx) {
        curValue = t[0];
        //visit(ctx.destination);
        Value dest = curValue;

        curValue = t[1];
        if(ctx.source instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.source);
        } else if (ctx.source instanceof StaticData){
            printInst("la",curValue,ctx.source);
        } else {
            visit(ctx.source);
        }
        Value src = curValue;

        printInst(ctx.opCode.toString(),dest,src);
        printInst("sw",dest,curFunction.frame.get(ctx.destination));
    }

    @Override
    public void visit(StoreInstruction ctx) {
        curValue = t[0];
        if(ctx.source instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.source);
        } else if (ctx.source instanceof StaticData){
            printInst("la",curValue,ctx.source);
        } else {
            visit(ctx.source);
        }
        Value src = curValue;

        curValue = t[1];
        if(ctx.address instanceof StaticData) {
            if(ctx.size.value > 0) {
                printInst("la",curValue,ctx.address);
            } else {
                visit(ctx.address);
            }
        } else {
            visit(ctx.address);
        }
        Value addr = curValue;

        String opcode;

        switch (ctx.size.value) {
            case 1:
                opcode = "sb";
                break;
            case 4:
                opcode = "sw";
                break;
            default:
                throw new RuntimeException("Invalid Store");
        }

        printPara(opcode,src,ctx.offset,addr);


    }

    @Override
    public void visit(ReturnInstruction ctx) {
        curValue = v[0];
        if(ctx.value instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.value);
        } else if (ctx.value instanceof StaticData){
            printInst("la",curValue,ctx.value);
        } else {
            visit(ctx.value);
        }
        print("j " + "__" + curFunction.function.getName() + "_return_");
    }

    @Override
    public void visit(PhysicalRegister ctx) {
        curValue = ctx;
    }

    @Override
    public void visit(VirtualRegister ctx) {
        printInst("lw",curValue,curFunction.frame.get(ctx));
    }

    @Override
    public void visit(MoveInstruction ctx) {
        curValue = t[0];
        //visit(ctx.destination);
        Value dest = curValue;


        curValue = t[1];
        if(ctx.source instanceof ImmediateNumber) {
            printInst("li",curValue,ctx.source);
        } else if(ctx.source instanceof StaticData) {
            printInst("la",curValue,ctx.source);
        } else {
            visit(ctx.source);
        }
        Value src = curValue;

        printInst("move",dest,src);
        printInst("sw",dest,curFunction.frame.get(ctx.destination));

    }

    @Override
    public void visit(LoadInstruction ctx) {
        curValue = t[0];
        //visit(ctx.destination);
        Value dest = curValue;

        curValue = t[1];
        if(ctx.address instanceof StaticData) {
            if(ctx.size.value > 0) {
                printInst("la",curValue,ctx.address);
            } else {
                visit(ctx.address);
            }
        } else {
            visit(ctx.address);
        }
        Value addr = curValue;

        String opcode;

        switch (ctx.size.value) {
            case 1:
                opcode = "lb";
                break;
            case 4:
                opcode = "lw";
                break;
            default:
                throw new RuntimeException("Invalid Store");
        }

        printPara(opcode,dest,ctx.offset,addr);
        printInst("sw",dest,curFunction.frame.get(ctx.destination));
    }

    @Override
    public void visit(JumpInstruction ctx) {
        printInst("j",ctx.destination.getName());
    }

    @Override
    public void visit(IR ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(ImmediateNumber ctx) {
        curValue = ctx;
    }

    @Override
    public void visit(FunctionCallInstruction ctx) {
        for(int i = 0; i < ctx.argumentList.size(); ++i) {
            curValue = t[0];
            Value value = ctx.argumentList.get(i);
            if(value instanceof ImmediateNumber) {
                printInst("li",curValue,value);
            } else if(value instanceof StaticData) {
                printInst("la",curValue,value);
            } else {
                visit(value);
            }
            if(ctx.function.functionBlock != null) {
                int delta = ctx.function.functionBlock.frame.get(ctx.function.functionBlock.argumentList.get(i)).offset - ctx.function.functionBlock.frame.getSize();
                printInst("sw",curValue,new FrameAddr(delta));
            } else {
                printInst("move",a[i],curValue);
            }

        }
        for(int i = 0; i < 3; ++i) {
            printInst("sw",t[i], curFunction.frame.get(t[i]));
        }
        if(ctx.function.getName().equals("main")) {
            printInst("jal", ctx.function.getName());
        } else {
            printInst("jal","func_" + ctx.function.getName());
        }
        if(ctx.destination != null) {
            printInst("sw",v[0],curFunction.frame.get(ctx.destination));
        }
        for(int i = 0; i < 3; ++i) {
            printInst("lw",t[i],  curFunction.frame.get(t[i]));
        }
    }

    @Override
    public void visit(FunctionBlock ctx) {
        print(".text");
        if(ctx.function.getName().equals("main")) {
            print(".globl main");
            print(ctx.function.getName() + ":");
        } else {
            print("func_" + ctx.function.getName() + ":");
        }
        curFunction = ctx;
        depth++;

        printInst("sub", sp, sp,new ImmediateNumber(ctx.frame.getSize()));
        printInst("sw",ra, ctx.frame.get(ra));
        printInst("sw",fp, ctx.frame.get(fp));

        ctx.basicBlockList.stream().forEachOrdered(this::visit);

        print("__" + ctx.function.getName() + "_return_:");
        /*if(ctx.function.getName().equals("main")) {
            print("move $t3 $v0");
            print("li $v0, 1");
            print("move $a0, $t3");
            print("syscall");
            print("move $v0 $t3");
        }
        */
        printInst("lw",ra, ctx.frame.get(ra));
        printInst("lw",fp, ctx.frame.get(fp));

        printInst("add", sp, sp,new ImmediateNumber(ctx.frame.getSize()));
        printInst("jr",ra);
        depth--;
    }
}
