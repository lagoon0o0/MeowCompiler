package RegisterAllocation;

import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;
import java.util.*;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by lagoon0o0 on 5/5/16.
 */
public class GraphColoring implements Visitor{
    PrintStream debug;
    public GraphColoring(PrintStream debug) {this.debug=debug;}
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
        // pre allocation
        for(int i = 0;i < ctx.argumentList.size(); ++i) {
            if(i < 4) {
                // map the first 4 VReg to a[0] - a[3] and forbid spilling them
                ctx.mapTo(ctx.argumentList.get(i), ctx.a[i]);
            } else {
                // alloc stack space for rest of VReg but not map them to the FrameAddr
                ctx.frame.get(ctx.argumentList.get(i));
            }
        }

        // copy the Original graph
        List<Set<Integer>> oriContraSet = new ArrayList<>();
        for (Set<Integer> x : ctx.contraSet) {
            oriContraSet.add(new HashSet<>(x));
        }

        // build the coloring order
        List<VirtualRegister> order = new ArrayList<>();
        Set<VirtualRegister> registerSet = new HashSet<>();
        ctx.getVirtualRegister.values().stream().filter(x -> x.useful).forEachOrdered(registerSet::add);
        // set the useless virtual register to $useless
        ctx.getVirtualRegister.values().stream().filter(x -> !x.useful).forEachOrdered(x->ctx.virtualToPhysical.put(x,FunctionBlock.useless));

        int tot = registerSet.size();
        for(int times = 0; times < tot; ++times) {
            int maxRef = 0;
            int maxDeg = 0;
            VirtualRegister target = null;
            for (VirtualRegister x : registerSet) { // has a small deg reg
                maxRef = max(maxRef,x.numberOfRef);
                maxDeg = max(maxDeg,ctx.getDeg(x));
                if(ctx.getDeg(x) < ctx.avaReg.size()) {
                    debug.println("deleting :" + x.toString());
                    target = x;
                    break;
                }
            }
            if(target != null) {
                ctx.delVirtualReg(target);
                order.add(target);
                registerSet.remove(target);
                continue;
            }
            // choose the reg that minimise the cost
            double A = 1;
            double B = -1;
            double spillCost = 1e10;
            target = null;
            for (VirtualRegister x : registerSet) {
                if(ctx.getPhysicalRegister(x) != null)
                    continue;
                double val = A * x.numberOfRef / maxRef + B * ctx.getDeg(x) / maxDeg;
                if(val < spillCost) {
                    spillCost = val;
                    target = x;
                }
            }
            ctx.delVirtualReg(target);
            registerSet.remove(target);
            order.add(target);
            // pre spill
            //ctx.mapTo(target, ctx.frame.get(target));
            //ctx.numberOfSpill++;
        }

        // recover the original graph
        ctx.contraSet = oriContraSet;


        // alloc the register
        for(int i = order.size() - 1; i >= 0; --i) {
            Set<PhysicalRegister> avaRegSet = new LinkedHashSet<>(ctx.avaReg);
            VirtualRegister x = order.get(i);
            if(ctx.getPhysicalRegister(x) != null)
                continue;
            int vx = ctx.getVirtualIndex(x);

            debug.print("allocating :" + x.toString());
            // remove all contraRegs
            for (Integer vy : ctx.contraSet.get(vx)) {
                VirtualRegister y = ctx.getVirtualRegister(vy);
                Register phy = ctx.getPhysicalRegister(y);
                if (phy != null) {
                    avaRegSet.remove(phy);
                }
            }
            if(avaRegSet.size() == 0) {
                ctx.mapTo(x, ctx.frame.get(x));
                ctx.numberOfSpill++;
                continue;
            }

            // first select from linkedRegs
            boolean success = false;
            for (Integer vy : ctx.linkedSet.get(vx)) {
                VirtualRegister y = ctx.getVirtualRegister(vy);
                Register target = ctx.getPhysicalRegister(y);
                if(target != null) {
                    if(avaRegSet.contains(target)) {
                        debug.println(" linked succ :" + target.toString());
                        ctx.mapTo(x, target);
                        success = true;
                        break;
                    }
                }
            }
            if(success)
                continue;

            if(ctx.linkedSet.get(vx).size() > 0)
               debug.println(" linked failed :" + avaRegSet.iterator().next().toString());
            else
               debug.println(" linked none :" + avaRegSet.iterator().next().toString());

            ctx.mapTo(x, avaRegSet.iterator().next());
        }

    }
}
