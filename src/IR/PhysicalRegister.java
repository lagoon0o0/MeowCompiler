package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/2/16.
 */
public class PhysicalRegister extends Register{
    int idx;
    public String name;

    public PhysicalRegister(int anIdx, String aName) {
        idx = anIdx;
        name = aName;
    }
    public String toString() {
        return "$" + name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
