package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class BranchInstruction extends ControlInstruction{
    public Value condition;
    public BasicBlock ifTrue, ifFalse;
    public BranchInstruction(Value aCondition, BasicBlock anIfTrue, BasicBlock anIfFalse) {
        condition = aCondition;
        ifTrue = anIfTrue;
        ifFalse = anIfFalse;
    }
    public String toString() {
        return "br" + " " + condition.toString() + " " + ifTrue.getName() + " " + ifFalse.getName();
    }
}
