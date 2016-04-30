package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class StoreInstruction extends MemoryAccessInstruction {
    public ImmediateNumber offset, size;
    public Value address,source;
    public StoreInstruction(Value anAddress, ImmediateNumber anOffset, ImmediateNumber aSize, Value aSource) {
        address = anAddress;
        offset = anOffset;
        size = aSize;
        source = aSource;
    }
    public String toString() {
        return "store" + " " + size.toString() + " " + address.toString() + " " + source.toString() + " " + offset.toString();
    }
}
