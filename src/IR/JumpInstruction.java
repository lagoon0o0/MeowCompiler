package IR;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class JumpInstruction extends ControlInstruction{
    BasicBlock destination;
    JumpInstruction(BasicBlock aDestination) {
        destination = aDestination;
    }
}
