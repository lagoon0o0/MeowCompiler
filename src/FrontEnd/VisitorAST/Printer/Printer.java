package FrontEnd.VisitorAST.Printer;

import AST.*;
import AST.Expression.*;
import AST.Statement.*;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TypeNode.*;
import FrontEnd.VisitorAST.Visitor;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class Printer implements Visitor {
    public  int depth = -1;
    void indent(int length) {
        for(int i = 1; i <= length; ++i)
            System.out.printf("\t");
    }
    void print(String content) {
        indent(depth);
        System.out.print(content + "\n");
    }
    @Override
    public void visit(AstNode ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(BinaryExpression ctx) {
        depth++;
        print(ctx.toString());
        print("operator:");
        print(ctx.operator.toString());
        print("lhs");
        visit(ctx.lhs);
        print("rhs");
        visit(ctx.rhs);
        depth--;
    }

    @Override
    public void visit(Block ctx) {
        depth++;
        print(ctx.toString());
        for(int i = 0; i < ctx.list.size(); ++i) {
            print("child" + i + ":");
            visit(ctx.list.get(i));
        }
        depth--;
    }

    @Override
    public void visit(BoolExpression ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(BracketExpression ctx) {
        depth++;
        print(ctx.toString());
        print("name:");
        visit(ctx.name);
        print("subscript");
        visit(ctx.subscript);
        depth--;
    }

    @Override
    public void visit(BreakStatement ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(ClassDeclaration ctx) {
        depth++;
        print(ctx.toString());
        print("fieldList:");
        for(int i = 0; i < ctx.fieldList.size(); ++i) {
            visit(ctx.fieldList.get(i));
        }
        depth--;
    }

    @Override
    public void visit(ContinueStatement ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(CreatorExpression ctx) {
        depth++;
        print(ctx.toString());
        print("typeNodeName:");
        visit(ctx.typeNodeName);
        print("dimensionSize: " + ctx.dimensionSize.size());
        for(int i = 0; i < ctx.dimensionSize.size(); ++i) {
            print(""+ctx.dimensionSize.get(i));
        }
        depth--;
    }

    @Override
    public void visit(FunctionDeclaration ctx) {
        depth++;
        print(ctx.toString());
        print("typeNode:");
        visit(ctx.typeNode);
        print("argumentlist: " + ctx.argumentlist.size());
        for(int i = 0; i < ctx.argumentlist.size(); ++i) {
            print("child: " + i);
            visit(ctx.argumentlist.get(i));
        }
        print("body:");
        visit(ctx.body);
        depth--;
    }

    @Override
    public void visit(IdentifierExpression ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(IfStatement ctx) {
        depth++;
        print(ctx.toString());
        print("condition:");
        visit(ctx.condition);
        print("bodyThen:");
        visit(ctx.bodyThen);
        print("bodyElse");
        if(ctx.bodyElse != null)
            visit(ctx.bodyElse);
        depth--;
    }

    @Override
    public void visit(IntExpression ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(MemberExpression ctx) {
        depth++;
        print(ctx.toString());
        print("parent:");
        visit(ctx.parent);
        depth--;
    }

    @Override
    public void visit(NullExpression ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(ParenExpression ctx) {
        depth++;
        print(ctx.toString());
        print("functionId:");
        visit(ctx.functionId);
        print("argumentList:" + ctx.argumentList.size());
        for(int i = 0; i < ctx.argumentList.size(); ++i) {
            print("child :" + i);
            visit(ctx.argumentList.get(i));
        }
        depth--;
    }

    @Override
    public void visit(PostfixExpression ctx) {
        depth++;
        print(ctx.toString());
        print("operator: " + ctx.operator.toString());
        print("expression: ");
        visit(ctx.expression);
        depth--;
    }

    @Override
    public void visit(Program ctx) {
        depth++;
        print(ctx.toString());
        print("list: " + ctx.list.size());
        for(int i = 0; i < ctx.list.size(); ++i) {
            print("child: " + i);
            visit(ctx.list.get(i));
        }
        depth--;
    }

    @Override
    public void visit(ReturnStatement ctx) {
        depth++;
        print(ctx.toString());
        print("value:");
        if(ctx.value != null)
            visit(ctx.value);
        depth--;
    }

    @Override
    public void visit(StringLiteralExpression ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }



    @Override
    public void visit(UnaryExpression ctx) {
        depth++;
        print(ctx.toString());
        print("operator:" + ctx.operator.toString());
        print("expression:");
        visit(ctx.expression);
        depth--;
    }

    @Override
    public void visit(VariableDeclarationStatement ctx) {
        visit(ctx.declaration);
    }

    @Override
    public void visit(VariableDeclarationStatement.VariableDeclaration ctx) {
        depth++;
        print(ctx.toString());
        print("typeNode:");
        visit(ctx.typeNode);
        print("initValue:");
        visit(ctx.initValue);
        depth--;
    }

    @Override
    public void visit(WhileStatement ctx) {
        depth++;
        print(ctx.toString());
        print("condition:");
        visit(ctx.condition);
        print("body:");
        visit(ctx.body);
        depth--;
    }

    @Override
    public void visit(EmptyExpression ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(ForStatement ctx) {
        depth++;
        print(ctx.toString());
        print("init:");
        visit(ctx.init);
        print("condition:");
        visit(ctx.condition);
        print("update:");
        visit(ctx.update);
        depth--;
    }

    @Override
    public void visit(ClassTypeNode ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(ArrayTypeNode ctx) {
        depth++;
        print(ctx.toString());
        print("bodyTypeNode");
        visit(ctx.bodyTypeNode);
        depth--;
    }

    @Override
    public void visit(FunctionTypeNode ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

    @Override
    public void visit(PrimitiveTypeNode ctx) {
        depth++;
        print(ctx.toString());
        depth--;
    }

}
