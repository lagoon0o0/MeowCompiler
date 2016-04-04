package AST.Expression;

import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class MemberExpression extends Expression {
    public Expression parent;
    public String child;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "MemberExpression: " + "child = " + child;
    }
}
