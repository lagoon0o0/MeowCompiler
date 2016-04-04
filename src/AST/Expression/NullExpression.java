package AST.Expression;

import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class NullExpression extends ConstantExpression {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
    @Override
    public String toString() {
        return "NullExpression:";
    }
}
