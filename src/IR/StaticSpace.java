package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/1/16.
 */
public class StaticSpace extends StaticData{
    int idx;
    String name;
    public ImmediateNumber size;
    public String toString() {
        return "_" + name + "_" + idx + "_";
    }
    public StaticSpace(String aName,ImmediateNumber aSize) {
        idx = ++total;
        size = aSize;
        name = aName;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
