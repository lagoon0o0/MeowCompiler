package AST.Expression;

import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class PostfixExpression extends Expression {
    public enum Operator {
        PlusPlus, MinusMinus;
    }
    public Operator operator;
    public Expression expression;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "PostfixExpression:";
    }
}
