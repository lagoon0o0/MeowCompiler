package RegisterAllocation;

import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;

/**
 * Created by lagoon0o0 on 5/7/16.
 */
public class BuildCallingGraph implements Visitor{
    FunctionBlock curFunc;
    PrintStream debug;
    BuildCallingGraph(PrintStream debug) {this.debug = debug;}
    @Override
    public void visit(AllocInstruction ctx) {
        
    }

    @Override
    public void visit(BasicBlock ctx) {
        ctx.list.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(BinaryInstruction ctx) {

    }

    @Override
    public void visit(BranchInstruction ctx) {

    }

    @Override
    public void visit(ConditionSetInstruction ctx) {

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

    }

    @Override
    public void visit(StoreInstruction ctx) {

    }

    @Override
    public void visit(ReturnInstruction ctx) {

    }

    @Override
    public void visit(PhysicalRegister ctx) {

    }

    @Override
    public void visit(VirtualRegister ctx) {

    }

    @Override
    public void visit(MoveInstruction ctx) {

    }

    @Override
    public void visit(LoadInstruction ctx) {

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
        if(ctx.function.functionBlock == null) // system call
            ctx.function.functionBlock = new FunctionBlock(ctx.function);
        curFunc.succ.add(ctx.function.functionBlock);
    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
    }
}
