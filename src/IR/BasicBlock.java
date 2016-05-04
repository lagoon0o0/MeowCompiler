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
    public List<Instruction> list = new ArrayList<>();
    public BasicBlock(String aName) {
        index = ++total;
        name = aName;
    }
    public void add(Instruction x) {
        if(!list.isEmpty() && list.get(list.size() - 1) instanceof ControlInstruction)
            return;
        list.add(x);
    }
    public Instruction getFirst() {
        if(list.size() == 0) {
            throw new RuntimeException("Empty Blcok!");
        }
        return list.get(0);
    }
    public String getName() {
        return "__" + name + "_" + index + "_" ;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
