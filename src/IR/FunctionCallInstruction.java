package IR;

import SymbolTable.FunctionSymbol;

import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionCallInstruction extends Instruction{
    Register destination;
    FunctionSymbol function;
    List<Value> argumentList;
    FunctionCallInstruction(Register aDestination, FunctionSymbol aFunction, List<Value> anArgumentList) {
        destination = aDestination;
        function = aFunction;
        argumentList = anArgumentList;
    }
    FunctionCallInstruction( FunctionSymbol aFunction, List<Value> anArgumentList) {
        function = aFunction;
        argumentList = anArgumentList;
    }
}
