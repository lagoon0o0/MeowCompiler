package IR;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class BasicBlock {
    static int total = 0;
    int index;
    String name;
    List<Instruction> list;
    public BasicBlock(String aName) {
        index = ++total;
        name = aName;
        list = new ArrayList<>();
    }
    public void add(Instruction x) {
        list.add(x);
    }
    public void print() {
        System.out.print( getName() + ": \n");
        list.stream().map(x -> "\t" + x.toString() + "\n").forEachOrdered(System.out::print);
        System.out.print("\n");
    }
    public String getName() {
        return "%" + name + "(" + index + ")" ;
    }
}
