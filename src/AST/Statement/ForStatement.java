package AST.Statement;

import FrontEnd.VisitorAST.Visitor;
import AST.Expression.Expression;

/**
 * Created by lagoon0o0 on 16/3/31.
 */
public class ForStatement extends Statement {
    public Expression init, condition, update;
    public Statement body;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ForStatement:";
    }


}
