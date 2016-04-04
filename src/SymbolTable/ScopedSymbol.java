package SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
abstract public class ScopedSymbol extends Symbol implements Scope{
    public Map<String, Symbol> field = new LinkedHashMap<>();
    public Scope enclosingScope;
    ScopedSymbol(String name, Type type, Scope aEnclosingScope) {
        super(name, type);
        enclosingScope = aEnclosingScope;
    }

    @Override
    public String getScopeName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }
    @Override
    public Symbol resolve(String name) {
        Symbol s = field.get(name);
        if(s != null) {
            return s;
        }
        if(enclosingScope != null) {
            return enclosingScope.resolve(name);
        }
        return null;
    }

    @Override
    public boolean define(Symbol sym) {
        if(field.containsKey(sym.name))
            return false;
        field.put(sym.name, sym);
        return true;
    }
}
