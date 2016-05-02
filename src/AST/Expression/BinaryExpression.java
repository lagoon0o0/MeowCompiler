package AST.Expression;

import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class BinaryExpression extends Expression {
    public static enum Operator {
        Plus,
        Minus,
        Multiply,
        Divide,
        Modulo,
        LeftShift,
        RightShift,
        LessThan,
        GreaterThan,
        LessOrEqualThan,
        GreaterOrEqualThan,
        Equal,
        NotEqual,
        BitwiseAnd,
        BitwiseXor,
        BitwiseOr,
        LogicalAnd,
        LogicalOr,
        Assign
        ;
    }
    public Operator operator;
    public Expression lhs, rhs;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "BinaryExpression:";
    }
}
