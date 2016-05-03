package IRVisitor;

import IR.*;

import java.util.*;

/**
 * Created by lagoon0o0 on 5/2/16.
 */
public class GetVRegisterUsage implements Visitor{
        final String[] names  = {
            "zero",  //0
            "at",   //1
            "v0",   //2
            "v1",   //3
            "a0",   //4
            "a1",   //5
            "a2",   //6
            "a3",   //7
            "t0",   //8
            "t1",   //9
            "t2",   //10
            "t3",   //11
            "t4",   //12
            "t5",   //13
            "t6",   //14
            "t7",   //15
            "s0",   //16
            "s1",   //17
            "s2",   //18
            "s3",   //19
            "s4",   //20
            "s5",   //21
            "s6",   //22
            "s7",   //23
            "t8",   //24
            "t9",   //25
            "k0",   //26
            "k1",   //27
            "gp",   //28
            "sp",   //29
            "fp",   //30
            "ra"    //31
        };
    Map<VirtualRegister,Integer> virtualRegisterIntegerMap;
    Map<BasicBlock, Map<VirtualRegister,Integer>> basicBlockMapMap = new Hashtable<>();
    List< Queue<Integer>> occur;
    int instIdx = 0;
    int totalReg = 0;
    public void add(VirtualRegister reg) {
        if(!virtualRegisterIntegerMap.containsKey(reg)) {
            virtualRegisterIntegerMap.put(reg,totalReg++);
            occur.add(new LinkedList<>());
        }
        occur.get(virtualRegisterIntegerMap.get(reg)).add(instIdx);
    }

    @Override
    public void visit(AllocInstruction ctx) {
        visit(ctx.destination);
        visit(ctx.size);
    }

    @Override
    public void visit(BasicBlock ctx) {
        virtualRegisterIntegerMap = new Hashtable<>();
        occur = new ArrayList<>();
        totalReg = 0;
        for (Instruction x : ctx.list) {
            instIdx++;
            visit(x);
        }
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
    public void visit(IRRoot ctx) {
        ctx.func.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(StaticString ctx) {

    }

    @Override
    public void visit(StaticSpace ctx) {

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
    public void visit(VirtualRegister ctx) {
        add(ctx);
    }

    @Override
    public void visit(PhysicalRegister ctx) {
        
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
        visit(ctx.destination);
        ctx.argumentList.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(FunctionBlock ctx) {
        ctx.argumentList.stream().forEachOrdered(this::visit);
        ctx.basicBlockList.stream().forEachOrdered(this::visit);
    }
}
