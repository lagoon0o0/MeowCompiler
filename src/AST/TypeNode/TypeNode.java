package AST.TypeNode;

import AST.AstNode;
import FrontEnd.VisitorAST.Visitor;
import SymbolTable.Type;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
abstract public class TypeNode extends AstNode {
    public Type type;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
