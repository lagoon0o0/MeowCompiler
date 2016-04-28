package IR;

/**
 * Created by lagoon0o0 on 4/27/16.
 */
public class Register extends Value{
    public int index;
    public int value;
    Register(int aIndex, int aValue) {
        index = aIndex;
        value = aValue;
    }
}
