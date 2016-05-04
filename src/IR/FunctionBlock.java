package IR;

import IRVisitor.Visitor;
import SymbolTable.FunctionSymbol;

import java.util.*;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionBlock extends IR{
    static final PhysicalRegister zero = new PhysicalRegister(0,"zero");
    static final PhysicalRegister at = new PhysicalRegister(1,"at");
    static final PhysicalRegister[] v  = {
            new PhysicalRegister(2,"v0")
            ,new PhysicalRegister(3,"v1")
    };
    static final PhysicalRegister[] a = {
            new PhysicalRegister(4,"a0")
            ,new PhysicalRegister(5,"a1")
            ,new PhysicalRegister(6,"a2")
            ,new PhysicalRegister(7,"a3")
    };
    static final PhysicalRegister[] t = {
            new PhysicalRegister(8,"t0")
            ,new PhysicalRegister(9,"t1")
            ,new PhysicalRegister(10,"t2")
            ,new PhysicalRegister(11,"t3")
            ,new PhysicalRegister(12,"t4")
            ,new PhysicalRegister(13,"t5")
            ,new PhysicalRegister(14,"t6")
            ,new PhysicalRegister(15,"t7")
            ,new PhysicalRegister(24,"t8")
            ,new PhysicalRegister(25,"t9")
    };
    static final PhysicalRegister[] s = {
            new PhysicalRegister(16,"s0")
            ,new PhysicalRegister(17,"s1")
            ,new PhysicalRegister(18,"s2")
            ,new PhysicalRegister(19,"s3")
            ,new PhysicalRegister(20,"s4")
            ,new PhysicalRegister(21,"s5")
            ,new PhysicalRegister(22,"s6")
            ,new PhysicalRegister(23,"s7")
    };
    static final PhysicalRegister[] k= {
            new PhysicalRegister(26,"k0")
            ,new PhysicalRegister(27,"k1")
    };
    static final PhysicalRegister gp = new PhysicalRegister(28,"gp");
    static final PhysicalRegister sp = new PhysicalRegister(29,"sp");
    static final PhysicalRegister fp = new PhysicalRegister(30,"fp");
    static final PhysicalRegister ra = new PhysicalRegister(31,"ra");

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
                return size + 8 - size % 8;
            } else {
                return size;
            }
        }
    }


    public int virtualTotal = 0;
    public Map<Register,PhysicalRegister> virtualToPhysical = new Hashtable<>();
    Map<VirtualRegister,Integer> getIndex = new Hashtable<>();
    Map<Integer,VirtualRegister> getRegister = new Hashtable<>();
    public List<Set<Integer>> edge = new ArrayList<>();
    public List<Set<Integer>> contraSet = new ArrayList<>();



    public Frame frame = new Frame();
    public FunctionSymbol function;
    public List<Register> argumentList = new ArrayList<>();
    public List<BasicBlock> basicBlockList = new ArrayList<>();
    public BasicBlock entryBlock;
    public void add(BasicBlock x) {
        if(basicBlockList.size() == 0)
            entryBlock = x;
        basicBlockList.add(x);
    }
    // previously map PhyReg to itself
    {
        virtualToPhysical.put(zero,zero);
        virtualToPhysical.put(at,at);
        for(int i = 0; i <= 1; ++i) {
            virtualToPhysical.put(v[i],v[i]);
        }
        for(int i = 0; i <= 3; ++i) {
            virtualToPhysical.put(a[i],a[i]);
        }
        for(int i = 0; i <= 9; ++i) {
            virtualToPhysical.put(t[i],t[i]);
        }
        for(int i = 0; i <= 7; ++i) {
            virtualToPhysical.put(s[i],s[i]);
        }
        for(int i = 0; i <= 1; ++i) {
            virtualToPhysical.put(k[i],k[i]);
        }
        virtualToPhysical.put(gp,gp);
        virtualToPhysical.put(fp,fp);
        virtualToPhysical.put(sp,sp);
        virtualToPhysical.put(ra,ra);
    }


    public FunctionBlock(FunctionSymbol aFunction) {
        function = aFunction;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public boolean insertVirtual(VirtualRegister register) {
        if(!getIndex.containsKey(register)) {
            getIndex.put(register,virtualTotal);
            getRegister.put(virtualTotal, register);
            edge.add(new HashSet<>());
            contraSet.add(new HashSet<>());
            virtualTotal++;
            return true;
        } else {
            //throw new RuntimeException("register already in set");
            return false;
        }
    }
    public int getVirtualIndex(VirtualRegister register) {
        if(getIndex.containsKey(register)) {
            return getIndex.get(register);
        } else {
            throw new RuntimeException("No such register:" + register.toString());
        }

    }
    public VirtualRegister getVirtualRegister(int x) {
        if(getRegister.containsKey(x)) {
            return getRegister.get(x);
        } else {
            throw new RuntimeException("No such register:" + x);
        }
    }
    public void addEdge(int x, int y) {
        if(x == y)
            return;
        //throw new RuntimeException("Invalid Edge");
        edge.get(x).add(y);
        edge.get(y).add(x);
    }
    public boolean delEdge(int x, int y) {
        return (edge.get(x).remove(y) && edge.get(y).remove(x));
    }
    public void addEdge(VirtualRegister vx, VirtualRegister vy) {
        int x = getVirtualIndex(vx);
        int y = getVirtualIndex(vy);
        if(x == y)
            return;
            //throw new RuntimeException("Invalid Edge");
        edge.get(x).add(y);
        edge.get(y).add(x);
    }
    public boolean delEdge(VirtualRegister vx, VirtualRegister vy) {
        int x = getVirtualIndex(vx);
        int y = getVirtualIndex(vy);
        return (edge.get(x).remove(y) && edge.get(y).remove(x));
    }

}
