package IR;

import SymbolTable.FunctionSymbol;
import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionBlock {
    FunctionSymbol function;
    List<Register> argumentList = new ArrayList<>();
    List<BasicBlock> basicBlockList = new ArrayList<>();
    BasicBlock entryBlock;
    public void add(BasicBlock x) {
        if(basicBlockList.size() == 0)
            entryBlock = x;
        basicBlockList.add(x);
    }
    FunctionBlock(FunctionSymbol aFunction, List<Register> anArgumentList, List<BasicBlock> anBasicBlockList, BasicBlock anEntryBlock) {
        function = aFunction;
        argumentList = anArgumentList;
        basicBlockList = anBasicBlockList;
        entryBlock = anEntryBlock;
    }
}
