package IRVisitor;

import IR.*;

/**
 * Created by lagoon0o0 on 4/30/16.
 */
public interface Visitor {
    public void visit(AllocInstruction ctx);
    public void visit(BasicBlock ctx);
    public void visit(BinaryInstruction ctx);
    public void visit(BranchInstruction ctx);
    public void visit(ConditionSetInstruction ctx);
    //public void visit(ControlInstruction ctx);
    public void visit(FunctionBlock ctx);
    public void visit(FunctionCallInstruction ctx);
    public void visit(ImmediateNumber ctx);
    //public void visit(Instruction ctx);
    public void visit(IR ctx);
    public void visit(JumpInstruction ctx);
    public void visit(LoadInstruction ctx);
    //public void visit(MemoryAccessInstruction ctx);
    public void visit(MoveInstruction ctx);
    public void visit(VirtualRegister ctx);
    public void visit(PhysicalRegister ctx);
    public void visit(ReturnInstruction ctx);
    public void visit(StoreInstruction ctx);
    public void visit(UnaryInstruction ctx);
    public void visit(IRRoot ctx);
    public void visit(StaticSpace ctx);
    public void visit(StaticString ctx);
    //public void visit(Value ctx);

}
