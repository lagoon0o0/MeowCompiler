package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class MoveInstruction extends Instruction {
    public Register destination;
    public Value source;
    public MoveInstruction(Register aDestination, Value aSource) {
        destination = aDestination;
        source = aSource;
    }
    public String toString() {
        return destination.toString() + " = " + "move" + " "+ source.toString();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
