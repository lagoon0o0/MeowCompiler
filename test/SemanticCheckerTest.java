import AST.AstNode;
import FrontEnd.CstListenerAndVisitor.MeowASTListener;
import FrontEnd.CstListenerAndVisitor.MeowLexer;
import FrontEnd.CstListenerAndVisitor.MeowParser;
import FrontEnd.SematicAnalysis.CompilationError;
import FrontEnd.SematicAnalysis.Phase1;
import FrontEnd.SematicAnalysis.Phase2;
import FrontEnd.SematicAnalysis.Phase3;
import FrontEnd.VisitorAST.Printer.Printer;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.fail;

/**
 * Created by abcdabcd987 on 2016-04-02.
 */
@RunWith(Parameterized.class)
public class SemanticCheckerTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        for (File f : new File("compiler2016-testcases/passed/").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                params.add(new Object[] { "compiler2016-testcases/passed/" + f.getName(), true });
            }
        }
        for (File f : new File("compiler2016-testcases/compile_error").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                params.add(new Object[] { "compiler2016-testcases/compile_error" + f.getName(), false });
            }
        }
        return params;
    }

    private String filename;
    private boolean shouldPass;

    public SemanticCheckerTest(String filename, boolean shouldPass) {
        this.filename = filename;
        this.shouldPass = shouldPass;
    }

    @Test
    public void testPass() throws IOException {
        System.out.println(filename);

        try {
            InputStream is = new FileInputStream(filename); // or System.in;
            ANTLRInputStream input = new ANTLRInputStream(is);

            MeowLexer lexer = new MeowLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MeowParser parser = new  MeowParser(tokens);
            ParseTree tree = parser.program(); // calc is the starting rule

            System.out.println("LISP:");
            System.out.println(tree.toStringTree(parser));
            System.out.println();

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

            if (!shouldPass) fail("Should not pass.");
        } catch (Exception e) {
            if (shouldPass) throw e;
            else e.printStackTrace();
        }
    }
}