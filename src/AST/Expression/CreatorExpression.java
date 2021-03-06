package AST.Expression;

import AST.TypeNode.TypeNode;
import FrontEnd.VisitorAST.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class CreatorExpression extends Expression {
    public TypeNode typeNodeName;
    public List<Expression> dimensionSize = new ArrayList<>();
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CreatorExpression: ";
    }
}
