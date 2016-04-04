package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class ClassSymbol extends ScopedSymbol implements Type{
    public ClassSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type, enclosingScope);
    }
    public ClassSymbol(String name, Scope enclosingScope) {
        super(name, null, enclosingScope);
        type = this;
    }

    public Symbol resolveMember(String name) {
        return field.get(name);
    }

    @Override
    public boolean compatibleWith(Type ctx) {
        if(ctx.getName().equals(SymbolTable.NULL))
            return true;
        return ctx instanceof ClassSymbol && ((ClassSymbol) ctx).name.equals(name);
    }
}
