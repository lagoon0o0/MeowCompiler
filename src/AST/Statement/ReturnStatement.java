package AST.Statement;

import FrontEnd.VisitorAST.Visitor;
import AST.Expression.Expression;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class ReturnStatement extends Statement {
    public Expression value;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ReturnStatement:";
    }
}
