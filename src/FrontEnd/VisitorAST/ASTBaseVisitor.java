package FrontEnd.VisitorAST;

import AST.Expression.*;
import AST.AstNode;
import AST.Program;
import AST.Statement.*;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TypeNode.ArrayTypeNode;
import AST.TypeNode.ClassTypeNode;
import AST.TypeNode.FunctionTypeNode;
import AST.TypeNode.PrimitiveTypeNode;
import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class ASTBaseVisitor implements Visitor {
    @Override
    public void visit(AstNode ctx) {
        ctx.accept(this);
    }
    @Override
    public void visit(Program ctx) {

    }

    @Override
    public void visit(BinaryExpression ctx) {

    }

    @Override
    public void visit(BoolExpression ctx) {

    }

    @Override
    public void visit(BracketExpression ctx) {

    }

    @Override
    public void visit(BreakStatement ctx) {

    }

    @Override
    public void visit(CreatorExpression ctx) {

    }

    @Override
    public void visit(EmptyExpression ctx) {

    }

    @Override
    public void visit(IdentifierExpression ctx) {

    }

    @Override
    public void visit(IntExpression ctx) {

    }

    @Override
    public void visit(MemberExpression ctx) {

    }

    @Override
    public void visit(NullExpression ctx) {

    }

    @Override
    public void visit(ParenExpression ctx) {

    }

    @Override
    public void visit(PostfixExpression ctx) {

    }

    @Override
    public void visit(StringLiteralExpression ctx) {

    }

    @Override
    public void visit(UnaryExpression ctx) {

    }

    @Override
    public void visit(Block ctx) {

    }

    @Override
    public void visit(ContinueStatement ctx) {

    }

    @Override
    public void visit(ForStatement ctx) {

    }

    @Override
    public void visit(ReturnStatement ctx) {

    }

    @Override
    public void visit(IfStatement ctx) {

    }

    @Override
    public void visit(VariableDeclarationStatement ctx) {

    }

    @Override
    public void visit(VariableDeclarationStatement.VariableDeclaration ctx) {

    }

    @Override
    public void visit(WhileStatement ctx) {

    }

    @Override
    public void visit(ClassDeclaration ctx) {

    }

    @Override
    public void visit(FunctionDeclaration ctx) {

    }

    @Override
    public void visit(ClassTypeNode ctx) {

    }

    @Override
    public void visit(ArrayTypeNode ctx) {

    }

    @Override
    public void visit(FunctionTypeNode ctx) {

    }

    @Override
    public void visit(PrimitiveTypeNode ctx) {

    }
}
