package RegisterAllocation;

import IR.*;
import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class BuildGraph implements Visitor{
    FunctionBlock curFunc;
    Instruction curInst;
    int curState = 0;
    final int USE = 1;
    final int DEF = 2;

    @Override
    public void visit(AllocInstruction ctx) {
        curInst = ctx;

        curState = DEF;
        visit(ctx.destination);

        curState = USE;
        visit(ctx.size);
    }

    @Override
    public void visit(BasicBlock ctx) {
        Instruction pre = null;
        for (Instruction x : ctx.list) {
            visit(x);
            if(pre != null) {
                pre.addSucc(x);
            }
            pre = x;
        }
    }

    @Override
    public void visit(BinaryInstruction ctx) {
        curInst = ctx;

        curState = DEF;
        visit(ctx.destination);

        curState = USE;
        visit(ctx.source1);

        curState = USE;
        visit(ctx.source2);
    }

    @Override
    public void visit(BranchInstruction ctx) {
        curInst = ctx;

        curState = USE;
        visit(ctx.condition);

        ctx.addSucc(ctx.ifTrue.getFirst());
        ctx.addSucc(ctx.ifFalse.getFirst());
    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        curInst = ctx;

        curState = DEF;
        visit(ctx.destination);

        curState = USE;
        visit(ctx.source1);

        curState = USE;
        visit(ctx.source2);
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
        ctx.func.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(UnaryInstruction ctx) {
        curInst = ctx;

        curState = DEF;
        visit(ctx.destination);

        curState = USE;
        visit(ctx.source);
    }

    @Override
    public void visit(StoreInstruction ctx) {
        curInst = ctx;
        curState = USE;
        visit(ctx.source);

        curState = USE;
        visit(ctx.address);
    }

    @Override
    public void visit(ReturnInstruction ctx) {
        curInst = ctx;
        curState = USE;
        visit(ctx.value);
    }

    @Override
    public void visit(PhysicalRegister ctx) {

    }

    @Override
    public void visit(VirtualRegister ctx) {
        if(curState == DEF) {
            curInst.addDef(curFunc.getVirtualIndex((ctx)));
        } else if(curState == USE) {
            curInst.addUse(curFunc.getVirtualIndex(ctx));
        } else {
            throw new RuntimeException("Invalid curState");
        }
    }

    @Override
    public void visit(MoveInstruction ctx) {
        curInst = ctx;

        curState = DEF;
        visit(ctx.destination);

        curState = USE;
        visit(ctx.source);
    }

    @Override
    public void visit(LoadInstruction ctx) {
        curInst = ctx;
        curState = DEF;
        visit(ctx.destination);

        curState = USE;
        visit(ctx.address);
    }

    @Override
    public void visit(JumpInstruction ctx) {
        curInst = ctx;
        ctx.addSucc(ctx.destination.getFirst());
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
        curInst = ctx;
        curState = DEF;
        if(ctx.destination != null)
            visit(ctx.destination);
        curState = USE;
        ctx.argumentList.stream().forEachOrdered(this::visit);

    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
    }
}
