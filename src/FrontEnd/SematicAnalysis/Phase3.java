package FrontEnd.SematicAnalysis;

import AST.Expression.*;
import AST.AstNode;
import AST.Program;
import AST.Statement.*;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TypeNode.*;
import SymbolTable.*;
import org.stringtemplate.v4.ST;

/**
 * Created by lagoon0o0 on 16/4/3.
 */
public class Phase3 extends SemanticChecker{
    int insideLoop, insideFunction;
    Type currentReturnType;
    public Phase3(SymbolTable symbolTable, CompilationError compilationError) {
        super(symbolTable,compilationError);
        insideFunction = insideLoop = 0;
    }
    public boolean isValidLvalue(Expression ctx) {
        return (ctx instanceof BracketExpression
                || ctx instanceof IdentifierExpression
                || ctx instanceof MemberExpression);
    }
    @Override
    public void visit(AstNode ctx) {
        ctx.accept(this);
    }

    @Override
    public void visit(Program ctx) {
        ctx.list.stream().forEachOrdered(this::visit);
        Symbol symbol = symbolTable.getCurrentScope().resolve("main");
        if(symbol == null || !(symbol instanceof FunctionSymbol)) {
            compilationError.add(ctx, "NoMainFunction:");
        } else {
            if(((FunctionSymbol) symbol).argumentTypeList.size() != 0 || !symbol.type.getName().equals(SymbolTable.INT))
                compilationError.add(ctx, "InvalidMainFunction:");
        }
    }

    @Override
    public void visit(BinaryExpression ctx) {
        visit(ctx.lhs);
        visit(ctx.rhs);
        ctx.scope = symbolTable.getCurrentScope();
        if(!ctx.lhs.type.compatibleWith(ctx.rhs.type))
            compilationError.add(ctx, "TypeNotCompatible: " + ctx.lhs.type.getName() + " vs " + ctx.rhs.type.getName());
        switch (ctx.operator) {
            case Plus:
                ctx.type = ctx.lhs.type;
                if(!ctx.type.getName().equals(SymbolTable.INT) && !ctx.type.getName().equals(SymbolTable.STRING))
                    compilationError.add(ctx,"InvalidType: " + ctx.type + " vs " + ctx.operator.name());
                break;
            case Minus:
            case Multiply:
            case Divide:
            case Modulo:
            case LeftShift:
            case RightShift:
                ctx.type = ctx.lhs.type;
                if(!ctx.type.getName().equals(SymbolTable.INT))
                    compilationError.add(ctx,"InvalidType: " + ctx.type + " vs " + ctx.operator.name());
                break;

            case LessThan:
            case GreaterThan:
            case LessOrEqualThan:
            case GreaterOrEqualThan:
                ctx.type = (Type) symbolTable.getCurrentScope().resolve(SymbolTable.BOOL);
                if(!ctx.lhs.type.getName().equals(SymbolTable.INT) && !ctx.lhs.type.getName().equals(SymbolTable.STRING))
                    compilationError.add(ctx,"InvalidType: " + ctx.lhs.type.getName() + " vs " + ctx.operator.name());
                break;

            case Equal:
            case NotEqual:
                ctx.type = (Type) symbolTable.getCurrentScope().resolve(SymbolTable.BOOL);
                break;

            case BitwiseAnd:
            case BitwiseXor:
            case BitwiseOr:
                ctx.type = ctx.lhs.type;
                if(!ctx.type.getName().equals(SymbolTable.INT))
                    compilationError.add(ctx,"InvalidType: " + ctx.type.getName() + " vs " + ctx.operator.name());
                break;
            case LogicalAnd:
            case LogicalOr:
                ctx.type = ctx.lhs.type;
                if(!ctx.type.getName().equals(SymbolTable.BOOL))
                    compilationError.add(ctx,"InvalidType: " + ctx.type.getName() + " vs " + ctx.operator.name());
                break;
            case Assign:
                ctx.type = ctx.lhs.type;
                // check left hand side valid
                if(!isValidLvalue(ctx.lhs)) {
                    compilationError.add(ctx, "InvalidLHS");
                }
                break;
            default:
                throw new RuntimeException("f**k");
        }
    }

    @Override
    public void visit(BoolExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbolTable.getCurrentScope().resolve(SymbolTable.BOOL).type;
    }

