package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class JumpInstruction extends ControlInstruction{
    BasicBlock destination;
    public JumpInstruction(BasicBlock aDestination) {
        destination = aDestination;
    }
    public String toString() {
        return "jump" + " " + destination.getName();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
