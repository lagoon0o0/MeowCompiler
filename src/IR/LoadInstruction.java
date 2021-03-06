package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class LoadInstruction extends MemoryAccessInstruction {
    public Register destination;
    public Value address;
    public ImmediateNumber size,offset;
    public LoadInstruction(Register aDestination, Value anAddress, ImmediateNumber anOffset, ImmediateNumber aSize) {
        destination = aDestination;
        address = anAddress;
        offset = anOffset;
        size = aSize;
        index = ++total;
    }
    public String toString() {
        return destination.toString() + " " + "=" + " " + "load"+ " " + size.toString() + "  " + address.toString() + " " + offset.toString();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
