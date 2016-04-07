package SymbolTable;

import java.util.ArrayList;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class ArrayType extends BaseScope implements Type {
    public Type bodyType;

    public ArrayType(Type aBodyType, Scope enclosingScope) {
        super("ArrayType", enclosingScope);
        bodyType = aBodyType;
        define(new FunctionSymbol("size", resolve(SymbolTable.INT).type, this));
    }

    @Override
    public boolean compatibleWith(Type ctx) {
        if (ctx.getName().equals(SymbolTable.NULL))
            return true;
        if (ctx instanceof ArrayType)
            return bodyType.compatibleWith(((ArrayType) ctx).bodyType);
        return false;
    }

    @Override
    public String getName() {
        return bodyType.getName() + "[]";
    }

}
