package IR;

import IRVisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 4/30/16.
 */
public class IRRoot  extends IR{
    public List<FunctionBlock> func = new ArrayList<>();
    public List<StaticData> staticDatas = new ArrayList<>();
    public void add(FunctionBlock cur) {
        func.add(cur);
    }
    public void add(StaticData cur) {staticDatas.add(cur);}
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
