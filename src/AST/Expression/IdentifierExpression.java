package AST.Expression;

import FrontEnd.VisitorAST.Visitor;
import IR.Value;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class IdentifierExpression extends Expression {
    public String name;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IdentifierExpression: " + name;
    }
}
