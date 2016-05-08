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
import MIPS.*;
import Optimization.BuildCallingGraph;
import Optimization.CalcRegisterUsage;
import RegisterAllocation.*;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import AST.AstNode;

import java.io.*;
public class Main {

    static final boolean Debugging = false;
    public static void runRISC(InputStream is,PrintStream out, PrintStream debug, boolean Debugging) throws IOException {
        final boolean PrintAST = Debugging;
        final boolean PrintIR = Debugging;
        final boolean PrintLiveness = Debugging;

        ANTLRInputStream input = new ANTLRInputStream(is);

        // run lexer and parser
        MeowLexer lexer = new MeowLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeowParser parser = new  MeowParser(tokens);
        ParseTree tree = parser.program(); // calc is the starting rule

        // build ast
        ParseTreeWalker walker = new ParseTreeWalker();
        MeowASTListener Listener = new MeowASTListener();
        walker.walk(Listener, tree);
        AstNode astRoot =  Listener.astRoot;
        if(PrintAST) {
            ASTPrinter printer = new ASTPrinter(debug);
            printer.visit(astRoot);
        }
        //semantic check
        SymbolTable symbolTable = new SymbolTable();
        CompilationError compilationError = new CompilationError();
        Phase1 phase1 = new Phase1(symbolTable, compilationError);
        phase1.visit(astRoot);
        Phase2 phase2 = new Phase2(symbolTable, compilationError);
        phase2.visit(astRoot);
        Phase3 phase3 = new Phase3(symbolTable, compilationError);
        phase3.visit(astRoot);

        // generate IR
        IRGeneratorVisitor irGeneratorVisitor = new IRGeneratorVisitor(symbolTable);

        irGeneratorVisitor.visit(astRoot);
        IRRoot irRoot = irGeneratorVisitor.irRoot;


        if(PrintIR) {
            IRPrinter irPrinter = new IRPrinter(debug);
            irPrinter.visit(irRoot);
        }


        CalcVirtualRegisterIndex calcVirtualRegisterIndex = new CalcVirtualRegisterIndex();
        calcVirtualRegisterIndex.visit(irRoot);
        // build instructuon CFG
        BuildGraph buildGraph = new BuildGraph();
        buildGraph.visit(irRoot);

        // calc liveness info
        CalcLiveness calcLiveness = new CalcLiveness(debug);
        calcLiveness.visit(irRoot);

        // build interference graph
        BuildInterferenceGraph buildInterferenceGraph = new BuildInterferenceGraph(debug);
        buildInterferenceGraph.visit(irRoot);

        // alloc register with coloring
        GraphColoring graphColoring = new GraphColoring(debug);
        graphColoring.visit(irRoot);

        // build the calling graph
        BuildCallingGraph buildCallingGraph = new BuildCallingGraph(debug);
        buildCallingGraph.visit(irRoot);

        // calc register usage
        CalcRegisterUsage calcRegisterUsage = new CalcRegisterUsage();
        calcRegisterUsage.visit(irRoot);


        // replace virtual register with physical register
        ReplaceRegister replaceRegister = new ReplaceRegister();
        replaceRegister.visit(irRoot);

        // calculate the frame size
        RISCCalcFrame riscCalcFrame = new RISCCalcFrame();
        riscCalcFrame.visit(irRoot);




        // translate to mips
        RISCTranslator riscTranslator = new RISCTranslator(out);
        riscTranslator.visit(irRoot);

        if(PrintLiveness) {
            PrintLiveness printLiveness = new PrintLiveness(debug);
            printLiveness.visit(irRoot);
        }
    }
    public static void runCISC(InputStream is,PrintStream out, PrintStream debug,boolean Debuging) throws IOException {
        final boolean PrintAST = Debuging;
        final boolean PrintIR = Debuging;

        ANTLRInputStream input = new ANTLRInputStream(is);

        // run lexer and parser
        MeowLexer lexer = new MeowLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MeowParser parser = new  MeowParser(tokens);
        ParseTree tree = parser.program(); // calc is the starting rule

        // build ast
        ParseTreeWalker walker = new ParseTreeWalker();
        MeowASTListener Listener = new MeowASTListener();
        walker.walk(Listener, tree);
        AstNode root =  Listener.astRoot;
        if(PrintAST) {
            ASTPrinter printer = new ASTPrinter(debug);
            printer.visit(root);
        }
        //semantic check
        SymbolTable symbolTable = new SymbolTable();
        CompilationError compilationError = new CompilationError();
        Phase1 phase1 = new Phase1(symbolTable, compilationError);
        phase1.visit(root);
        Phase2 phase2 = new Phase2(symbolTable, compilationError);
        phase2.visit(root);
        Phase3 phase3 = new Phase3(symbolTable, compilationError);
        phase3.visit(root);

        // generate IR
        IRGeneratorVisitor irGeneratorVisitor = new IRGeneratorVisitor(symbolTable);

        irGeneratorVisitor.visit(root);
        IRRoot irRoot = irGeneratorVisitor.irRoot;

        if(PrintIR) {
            IRPrinter irPrinter = new IRPrinter(debug);
            irPrinter.visit(irRoot);
        }

        // CISC Translation
        CISCCalcFrame calcFrame = new CISCCalcFrame();
        calcFrame.visit(irRoot);


        CISCTranslator ciscTranslator = new CISCTranslator(out);
        //System.out.print("------mips--------\n");
        ciscTranslator.visit(irRoot);
    }

    public static void debug() throws IOException {
        boolean CISC = false;
        // for debug
        InputStream is = new FileInputStream("sample/sample0.mx"); // or System.in;
        PrintStream srcfile = new PrintStream(new FileOutputStream("out/src.s"));
        PrintStream debug = new PrintStream(new FileOutputStream("out/main_bug.R"));
        ByteArrayOutputStream mySrcTextOut = new ByteArrayOutputStream();
        PrintStream mySrcPrint = new PrintStream(mySrcTextOut);

        if(CISC) {
            runCISC(is,mySrcPrint,debug,true);
        } else {
            runRISC(is,mySrcPrint,debug,true);
        }


        // link and output
        BufferedReader lib = new BufferedReader(new FileReader("lib/mylib.s"));
        for(String line = lib.readLine();line != null ; line = lib.readLine()) {
            srcfile.println(line);
        }
        byte[] mySrcText = mySrcTextOut.toByteArray();
        BufferedReader my = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(mySrcText,0,mySrcText.length)));
        for(String line = my.readLine();line != null ; line = my.readLine()) {
            srcfile.println(line);
        }
    }

    public static void finaltest() throws IOException {
        boolean CISC = false;
        // for final test
        InputStream is = System.in;
        PrintStream srcfile = System.out;
        PrintStream debug = System.err;
        ByteArrayOutputStream mySrcTextOut = new ByteArrayOutputStream();
        PrintStream mySrcPrint = new PrintStream(mySrcTextOut);

        if(CISC) {
            runCISC(is,mySrcPrint,debug,false);
        } else {
            runRISC(is,mySrcPrint,debug,false);
        }
        // link and output
        BufferedReader lib = new BufferedReader(new FileReader("lib/mylib.s"));
        for(String line = lib.readLine();line != null ; line = lib.readLine()) {
            srcfile.println(line);
        }
        byte[] mySrcText = mySrcTextOut.toByteArray();
        BufferedReader my = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(mySrcText,0,mySrcText.length)));
        for(String line = my.readLine();line != null ; line = my.readLine()) {
            srcfile.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        if(Debugging)
            debug();
        else
            finaltest();
    }
}
