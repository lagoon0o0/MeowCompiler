package IRVisitor;
import IR.*;

import java.io.PrintStream;

/**
 * Created by lagoon0o0 on 4/30/16.
 */
public class IRPrinter implements Visitor{
    PrintStream out;
    public IRPrinter(PrintStream x) {
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
        print(ctx.toString());
    }

    @Override
    public void visit(BasicBlock ctx) {
        print( ctx.getName() + ":");
        depth++;
        ctx.list.stream().forEachOrdered(this::visit);
        depth--;
        print("");
    }

    @Override
    public void visit(BinaryInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(BranchInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(ConditionSetInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(FunctionBlock ctx) {
        String ret = "func " + ctx.function.getName() + " ";
        for (Register x : ctx.argumentList) {
            ret += x.toString() + " ";
        }
        ret+="{";
        print(ret);
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
        print("}");
    }

    @Override
    public void visit(FunctionCallInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(ImmediateNumber ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(IR ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(JumpInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(LoadInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(MoveInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(VirtualRegister ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(PhysicalRegister ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(ReturnInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(StoreInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(UnaryInstruction ctx) {
        print(ctx.toString());
    }

    @Override
    public void visit(IRRoot ctx) {
        ctx.func.stream().forEachOrdered(this::visit);
    }

}
