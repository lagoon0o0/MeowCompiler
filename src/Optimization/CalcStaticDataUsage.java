package Optimization;

import IR.*;
import IRVisitor.Visitor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lagoon0o0 on 5/12/16.
 */
public class CalcStaticDataUsage implements Visitor
{
    IRRoot irRoot;
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
        irRoot = ctx;
        ctx.func.stream().forEachOrdered(this::visit);
        ctx.func.stream().forEach(x->x.usedStaticData.addAll(x.ocrStaticData));
        boolean finished = true;
        do {
            finished = true;
            for (FunctionBlock cur : ctx.func) {
                Set<VirtualRegister> old = new HashSet<>(cur.usedStaticData);
                for (FunctionBlock x : cur.succ) {
                    cur.usedStaticData.addAll(x.usedStaticData);
                }
                if(!old.equals(cur.usedStaticData)) {
                    finished = false;
                }
            }
        } while(!finished);
    }

    @Override
    public void visit(UnaryInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.source);

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
        if(irRoot.virtualToSymbol.containsKey(ctx))
            curFunc.ocrStaticData.add(ctx);
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
        if(ctx.destination != null)
        visit(ctx.destination);
        ctx.argumentList.stream().forEach(this::visit);
    }

    @Override
    public void visit(FunctionBlock ctx) {
        curFunc = ctx;
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
    }
}
