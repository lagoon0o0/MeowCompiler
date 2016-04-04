package AST.TypeNode;

import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/4/1.
 */
public class ClassTypeNode extends TypeNode {
    public String typeName;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ClassTypeNode: " +  typeName;
    }
}