    @Override
    public void visit(BracketExpression ctx) {
        visit(ctx.name);
        visit(ctx.subscript);
        if(!ctx.subscript.type.getName().equals(SymbolTable.INT))
            compilationError.add(ctx,"InvalidSubscriptionType: " + ctx.subscript.type.getName());
        if(!(ctx.name.type instanceof ArrayType))
            compilationError.add(ctx,"InvalidArrayType: " + ctx.name.type.getName());
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = ((ArrayType) ctx.name.type).bodyType;
    }

    @Override
    public void visit(BreakStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        if(insideLoop == 0) {
            compilationError.add(ctx, "InvalidBreakStatement");
        }
    }

    @Override
    public void visit(CreatorExpression ctx) {
        visit(ctx.typeNodeName);
        ctx.dimensionSize.stream().forEachOrdered(this::visit);
        ctx.dimensionSize.stream().filter(cur -> !(cur.type.getName().equals(SymbolTable.INT)||cur.type.getName().equals(SymbolTable.VOID))).forEach(cur -> {
            compilationError.add(ctx, "InvalidSubscriptionType: " + cur.type.getName());
        });
        boolean flag = false;
        for (Expression cur : ctx.dimensionSize) {
            if(cur.type.getName().equals(SymbolTable.VOID))
                flag = true;
            else if(flag) {
                compilationError.add(ctx, "InvalidArrayCreator: ");
            }
        }
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = ctx.typeNodeName.type;
    }

    @Override
    public void visit(EmptyExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbolTable.getCurrentScope().resolve(SymbolTable.VOID).type;
    }

