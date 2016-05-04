package LivenessAnalysis;

import IR.*;
import IRVisitor.Visitor;
import SymbolTable.Symbol;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class CalcVirtualRegisterIndex implements Visitor{
    FunctionBlock curFunc;
    @Override
    public void visit(AllocInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.size);
    }

    @Override
    public void visit(BasicBlock ctx) {
        ctx.list.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(BinaryInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.source1);
        visit(ctx.source2);
    }

    @Override
    public void visit(BranchInstruction ctx) {
        visit(ctx.condition);
    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.source1);
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
        visit(ctx.source);
        visit(ctx.destination);
    }

    @Override
    public void visit(StoreInstruction ctx) {
        visit(ctx.address);
        visit(ctx.source);
    }

    @Override
    public void visit(ReturnInstruction ctx) {
        visit(ctx.value);
    }

    @Override
    public void visit(PhysicalRegister ctx) {
    }

    @Override
    public void visit(VirtualRegister ctx) {
        curFunc.insertVirtual(ctx);
    }

    @Override
    public void visit(MoveInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.source);
    }

    @Override
    public void visit(LoadInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.address);
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
        ctx.argumentList.stream().forEachOrdered(this::visit);
        if(ctx.destination != null)
            visit(ctx.destination);
    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        ctx.argumentList.stream().forEachOrdered(this::visit);
        ctx.basicBlockList.stream().forEachOrdered(this::visit);

    }
}
