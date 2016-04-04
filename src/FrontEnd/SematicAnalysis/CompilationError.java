package FrontEnd.SematicAnalysis;

import AST.AstNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class CompilationError {
    public List<String> list;
    public CompilationError() {
        list = new ArrayList<>();
    }
    void add(AstNode ctx, String err) {
        list.add(err);
        System.out.print(err + '\n');
        throw new RuntimeException(err);
    }

}
