package IR;

import IRVisitor.Visitor;


/**
 * Created by lagoon0o0 on 4/27/16.
 */
public class VirtualRegister extends Register{
    static int total = 0;
    public int idx;
    public int numberOfRef = 0;
    public String name;

    public VirtualRegister(String aName) {
        idx = ++total;
        name = aName;
    }
    public String toString() {
        return "$" + name + "(" + idx + ")";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
