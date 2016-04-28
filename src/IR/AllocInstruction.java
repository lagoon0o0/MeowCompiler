package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class AllocInstruction extends MemoryAccessInstruction{
    Register destination;
    Value size;
    public AllocInstruction(Register aDestination, Value aSize) {
        destination = aDestination;
        size = aSize;
    }
}
