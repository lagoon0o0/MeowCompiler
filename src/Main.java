/**
 * Created by lagoon0o0 on 16/3/28.
 */
import FrontEnd.CstListenerAndVisitor.MeowASTListener;
import FrontEnd.CstListenerAndVisitor.MeowLexer;
import FrontEnd.CstListenerAndVisitor.MeowParser;
import FrontEnd.SematicAnalysis.CompilationError;
import FrontEnd.SematicAnalysis.Phase1;
import FrontEnd.SematicAnalysis.Phase2;
import FrontEnd.SematicAnalysis.Phase3;
import FrontEnd.VisitorAST.Printer.Printer;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import AST.AstNode;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/lagoon0o0/Documents/Compiler/Meow/compiler2016-testcases/passed/basicopt1-5100309127-hetianxing.mx"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        MeowLexer lexer = new MeowLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeowParser parser = new  MeowParser(tokens);
        ParseTree tree = parser.program(); // calc is the starting rule

        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

        /*
        System.out.println("FrontEnd.VisitorAST.Visitor:");
        MeowBaseVisitor evalByVisitor = new  MeowBaseVisitor();
        evalByVisitor.visit(tree);
        System.out.println();
        */

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        MeowASTListener Listener = new MeowASTListener();
        walker.walk(Listener, tree);
        AstNode root =  Listener.astRoot;
        Printer printer = new Printer();
        printer.visit(root);

        SymbolTable symbolTable = new SymbolTable();
        CompilationError compilationError = new CompilationError();
        Phase1 phase1 = new Phase1(symbolTable, compilationError);
        phase1.visit(root);
        Phase2 phase2 = new Phase2(symbolTable, compilationError);
        phase2.visit(root);
        Phase3 phase3 = new Phase3(symbolTable, compilationError);
        phase3.visit(root);

    }
}