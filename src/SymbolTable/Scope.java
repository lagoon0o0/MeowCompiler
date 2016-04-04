package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public interface Scope {
    String getScopeName();
    Scope getEnclosingScope();
    boolean define(Symbol sym);
    Symbol resolve(String name);
}
