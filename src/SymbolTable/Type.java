package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public interface Type {
    boolean compatibleWith(Type ctx);
    String  getName();
}