    @Override
    public void visit(IdentifierExpression ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.name);
        if(symbol == null) {
            compilationError.add(ctx, "UndefinedVariable: " + ctx.name);
        }
        ctx.symbol = symbol;
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = ctx.symbol.type;
    }

    @Override
    public void visit(IntExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbolTable.getCurrentScope().resolve(SymbolTable.INT).type;
    }

    @Override
    public void visit(MemberExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();

        visit(ctx.parent);
        if(ctx.parent.type instanceof Scope) {
            Symbol symbol = ((Scope) ctx.parent.type).resolve(ctx.child);
            if(symbol == null)
                compilationError.add(ctx, "NoSuchMember: " + ctx.child);
            ctx.type = symbol.type;
            ctx.symbol = symbol;
        } else {
            compilationError.add(ctx, "InvalidMemberOperation: " + ctx.parent.type.getName());
        }
    }

    @Override
    public void visit(NullExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbolTable.getCurrentScope().resolve(SymbolTable.NULL).type;
    }

    @Override
    public void visit(ParenExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.functionId);

        ctx.type = ctx.functionId.type;
        ctx.argumentList.stream().forEachOrdered(this::visit);
        if(ctx.functionId.symbol instanceof FunctionSymbol) {
            if(((FunctionSymbol) ctx.functionId.symbol).argumentTypeList.size() == ctx.argumentList.size()){
                for(int i = 0; i < ctx.argumentList.size(); ++i) {
                    if(!ctx.argumentList.get(i).type.compatibleWith(((FunctionSymbol) ctx.functionId.symbol).argumentTypeList.get(i)))
                        compilationError.add(ctx, "InvalidParameterList: ");
                }
            } else {
                compilationError.add(ctx, "InvalidParameterList: ");
            }
        } else {
            compilationError.add(ctx, "InvalidFucntionCall: " + ctx.functionId.toString());
        }
    }

    @Override
    public void visit(PostfixExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.expression);
        if(!ctx.expression.type.getName().equals(SymbolTable.INT))
            compilationError.add(ctx, "InvalidPostfixExpression: " + ctx.expression.type.getName());
        ctx.type = ctx.expression.type;
    }

    @Override
    public void visit(StringLiteralExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbolTable.getCurrentScope().resolve(SymbolTable.STRING).type;
    }

    @Override
    public void visit(UnaryExpression ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.expression);
        switch (ctx.operator) {
            case PlusPlus:
            case MinusMinus:
            case BitwiseNot:
            if(!ctx.expression.type.getName().equals(SymbolTable.INT))
                compilationError.add(ctx, "InvalidUnaryExpression: " + ctx.expression.type.getName());
                break;
            case LogicalNot:
            if(!ctx.expression.type.getName().equals(SymbolTable.BOOL))
                compilationError.add(ctx, "InvalidUnaryExpression: " + ctx.expression.type.getName());
                break;
        }

        ctx.type = ctx.expression.type;
    }

    @Override
    public void visit(Block ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        ctx.localScope = new LocalScope(ctx.scope);
        symbolTable.push(ctx.localScope);
        ctx.list.stream().forEachOrdered(this::visit);
        symbolTable.pop();
    }

    @Override
    public void visit(ContinueStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        if(insideLoop == 0) {
            compilationError.add(ctx, "InvalidContinueStatement: ");
        }
    }

    @Override
    public void visit(ForStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.init);
        visit(ctx.condition);
        if(!(ctx.condition instanceof EmptyExpression) && !ctx.condition.type.compatibleWith(symbolTable.getCurrentScope().resolve(SymbolTable.BOOL).type)) {
            compilationError.add(ctx, "InvalidForStatement:");
        }
        visit(ctx.update);
        insideLoop++;
        visit(ctx.body);
        insideLoop--;

    }

    @Override
    public void visit(ReturnStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        if(insideFunction == 0) {
            compilationError.add(ctx, "InvalidReturnStatement: ");
        }
        visit(ctx.value);
        if(!ctx.value.type.compatibleWith(currentReturnType)) {
            compilationError.add(ctx, "InvalidReturnValue: ");
        }
    }

    @Override
    public void visit(IfStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.condition);
        if(!ctx.condition.type.compatibleWith(symbolTable.getCurrentScope().resolve(SymbolTable.BOOL).type)) {
            compilationError.add(ctx, "InvalidIfStatement:");
        }
        visit(ctx.bodyThen);
        visit(ctx.bodyElse);
    }

    @Override
    public void visit(VariableDeclarationStatement ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.declaration);
    }

    @Override
    public void visit(VariableDeclarationStatement.VariableDeclaration ctx) {
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.typeNode);
        visit(ctx.initValue);
        Symbol symbol = new VariableSymbol(ctx.id, ctx.typeNode.type);
        if(ctx.typeNode.type.getName().equals(SymbolTable.VOID)) {
            compilationError.add(ctx, "InvalidVariableType: " + ctx.typeNode.type.getName());
        }
        if(!symbolTable.getCurrentScope().define(symbol)) {
            compilationError.add(ctx, "InvalidVariableDeclaration: " + ctx.id);
        }
        if(!(ctx.initValue instanceof EmptyExpression)
                && !ctx.typeNode.type.compatibleWith(ctx.initValue.type)) {
            compilationError.add(ctx, "InvalidInitValueType: " + ctx.initValue.type.getName());
        }
    }

    @Override
    public void visit(WhileStatement ctx) {
        insideLoop++;
        ctx.scope = symbolTable.getCurrentScope();
        visit(ctx.condition);
        if(!ctx.condition.type.compatibleWith(symbolTable.getCurrentScope().resolve(SymbolTable.BOOL).type)) {
            compilationError.add(ctx, "InvalidWhileStatement:");
        }
        visit(ctx.body);
        insideLoop--;
    }

    @Override
    public void visit(ClassDeclaration ctx) {

    }

    @Override
    public void visit(FunctionDeclaration ctx) {
        symbolTable.push((Scope) ctx.symbol);
        insideFunction++;
        visit(ctx.typeNode);
        currentReturnType = ctx.typeNode.type;
        ctx.symbol.type = ctx.typeNode.type;

        ctx.bodyStatements.stream().forEachOrdered(this::visit);
        currentReturnType = symbolTable.getCurrentScope().resolve(SymbolTable.NULL).type;
        insideFunction--;
        symbolTable.pop();
    }

    @Override
    public void visit(ClassTypeNode ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.typeName);
        if(symbol == null)
            compilationError.add(ctx,"ClassTypeName : " + ctx.typeName + " Not Found.");
        ctx.symbol = symbol;
        ctx.type = symbol.type;
        ctx.scope = symbolTable.getCurrentScope();
    }

    @Override
    public void visit(ArrayTypeNode ctx) {
        visit(ctx.bodyTypeNode);
        ctx.type = new ArrayType(ctx.bodyTypeNode.type, symbolTable.getCurrentScope()) {};
    }

    @Override
    public void visit(FunctionTypeNode ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.typeName);
        if(symbol == null)
            compilationError.add(ctx,"FunctionTypeName : " + ctx.typeName + "Not Found.");
        ctx.symbol = symbol;
        ctx.type = symbol.type;
        ctx.scope = symbolTable.getCurrentScope();
    }

    @Override
    public void visit(PrimitiveTypeNode ctx) {
        Symbol symbol = symbolTable.getCurrentScope().resolve(ctx.typeName);
        if(symbol == null)
            compilationError.add(ctx,"PrimitiveTypeName : " + ctx.typeName + "Not Found.");
        ctx.symbol = symbol;
        ctx.scope = symbolTable.getCurrentScope();
        ctx.type = symbol.type;
    }
}
