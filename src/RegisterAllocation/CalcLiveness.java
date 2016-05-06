package RegisterAllocation;

import IR.*;
import IRVisitor.Visitor;

import java.io.PrintStream;
import java.util.*;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class CalcLiveness implements Visitor{

    PrintStream debug;


    List<Instruction> list;
    Set<Instruction> vis = new HashSet<>();
    Queue<Instruction> queue;
    int depth = 0;

    public CalcLiveness(PrintStream debug){this.debug=debug;}
    public void visit(Instruction ctx) {
        if(vis.contains(ctx))
            return;
        queue.add(ctx);
        list.add(ctx);
        vis.add(ctx);
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
        queue = new LinkedList<>();
        list = new ArrayList<>();
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
        while(!queue.isEmpty()) {
            Instruction cur = queue.remove();
            cur.successor.stream().forEachOrdered(this::visit);
        }

        /*System.out.println("listOfFunc:" + ctx.function.getName());
        for (Instruction x : list) {
            System.out.println(x.toString());
        }
        */

        boolean finished;
        do {
            finished = true;
            for(int i = list.size() - 1; i >= 0; --i) {
                Instruction cur = list.get(i);
                Set<Integer> oldIn = cur.in;
                Set<Integer> oldOut = cur.out;

                cur.out = new HashSet<>();
                cur.in = new HashSet<>();

                for (Instruction x : cur.successor) {
                    cur.out.addAll(x.in);
                }
                cur.in.addAll(cur.use);
                for (Integer x : cur.out) {
                    if(!cur.def.contains(x))
                        cur.in.add(x);
                }
                if(!oldOut.equals(cur.out) || !oldIn.equals(cur.in)) {
                    /*
                    System.out.println(cur.toString() + " failed");
                    System.out.print("out: ");
                    for (Integer x : oldOut) {
                        System.out.print(x + " ");

                    }
                    System.out.print(" vs ");
                    for (Integer x : cur.out) {
                        System.out.print(x + " ");
                    }

                    System.out.print("\nin: ");
                    for (Integer x : oldIn) {
                        System.out.print(x + " ");

                    }
                    System.out.print(" vs ");
                    for (Integer x : cur.in) {
                        System.out.print(x + " ");
                    }
                    */
                    finished = false;
                }
            }
        }while(!finished);


    }
}
