package SymbolTable;

import IR.FunctionBlock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class FunctionSymbol extends ScopedSymbol {
    public FunctionBlock functionBlock;
    public List<Type> argumentTypeList;
    public FunctionSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type, enclosingScope);
        argumentTypeList = new ArrayList<>();
    }
    public FunctionSymbol(String name, Type type, Scope enclosingScope, List<Type> anArgumentList) {
        super(name, type, enclosingScope);
        argumentTypeList = anArgumentList;
    }
    public void addArgument(Type type) {
        argumentTypeList.add(type);
    }

}
