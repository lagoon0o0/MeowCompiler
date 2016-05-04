package IR;

import IRVisitor.Visitor;
import SymbolTable.FunctionSymbol;

import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionCallInstruction extends Instruction {
    public Register destination;
    public FunctionSymbol function;
    public List<Value> argumentList;
    public FunctionCallInstruction(Register aDestination, FunctionSymbol aFunction, List<Value> anArgumentList) {
        destination = aDestination;
        function = aFunction;
        argumentList = anArgumentList;
        index = ++total;
    }
     public FunctionCallInstruction( FunctionSymbol aFunction, List<Value> anArgumentList) {
        function = aFunction;
        argumentList = anArgumentList;
        index = ++total;
    }
    public String toString() {
        String ret = "call" + " " + function.getName() + " ";
        for (Value x : argumentList) {
            ret += x.toString() + " ";
        }
        if(destination == null)
            return ret;
        else
            return destination.toString() + " = " + ret;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
