package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class BinaryInstruction extends Instruction {
    public static enum OpCode {
        add,
        sub,
        mul,
        div,
        rem,
        shl,
        shr,
        and,
        xor,
        or,
    }
    public OpCode opCode;
    public Register destination;
    public Value source1, source2;
    public BinaryInstruction(OpCode aOpCode, Register aDestination, Value aSource1, Value aSource2) {
        opCode = aOpCode;
        destination = aDestination;
        source1 = aSource1;
        source2 = aSource2;
    }
    public String toString() {
        return destination.toString() + " " + "=" + " " + opCode.toString() + " " + source1.toString() + " " + source2.toString();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
