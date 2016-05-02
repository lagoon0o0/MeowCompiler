package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/1/16.
 */
public class StaticString extends StaticData {
    int idx;
    String name,content;
    public String toString() {
        return "&" + name + "(" + idx + ")";
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
