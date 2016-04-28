package IR;

import SymbolTable.FunctionSymbol;

import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionCallInstruction extends Instruction{
    public Register destination;
    public FunctionSymbol function;
    public List<Value> argumentList;
    public FunctionCallInstruction(Register aDestination, FunctionSymbol aFunction, List<Value> anArgumentList) {
        destination = aDestination;
        function = aFunction;
        argumentList = anArgumentList;
    }
     public FunctionCallInstruction( FunctionSymbol aFunction, List<Value> anArgumentList) {
        function = aFunction;
        argumentList = anArgumentList;
    }
}
