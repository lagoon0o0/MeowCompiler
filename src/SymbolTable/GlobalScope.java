package SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class GlobalScope extends BaseScope {
    GlobalScope(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }
    GlobalScope(Scope enclosingScope) {
        super("aGlobalScope", enclosingScope);
    }

}
