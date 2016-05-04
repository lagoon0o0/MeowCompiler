/**
 * Created by lagoon0o0 on 16/3/28.
 */
import FrontEnd.CstListenerAndVisitor.MeowASTListener;
import FrontEnd.IRGeneratorVisitor;
import FrontEnd.LexarAndPaser.*;
import FrontEnd.SematicAnalysis.CompilationError;
import FrontEnd.SematicAnalysis.Phase1;
import FrontEnd.SematicAnalysis.Phase2;
import FrontEnd.SematicAnalysis.Phase3;
import FrontEnd.VisitorAST.ASTPrinter;
import IR.IRRoot;
import IRVisitor.IRPrinter;
import LivenessAnalysis.*;
import MIPS.CISCTranslator;
import MIPS.CalcFrame;
import SymbolTable.SymbolTable;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import AST.AstNode;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        boolean CISC = false;
        InputStream is = new FileInputStream("sample/sample0.mx"); // or System.in;
        PrintStream src = new PrintStream(new FileOutputStream("out/src.s"));

        //InputStream is = System.in;
        //try {
        ByteArrayOutputStream mySrcTextOut = new ByteArrayOutputStream();
        PrintStream mySrcPrint = new PrintStream(mySrcTextOut);
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
        ASTPrinter printer = new ASTPrinter();
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
        IRPrinter irPrinter = new IRPrinter(System.out);

        //System.out.print("------ir--------\n");

        //irPrinter.visit(irRoot);

        if(!CISC) {
            // Liveness Analysis

            CalcVirtualRegisterIndex calcVirtualRegisterIndex = new CalcVirtualRegisterIndex();
            calcVirtualRegisterIndex.visit(irRoot);

            BuildGraph buildGraph = new BuildGraph();
            buildGraph.visit(irRoot);

            CalcLiveness calcLiveness = new CalcLiveness();
            calcLiveness.visit(irRoot);

            BuildInterferenceGraph buildInterferenceGraph = new BuildInterferenceGraph();
            buildInterferenceGraph.visit(irRoot);


            PrintLiveness printLiveness = new PrintLiveness(System.out);
            printLiveness.visit(irRoot);



        } else {
            // CISC Translation
            CalcFrame calcFrame = new CalcFrame();
            calcFrame.visit(irRoot);


            CISCTranslator ciscTranslator = new CISCTranslator(mySrcPrint);
            //System.out.print("------mips--------\n");
            ciscTranslator.visit(irRoot);

            BufferedReader lib = new BufferedReader(new FileReader("lib/mylib.s"));
            for(String line = lib.readLine();line != null ; line = lib.readLine()) {
                src.println(line);
            }
            byte[] mySrcText = mySrcTextOut.toByteArray();
            BufferedReader my = new BufferedReader(new InputStreamReader(new ByteInputStream(mySrcText,mySrcText.length)));
            for(String line = my.readLine();line != null ; line = my.readLine()) {
                src.println(line);
            }
        }

        /*
        Process process = Runtime.getRuntime().exec("out/spim -ldata 10000000000 -stat -file out/src.s");
        OutputStream tmp = process.getOutputStream();
        PrintStream data = new PrintStream(tmp);
        data.println("168");
        tmp.close();
        InputStreamReader rr = new InputStreamReader(process.getErrorStream());
        InputStreamReader ir = new InputStreamReader(process.getInputStream());
        BufferedReader bufferedReader = new BufferedReader (ir);
        String line;
        while ((line = bufferedReader.readLine()) != null)
        System.out.println(line);
        bufferedReader = new BufferedReader (rr);
        while ((line = bufferedReader.readLine()) != null)
        System.out.println(line);
        */
        //System.out.print("Passed!\n");
        //}
        /*catch (Exception e) {

            System.out.print("Compilation Error!\n");

            System.exit(1);
        }*/
    }
}
