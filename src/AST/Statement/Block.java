package AST.Statement;

import FrontEnd.VisitorAST.Visitor;
import SymbolTable.LocalScope;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class Block extends Statement {
    public LocalScope localScope;
    public List<Statement> list = new ArrayList<>();
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Block:" + " ListSize = " + list.size();
    }
}
