package SymbolTable;

import java.util.*;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class SymbolTable {
    public static final String INT = "int";
    public static final String BOOL = "bool";
    public static final String STRING = "string";
    public static final String VOID = "void";
    public static final String NULL = "null";
    Scope currentScope, globalScope;
    public SymbolTable() {
        currentScope = new GlobalScope(null);
        globalScope = currentScope;
        // Define primitive types
        final String[] primitiveTypes = {
                INT, BOOL, STRING, VOID, NULL
        };
        for (String primitiveType : primitiveTypes) {
            currentScope.define(new PrimitiveType(primitiveType,currentScope));
        }
        // Define System Functions
        SymbolTable symbolTable = this;
        currentScope.define(new FunctionSymbol("print", currentScope.resolve(VOID).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        currentScope.define(new FunctionSymbol("printInt", currentScope.resolve(VOID).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        currentScope.define(new FunctionSymbol("printlnInt", currentScope.resolve(VOID).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        currentScope.define(new FunctionSymbol("println", currentScope.resolve(VOID).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        currentScope.define(new FunctionSymbol("getString", currentScope.resolve(STRING).type, currentScope));
        currentScope.define(new FunctionSymbol("getInt", currentScope.resolve(INT).type, currentScope));
        currentScope.define(new FunctionSymbol("toString", currentScope.resolve(STRING).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        currentScope.define(new FunctionSymbol("stringConcatenate",currentScope.resolve(STRING).type, currentScope, new ArrayList<Type>()){
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        currentScope.define(new FunctionSymbol("stringIsEqual",currentScope.resolve(BOOL).type, currentScope, new ArrayList<Type>()){
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        currentScope.define(new FunctionSymbol("stringLess",currentScope.resolve(BOOL).type, currentScope, new ArrayList<Type>()){
            {
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
                addArgument((Type) symbolTable.currentScope.resolve(STRING));
            }
        });
        // Define Member Functions
        PrimitiveType stringType = (PrimitiveType) currentScope.resolve(STRING);
        push(stringType);
        currentScope.define(new FunctionSymbol(stringType.getName() + "." + "length", currentScope.resolve(INT).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(stringType.getName()));
            }
        });
        currentScope.define(new FunctionSymbol(stringType.getName() + "." + "substring", currentScope.resolve(STRING).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(stringType.getName()));
                addArgument((Type) symbolTable.currentScope.resolve(INT));
                addArgument((Type) symbolTable.currentScope.resolve(INT));
            }
        });
        currentScope.define(new FunctionSymbol(stringType.getName() + "." + "parseInt", currentScope.resolve(INT).type, currentScope){
            {
                addArgument((Type) symbolTable.currentScope.resolve(stringType.getName()));
            }
        });
        currentScope.define(new FunctionSymbol(stringType.getName() + "." + "ord", currentScope.resolve(INT).type, currentScope) {
            {
                addArgument((Type) symbolTable.currentScope.resolve(stringType.getName()));
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
