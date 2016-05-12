package Optimization;

import IR.*;
import IRVisitor.Visitor;
import SymbolTable.SymbolTable;
import SymbolTable.VariableSymbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lagoon0o0 on 5/12/16.
 */
public class LoadAndStoreStaticData implements Visitor{
    IRRoot irRoot;
    @Override
    public void visit(AllocInstruction ctx) {
        
    }

    @Override
    public void visit(BasicBlock ctx) {

    }

    @Override
    public void visit(BinaryInstruction ctx) {

    }

    @Override
    public void visit(BranchInstruction ctx) {

    }

    @Override
    public void visit(ConditionSetInstruction ctx) {

    }

    @Override
    public void visit(VoidValue ctx) {

    }

    @Override
    public void visit(StaticString ctx) {

    }

    @Override
    public void visit(StaticSpace ctx) {

    }

    @Override
    public void visit(IRRoot ctx) {
        irRoot = ctx;
        ctx.func.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(UnaryInstruction ctx) {

    }

    @Override
    public void visit(StoreInstruction ctx) {

    }

    @Override
    public void visit(ReturnInstruction ctx) {

    }

    @Override
    public void visit(PhysicalRegister ctx) {

    }

    @Override
    public void visit(VirtualRegister ctx) {

    }

    @Override
    public void visit(MoveInstruction ctx) {

    }

    @Override
    public void visit(LoadInstruction ctx) {

    }

    @Override
    public void visit(JumpInstruction ctx) {

    }

    @Override
    public void visit(IR ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(ImmediateNumber ctx) {

    }

    @Override
    public void visit(FunctionCallInstruction ctx) {

    }

    @Override
    public void visit(FunctionBlock ctx) {
        for (BasicBlock curBlock : ctx.basicBlockList) {
            List<Instruction> list = new ArrayList<>();
            if(curBlock == ctx.entryBlock) {
                for (VirtualRegister x : ctx.ocrStaticData) {
                    VariableSymbol symbol = irRoot.virtualToSymbol.get(x);
                    if(symbol.type.getName().equals(SymbolTable.BOOL)) {
                        list.add(new LoadInstruction(x,symbol.label,new ImmediateNumber(0),new ImmediateNumber(1)));
                    } else {
                        list.add(new LoadInstruction(x,symbol.label,new ImmediateNumber(0),new ImmediateNumber(4)));
                    }
                }
            }
            for (Instruction inst : curBlock.list) {
                if(inst instanceof ReturnInstruction) {
                    for (VirtualRegister x : ctx.ocrStaticData) {
                        VariableSymbol symbol = irRoot.virtualToSymbol.get(x);
                        if(symbol.type.getName().equals(SymbolTable.BOOL)) {
                            list.add(new StoreInstruction(symbol.label,new ImmediateNumber(0),new ImmediateNumber(1),x));
                        } else {
                            list.add(new StoreInstruction(symbol.label,new ImmediateNumber(0),new ImmediateNumber(4),x));
                        }
                    }
                    list.add(inst);
                } else if(inst instanceof FunctionCallInstruction) {
                    for (VirtualRegister x : ctx.ocrStaticData) {
                        if(((FunctionCallInstruction) inst).function.functionBlock.usedStaticData.contains(x)) {
                            VariableSymbol symbol = irRoot.virtualToSymbol.get(x);
                            if(symbol.type.getName().equals(SymbolTable.BOOL)) {
                                list.add(new StoreInstruction(symbol.label,new ImmediateNumber(0),new ImmediateNumber(1),x));
                            } else {
                                list.add(new StoreInstruction(symbol.label,new ImmediateNumber(0),new ImmediateNumber(4),x));
                            }
                        }
                    }
                    list.add(inst);
                    for (VirtualRegister x : ctx.ocrStaticData) {
                        if (((FunctionCallInstruction) inst).function.functionBlock.usedStaticData.contains(x)) {
                            VariableSymbol symbol = irRoot.virtualToSymbol.get(x);
                            if (symbol.type.getName().equals(SymbolTable.BOOL)) {
                                list.add(new LoadInstruction(x, symbol.label, new ImmediateNumber(0), new ImmediateNumber(1)));
                            } else {
                                list.add(new LoadInstruction(x, symbol.label, new ImmediateNumber(0), new ImmediateNumber(4)));
                            }
                        }
                    }
                } else {
                    list.add(inst);
                }

                if(inst instanceof FunctionCallInstruction) {

                }
            }
            curBlock.list = list;
        }
    }
}
