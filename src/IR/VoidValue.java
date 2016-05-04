package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/4/16.
 */
public class VoidValue extends Value{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String toString() {
        return "";
    }
}
