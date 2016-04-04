package SymbolTable;


/**
 * Created by lagoon0o0 on 16/4/3.
 */
abstract public class Symbol {
    public String name;
    public Type type;
    Symbol(String aName, Type aType) {
        name = aName;
        type = aType;
    }
    public String getName() {
        return name;
    }
    public Type getType() {
        return type;
    }
}
