package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class UnaryInstruction extends Instruction {
    public static enum OpCode {
        neg,
        not
    }
    public OpCode opCode;
    public Register destination;
    public Value source;
    public UnaryInstruction(OpCode aOpCode, Register aDestination, Value aSource) {
        opCode = aOpCode;
        destination = aDestination;
        source = aSource;
        index = ++total;
    }
    public String toString() {
        return destination.toString() + " " + "=" + " " + opCode.toString() + " " + source.toString();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
