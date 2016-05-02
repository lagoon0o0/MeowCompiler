package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class ReturnInstruction extends ControlInstruction {
    public Value value;
    public ReturnInstruction(Value aValue) {
        value = aValue;
    }
    public String toString() {
        return "ret" + " " + value.toString();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
