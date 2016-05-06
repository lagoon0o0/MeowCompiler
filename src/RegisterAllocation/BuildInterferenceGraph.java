package RegisterAllocation;

import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class BuildInterferenceGraph implements Visitor{
    FunctionBlock curFunc;
    PrintStream debug;
    public BuildInterferenceGraph(PrintStream debug){this.debug=debug;}
    public void visit(Instruction ctx) {
        if(ctx instanceof MoveInstruction) {
            for (Integer x : ctx.def) {
                for (Integer y : ctx.use) {
                  if(((MoveInstruction) ctx).source instanceof VirtualRegister)
                      curFunc.addLink(x,y);
                }
                for (Integer y : ctx.out) {
                    if(((MoveInstruction) ctx).source instanceof VirtualRegister
                            && y == curFunc.getVirtualIndex((VirtualRegister) ((MoveInstruction) ctx).source)) {
                        continue;
                    }
                    curFunc.addContra(x,y);
                }
            }
        } else {
            for (Integer x : ctx.def) {
                for (Integer y : ctx.out) {
                    curFunc.addContra(x,y);
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
        // different args are contra
        for (Register x : ctx.argumentList) {
            for (Register y : ctx.argumentList) {
                curFunc.addContra((VirtualRegister) x, (VirtualRegister) y);
            }
        }
        ctx.basicBlockList.stream().forEachOrdered(this::visit);


    }
}
