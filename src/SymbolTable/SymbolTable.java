package SymbolTable;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class SymbolTable {
    public static final String INT = "int";
    public static final String BOOL = "bool";
    public static final String STRING = "string";
    public static final String VOID = "void";
    public static final String NULL = "null";
    Scope currentScope;
    public SymbolTable() {
        currentScope = new GlobalScope(null);
        final String[] primitiveTypes = {
                INT, BOOL, STRING, VOID, NULL
        };
        for (String primitiveType : primitiveTypes) {
            currentScope.define(new PrimitiveType(primitiveType));
        }
    }
    public Scope getCurrentScope() {
        return currentScope;
    }
    public void push(Scope scope) {
        currentScope = scope;
    }
    public void pop() {
        currentScope = currentScope.getEnclosingScope();
    }
}
