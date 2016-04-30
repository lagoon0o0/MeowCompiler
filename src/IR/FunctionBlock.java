package IR;

import SymbolTable.FunctionSymbol;
import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionBlock {
    public FunctionSymbol function;
    public List<Register> argumentList = new ArrayList<>();
    public List<BasicBlock> basicBlockList = new ArrayList<>();
    public BasicBlock entryBlock;
    public void add(BasicBlock x) {
        if(basicBlockList.size() == 0)
            entryBlock = x;
        basicBlockList.add(x);
    }
    public FunctionBlock(FunctionSymbol aFunction) {
        function = aFunction;
    }
    public void print() {
        System.out.print("func " + function.getName() + " ");
        argumentList.stream().map(x -> x.toString() + " ").forEachOrdered(System.out :: print);
        System.out.print("{\n");
        basicBlockList.stream().forEachOrdered(x -> x.print());
        System.out.print("}\n");

    }
}
