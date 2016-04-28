package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class LoadInstruction extends MemoryAccessInstruction {
    Register destination;
    Value address;
    ImmediateNumber size,offset;
    LoadInstruction(Register aDestination, Value anAddress, ImmediateNumber anOffset, ImmediateNumber aSize) {
        destination = aDestination;
        address = anAddress;
        offset = anOffset;
        size = aSize;
    }
}
