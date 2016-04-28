package IR;

import java.security.PublicKey;

/**
 * Created by lagoon0o0 on 4/27/16.
 */
public class Register extends Value{
    static int total = 0;
    public int idx;
    public String name;

    public Register(String aName) {
        idx = ++total;
        name = aName;
    }
}
