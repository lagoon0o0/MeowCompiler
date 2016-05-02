package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 4/30/16.
 */
public abstract class IR {
    public abstract void accept(Visitor visitor);
}
