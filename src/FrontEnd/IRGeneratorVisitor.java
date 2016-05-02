package FrontEnd;

import AST.AstNode;
import AST.Expression.*;
import AST.Program;
import AST.Statement.*;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TranslationUnit.TranslationUnit;
import AST.TypeNode.ArrayTypeNode;
import AST.TypeNode.ClassTypeNode;
import AST.TypeNode.FunctionTypeNode;
import AST.TypeNode.PrimitiveTypeNode;
import FrontEnd.VisitorAST.Visitor;
import IR.*;
import SymbolTable.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lagoon0o0 on 4/28/16.
 */
public class IRGeneratorVisitor implements Visitor{
    public IRRoot irRoot = new IRRoot();
    public SymbolTable symbolTable;
    boolean global = true;
    FunctionBlock curFunc;
    BasicBlock staticInit;
    BasicBlock curBlock;
    BasicBlock loopCondition;
    BasicBlock loopBody;
    BasicBlock loopAfter;
    BasicBlock loopUpdate;
    public IRGeneratorVisitor(SymbolTable aSymbolTable) {
        symbolTable = aSymbolTable;
    }
    Map<String,Integer> sizeTable = new LinkedHashMap<>();
    {
        sizeTable.put(SymbolTable.BOOL,1);
        sizeTable.put(SymbolTable.INT,4);
        sizeTable.put(SymbolTable.STRING,4);
    }
    @Override
    public void visit(AstNode ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(Program ctx) {
        ctx.list.stream().filter(x -> x instanceof ClassDeclaration).forEachOrdered(this::visit);
        staticInit = new BasicBlock("staticInit");
        curBlock = staticInit;
        ctx.list.stream().filter(x -> x instanceof VariableDeclarationStatement.VariableDeclaration).forEachOrdered(this::visit);
        for (TranslationUnit x : ctx.list) {
            if(x instanceof FunctionDeclaration){
                global = false;
                visit(x);
                global = true;
            }
        }
    }

    @Override
    public void visit(BinaryExpression ctx) {
        if(!(ctx.operator.equals(BinaryExpression.Operator.LogicalAnd) || ctx.operator.equals(BinaryExpression.Operator.LogicalOr))) {
            if(ctx.operator.equals(BinaryExpression.Operator.Assign)) {
                if(ctx.lhs instanceof IdentifierExpression)
                    visitLeft((IdentifierExpression) ctx.lhs);
                else if(ctx.lhs instanceof BracketExpression)
                    visitLeft((BracketExpression) ctx.lhs);
                else if(ctx.lhs instanceof MemberExpression)
                    visitLeft((MemberExpression) ctx.lhs);
            } else {
                visit(ctx.lhs);
            }
            visit(ctx.rhs);
        }
        switch (ctx.operator) {
            case Plus:
                if(ctx.type.getName().equals(SymbolTable.INT)) {
                    curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add, (VirtualRegister) (ctx.valueIR = new VirtualRegister("add_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                } else if(ctx.type.getName().equals(SymbolTable.STRING)) {
                    // to be done
                }
                break;
            case Minus:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.sub, (VirtualRegister)(ctx.valueIR = new VirtualRegister("sub_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case Multiply:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.mul, (VirtualRegister)(ctx.valueIR = new VirtualRegister("mul_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case Divide:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.div, (VirtualRegister)(ctx.valueIR = new VirtualRegister("div_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case Modulo:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.rem, (VirtualRegister)(ctx.valueIR = new VirtualRegister("rem_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case LeftShift:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl, (VirtualRegister)(ctx.valueIR = new VirtualRegister("shl_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case RightShift:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shr, (VirtualRegister)(ctx.valueIR = new VirtualRegister("shr_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case LessThan:
                curBlock.add(new ConditionSetInstruction(ConditionSetInstruction.OpCode.slt, (VirtualRegister)(ctx.valueIR = new VirtualRegister("slt_dest")),ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case GreaterThan:
                curBlock.add(new ConditionSetInstruction(ConditionSetInstruction.OpCode.sgt, (VirtualRegister)(ctx.valueIR = new VirtualRegister("sgt_dest")),ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case LessOrEqualThan:
                curBlock.add(new ConditionSetInstruction(ConditionSetInstruction.OpCode.sle, (VirtualRegister)(ctx.valueIR = new VirtualRegister("sle_dest")),ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case GreaterOrEqualThan:
                curBlock.add(new ConditionSetInstruction(ConditionSetInstruction.OpCode.sge, (VirtualRegister)(ctx.valueIR = new VirtualRegister("sge_dest")),ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case Equal:
                curBlock.add(new ConditionSetInstruction(ConditionSetInstruction.OpCode.seq, (VirtualRegister)(ctx.valueIR = new VirtualRegister("seq_dest")),ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case NotEqual:
                curBlock.add(new ConditionSetInstruction(ConditionSetInstruction.OpCode.sne, (VirtualRegister)(ctx.valueIR = new VirtualRegister("sne_dest")),ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case BitwiseAnd:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.and, (VirtualRegister)(ctx.valueIR = new VirtualRegister("and_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case BitwiseXor:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.xor, (VirtualRegister)(ctx.valueIR = new VirtualRegister("xor_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case BitwiseOr:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.or, (VirtualRegister)(ctx.valueIR = new VirtualRegister("or_dest")), ctx.lhs.valueIR, ctx.rhs.valueIR));
                break;
            case LogicalAnd:
                {
                    visit(ctx.lhs);
                    BasicBlock next = new BasicBlock("lhs_is_true");
                    BasicBlock targetFalse = new BasicBlock("target_false");
                    BasicBlock targetTrue = new BasicBlock("target_true");
                    BasicBlock targetAfter = new BasicBlock("target_after");
                    curFunc.add(next);
                    curFunc.add(targetFalse);
                    curFunc.add(targetTrue);
                    curFunc.add(targetAfter);
                    curBlock.add(new BranchInstruction(ctx.lhs.valueIR,next,targetFalse));

                    curBlock = next;
                    visit(ctx.rhs);
                    curBlock.add(new BranchInstruction(ctx.rhs.valueIR,targetTrue,targetFalse));

                    ctx.valueIR = new VirtualRegister("and_dest");

                    curBlock = targetFalse;
                    curBlock.add(new MoveInstruction(((VirtualRegister)(ctx.valueIR)), new ImmediateNumber(0)));
                    curBlock.add(new JumpInstruction(targetAfter));

                    curBlock = targetTrue;
                    curBlock.add(new MoveInstruction(((VirtualRegister)(ctx.valueIR)), new ImmediateNumber(1)));
                    curBlock.add(new JumpInstruction(targetAfter));

                    curBlock = targetAfter;

                }
                break;
            case LogicalOr:
                {
                    visit(ctx.lhs);
                    BasicBlock next = new BasicBlock("lhs_is_true");
                    BasicBlock targetFalse = new BasicBlock("target_false");
                    BasicBlock targetTrue = new BasicBlock("target_true");
                    BasicBlock targetAfter = new BasicBlock("target_after");
                    curFunc.add(next);
                    curFunc.add(targetFalse);
                    curFunc.add(targetTrue);
                    curFunc.add(targetAfter);
                    curBlock.add(new BranchInstruction(ctx.lhs.valueIR,targetTrue,next));

                    curBlock = next;
                    visit(ctx.rhs);
                    curBlock.add(new BranchInstruction(ctx.rhs.valueIR,targetTrue,targetFalse));

                    ctx.valueIR = new VirtualRegister("or_dest");
                    curBlock = targetFalse;
                    curBlock.add(new MoveInstruction(((VirtualRegister)(ctx.valueIR)), new ImmediateNumber(0)));
                    curBlock.add(new JumpInstruction(targetAfter));

                    curBlock = targetTrue;
                    curBlock.add(new MoveInstruction(((VirtualRegister)(ctx.valueIR)), new ImmediateNumber(1)));
                    curBlock.add(new JumpInstruction(targetAfter));

                    curBlock = targetAfter;
                }
                break;
            case Assign:
                // to be done
                if(ctx.lhs instanceof IdentifierExpression) {
                    curBlock.add(new MoveInstruction((VirtualRegister) ctx.lhs.valueIR,ctx.rhs.valueIR));
                    curBlock.add(new MoveInstruction((VirtualRegister) (ctx.valueIR = new VirtualRegister("assign_dest")),ctx.rhs.valueIR));
                } else {
                    curBlock.add(new StoreInstruction(ctx.lhs.valueIR,new ImmediateNumber(0),new ImmediateNumber(4),ctx.rhs.valueIR));
                    curBlock.add(new MoveInstruction((VirtualRegister) (ctx.valueIR = new VirtualRegister("assign_dest")),ctx.rhs.valueIR));
                }
                break;
        }
    }

    @Override
    public void visit(BoolExpression ctx) {
        ctx.valueIR = new ImmediateNumber(ctx.value ? 1 : 0);
    }

    @Override
    public void visit(BracketExpression ctx) {
        visit(ctx.name);
        visit(ctx.subscript);

        if(ctx.type.getName().equals(SymbolTable.BOOL)){
            VirtualRegister addr;
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.name.valueIR, ctx.subscript.valueIR));
            curBlock.add(new LoadInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("bracket_rval")),addr,new ImmediateNumber(4),new ImmediateNumber(sizeTable.get(ctx.type.getName()))));
        }
        else if(ctx.type.getName().equals(SymbolTable.INT)) {
            VirtualRegister addr;
            VirtualRegister tmp = new VirtualRegister("offset");
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,tmp,ctx.subscript.valueIR, new ImmediateNumber(2)));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.name.valueIR, tmp));
            curBlock.add(new LoadInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("bracket_rval")),addr,new ImmediateNumber(4),new ImmediateNumber(sizeTable.get(ctx.type.getName()))));
        } else {
            // 对于class string array返回了引用
            VirtualRegister addr;
            VirtualRegister tmp = new VirtualRegister("offset");
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,tmp,ctx.subscript.valueIR, new ImmediateNumber(2)));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.name.valueIR, tmp));
            curBlock.add(new LoadInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("bracket_rval")),addr,new ImmediateNumber(4),new ImmediateNumber(4)));
        }

    }

    public void visitLeft(BracketExpression ctx) {
        visit(ctx.name);
        visit(ctx.subscript);

        if(ctx.type.getName().equals(SymbolTable.BOOL)){
            VirtualRegister addr;
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.name.valueIR, ctx.subscript.valueIR));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,(VirtualRegister) (ctx.valueIR = new VirtualRegister("bracket_lval")),addr, new ImmediateNumber(4)));
        }
        else if(ctx.type.getName().equals(SymbolTable.INT)) {
            VirtualRegister addr;
            VirtualRegister tmp = new VirtualRegister("offset");
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,tmp,ctx.subscript.valueIR, new ImmediateNumber(2)));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.name.valueIR, tmp));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,(VirtualRegister) (ctx.valueIR = new VirtualRegister("bracket_lval")),addr, new ImmediateNumber(4)));
        } else {
            // 对于class string array返回了引用
            VirtualRegister addr;
            VirtualRegister tmp = new VirtualRegister("offset");
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,tmp,ctx.subscript.valueIR, new ImmediateNumber(2)));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.name.valueIR, tmp));
            curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,(VirtualRegister) (ctx.valueIR = new VirtualRegister("bracket_lval")),addr, new ImmediateNumber(4)));
        }
        // 返回了引用
    }

    @Override
    public void visit(BreakStatement ctx) {
        curBlock.add(new JumpInstruction(loopAfter));
        // break后面的语句无效
    }

    @Override
    public void visit(CreatorExpression ctx) {
        // 仅支持[x][]...[]形式 其余未定义不作处理
        visit(ctx.typeNodeName);
        ctx.dimensionSize.stream().forEachOrdered(this::visit);
        if(ctx.dimensionSize.size() == 0) {
            if(ctx.type.getName().equals(SymbolTable.BOOL)) // bool 值储存
                curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_id_dest")), new ImmediateNumber(1)));
            else if(ctx.type instanceof PrimitiveType) {
                curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_id_dest")), new ImmediateNumber(4)));
            } else {
                curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_id_dest")), new ImmediateNumber(((ClassSymbol)ctx.type).size)));
            }
        } else {

            if(ctx.dimensionSize.get(0).type.getName().equals(SymbolTable.NULL)) {

                return;
            }

            if(ctx.dimensionSize.size() == 1) {

                if(((ArrayType)ctx.typeNodeName.type).bodyType.getName().equals(SymbolTable.INT)) {
                    //值存储

                    VirtualRegister len = new VirtualRegister("len");
                    curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,len,ctx.dimensionSize.get(0).valueIR,new ImmediateNumber(2)));
                    curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,len,len,new ImmediateNumber(4)));

                    curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_int_dest")), len));
                    curBlock.add(new StoreInstruction(ctx.valueIR, new ImmediateNumber(0), new ImmediateNumber(4), ctx.dimensionSize.get(0).valueIR));

                } else if(((ArrayType)ctx.typeNodeName.type).bodyType.getName().equals(SymbolTable.BOOL)){
                    //值存储
                    VirtualRegister len = new VirtualRegister("len");
                    curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,len,ctx.dimensionSize.get(0).valueIR,new ImmediateNumber(4)));
                    curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_bool_dest")), len));
                } else {
                    //引用存储

                    VirtualRegister len = new VirtualRegister("len");
                    curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,len,ctx.dimensionSize.get(0).valueIR,new ImmediateNumber(2)));
                    curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,len,len,new ImmediateNumber(4)));
                    curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_class_dest")), len));
                    curBlock.add(new StoreInstruction(ctx.valueIR, new ImmediateNumber(0), new ImmediateNumber(4), ctx.dimensionSize.get(0).valueIR));

                }
            } else{
                //引用存储
                VirtualRegister len = new VirtualRegister("len");
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.shl,len,ctx.dimensionSize.get(0).valueIR,new ImmediateNumber(2)));
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,len,len,new ImmediateNumber(4)));
                curBlock.add(new AllocInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("Creator_array_dest")), len));
                curBlock.add(new StoreInstruction(ctx.valueIR, new ImmediateNumber(0), new ImmediateNumber(4), ctx.dimensionSize.get(0).valueIR));
            }
        }


    }

    @Override
    public void visit(EmptyExpression ctx) {

    }

    @Override
    public void visit(IdentifierExpression ctx) {
        if(ctx.symbol instanceof  VariableSymbol) {
            if(((VariableSymbol) ctx.symbol).isStatic) {
                if(ctx.symbol.type.getName().equals(SymbolTable.BOOL)) {
                    curBlock
                            .add(new LoadInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister(ctx.symbol.name + "_temp_reg"))
                                ,((VariableSymbol) ctx.symbol).label,
                                    new ImmediateNumber(0), new ImmediateNumber(1)));
                } else {
                    curBlock
                            .add(new LoadInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister(ctx.symbol.name + "_temp_reg"))
                                    ,((VariableSymbol) ctx.symbol).label,
                                    new ImmediateNumber(0), new ImmediateNumber(4)));
                }
            } else {
                ctx.valueIR = ((VariableSymbol)ctx.symbol).register;
            }

        }

    }
    public void visitLeft(IdentifierExpression ctx) {
        ctx.valueIR = ((VariableSymbol)ctx.symbol).register;
    }

    @Override
    public void visit(IntExpression ctx) {
        ctx.valueIR = new ImmediateNumber(ctx.value);
    }

    @Override
    public void visit(MemberExpression ctx) {
        visit(ctx.parent);
        if(ctx.parent.type instanceof ClassSymbol) {
            //访问类成员

            int offset = ((ClassSymbol) ctx.parent.type).getOffset(ctx.child);
            if(ctx.type.getName().equals(SymbolTable.INT) || ctx.type.getName().equals(SymbolTable.BOOL)) {
                //对于int bool 类型返回值
                VirtualRegister addr;
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,addr = new VirtualRegister("bracket_dest"),ctx.parent.valueIR, new ImmediateNumber(offset)));
                curBlock.add(new LoadInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("load_dest")),addr,new ImmediateNumber(0),new ImmediateNumber(sizeTable.get(ctx.type.getName()))));

            } else {
                //对于class string array返回引用
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add, (VirtualRegister) (ctx.valueIR = new VirtualRegister("member_dest")), ctx.parent.valueIR, new ImmediateNumber(offset)));
            }
        } else {
            // 调用系统内建方法
            // to be done

        }
    }
    public void visitLeft(MemberExpression ctx) {
        visit(ctx.parent);
       if(ctx.parent.type instanceof ClassSymbol) {
           int offset = ((ClassSymbol) ctx.parent.type).getOffset(ctx.child);
           curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,(VirtualRegister)(ctx.valueIR = new VirtualRegister("member_dest")),ctx.parent.valueIR,new ImmediateNumber(offset)));
           //传引用
       } else {
           // 系统内建方法
           // to be done

       }
    }

    @Override
    public void visit(NullExpression ctx) {
        // 暂定为 0
        ctx.valueIR = new ImmediateNumber(0);
    }

    @Override
    public void visit(ParenExpression ctx) {
        visit(ctx.functionId);
        ctx.argumentList.stream().forEachOrdered(this::visit);
        List<Value> list = new ArrayList<>();
        ctx.argumentList.stream().map(x -> x.valueIR).forEachOrdered(list::add);
        if(ctx.type.getName().equals(SymbolTable.VOID))
            curBlock.add(new FunctionCallInstruction((FunctionSymbol) ctx.functionId.symbol,list));
        else
            curBlock.add(new FunctionCallInstruction((VirtualRegister) (ctx.valueIR = new VirtualRegister("func_value")),(FunctionSymbol) ctx.functionId.symbol,list));

    }

    @Override
    public void visit(PostfixExpression ctx) {
        visit(ctx.expression);
        VirtualRegister temp = new VirtualRegister("postfix_value");
        curBlock.add(new MoveInstruction(temp,ctx.expression.valueIR));
        ctx.valueIR = temp;
        switch (ctx.operator) {
            case PlusPlus:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add,(VirtualRegister) ctx.expression.valueIR,ctx.expression.valueIR,new ImmediateNumber(1)));
                break;
            case MinusMinus:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.sub,(VirtualRegister) ctx.expression.valueIR,ctx.expression.valueIR,new ImmediateNumber(1)));
                break;
        }

    }

    @Override
    public void visit(StringLiteralExpression ctx) {
        // to be done;
    }

    @Override
    public void visit(UnaryExpression ctx) {
        visit(ctx.expression);
        switch (ctx.operator) {
            case PlusPlus:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.add, (VirtualRegister)(ctx.valueIR = ctx.expression.valueIR),ctx.expression.valueIR,new ImmediateNumber(1)));
                break;
            case MinusMinus:
                curBlock.add(new BinaryInstruction(BinaryInstruction.OpCode.sub, (VirtualRegister)(ctx.valueIR = ctx.expression.valueIR),ctx.expression.valueIR,new ImmediateNumber(1)));
                break;
            case LogicalNot:
                curBlock.add(new UnaryInstruction(UnaryInstruction.OpCode.not,(VirtualRegister)(ctx.valueIR = new VirtualRegister("logicalNot_dest")),ctx.expression.valueIR));
                break;
            case BitwiseNot:
                curBlock.add(new UnaryInstruction(UnaryInstruction.OpCode.not,(VirtualRegister)(ctx.valueIR = new VirtualRegister("bitwiseNot_dest")),ctx.expression.valueIR));
                break;
            case Plus:
                curBlock.add(new MoveInstruction((VirtualRegister)(ctx.valueIR = new VirtualRegister("plus_dest")),ctx.expression.valueIR));
                break;
            case Minus:
                curBlock.add(new UnaryInstruction(UnaryInstruction.OpCode.neg,(VirtualRegister)(ctx.valueIR = new VirtualRegister("neg_dest")),ctx.expression.valueIR));
                break;
        }
    }

    @Override
    public void visit(Block ctx) {
        ctx.list.stream().forEachOrdered(this::visit);
    }


    @Override
    public void visit(ContinueStatement ctx) {
        curBlock.add(new JumpInstruction(loopUpdate));
    }

    @Override
    public void visit(ForStatement ctx) {
        BasicBlock oldLoopCondition = loopCondition;
        BasicBlock oldLoopBody = loopBody;
        BasicBlock oldLoopUpdate = loopUpdate;
        BasicBlock oldLoopAfter = loopAfter;

        BasicBlock loopInit = new BasicBlock("forInit");
        loopCondition = new BasicBlock("forCondition");
        loopBody = new BasicBlock("forBody");
        loopAfter = new BasicBlock("forAfter");
        loopUpdate = new BasicBlock("forUpdate");

        curFunc.add(loopInit);
        curFunc.add(loopAfter);
        curFunc.add(loopCondition);
        curFunc.add(loopBody);
        curFunc.add(loopUpdate);


        curBlock.add(new JumpInstruction(loopInit));

        curBlock = loopInit;
        visit(ctx.init);
        curBlock.add(new JumpInstruction(loopCondition));

        curBlock = loopCondition;
        visit(ctx.condition);
        curBlock.add(new BranchInstruction(ctx.condition.valueIR, loopBody,loopAfter));


        curBlock = loopBody;
        visit(ctx.body);
        curBlock.add(new JumpInstruction(loopUpdate));


        curBlock = loopUpdate;
        visit(ctx.update);
        curBlock.add(new JumpInstruction(loopCondition));

        curBlock = loopAfter;
        loopCondition = oldLoopCondition;
        loopBody = oldLoopBody;
        loopUpdate = oldLoopUpdate;
        loopAfter = oldLoopAfter;
    }

    @Override
    public void visit(ReturnStatement ctx) {
        visit(ctx.value);
        curBlock.add(new ReturnInstruction(ctx.value.valueIR));
    }

    @Override
    public void visit(IfStatement ctx) {
        if(ctx.bodyElse instanceof EmptyExpression) {
            BasicBlock ifTrue = new BasicBlock("ifTrue");
            BasicBlock ifCondition = new BasicBlock("ifCondition");
            BasicBlock ifAfter = new BasicBlock("ifAfter");

            curFunc.add(ifCondition);
            curFunc.add(ifTrue);
            curFunc.add(ifAfter);

            curBlock.add(new JumpInstruction(ifCondition));

            curBlock = ifCondition;
            visit(ctx.condition);
            curBlock.add(new BranchInstruction(ctx.condition.valueIR,ifTrue,ifAfter));

            curBlock = ifTrue;
            visit(ctx.bodyThen);
            curBlock.add(new JumpInstruction(ifAfter));

            curBlock = ifAfter;
        } else {
            BasicBlock ifTrue = new BasicBlock("ifTrue");
            BasicBlock ifFalse = new BasicBlock("ifFalse");
            BasicBlock ifCondition = new BasicBlock("ifCondition");
            BasicBlock ifAfter = new BasicBlock("ifAfter");

            curFunc.add(ifCondition);
            curFunc.add(ifTrue);
            curFunc.add(ifFalse);
            curFunc.add(ifAfter);

            curBlock.add(new JumpInstruction(ifCondition));

            curBlock = ifCondition;
            visit(ctx.condition);
            curBlock.add(new BranchInstruction(ctx.condition.valueIR,ifTrue,ifFalse));

            curBlock = ifTrue;
            visit(ctx.bodyThen);
            curBlock.add(new JumpInstruction(ifAfter));

            curBlock = ifFalse;
            visit(ctx.bodyElse);
            curBlock.add(new JumpInstruction(ifAfter));

            curBlock = ifAfter;
        }

    }

    @Override
    public void visit(VariableDeclarationStatement ctx) {
        visit(ctx.declaration);
    }

    @Override
    public void visit(VariableDeclarationStatement.VariableDeclaration ctx) {
        if(global) {
            visit(ctx.typeNode);
            visit(ctx.initValue);
            ((VariableSymbol)ctx.symbol).isStatic = true;
            if(ctx.typeNode.type.getName().equals(SymbolTable.BOOL)) {
                ((VariableSymbol) ctx.symbol).label = new StaticSpace(ctx.id, new ImmediateNumber(1));
                irRoot.add(((VariableSymbol) ctx.symbol).label);
            }else {
                ((VariableSymbol) ctx.symbol).label = new StaticSpace(ctx.id, new ImmediateNumber(4));
                irRoot.add(((VariableSymbol) ctx.symbol).label);
            }
            if(!(ctx.initValue  instanceof EmptyExpression)) {
                if(ctx.typeNode.type.getName().equals(SymbolTable.BOOL))
                    curBlock.add(new StoreInstruction(((VariableSymbol)ctx.symbol).label,new ImmediateNumber(0),new ImmediateNumber(1), ctx.initValue.valueIR));
                else
                    curBlock.add(new StoreInstruction(((VariableSymbol)ctx.symbol).label,new ImmediateNumber(0),new ImmediateNumber(4), ctx.initValue.valueIR));
            }

        } else {
            visit(ctx.typeNode);
            visit(ctx.initValue);
            ((VariableSymbol)ctx.symbol).register = new VirtualRegister(ctx.id + "_reg");
            if(!(ctx.initValue  instanceof EmptyExpression)) {
                curBlock.add(new MoveInstruction(((VariableSymbol) ctx.symbol).register, ctx.initValue.valueIR));
            }
        }
    }

    @Override
    public void visit(WhileStatement ctx) {
        BasicBlock oldLoopCondition = loopCondition;
        BasicBlock oldLoopBody = loopBody;
        BasicBlock oldLoopAfter = loopAfter;


        loopCondition = new BasicBlock("whileCondition");
        loopBody = new BasicBlock("whileBody");
        loopAfter = new BasicBlock("whileAfter");
        curFunc.add(loopCondition);
        curFunc.add(loopBody);
        curFunc.add(loopAfter);


        curBlock.add(new JumpInstruction(loopCondition));
        curBlock = loopCondition;
        visit(ctx.condition);
        curBlock.add(new BranchInstruction(ctx.condition.valueIR,loopBody,loopAfter));

        curBlock = loopBody;
        visit(ctx.body);
        curBlock.add(new JumpInstruction(loopCondition));

        curBlock = loopAfter;
        loopCondition = oldLoopCondition;
        loopBody = oldLoopBody;
        loopAfter = oldLoopAfter;

    }

    @Override
    public void visit(ClassDeclaration ctx) {
        //ctx.fieldList.stream().forEachOrdered(this::visit);
        ctx.fieldList.stream().forEachOrdered(
                x -> ((ClassSymbol) ctx.symbol)
                        .insertOffset(x.declaration.id,
                                x.declaration.typeNode.type instanceof PrimitiveType ? sizeTable.get(x.declaration.typeNode.type.getName()) : 4));
    }

    @Override
    public void visit(FunctionDeclaration ctx) {
        FunctionBlock functionBlock = new FunctionBlock((FunctionSymbol)ctx.symbol);
        irRoot.add(functionBlock);
        curFunc = functionBlock;
        visit(ctx.typeNode);
        ctx.argumentlist.stream().forEachOrdered(this::visit);
        ctx.argumentlist.stream().map(x -> ((VariableSymbol)x.declaration.symbol).register).forEachOrdered(functionBlock.argumentList::add);
        curFunc = functionBlock;
        BasicBlock entryBlock = new BasicBlock("entry_block");
        if(ctx.id.equals("main")) {
            curFunc.add(staticInit);
            staticInit.add(new JumpInstruction(entryBlock));
        }
        curFunc.add(entryBlock);
        curBlock = entryBlock;
        ctx.bodyStatements.stream().forEachOrdered(this::visit);
    }

    @Override
    public void visit(ClassTypeNode ctx) {

    }

    @Override
    public void visit(ArrayTypeNode ctx) {

    }

    @Override
    public void visit(FunctionTypeNode ctx) {

    }

    @Override
    public void visit(PrimitiveTypeNode ctx) {

    }
}
