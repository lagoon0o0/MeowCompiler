package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class ReturnInstruction extends ControlInstruction {
    Value value;
    public ReturnInstruction(Value aValue) {
        value = aValue;
    }
    public String toString() {
        return "ret" + " " + value.toString();
    }
}
