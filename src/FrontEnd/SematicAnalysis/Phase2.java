package FrontEnd.SematicAnalysis;

import AST.*;
import AST.Expression.EmptyExpression;
import AST.Statement.VariableDeclarationStatement;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TranslationUnit.TranslationUnit;
import AST.TypeNode.ArrayTypeNode;
import AST.TypeNode.ClassTypeNode;
import AST.TypeNode.FunctionTypeNode;
import AST.TypeNode.PrimitiveTypeNode;
import SymbolTable.*;

/**
 * Created by lagoon0o0 on 16/4/3.
 * 1)完成所有Class声明的解析
 * 2)完成函数返回值和参数列表的解析
 */
public class Phase2 extends SemanticChecker{
    public Phase2(SymbolTable symbolTable, CompilationError compilationError) {
        super(symbolTable,compilationError);
    }
    @Override
    public void visit(Program ctx) {
        for (TranslationUnit translationUnit : ctx.list) {
            if(translationUnit instanceof FunctionDeclaration || translationUnit instanceof ClassDeclaration) {
                visit(translationUnit);
            }
        }
    }
    @Override
    public void visit(VariableDeclarationStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.declaration);
    }

    @Override
    public void visit(VariableDeclarationStatement.VariableDeclaration ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.typeNode);
        Symbol symbol = new VariableSymbol(ctx.id, ctx.typeNode.type);
        if(!symbolTable.getCurrentScope().define(symbol)) {
            compilationError.add(ctx, "InvalidVariableDeclaration: " + ctx.id);
        }
        if(!(ctx.initValue instanceof EmptyExpression)
                && !ctx.typeNode.type.compatibleWith(ctx.initValue.type)) {
            compilationError.add(ctx, "InvalidInitValueType: " + ctx.initValue.type.getName());
        }
    }
    @Override
    public void visit(ClassDeclaration ctx) {   //???
        symbolTable.push((Scope) ctx.symbol);
        ctx.fieldList.stream().forEachOrdered(this::visit);
        symbolTable.pop();
    }
    @Override
    public void visit(FunctionDeclaration ctx) {
        symbolTable.getCurrentScope().define(ctx.symbol =  new FunctionSymbol(ctx.id, null, symbolTable.getCurrentScope()));
        symbolTable.push((Scope) ctx.symbol);
        visit(ctx.typeNode);
        ctx.symbol.type = ctx.typeNode.type;
        ctx.argumentlist.stream().forEachOrdered(this::visit);
        ctx.argumentlist.stream().forEachOrdered(x -> ((FunctionSymbol)ctx.symbol).addArgument(x.declaration.typeNode.type));
        symbolTable.pop();
        ctx.scope = symbolTable.getCurrentScope();
    }
    @Override
    public void visit(ClassTypeNode ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.typeName);
        if(symbol == null)
            compilationError.add(ctx,"ClassTypeName : " + ctx.typeName + " Not Found.");
        ctx.symbol = symbol;
        ctx.type = symbol.type;
        ctx.scope = symbolTable.getCurrentScope();
    }

    @Override
    public void visit(ArrayTypeNode ctx) {
        visit(ctx.bodyTypeNode);
        ctx.type = new ArrayType(ctx.bodyTypeNode.type);
    }

    @Override
    public void visit(FunctionTypeNode ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.typeName);
        if(symbol == null)
            compilationError.add(ctx,"FunctionTypeName : " + ctx.typeName + "Not Found.");
        ctx.symbol = symbol;
        ctx.type = symbol.type;
        ctx.scope = symbolTable.getCurrentScope();
    }

    @Override
    public void visit(PrimitiveTypeNode ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.typeName);
        if(symbol == null)
            compilationError.add(ctx,"PrimitiveTypeName : " + ctx.typeName + "Not Found.");
        ctx.symbol = symbol;
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbol.type;
    }
}
