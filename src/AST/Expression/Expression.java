package AST.Expression;

import AST.Statement.Statement;
import IR.Value;
import SymbolTable.Type;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public abstract class Expression extends Statement {
    public Type type;
    public Value valueIR;
}
