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
    IRRoot root;
    public BuildCallingGraph(PrintStream debug) {this.debug = debug;}
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

        root = ctx;
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
    void addVirtual(String name, PhysicalRegister phy, FunctionBlock func) {
        VirtualRegister cur = new VirtualRegister("name");
        cur.useful = true;
        func.argumentList.add(cur);
        func.insertVirtual(cur);
        func.virtualToPhysical.put(cur,phy);
    }
    @Override
    public void visit(FunctionCallInstruction ctx) {
        if(ctx.function.functionBlock == null) {// system call
            ctx.function.functionBlock = new FunctionBlock(ctx.function);
            if(ctx.function.getName().equals("printlnInt")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("printInt")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("print")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("println")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("getString")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("a1",FunctionBlock.a[1],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
                addVirtual("v1",FunctionBlock.v[1],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("getInt")) {
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("toString")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
                addVirtual("t1",FunctionBlock.t[1],ctx.function.functionBlock);
                addVirtual("t2",FunctionBlock.t[2],ctx.function.functionBlock);
                addVirtual("t3",FunctionBlock.t[3],ctx.function.functionBlock);
                addVirtual("t5",FunctionBlock.t[5],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
                addVirtual("v1",FunctionBlock.v[1],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("string.length")) {
                addVirtual("a0", FunctionBlock.a[0], ctx.function.functionBlock);
                addVirtual("v0", FunctionBlock.v[0], ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("string.substring")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("a1",FunctionBlock.a[1],ctx.function.functionBlock);
                addVirtual("a2",FunctionBlock.a[2],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
                addVirtual("t1",FunctionBlock.t[1],ctx.function.functionBlock);
                addVirtual("t2",FunctionBlock.t[2],ctx.function.functionBlock);
                addVirtual("t3",FunctionBlock.t[3],ctx.function.functionBlock);
                addVirtual("t4",FunctionBlock.t[4],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("string.parseInt")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
                addVirtual("t1",FunctionBlock.t[1],ctx.function.functionBlock);
                addVirtual("t2",FunctionBlock.t[2],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("string.ord")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("a1",FunctionBlock.a[1],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("_array.size")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("stringConcatenate")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("a1",FunctionBlock.a[1],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
                addVirtual("t1",FunctionBlock.t[1],ctx.function.functionBlock);
                addVirtual("t2",FunctionBlock.t[2],ctx.function.functionBlock);
                addVirtual("t3",FunctionBlock.t[3],ctx.function.functionBlock);
                addVirtual("t4",FunctionBlock.t[4],ctx.function.functionBlock);
                addVirtual("t5",FunctionBlock.t[5],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("stringIsEqual")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("a1",FunctionBlock.a[1],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
                addVirtual("t1",FunctionBlock.t[1],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else if(ctx.function.getName().equals("stringLess")) {
                addVirtual("a0",FunctionBlock.a[0],ctx.function.functionBlock);
                addVirtual("a1",FunctionBlock.a[1],ctx.function.functionBlock);
                addVirtual("t0",FunctionBlock.t[0],ctx.function.functionBlock);
                addVirtual("t1",FunctionBlock.t[1],ctx.function.functionBlock);
                addVirtual("v0",FunctionBlock.v[0],ctx.function.functionBlock);
            } else {
                throw new RuntimeException("invalid syscall");
            }
            // initialize the syscall
            root.externalFunc.add(ctx.function.functionBlock);
        }
        curFunc.succ.add(ctx.function.functionBlock);
    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
    }
}
