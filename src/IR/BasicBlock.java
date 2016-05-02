package IR;

import IRVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class BasicBlock extends IR{
    static int total = 0;
    int index;
    String name;
    public List<Instruction> list;
    public BasicBlock(String aName) {
        index = ++total;
        name = aName;
        list = new ArrayList<>();
    }
    public void add(Instruction x) {
        if(!list.isEmpty() && list.get(list.size() - 1) instanceof ControlInstruction)
            return;
        list.add(x);
    }
    public String getName() {
        return "%" + name + "(" + index + ")" ;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
