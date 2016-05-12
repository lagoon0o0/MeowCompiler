package Optimization;

import IR.*;
import IRVisitor.Visitor;

import java.util.*;

/**
 * Created by lagoon0o0 on 5/7/16.
 */
public class CalcRegisterUsage implements Visitor{
    IRRoot irRoot;
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
        irRoot = ctx;
        ctx.externalFunc.stream().forEach(this::visit);
        ctx.func.stream().forEach(this::visit);
        boolean finished = true;
       do {
           finished = true;
           for (FunctionBlock cur : ctx.func) {
               Set<PhysicalRegister> old = new HashSet<>(cur.usedPhysicalRegister);
               for (FunctionBlock x : cur.succ) {
                   cur.usedPhysicalRegister.addAll(x.usedPhysicalRegister);
               }
               if(!old.equals(cur.usedPhysicalRegister)) {
                   finished = false;
               }
           }
        }while(!finished);
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
        ctx.getVirtualRegister.values().stream()
                .filter(x -> (x.useful && ctx.getPhysicalRegister(x) instanceof PhysicalRegister))
                .map(ctx::getPhysicalRegister)
                .map(x -> (PhysicalRegister)x)
                .forEach(ctx.usedPhysicalRegister::add);

    }
}
