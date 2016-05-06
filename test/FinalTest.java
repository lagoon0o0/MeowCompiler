import AST.AstNode;
import FrontEnd.CstListenerAndVisitor.MeowASTListener;
import FrontEnd.IRGeneratorVisitor;
import FrontEnd.LexarAndPaser.MeowLexer;
import FrontEnd.LexarAndPaser.MeowParser;
import FrontEnd.SematicAnalysis.CompilationError;
import FrontEnd.SematicAnalysis.Phase1;
import FrontEnd.SematicAnalysis.Phase2;
import FrontEnd.SematicAnalysis.Phase3;
import FrontEnd.VisitorAST.ASTPrinter;
import IR.IRRoot;
import IRVisitor.IRPrinter;
import MIPS.*;
import RegisterAllocation.*;
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

/**
 * Created by abcdabcd987 on 2016-04-13.
 */
@RunWith(Parameterized.class)
public class FinalTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        for (File f : new File("compiler2016-testcases/passed/").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                String prefix = "compiler2016-testcases/passed/" + f.getName().substring(0,f.getName().length()-3);
                String filename = prefix + ".mx";
                String inputname = prefix + ".in";
                String outputname = prefix + ".out";
                params.add(new Object[] {filename,inputname,outputname});
            }
        }
        return params;
    }
    private String filename,inputname,outputname;
    public FinalTest(String filename, String inputname, String outputname) {
        this.filename = filename;
        this.inputname = inputname;
        this.outputname = outputname;
    }
    @Test
    public void testPass() throws IOException, InterruptedException {
        boolean CISC = false;
        System.out.println(filename);
        InputStream is = new FileInputStream(filename);
        PrintStream srcfile = new PrintStream(new FileOutputStream("out/src.s"));
        ByteArrayOutputStream mipsTextOut = new ByteArrayOutputStream(); // out put your mips code into mipsTextOut
        PrintStream out = new PrintStream(mipsTextOut);
        PrintStream debug = new PrintStream(new FileOutputStream("out/test_bug.R"));

        // run compiler
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

        IRPrinter irPrinter = new IRPrinter(debug);

        //System.out.print("------ir--------\n");
        irPrinter.visit(irRoot);

        if(CISC) {
            CISCCalcFrame calcFrame = new CISCCalcFrame();
            calcFrame.visit(irRoot);

            CISCTranslator ciscTranslator = new CISCTranslator(mySrcPrint);
            //System.out.print("------mips--------\n");

            ciscTranslator.visit(irRoot);

        } else {
            CalcVirtualRegisterIndex calcVirtualRegisterIndex = new CalcVirtualRegisterIndex();
            calcVirtualRegisterIndex.visit(irRoot);

            BuildGraph buildGraph = new BuildGraph();
            buildGraph.visit(irRoot);

            CalcLiveness calcLiveness = new CalcLiveness(debug);
            calcLiveness.visit(irRoot);

            BuildInterferenceGraph buildInterferenceGraph = new BuildInterferenceGraph(debug);
            buildInterferenceGraph.visit(irRoot);

            GraphColoring graphColoring = new GraphColoring(debug);
            graphColoring.visit(irRoot);


            ReplaceRegister replaceRegister = new ReplaceRegister();
            replaceRegister.visit(irRoot);

            RISCCalcFrame riscCalcFrame = new RISCCalcFrame();
            riscCalcFrame.visit(irRoot);

            RISCTranslator riscTranslator = new RISCTranslator(mySrcPrint);
            riscTranslator.visit(irRoot);




            PrintLiveness printLiveness = new PrintLiveness(debug);
            printLiveness.visit(irRoot);
        }

        BufferedReader lib = new BufferedReader(new FileReader("lib/mylib.s"));
        for(String line = lib.readLine();line != null ; line = lib.readLine()) {
            out.println(line);
        }
        byte[] mySrcText = mySrcTextOut.toByteArray();
        BufferedReader my = new BufferedReader(new InputStreamReader(new ByteInputStream(mySrcText,mySrcText.length)));
        for(String line = my.readLine();line != null ; line = my.readLine()) {
            out.println(line);
        }

        // check answer
        out.flush();
        mipsTextOut.close();

        byte[] mipsText = mipsTextOut.toByteArray();
        BufferedReader mipsBuffered = new BufferedReader(new InputStreamReader(new ByteInputStream(mipsText, mipsText.length)));
        for(String line = mipsBuffered.readLine();line != null ; line = mipsBuffered.readLine()) {
            srcfile.println(line);
        }
        Process process = Runtime.getRuntime().exec("out/spim -lstack 10000000000 -ldata 10000000000 -stat -file out/src.s");
        PrintStream dataEntry = new PrintStream(process.getOutputStream());
        InputStreamReader sys = new InputStreamReader(process.getErrorStream());
        InputStreamReader usr = new InputStreamReader(process.getInputStream());

        BufferedReader data;
        try {
            data =  new BufferedReader(new FileReader(inputname));
        } catch (Exception e) {
            System.out.println("No input");
            data = new BufferedReader(new FileReader(filename));
        }


        String line;
        while ((line = data.readLine()) != null)
            dataEntry.println(line);
        dataEntry.flush();
        boolean hasOut = true;
        try {
            BufferedReader temp = new BufferedReader(new FileReader(outputname));
        }catch (Exception e) {
            hasOut = false;
        }
        if(hasOut) {
            BufferedReader stdOut = new BufferedReader(new FileReader(outputname));
            BufferedReader usrOut = new BufferedReader(usr);
            String stdLine,usrLine;
            for(int i = 1;; ++i) {
                stdLine = stdOut.readLine();
                usrLine = usrOut.readLine();
                if(stdLine == null && usrLine == null)
                    break;
                if(stdLine == null || usrLine == null || !stdLine.equals(usrLine)) {
                    throw new RuntimeException("WA on line " + i + ": "+ stdLine + " vs " + usrLine);
                }
            }
            System.out.println("Yes!");
        } else {
            throw new RuntimeException("No std out");
            /*System.out.println("No std output, usr out put:");
            BufferedReader usrOut = new BufferedReader(usr);
            String usrLine;
            for(int i = 1;; ++i) {
                usrLine = usrOut.readLine();
                if(usrLine == null)
                    break;
                System.out.println(usrLine);
            }*/
        }


        BufferedReader sysBuff = new BufferedReader(sys);
        int tot = 0;
        while((line = sysBuff.readLine()) != null) {
            tot++;
            System.out.println(line);
        }
        if(tot > 2)
            throw new RuntimeException("RE");
    }
}