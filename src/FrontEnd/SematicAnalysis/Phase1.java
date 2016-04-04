package FrontEnd.SematicAnalysis;

import AST.Program;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.TranslationUnit;
import SymbolTable.*;

/**
 * Created by lagoon0o0 on 16/4/3.
 * 找到所有Class的名称
 */
public class Phase1 extends SemanticChecker {
    public Phase1(SymbolTable symbolTable, CompilationError compilationError) {
        super(symbolTable,compilationError);
    }

    @Override
    public void visit(Program ctx) {
        for (TranslationUnit translationUnit : ctx.list) {
            if(translationUnit instanceof ClassDeclaration) {
                visit(translationUnit);
            }
        }
    }
    @Override
    public void visit(ClassDeclaration ctx) {
        symbolTable.getCurrentScope().define(ctx.symbol = new ClassSymbol(ctx.id,symbolTable.getCurrentScope()));
        ctx.scope = symbolTable.getCurrentScope();
    }
}
