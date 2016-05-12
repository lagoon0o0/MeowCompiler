package MIPS;

import IR.*;
import IRVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 5/5/16.
 */
public class ReplaceRegister implements Visitor{
    FunctionBlock curFunction;

    public Value calc(Value ctx) {
        if(ctx instanceof StaticData)
            return ctx;
        if(ctx instanceof Register) {
            if(ctx instanceof VirtualRegister) {
                if(((VirtualRegister) ctx).useful)
                    return curFunction.getPhysicalRegister((Register) ctx);
                return FunctionBlock.useless;  // useless register
            } else {
                return curFunction.getPhysicalRegister((Register) ctx);
            }
        }
        return ctx;
    }
    public Register calc(Register ctx) {
        if(ctx instanceof StaticData)
            return ctx;
        if(ctx instanceof VirtualRegister) {
            if(((VirtualRegister) ctx).useful)
                return curFunction.getPhysicalRegister((Register) ctx);
            return FunctionBlock.useless;  // useless register
        } else {
            return curFunction.getPhysicalRegister((Register) ctx);
        }
    }
    @Override
    public void visit(AllocInstruction ctx) {
        ctx.destination = calc(ctx.destination);
        ctx.size = calc(ctx.size);
    }

    @Override
    public void visit(BasicBlock ctx) {
        ctx.list.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(BinaryInstruction ctx) {
        ctx.destination = calc(ctx.destination);
        ctx.source1 = calc(ctx.source1);
        ctx.source2 = calc(ctx.source2);
    }

    @Override
    public void visit(BranchInstruction ctx) {
        ctx.condition = calc(ctx.condition);
    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        ctx.destination= calc(ctx.destination);
        ctx.source1 = calc(ctx.source1);
        ctx.source2 = calc(ctx.source2);
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
        ctx.destination = calc(ctx.destination);
        ctx.source = calc(ctx.source);
    }

    @Override
    public void visit(StoreInstruction ctx) {
        ctx.address = calc(ctx.address);
        ctx.source = calc(ctx.source);
    }

    @Override
    public void visit(ReturnInstruction ctx) {
        ctx.value = calc(ctx.value);
    }

    @Override
    public void visit(PhysicalRegister ctx) {

    }

    @Override
    public void visit(VirtualRegister ctx) {

    }

    @Override
    public void visit(MoveInstruction ctx) {
        ctx.source = calc(ctx.source);
        ctx.destination = calc(ctx.destination);
    }

    @Override
    public void visit(LoadInstruction ctx) {
        ctx.destination = calc(ctx.destination);
        ctx.address = calc(ctx.address);
    }

    @Override
    public void visit(JumpInstruction ctx) {

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
        if(ctx.destination != null)
            ctx.destination = calc(ctx.destination);
        List<Value> newArgumentList = new ArrayList<>();
        ctx.argumentList.stream().forEachOrdered(x->newArgumentList.add(calc(x)));
        ctx.argumentList = newArgumentList;
    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunction = ctx;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
    }
}
