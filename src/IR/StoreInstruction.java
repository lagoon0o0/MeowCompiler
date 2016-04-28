package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class StoreInstruction extends MemoryAccessInstruction {
    ImmediateNumber offset, size;
    Value address,source;
    StoreInstruction(Value anAddress, ImmediateNumber anOffset, ImmediateNumber aSize, Value aSource) {
        address = anAddress;
        offset = anOffset;
        size = aSize;
        source = aSource;
    }
}
