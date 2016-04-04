package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class LocalScope extends BaseScope{
    public LocalScope(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }
    public LocalScope(Scope enclosingScope) {
        super("aLocalScope", enclosingScope);
    }
}
