package IR;

import IRVisitor.Visitor;
import SymbolTable.FunctionSymbol;

import java.util.*;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class FunctionBlock extends IR {
    public static final PhysicalRegister useless = new PhysicalRegister(0,"useless");
    public static final PhysicalRegister zero = new PhysicalRegister(0,"zero");
    public static final PhysicalRegister at = new PhysicalRegister(1,"at");
    public static final PhysicalRegister[] v  = {
            new PhysicalRegister(2,"v0")
            ,new PhysicalRegister(3,"v1")
    };
    public static final PhysicalRegister[] a = {
            new PhysicalRegister(4,"a0")
            ,new PhysicalRegister(5,"a1")
            ,new PhysicalRegister(6,"a2")
            ,new PhysicalRegister(7,"a3")
    };
    public static final PhysicalRegister[] t = {
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
    public static final PhysicalRegister[] s = {
            new PhysicalRegister(16,"s0")
            ,new PhysicalRegister(17,"s1")
            ,new PhysicalRegister(18,"s2")
            ,new PhysicalRegister(19,"s3")
            ,new PhysicalRegister(20,"s4")
            ,new PhysicalRegister(21,"s5")
            ,new PhysicalRegister(22,"s6")
            ,new PhysicalRegister(23,"s7")
    };
    public static final PhysicalRegister[] k= {
            new PhysicalRegister(26,"k0")
            ,new PhysicalRegister(27,"k1")
    };
    public static final PhysicalRegister gp = new PhysicalRegister(28,"gp");
    public static final PhysicalRegister sp = new PhysicalRegister(29,"sp");
    public static final PhysicalRegister fp = new PhysicalRegister(30,"fp");
    public static final PhysicalRegister ra = new PhysicalRegister(31,"ra");
    public static final Set<PhysicalRegister> avaReg = new LinkedHashSet<PhysicalRegister>() {
        {
            for(int i = 0; i <= 1; ++i) {
                add(v[i]);
            }
            for(int i = 0; i <= 3; ++i) {
                add(a[i]);
            }
            for(int i = 2; i <= 9; ++i) {
                add(t[i]);
            }
            for(int i = 0; i <= 7; ++i) {
                add(s[i]);
            }
            add(fp);
        }
    };
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
    public int numberOfSpill = 0;
    public Map<Register,Register> virtualToPhysical = new Hashtable<>();
    public Map<VirtualRegister,Integer> getVirtualIndex = new Hashtable<>();
    public Map<Integer,VirtualRegister> getVirtualRegister = new Hashtable<>();
    public List<Set<Integer>> contraSet = new ArrayList<>();
    public List<Set<Integer>> linkedSet = new ArrayList<>();



    public Frame frame = new Frame();
    public FunctionSymbol function;
    public List<Register> argumentList = new ArrayList<>();
    public List<BasicBlock> basicBlockList = new ArrayList<>();

    public BasicBlock entryBlock;

    public Set<FunctionBlock> succ = new HashSet<>();
    public Set<PhysicalRegister> usedPhysicalRegister = new HashSet<>();
    public Set<VirtualRegister> ocrStaticData = new HashSet<>();
    public Set<VirtualRegister> usedStaticData = new HashSet<>();
    // previously map PhyReg to itself
    {
        virtualToPhysical.put(useless,useless);
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
    public void add(BasicBlock x) {
        if(basicBlockList.size() == 0)
            entryBlock = x;
        basicBlockList.add(x);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public boolean insertVirtual(VirtualRegister register) {
        if(!getVirtualIndex.containsKey(register)) {
            getVirtualIndex.put(register,virtualTotal);
            getVirtualRegister.put(virtualTotal, register);
            contraSet.add(new HashSet<>());
            linkedSet.add(new HashSet<>());
            virtualTotal++;
            return true;
        } else {
            //throw new RuntimeException("register already in set");
            return false;
        }
    }
    public int getVirtualIndex(VirtualRegister register) {
        if(getVirtualIndex.containsKey(register)) {
            return getVirtualIndex.get(register);
        } else {
            throw new RuntimeException("No such register:" + register.toString());
        }

    }
    public VirtualRegister getVirtualRegister(int x) {
        if(getVirtualRegister.containsKey(x)) {
            return getVirtualRegister.get(x);
        } else {
            throw new RuntimeException("No such register:" + x);
        }
    }
    public void addContra(int x, int y) {
        if(x == y)
            return;
        //throw new RuntimeException("Invalid Edge");
        contraSet.get(x).add(y);
        contraSet.get(y).add(x);
    }
    public boolean delContra(int x, int y) {
        return (contraSet.get(x).remove(y) && contraSet.get(y).remove(x));
    }
    public void addContra(VirtualRegister vx, VirtualRegister vy) {
        int x = getVirtualIndex(vx);
        int y = getVirtualIndex(vy);
        if(x == y)
            return;
        contraSet.get(x).add(y);
        contraSet.get(y).add(x);
    }
    public boolean delContra(VirtualRegister vx, VirtualRegister vy) {
        int x = getVirtualIndex(vx);
        int y = getVirtualIndex(vy);
        return (contraSet.get(x).remove(y) && contraSet.get(y).remove(x));
    }


    public void addLink(int x, int y) {
        if(x == y)
            return;
        linkedSet.get(x).add(y);
        linkedSet.get(y).add(x);
    }
    public boolean delLink(int x, int y) {
        return (linkedSet.get(x).remove(y) && linkedSet.get(y).remove(x));
    }
    public void addLink(VirtualRegister vx, VirtualRegister vy) {
        int x = getVirtualIndex(vx);
        int y = getVirtualIndex(vy);
        if(x == y)
            return;
        linkedSet.get(x).add(y);
        linkedSet.get(y).add(x);
    }
    public boolean delLink(VirtualRegister vx, VirtualRegister vy) {
        int x = getVirtualIndex(vx);
        int y = getVirtualIndex(vy);
        return (linkedSet.get(x).remove(y) && linkedSet.get(y).remove(x));
    }

    public void delVirtualReg(int x) {
        Set<Integer> copy = new HashSet<Integer>(contraSet.get(x));
        for (Integer y : copy) {
            delContra(x,y);
        }
    }
    public void delVirtualReg(VirtualRegister vx) {
        int x = getVirtualIndex(vx);
        Set<Integer> copy = new HashSet<Integer>(contraSet.get(x));
        for (Integer y : copy) {
            delContra(x,y);
        }
    }

    public void mapTo(Register x,Register y) {
        if(virtualToPhysical.containsKey(x))
            throw new RuntimeException("invalid vReg " + x.toString() + "->" + getPhysicalRegister(x).toString());
        if(y instanceof PhysicalRegister && !avaReg.contains(y))
            throw new RuntimeException("invalid pReg");
        virtualToPhysical.put(x,y);
    }
    public void mapTo(int vx,Register y) {
        Register x = getVirtualRegister(vx);
        if(virtualToPhysical.containsKey(x))
            throw new RuntimeException("invalid vReg");
        if(y instanceof PhysicalRegister && !avaReg.contains(y))
            throw new RuntimeException("invalid pReg");
        virtualToPhysical.put(x,y);
    }
    public Register getPhysicalRegister(Register x) {
        if(virtualToPhysical.containsKey(x)) {
            return virtualToPhysical.get(x);
        } else {
            return null;
        }
    }

    public int getDeg(VirtualRegister x) {
        return contraSet.get(getVirtualIndex(x)).size();
    }
    public int getDeg(int x) {
        return contraSet.get(x).size();
    }
}
