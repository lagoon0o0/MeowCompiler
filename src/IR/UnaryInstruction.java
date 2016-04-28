package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class UnaryInstruction extends Instruction{
    public static enum OpCode {
        neg,
        not
    }
    OpCode opCode;
    Register destination;
    Value source;
    UnaryInstruction(OpCode aOpCode, Register aDestination, Value aSource) {
        opCode = aOpCode;
        destination = aDestination;
        source = aSource;
    }
}
