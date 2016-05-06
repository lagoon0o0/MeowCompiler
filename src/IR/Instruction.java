package IR;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public abstract class Instruction extends IR{
    static int total = 0;
    public int index = 0;
    public Set<Instruction> successor = new HashSet<>();
    public Set<Integer> in = new HashSet<>()
            ,out = new HashSet<>()
            ,use = new HashSet<>()
            ,def = new HashSet<>();
    public boolean addUse(int x) {
        return use.add(x);
    }
    public boolean addDef(int x) {
        return def.add(x);
    }
    public boolean addIn(int x) {
        return in.add(x);
    }
    public boolean addOut(int x) {
        return out.add(x);
    }
    public boolean addSucc(Instruction x) {
        return successor.add(x);
    }

}
