package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class VariableSymbol extends Symbol{
    int position;
    public VariableSymbol(String name, Type type) {
        super(name, type);
    }
}
