package SymbolTable;

import IR.VirtualRegister;
import IR.StaticData;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class VariableSymbol extends Symbol{
    public VirtualRegister register;
    public boolean isStatic = false;
    public StaticData label;
    public VariableSymbol(String name, Type type) {
        super(name, type);
    }
}
