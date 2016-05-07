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
                String limitname = prefix + ".limit";
                params.add(new Object[] {filename,inputname,outputname,limitname});
            }
        }
        return params;
    }
    private String filename,inputname,outputname,limitname;
    public FinalTest(String filename, String inputname, String outputname, String limitname) {
        this.filename = filename;
        this.inputname = inputname;
        this.outputname = outputname;
        this.limitname = limitname;
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
        if(CISC)
            Main.runCISC(is,mySrcPrint,debug,false);
        else
            Main.runRISC(is,mySrcPrint,debug,false);
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
        boolean hasLimit = true;
        try {
            data =  new BufferedReader(new FileReader(limitname));
        } catch (Exception e) {
            hasLimit = false;
            System.out.println("No limit");
            data = new BufferedReader(new FileReader(filename));
        }
        if(hasLimit) {
            BufferedReader sysBuff = new BufferedReader(sys);
            int tot = 0;
            String info = "";
            while((line = sysBuff.readLine()) != null) {
                tot++;
                if(tot == 2) {
                    info = line;
                }
                System.out.println(line);
            }
            if(tot > 2)
                throw new RuntimeException("RE");
            String[] arr = info.split("\t");
            int myTotal = Integer.valueOf(arr[2]);
            int stdTotal = Integer.valueOf(data.readLine());
            System.out.print(myTotal +  " vs " + stdTotal + " ratio = " + (double)myTotal / stdTotal +"\n");
            if(myTotal > stdTotal) {
                throw new RuntimeException("limitation exceeded");
            }
        } else {
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
}