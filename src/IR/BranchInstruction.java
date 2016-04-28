package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class BranchInstruction extends ControlInstruction{
    Value condition;
    BasicBlock ifTrue, ifFalse;
    BranchInstruction(Value aCondition, BasicBlock anIfTrue, BasicBlock anIfFalse) {
        condition = aCondition;
        ifTrue = anIfTrue;
        ifFalse = anIfFalse;
    }
}
