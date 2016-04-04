package AST.TranslationUnit;

import AST.Statement.VariableDeclarationStatement;
import FrontEnd.VisitorAST.Visitor;
import AST.Expression.IdentifierExpression;
import SymbolTable.Scope;

import java.util.List;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class ClassDeclaration extends TranslationUnit {
    public String id;
    public Scope scope;
    public List<VariableDeclarationStatement> fieldList;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ClassDeclaration: " + "id =" + id;
    }
}
