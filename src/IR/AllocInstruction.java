package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class AllocInstruction extends MemoryAccessInstruction{
    public Register destination;
    public Value size;
    public AllocInstruction(Register aDestination, Value aSize) {
        index = ++total;
        destination = aDestination;
        size = aSize;
    }
    public String toString() {
        return destination.toString() + " " + "=" + " " + "alloc" + " "+ size.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
