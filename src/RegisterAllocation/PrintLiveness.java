package RegisterAllocation;
import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class PrintLiveness implements Visitor{
    PrintStream out;
    FunctionBlock curFunc;
    IRRoot irRoot;
    public PrintLiveness(PrintStream x) {
        out = x;
    }
    int depth = 0;

    void indent(int length) {
        for(int i = 1; i <= length; ++i)
            out.printf("\t");
    }
    void print(String content) {
        indent(depth);
        out.print(content + "\n");
    }
    @Override
    public void visit(AllocInstruction ctx) {

    }

    public void visit(Instruction ctx) {
        print(ctx.index + ":" + ctx.toString());

        depth++;

        print("succ = ");
        depth++;
        for (Instruction x : ctx.successor) {
            print(x.index + "," + x.toString());
        }
        depth--;

        print("def = ");
        depth++;
        for (Integer x : ctx.def) {
            print(x + "," +curFunc.getVirtualRegister(x).toString());
        }
        depth--;

        print("use = ");
        depth++;
        for (Integer x : ctx.use) {
            print(x + "," +curFunc.getVirtualRegister(x).toString());
        }
        depth--;

        print("in = ");

        depth++;
        for (Integer x : ctx.in) {
            print(x + "," +curFunc.getVirtualRegister(x).toString());
        }
        depth--;

        print("out = ");

        depth++;
        for (Integer x : ctx.out) {
            print(x + "," +curFunc.getVirtualRegister(x).toString());
        }
        depth--;


        depth--;
    }

    @Override
    public void visit(BasicBlock ctx) {
        print("BasicBlock: " + ctx.getName());
        depth++;
        ctx.list.stream().forEachOrdered(this::visit);

        depth--;
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
        irRoot = ctx;
        ctx.func.stream().forEachOrdered(this::visit);

        print("---------------exteral function-------------------");
        ctx.externalFunc.stream().forEachOrdered(this::visit);
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
        print("function : " + ctx.function.getName());
        print("number of spill = " + ctx.numberOfSpill);
        print("size of frame = " + ctx.frame.getSize());
        print("list of used staticdata:");
        depth++;
        for (VirtualRegister x : ctx.ocrStaticData) {
            print(x.toString() + ": " + irRoot.virtualToSymbol.get(x).getName());
        }
        depth--;

        print("list of called function:");
        depth++;
        for (FunctionBlock x : ctx.succ) {
            print(x.function.getName());
        }
        depth--;
        print("list of used physical register:");
        depth++;
        for (PhysicalRegister x : ctx.usedPhysicalRegister) {
            print(x.toString());
        }
        depth--;
        print("list of reg:");
        depth++;
        for(int i = 0; i < ctx.virtualTotal; ++i) {
            print(i + ": " + ctx.getVirtualRegister(i).toString()
                    + "\tContra = "  + ctx.contraSet.get(i).size()
                    + "\tLink = " + ctx.linkedSet.get(i).size()
                    + "\tRef = "  + ctx.getVirtualRegister(i).numberOfRef
                    + "\tPhy = " + ctx.getPhysicalRegister(ctx.getVirtualRegister(i)).toString()
                    + "\tuse = " + ctx.getVirtualRegister(i).useful
            );

        }
        depth--;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);


    }
}
