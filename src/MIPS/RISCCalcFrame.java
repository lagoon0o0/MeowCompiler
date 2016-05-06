package MIPS;

import IR.*;
import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/5/16.
 */
public class RISCCalcFrame implements Visitor{

    @Override
    public void visit(AllocInstruction ctx) {

    }

    @Override
    public void visit(BasicBlock ctx) {

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

    }

    @Override
    public void visit(FunctionBlock ctx) {
        // caller
        for (int i = 0; i <= 9; ++i) {
            ctx.frame.get(FunctionBlock.t[i]);
        }
        for (int i = 0; i <= 3; ++i) {
            ctx.frame.get(FunctionBlock.a[i]);
        }
        for (int i = 0; i <= 1; ++i) {
            ctx.frame.get(FunctionBlock.v[i]);
        }
        // callee
        for (int i = 0; i <= 7; ++i) {
            ctx.frame.get(FunctionBlock.s[i]);
        }
        ctx.frame.get(FunctionBlock.ra);
        ctx.frame.get(FunctionBlock.fp);
    }
}
