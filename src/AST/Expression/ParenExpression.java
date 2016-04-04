package AST.Expression;

import FrontEnd.VisitorAST.Visitor;

import java.util.List;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class ParenExpression extends Expression {
    public Expression functionId;
    public List<Expression> argumentList;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ParenExpression: ";
    }
}
