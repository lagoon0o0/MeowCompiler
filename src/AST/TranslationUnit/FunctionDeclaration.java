package AST.TranslationUnit;

import AST.Statement.Block;
import AST.Statement.Statement;
import AST.TypeNode.TypeNode;
import AST.Statement.VariableDeclarationStatement;
import FrontEnd.VisitorAST.Visitor;
import AST.Expression.IdentifierExpression;
import SymbolTable.Scope;

import java.util.List;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class FunctionDeclaration extends TranslationUnit {
    public TypeNode typeNode;
    public String id;
    public List<VariableDeclarationStatement> argumentlist;
    public List<Statement> bodyStatements;
    public Block body;
    public Scope scope;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FunctionDeclaration: " + "id = " + id;
    }

}
