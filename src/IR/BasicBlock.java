package IR;

import java.util.List;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class BasicBlock {
    int index;
    String name;
    List<Instruction> list;
    BasicBlock(int aIndex, String aName) {
        index = aIndex;
        name = aName;
    }
}
