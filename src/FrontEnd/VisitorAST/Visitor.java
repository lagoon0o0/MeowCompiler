package FrontEnd.VisitorAST;

import AST.*;
import AST.Expression.*;
import AST.Statement.*;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TypeNode.*;

/**
 * Created by lagoon0o0 on 16/3/28.
 */
public interface Visitor{

    public void visit(AstNode ctx);
    public void visit(Program ctx);

    // Expression
    public void visit(BinaryExpression ctx);
    public void visit(BoolExpression ctx);
    public void visit(BracketExpression ctx);
    public void visit(BreakStatement ctx);
    public void visit(CreatorExpression ctx);
    public void visit(EmptyExpression ctx);
    //public void visit(Expression ctx);
    public void visit(IdentifierExpression ctx);
    public void visit(IntExpression ctx);
    public void visit(MemberExpression ctx);
    public void visit(NullExpression ctx);
    public void visit(ParenExpression ctx);
    public void visit(PostfixExpression ctx);

    public void visit(StringLiteralExpression ctx);
    public void visit(UnaryExpression ctx);


    // Statement
    public void visit(Block ctx);
    public void visit(ContinueStatement ctx);
    public void visit(ForStatement ctx);
    public void visit(ReturnStatement ctx);
    public void visit(IfStatement ctx);
    //public void visit(Statement ctx);
    public void visit(VariableDeclarationStatement ctx);
    public void visit(VariableDeclarationStatement.VariableDeclaration ctx);
    public void visit(WhileStatement ctx);



    // TranslationUnit
    public void visit(ClassDeclaration ctx);
    public void visit(FunctionDeclaration ctx);
    //public void visit(TranslationUnit ctx);

    // TypeNode
    //public void visit(TypeNode ctx);
    public void visit(ClassTypeNode ctx);
    public void visit(ArrayTypeNode ctx);
    public void visit(FunctionTypeNode ctx);
    public void visit(PrimitiveTypeNode ctx);



}
