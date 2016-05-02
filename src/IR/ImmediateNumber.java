package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/27/16.
 */
public class ImmediateNumber extends Value {
    public int value;
    public ImmediateNumber(int aValue) {
        value = aValue;
    }
    public String toString() {
        return String.valueOf(value);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
