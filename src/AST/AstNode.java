package AST;

import FrontEnd.VisitorAST.Visitor;
import SymbolTable.Scope;
import SymbolTable.Symbol;

/**
 * Created by lagoon0o0 on 16/3/28.
 */
abstract public class AstNode {
    public int column, row;
    public Symbol symbol;
    public Scope scope;
    public abstract void accept(Visitor visitor);
    public abstract String toString();

}
