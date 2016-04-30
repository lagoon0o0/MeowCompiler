package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class ConditionSetInstruction extends Instruction{
    public static enum OpCode {
        slt,
        sgt,
        sle,
        sge,
        seq,
        sne
    }
    OpCode opCode;
    Register destination;
    Value source1, source2;
    public ConditionSetInstruction(OpCode aOpCode, Register aDestination, Value aSource1, Value aSource2) {
        opCode = aOpCode;
        destination = aDestination;
        source1 = aSource1;
        source2 = aSource2;
    }
    public String toString() {
        return destination.toString() + " " + "=" + " " + opCode.toString() + " " + source1.toString() + " " + source2.toString();
    }
}