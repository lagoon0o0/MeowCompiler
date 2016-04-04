package AST.Expression;

import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class UnaryExpression extends Expression {
    public enum Operator {
        PlusPlus, MinusMinus, LogicalNot, BitwiseNot;
    }
    public Operator operator;
    public Expression expression;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "UnaryExpression:";
    }
}
