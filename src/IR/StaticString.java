package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/1/16.
 */
public class StaticString extends StaticData {
    public int idx;
    public String name,content;
    public String toString() {
        return "_" + name + "_" + idx + "_";
    }
    public StaticString(String aName, String aContent) {
        idx = ++total;
        name = aName;
        content = aContent;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
