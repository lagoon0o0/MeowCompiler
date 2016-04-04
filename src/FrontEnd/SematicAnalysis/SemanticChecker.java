package FrontEnd.SematicAnalysis;

import FrontEnd.VisitorAST.ASTBaseVisitor;
import SymbolTable.SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class SemanticChecker extends ASTBaseVisitor {
    SymbolTable symbolTable;
    CompilationError compilationError;
    SemanticChecker(SymbolTable aSymbolTable, CompilationError aCompilationError) {
        symbolTable = aSymbolTable;
        compilationError = aCompilationError;
    }
}
