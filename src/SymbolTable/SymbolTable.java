package SymbolTable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class SymbolTable {
    public static final String INT = "int";
    public static final String BOOL = "bool";
    public static final String STRING = "string";
    public static final String VOID = "void";
    public static final String NULL = "null";
    Map<String,Integer> sizeTable;
    Scope currentScope, globalScope;
    public SymbolTable() {

        currentScope = new GlobalScope(null);
        globalScope = currentScope;
        sizeTable = new LinkedHashMap<>();
        // Define primitive types
        final String[] primitiveTypes = {
                INT, BOOL, STRING, VOID, NULL
        };
        sizeTable.put(INT, 4);
        sizeTable.put(BOOL,1);
        sizeTable.put(STRING,8);
        for (String primitiveType : primitiveTypes) {
            currentScope.define(new PrimitiveType(primitiveType,currentScope));
        }
        // Define System Functions
        SymbolTable symbolTable = this;
        currentScope.define(new FunctionSymbol("print", currentScope.resolve(VOID).type, currentScope, new ArrayList<Type>()) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        currentScope.define(new FunctionSymbol("println", currentScope.resolve(VOID).type, currentScope, new ArrayList<Type>()) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        currentScope.define(new FunctionSymbol("getString", currentScope.resolve(STRING).type, currentScope));
        currentScope.define(new FunctionSymbol("getInt", currentScope.resolve(INT).type, currentScope));
        currentScope.define(new FunctionSymbol("toString", currentScope.resolve(STRING).type, currentScope, new ArrayList<Type>()) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        // Define Member Functions
        PrimitiveType stringType = (PrimitiveType) currentScope.resolve(STRING);
        push(stringType);
        currentScope.define(new FunctionSymbol("length", currentScope.resolve(INT).type, currentScope));
        currentScope.define(new FunctionSymbol("substring", currentScope.resolve(STRING).type, currentScope, new ArrayList<Type>()) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(INT));
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        currentScope.define(new FunctionSymbol("parseInt", currentScope.resolve(INT).type, currentScope));
        currentScope.define(new FunctionSymbol("ord", currentScope.resolve(INT).type, currentScope, new ArrayList<Type>()) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        pop();
    }
    public Scope getGlobalScope() {return globalScope;}
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
