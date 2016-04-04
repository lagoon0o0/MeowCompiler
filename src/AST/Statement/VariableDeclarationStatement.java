package AST.Statement;

import AST.TypeNode.TypeNode;
import FrontEnd.VisitorAST.Visitor;
import AST.Expression.Expression;
import AST.Expression.IdentifierExpression;
import AST.TranslationUnit.TranslationUnit;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class VariableDeclarationStatement extends Statement {


    public VariableDeclaration declaration;
    {
        declaration = new VariableDeclaration();

    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "VariableDeclarationStatement: ";
    }

    public class VariableDeclaration extends TranslationUnit {
        public TypeNode typeNode;
        public String id;
        public Expression initValue;

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);

        }
        @Override
        public String toString() {
            return "VairableDeclaration: " + "id = " + id;
        }
    }

}
