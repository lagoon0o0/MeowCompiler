import AST.AstNode;
import FrontEnd.CstListenerAndVisitor.MeowASTListener;
import FrontEnd.IRGeneratorVisitor;
import FrontEnd.LexarAndPaser.MeowLexer;
import FrontEnd.LexarAndPaser.MeowParser;
import FrontEnd.SematicAnalysis.CompilationError;
import FrontEnd.SematicAnalysis.Phase1;
import FrontEnd.SematicAnalysis.Phase2;
import FrontEnd.SematicAnalysis.Phase3;
import IR.IRRoot;
import IRVisitor.IRPrinter;
import SymbolTable.SymbolTable;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.fail;

/**
 * Created by abcdabcd987 on 2016-04-13.
 */
@RunWith(Parameterized.class)
public class IRBuilderTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        for (File f : new File("compiler2016-testcases/ir/").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                params.add(new Object[] { "compiler2016-testcases/ir/" + f.getName() });
            }
        }
        return params;
    }
    private String filename;
    public IRBuilderTest(String filename) {
        this.filename = filename;
    }
    @Test
    public void testPass() throws IOException, InterruptedException {
        System.out.println(filename);

        ByteArrayOutputStream irTextOut = new ByteArrayOutputStream();
        OutputStream tee = new TeeOutputStream(System.out, irTextOut); // if you need this, check out: https://gist.github.com/abcdabcd987/dbc9c82ccba90707da3e6f7d47a6468f
        PrintStream out = new PrintStream(tee);

        // ... Run your compiler
        InputStream is = new FileInputStream(filename);
        ANTLRInputStream input = new ANTLRInputStream(is);
        MeowLexer lexer = new MeowLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeowParser parser = new  MeowParser(tokens);
        ParseTree tree = parser.program(); // calc is the starting rule
        /*
        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();
        System.out.println("FrontEnd.VisitorAST.Visitor:");
        MeowBaseVisitor evalByVisitor = new  MeowBaseVisitor();
        evalByVisitor.visit(tree);
        System.out.println();
        */
        //System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        MeowASTListener Listener = new MeowASTListener();
        walker.walk(Listener, tree);
        AstNode root =  Listener.astRoot;
        //ASTPrinter printer = new ASTPrinter();
        //printer.visit(root);

        SymbolTable symbolTable = new SymbolTable();
        CompilationError compilationError = new CompilationError();
        Phase1 phase1 = new Phase1(symbolTable, compilationError);
        phase1.visit(root);
        Phase2 phase2 = new Phase2(symbolTable, compilationError);
        phase2.visit(root);
        Phase3 phase3 = new Phase3(symbolTable, compilationError);
        phase3.visit(root);
        IRGeneratorVisitor irGeneratorVisitor = new IRGeneratorVisitor(symbolTable);

        irGeneratorVisitor.visit(root);
        IRRoot irRoot = irGeneratorVisitor.irRoot;
        IRPrinter irPrinter = new IRPrinter(out);
        irPrinter.visit(irRoot);

        out.flush();
        irTextOut.close();

        // Run the virtual machine
        byte[] irText = irTextOut.toByteArray();
        ByteInputStream vmIn = new ByteInputStream(irText, irText.length);
        LLIRInterpreter vm = new LLIRInterpreter(vmIn,false);
        vm.run();

        // Assert result
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        do {
            line = br.readLine();
        } while (!line.startsWith("/*! assert:"));
        String assertion = line.replace("/*! assert:", "").trim();
        if (assertion.equals("exitcode")) {
            int expected = Integer.valueOf(br.readLine().trim());
            if (vm.getExitcode() != expected)
                throw new RuntimeException("exitcode = " + vm.getExitcode() + ", expected: " + expected);
        } else if (assertion.equals("exception")) {
            if (!vm.exitException())
                throw new RuntimeException("exit successfully, expected an exception.");
        } else {
            throw new RuntimeException("unknown assertion.");
        }
        br.close();
    }
}