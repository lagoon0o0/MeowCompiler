package AST;

import AST.TranslationUnit.TranslationUnit;
import FrontEnd.VisitorAST.Visitor;

import java.util.ArrayList;

/**
 * Created by lagoon0o0 on 16/3/30.
 */
public class Program extends AstNode {
    public ArrayList<TranslationUnit> list;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return "Program: " + " ListSize = " + list.size();
    }
}
