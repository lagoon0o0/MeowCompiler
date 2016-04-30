package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class MoveInstruction extends Instruction{
    Register destination;
    Value source;
    public MoveInstruction(Register aDestination, Value aSource) {
        destination = aDestination;
        source = aSource;
    }
    public String toString() {
        return destination.toString() + " = " + "move" + " "+ source.toString();
    }
}
