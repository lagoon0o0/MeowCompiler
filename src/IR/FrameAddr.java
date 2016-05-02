package IR;

import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/2/16.
 */
public class FrameAddr extends Register{
    int offset;
    public FrameAddr(int anOffset) {
        offset = anOffset;
    }
    public String toString() {
        return offset + "($sp)";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
