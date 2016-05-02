package IR;

import IRVisitor.Visitor;
import SymbolTable.FunctionSymbol;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionBlock extends IR{
    public class Frame {
        private int size = 0;
        Map<Register, FrameAddr> hash = new Hashtable<>();
        public FrameAddr get(Register reg) {
            if(hash.containsKey(reg)) {
                return hash.get(reg);
            } else {
                FrameAddr ret = new FrameAddr(size);
                hash.put(reg,ret);
                size += 4;
                return ret;
            }
        }
        public int getSize() {
            if(size % 8 != 0) {
                return size + 8;
            } else {
                return size;
            }
        }
    }
    public Frame frame = new Frame();
    public FunctionSymbol function;
    public String name;
    public List<Register> argumentList = new ArrayList<>();
    public List<BasicBlock> basicBlockList = new ArrayList<>();
    public BasicBlock entryBlock;
    public void add(BasicBlock x) {
        if(basicBlockList.size() == 0)
            entryBlock = x;
        basicBlockList.add(x);
    }
    public FunctionBlock(FunctionSymbol aFunction) {
        function = aFunction;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
