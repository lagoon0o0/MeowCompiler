package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class PrimitiveType extends Symbol implements Type{
    PrimitiveType(String name, Type type) {
        super(name,type);
    }
    PrimitiveType(String name) {
        super(name, null);
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
