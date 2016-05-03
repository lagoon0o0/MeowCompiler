package AST.TranslationUnit;

import AST.Statement.Block;
import AST.Statement.Statement;
import AST.TypeNode.TypeNode;
import AST.Statement.VariableDeclarationStatement;
import FrontEnd.VisitorAST.Visitor;
import AST.Expression.IdentifierExpression;
import IR.FunctionBlock;
import SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class FunctionDeclaration extends TranslationUnit {
    public TypeNode typeNode;
    public String id;
    public List<VariableDeclarationStatement> argumentlist = new ArrayList<>();
    public List<Statement> bodyStatements = new ArrayList<>();
    public Block body;
    public FunctionBlock functionBlock;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FunctionDeclaration: " + "id = " + id;
    }

}
