package Optimization;


import IR.*;
import IRVisitor.Visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lagoon0o0 on 5/12/16.
 */
public class InlineLeafFunction implements Visitor{
    Register returnDest;
    BasicBlock curBlock;
    BasicBlock callingBlock;
    BasicBlock returnBlock;
    List<BasicBlock> curList;
    IRRoot irRoot;
    Map<VirtualRegister,VirtualRegister> registerMap;
    Map<BasicBlock, BasicBlock> basicBlockMap;
    FunctionBlock curFunc, dupFunc;
    public Value getValue(Value value) {
        if(value instanceof Register) {
            return getRegister((Register) value);
        }
        return value;
    }

    public Register getRegister(Register reg) {
        if(reg instanceof VirtualRegister) {
            // static data
            if(irRoot.virtualToSymbol.containsKey(reg))
                return reg;
            if (registerMap.containsKey(reg))
                return registerMap.get(reg);
            registerMap.put((VirtualRegister) reg, new VirtualRegister(((VirtualRegister) reg).name));
            return registerMap.get(reg);
        }
        return reg;
    }
    public BasicBlock getBasicBlock(BasicBlock basicBlock) {
        if(basicBlockMap.containsKey(basicBlock)) {
            return basicBlockMap.get(basicBlock);
        }
        basicBlockMap.put(basicBlock, new BasicBlock(basicBlock.name));
        return basicBlockMap.get(basicBlock);
    }


    @Override
    public void visit(AllocInstruction ctx) {
        curBlock.add(new AllocInstruction(getRegister(ctx.destination), getValue(ctx.size)));
    }
    @Override
    public void visit(BasicBlock ctx) {

    }

    @Override
    public void visit(BinaryInstruction ctx) {
        curBlock.add(new BinaryInstruction(ctx.opCode,getRegister(ctx.destination),getValue(ctx.source1),getValue(ctx.source2)));
    }

    @Override
    public void visit(BranchInstruction ctx) {
        curBlock.add(new BranchInstruction(getValue(ctx.condition),getBasicBlock(ctx.ifTrue),getBasicBlock(ctx.ifFalse)));
    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        curBlock.add(new ConditionSetInstruction(ctx.opCode,getRegister(ctx.destination),getValue(ctx.source1),getValue(ctx.source2)));
    }

    @Override
    public void visit(VoidValue ctx) {

    }

    @Override
    public void visit(StaticString ctx) {

    }

    @Override
    public void visit(StaticSpace ctx) {

    }

    @Override
    public void visit(IRRoot ctx) {
        irRoot = ctx;
        ctx.func.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(UnaryInstruction ctx) {
        curBlock.add(new UnaryInstruction(ctx.opCode,getRegister(ctx.destination),getValue(ctx.source)));
    }

    @Override
    public void visit(StoreInstruction ctx) {
        curBlock.add(new StoreInstruction(getValue(ctx.address),ctx.offset,ctx.size,getValue(ctx.source)));
    }

    @Override
    public void visit(ReturnInstruction ctx) {
        if(!(ctx.value instanceof VoidValue) && returnDest != null) {
            curBlock.add(new MoveInstruction(returnDest,getValue(ctx.value)));
        }
        curBlock.add(new JumpInstruction(returnBlock));
    }

    @Override
    public void visit(PhysicalRegister ctx) {

    }

    @Override
    public void visit(VirtualRegister ctx) {

    }

    @Override
    public void visit(MoveInstruction ctx) {
        curBlock.add(new MoveInstruction(getRegister(ctx.destination),getValue(ctx.source)));
    }

    @Override
    public void visit(LoadInstruction ctx) {
        curBlock.add(new LoadInstruction(getRegister(ctx.destination),getValue(ctx.address),ctx.offset,ctx.size));
    }

    @Override
    public void visit(JumpInstruction ctx) {
        curBlock.add(new JumpInstruction(getBasicBlock(ctx.destination)));
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
        List<Value> list = new ArrayList<>();
        ctx.argumentList.stream().map(this::getValue).forEachOrdered(list::add);
        curBlock.add(new FunctionCallInstruction(getRegister(ctx.destination),ctx.function,list));
    }
    public void expand(FunctionCallInstruction ctx) {

        returnDest = ctx.destination;
        registerMap = new HashMap<>();
        basicBlockMap = new HashMap<>();
        // copy the argument
        FunctionBlock func = (ctx.function.functionBlock == curFunc)
                ? dupFunc
                :ctx.function.functionBlock;
        for(int i = 0; i < ctx.argumentList.size(); ++i) {
            Value src = ctx.argumentList.get(i);
            Register dest = getRegister(func.argumentList.get(i));
            callingBlock.add(new MoveInstruction(dest,src));
        }
        //jump to the entry
        curBlock = callingBlock;
        for (BasicBlock x : func.basicBlockList) {
            if(curBlock == callingBlock) {
                curBlock = getBasicBlock(x);
                callingBlock.add(new JumpInstruction(curBlock));
                curList.add(callingBlock);
            } else {
                curBlock = getBasicBlock(x);
            }
            for (Instruction inst : x.list) {
                visit(inst);
            }
            curList.add(curBlock);
        }

    }
    public FunctionBlock duplicateFunc(FunctionBlock ctx) {
        basicBlockMap = new HashMap<>();
        FunctionBlock ret = new FunctionBlock(ctx.function);
        ret.argumentList = ctx.argumentList;
        for (BasicBlock x : ctx.basicBlockList) {
            curBlock = getBasicBlock(x);

            for (Instruction inst : x.list) {
                if(inst instanceof ControlInstruction) {
                    if(inst instanceof JumpInstruction) {
                        curBlock.add(new JumpInstruction(getBasicBlock(((JumpInstruction) inst).destination)));
                    } else if(inst instanceof BranchInstruction) {
                        curBlock.add(new BranchInstruction(((BranchInstruction) inst).condition
                                ,getBasicBlock(((BranchInstruction) inst).ifTrue)
                                ,getBasicBlock(((BranchInstruction) inst).ifFalse)));
                    } else if(inst instanceof ReturnInstruction) {
                        curBlock.add(inst);
                    }
                } else {
                    curBlock.add(inst);
                }

            }
            ret.basicBlockList.add(curBlock);
        }
        return ret;
    }

    @Override
    public void visit(FunctionBlock ctx) {
        if(ctx.function.isExternal)
            return;
        curFunc = ctx;
        dupFunc = duplicateFunc(ctx);
        List<BasicBlock> list = new ArrayList<>();
        curList = list;
        for (BasicBlock cur : ctx.basicBlockList) {
            BasicBlock temp = new BasicBlock(cur.name);
            temp.list = cur.list;
            cur.list = new ArrayList<>();
            BasicBlock newBlock = cur;
            for (Instruction inst : temp.list) {
                if(inst instanceof FunctionCallInstruction
                        && !((FunctionCallInstruction) inst).function.isExternal
                        //&& ((FunctionCallInstruction) inst).function.functionBlock.succ.size() == 0
                        //&& ((FunctionCallInstruction) inst).function.functionBlock != ctx
                        ) {
                    System.out.println("expanding " + inst.toString());
                    callingBlock = newBlock;
                    returnBlock = new BasicBlock("returnBlock");
                    expand((FunctionCallInstruction) inst);
                    newBlock = returnBlock;
                } else {
                    newBlock.add(inst);
                }
            }
            list.add(newBlock);
        }
        ctx.basicBlockList = list;
    }


}
