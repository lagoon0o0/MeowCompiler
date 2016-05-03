package SymbolTable;

import AST.TypeNode.TypeNode;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class PrimitiveType extends ScopedSymbol implements Type{

    PrimitiveType(String name, Type type, Scope enclosingScope) {
        super(name,type,enclosingScope);
    }
    PrimitiveType(String name, Scope enclosingScope) {
        super(name, null, enclosingScope);
        type = this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean compatibleWith(Type ctx) {
        return ctx instanceof PrimitiveType && name.equals(((PrimitiveType) ctx).name);
    }
}
