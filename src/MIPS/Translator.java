package MIPS;

import IR.PhysicalRegister;
import IRVisitor.Visitor;

/**
 * Created by lagoon0o0 on 5/2/16.
 */
public abstract class Translator implements Visitor{
    boolean global = true;
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
}
