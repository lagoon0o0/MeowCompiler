package LivenessAnalysis;

import IR.*;
import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class BuildInterferenceGraph implements Visitor{
    FunctionBlock curFunc;

    public void visit(Instruction ctx) {
        if(ctx instanceof MoveInstruction) {
            for (Integer x : ctx.def) {
                for (Integer y : ctx.out) {
                    if(((MoveInstruction) ctx).source instanceof VirtualRegister
                            && y == curFunc.getVirtualIndex((VirtualRegister) ((MoveInstruction) ctx).source)) {
                        continue;
                    }
                    curFunc.addEdge(x,y);
                }
            }
        } else {
            for (Integer x : ctx.def) {
                for (Integer y : ctx.out) {
                    curFunc.addEdge(x,y);
                }
            }
        }

    }
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

    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);


    }
}
