package FrontEnd.CstListenerAndVisitor; /**
 * Created by lagoon0o0 on 16/3/30.
 */
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import AST.*;
import AST.Expression.*;
import AST.Statement.*;
import AST.TranslationUnit.ClassDeclaration;
import AST.TranslationUnit.FunctionDeclaration;
import AST.TranslationUnit.TranslationUnit;
import AST.TypeNode.*;

import java.util.*;

public class MeowASTListener extends MeowBaseListener{
    public ParseTreeProperty<Object> values = new ParseTreeProperty<>();
    public AstNode astRoot;
    //
    @Override
    public void exitPrimaryExpressionIdentifier(MeowParser.PrimaryExpressionIdentifierContext ctx) {
        values.put(ctx, new IdentifierExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                name = ctx.getText();

            }
        });
    }

    @Override
    public void exitPrimaryExpressionconstant(MeowParser.PrimaryExpressionconstantContext ctx) {
        values.put(ctx, values.get(ctx.constant()));
    }

    @Override
    public void exitPrimaryExpressionStringLiteral(MeowParser.PrimaryExpressionStringLiteralContext ctx) {
        values.put(ctx,new StringLiteralExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                content = ctx.getText();
            }
        });
    }

    @Override
    public void exitPrimaryExpressionParen(MeowParser.PrimaryExpressionParenContext ctx) {
        values.put(ctx,values.get(ctx.expression()));
    }

    @Override
    public void exitPostfixExpressionBracket(MeowParser.PostfixExpressionBracketContext ctx) {
        values.put(ctx, new BracketExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                subscript = (Expression) values.get(ctx.expression());
                name = (Expression) values.get(ctx.postfixExpression());
            }
        });
    }

    @Override
    public void exitPostfixExpressionParen(MeowParser.PostfixExpressionParenContext ctx) {
        values.put(ctx, new ParenExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                functionId = (Expression)  values.get(ctx.postfixExpression());
                if(ctx.argumentExpression() != null)
                    argumentList = (List<Expression>) values.get(ctx.argumentExpression());
                else
                    argumentList = new ArrayList<>();
            }
        });

    }

    @Override
    public void exitPostfixExpressionDot(MeowParser.PostfixExpressionDotContext ctx) {
        MemberExpression cur = new MemberExpression();
        values.put(ctx,cur);
        cur.parent = (Expression) values.get(ctx.postfixExpression());
        cur.child = ctx.Identifier().getText();
    }

    @Override
    public void exitPostfixExpressionMinusMinus(MeowParser.PostfixExpressionMinusMinusContext ctx) {
        values.put(ctx, new PostfixExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = PostfixExpression.Operator.MinusMinus;
                expression = (Expression) values.get(ctx.postfixExpression());
            }
        });
    }

    @Override
    public void exitPostfixExpressionPre(MeowParser.PostfixExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.primaryExpression()));
    }

    @Override
    public void exitPostfixExpressionPlusPlus(MeowParser.PostfixExpressionPlusPlusContext ctx) {
        values.put(ctx, new PostfixExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = PostfixExpression.Operator.PlusPlus;
                expression = (Expression) values.get(ctx.postfixExpression());
            }
        });
    }

    @Override
    public void exitUnaryExpressionPre(MeowParser.UnaryExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.postfixExpression()));
    }

    @Override
    public void exitUnaryExpressionNew(MeowParser.UnaryExpressionNewContext ctx) {
        values.put(ctx, values.get(ctx.creator()));
    }

    @Override
    public void exitUnaryExpressionPlusPlus(MeowParser.UnaryExpressionPlusPlusContext ctx) {
        values.put(ctx, new UnaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = UnaryExpression.Operator.PlusPlus;
                expression = (Expression) values.get(ctx.unaryExpression());
            }

        });
    }

    @Override
    public void exitUnaryExpressionMinusMinus(MeowParser.UnaryExpressionMinusMinusContext ctx) {
        values.put(ctx, new UnaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = UnaryExpression.Operator.MinusMinus;
                expression = (Expression) values.get(ctx.unaryExpression());
            }

        });
    }

    @Override
    public void exitUnaryExpressionNot(MeowParser.UnaryExpressionNotContext ctx) {
        values.put(ctx, new UnaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = UnaryExpression.Operator.LogicalNot;
                expression = (Expression) values.get(ctx.unaryExpression());
            }

        });
    }

    @Override
    public void exitUnaryExpressionTilde(MeowParser.UnaryExpressionTildeContext ctx) {
        values.put(ctx, new UnaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = UnaryExpression.Operator.BitwiseNot;
                expression = (Expression) values.get(ctx.unaryExpression());
            }

        });
    }

    @Override
    public void exitCastExpressionPre(MeowParser.CastExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.unaryExpression()));
    }

    @Override
    public void exitMultiplicativeExpressionDiv(MeowParser.MultiplicativeExpressionDivContext ctx) {
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Divide;
                lhs = (Expression) values.get(ctx.multiplicativeExpression());
                rhs = (Expression) values.get(ctx.castExpression());
            }
        });

    }

    @Override
    public void exitMultiplicativeExpressionMod(MeowParser.MultiplicativeExpressionModContext ctx) {
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Modulo;
                lhs = (Expression) values.get(ctx.multiplicativeExpression());
                rhs = (Expression) values.get(ctx.castExpression());
            }
        });
    }

    @Override
    public void exitMultiplicativeExpressionMul(MeowParser.MultiplicativeExpressionMulContext ctx) {
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Multiply;
                lhs = (Expression) values.get(ctx.multiplicativeExpression());
                rhs = (Expression) values.get(ctx.castExpression());
            }
        });
    }

    @Override
    public void exitMultiplicativeExpressionPre(MeowParser.MultiplicativeExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.castExpression()));
    }

    @Override
    public void exitAddativeExpressionMinus(MeowParser.AddativeExpressionMinusContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Minus;
                lhs = (Expression) values.get(ctx.addativeExpression());
                rhs = (Expression) values.get(ctx.multiplicativeExpression());
            }
        });
    }

    @Override
    public void exitAddativeExpressionPlus(MeowParser.AddativeExpressionPlusContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Plus;
                lhs = (Expression) values.get(ctx.addativeExpression());
                rhs = (Expression) values.get(ctx.multiplicativeExpression());
            }
        });
    }

    @Override
    public void exitAddativeExpressionPre(MeowParser.AddativeExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.multiplicativeExpression()));
    }

    @Override
    public void exitShiftExpressionLeftShift(MeowParser.ShiftExpressionLeftShiftContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.LeftShift;
                lhs = (Expression) values.get(ctx.shiftExpression());
                rhs = (Expression) values.get(ctx.addativeExpression());
            }
        });
    }

    @Override
    public void exitShiftExpressionRightShift(MeowParser.ShiftExpressionRightShiftContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.RightShift;
        cur.lhs = (Expression) values.get(ctx.shiftExpression());
        cur.rhs = (Expression) values.get(ctx.addativeExpression());
    }

    @Override
    public void exitShiftExpressionPre(MeowParser.ShiftExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.addativeExpression()));
    }

    @Override
    public void exitRelationalExpressionGreaterOrEqualThan(MeowParser.RelationalExpressionGreaterOrEqualThanContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.GreaterOrEqualThan;
        cur.lhs = (Expression) values.get(ctx.relationalExpression());
        cur.rhs = (Expression) values.get(ctx.shiftExpression());
    }

    @Override
    public void exitRelationalExpressionGreaterThan(MeowParser.RelationalExpressionGreaterThanContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.GreaterThan;
        cur.lhs = (Expression) values.get(ctx.relationalExpression());
        cur.rhs = (Expression) values.get(ctx.shiftExpression());
    }

    @Override
    public void exitRelationalExpressionLessOrEqualThan(MeowParser.RelationalExpressionLessOrEqualThanContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.LessOrEqualThan;
        cur.lhs = (Expression) values.get(ctx.relationalExpression());
        cur.rhs = (Expression) values.get(ctx.shiftExpression());
    }

    @Override
    public void exitRelationalExpressionLessThan(MeowParser.RelationalExpressionLessThanContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.LessThan;
        cur.lhs = (Expression) values.get(ctx.relationalExpression());
        cur.rhs = (Expression) values.get(ctx.shiftExpression());
    }

    @Override
    public void exitRelationalExpressionPre(MeowParser.RelationalExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.shiftExpression()));
    }

    @Override
    public void exitEqualityExpressionEqual(MeowParser.EqualityExpressionEqualContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.Equal;
        cur.lhs = (Expression) values.get(ctx.equalityExpression());
        cur.rhs = (Expression) values.get(ctx.relationalExpression());
    }

    @Override
    public void exitEqualityExpressionNotEqual(MeowParser.EqualityExpressionNotEqualContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.NotEqual;
        cur.lhs = (Expression) values.get(ctx.equalityExpression());
        cur.rhs = (Expression) values.get(ctx.relationalExpression());
    }

    @Override
    public void exitEqualityExpressionPre(MeowParser.EqualityExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.relationalExpression()));
    }

    @Override
    public void exitAndExpressionAnd(MeowParser.AndExpressionAndContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.BitwiseAnd;
        cur.lhs = (Expression) values.get(ctx.andExpression());
        cur.rhs = (Expression) values.get(ctx.equalityExpression());
    }

    @Override
    public void exitAndExpressionPre(MeowParser.AndExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.equalityExpression()));
    }

    @Override
    public void exitXorExpressionXor(MeowParser.XorExpressionXorContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.BitwiseXor;
        cur.lhs = (Expression) values.get(ctx.xorExpression());
        cur.rhs = (Expression) values.get(ctx.andExpression());
    }

    @Override
    public void exitXorExpressionPre(MeowParser.XorExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.andExpression()));
    }

    @Override
    public void exitOrExpressionOr(MeowParser.OrExpressionOrContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.BitwiseOr;
        cur.lhs = (Expression) values.get(ctx.orExpression());
        cur.rhs = (Expression) values.get(ctx.xorExpression());
    }

    @Override
    public void exitOrExpressionPre(MeowParser.OrExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.xorExpression()));
    }

    @Override
    public void exitLogicalAndExpressionAnd(MeowParser.LogicalAndExpressionAndContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.LogicalAnd;
        cur.lhs = (Expression) values.get(ctx.logicalAndExpression());
        cur.rhs = (Expression) values.get(ctx.orExpression());
    }

    @Override
    public void exitLogicalAndExpressionPre(MeowParser.LogicalAndExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.orExpression()));
    }

    @Override
    public void exitLogicalOrExpressionOr(MeowParser.LogicalOrExpressionOrContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.LogicalOr;
        cur.lhs = (Expression) values.get(ctx.logicalOrExpression());
        cur.rhs = (Expression) values.get(ctx.logicalAndExpression());
    }

    @Override
    public void exitLogicalOrExpressionPre(MeowParser.LogicalOrExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.logicalAndExpression()));
    }

    @Override
    public void exitConditionalExpressionPre(MeowParser.ConditionalExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.logicalOrExpression()));
    }

    @Override
    public void exitAssignmentExpressionAssgin(MeowParser.AssignmentExpressionAssginContext ctx) {
        BinaryExpression cur = new BinaryExpression();
        values.put(ctx, cur);
        cur.operator = BinaryExpression.Operator.Assign;
        cur.lhs = (Expression) values.get(ctx.unaryExpression());
        cur.rhs = (Expression) values.get(ctx.assignmentExpression());
    }

    @Override
    public void exitAssignmentExpressionPre(MeowParser.AssignmentExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.conditionalExpression()));
    }

    @Override
    public void exitArgumentExpressionCur(MeowParser.ArgumentExpressionCurContext ctx) {
        ArrayList<Expression> cur = (ArrayList<Expression>) values.get(ctx.argumentExpression());
        values.put(ctx, cur);
        cur.add((Expression) values.get(ctx.assignmentExpression()));
    }

    @Override
    public void exitArgumentExpressionPre(MeowParser.ArgumentExpressionPreContext ctx) {
        ArrayList<Expression> cur = new ArrayList<Expression>();
        values.put(ctx, cur);
        cur.add((Expression) values.get(ctx.assignmentExpression()));
    }

    @Override
    public void exitExpressionPre(MeowParser.ExpressionPreContext ctx) {

        values.put(ctx, values.get(ctx.assignmentExpression()));

    }

    @Override
    public void exitCreatorPrimitiveType(MeowParser.CreatorPrimitiveTypeContext ctx) {
        CreatorExpression cur = new CreatorExpression();
        values.put(ctx, cur);
        cur.typeNodeName = (TypeNode) values.get(ctx.primitiveType());
        cur.dimensionSize = new ArrayList<>();
    }

    @Override
    public void exitCreatorIdentifier(MeowParser.CreatorIdentifierContext ctx) {
        CreatorExpression cur = new CreatorExpression();
        values.put(ctx, cur);
        ClassTypeNode tmp = new ClassTypeNode();
        tmp.typeName = ctx.Identifier().getText();
        cur.typeNodeName = tmp;
        cur.dimensionSize = new ArrayList<>();
    }

    @Override
    public void exitCreatorArray(MeowParser.CreatorArrayContext ctx) {
        CreatorExpression cur = (CreatorExpression) values.get(ctx.creator());
        values.put(ctx, cur);
        cur.typeNodeName = new ArrayTypeNode(){
            {
                bodyTypeNode = cur.typeNodeName;
            }
        };
        if(ctx.expression() != null)
            cur.dimensionSize.add((Expression) values.get(ctx.expression()));
        else {
            cur.dimensionSize.add(new EmptyExpression());
        }
    }


    @Override
    public void exitTypeNameprimitiveType(MeowParser.TypeNameprimitiveTypeContext ctx) {
        PrimitiveTypeNode cur = new PrimitiveTypeNode();
        values.put(ctx, cur);
        cur.typeName = ctx.primitiveType().getText();
    }

    @Override
    public void exitTypeNameIdentifier(MeowParser.TypeNameIdentifierContext ctx) {
        ClassTypeNode cur = new ClassTypeNode();
        values.put(ctx, cur);
        cur.typeName = ctx.Identifier().getText();
    }

    @Override
    public void exitTypeNameArray(MeowParser.TypeNameArrayContext ctx) {
        ArrayTypeNode cur = new ArrayTypeNode();
        values.put(ctx,cur);
        cur.bodyTypeNode = (TypeNode) values.get(ctx.typeName());
    }

    @Override
    public void exitPrimitiveType(MeowParser.PrimitiveTypeContext ctx) {
        PrimitiveTypeNode cur = new PrimitiveTypeNode();
        values.put(ctx, cur);
        cur.typeName = ctx.name.getText();
    }

    @Override
    public void exitBlock(MeowParser.BlockContext ctx) {
        Block cur = new Block();
        values.put(ctx, cur);
        if(ctx.blockStatements() != null)
            cur.list = (List<Statement>) values.get(ctx.blockStatements());
        else
            cur.list = new ArrayList<>();
    }

    @Override
    public void exitBlockStatementsCur(MeowParser.BlockStatementsCurContext ctx) {
        List<Statement> cur = (ArrayList<Statement>) values.get(ctx.blockStatements());
        values.put(ctx, cur);
        if(values.get(ctx.statement()) instanceof Statement)
            cur.add((Statement) values.get(ctx.statement()));
        else {
            ((List<VariableDeclarationStatement>)values.get(ctx.statement())).stream().forEachOrdered(x -> cur.add(x));
        }
    }

    @Override
    public void exitBlockStatementsPre(MeowParser.BlockStatementsPreContext ctx) {
        ArrayList<Statement> cur = new ArrayList<>();
        values.put(ctx,cur);
        if(values.get(ctx.statement()) instanceof Statement)
            cur.add((Statement) values.get(ctx.statement()));
        else {
            ((List<VariableDeclarationStatement>)values.get(ctx.statement())).stream().forEachOrdered(x -> cur.add(x));
        }
    }

    @Override
    public void exitStatementBlock(MeowParser.StatementBlockContext ctx) {
        values.put(ctx, values.get(ctx.block()));
    }

    @Override
    public void exitStatementVariableDeclarationStatement(MeowParser.StatementVariableDeclarationStatementContext ctx) {
        values.put(ctx, values.get(ctx.variableDeclarationStatement()));
    }

    @Override
    public void exitStatementExpressionStatement(MeowParser.StatementExpressionStatementContext ctx) {
        values.put(ctx, values.get(ctx.expressionStatement()));
    }

    @Override
    public void exitStatementBreak(MeowParser.StatementBreakContext ctx) {
        BreakStatement cur = new BreakStatement();
        values.put(ctx, cur);
    }

    @Override
    public void exitStatementcontinue(MeowParser.StatementcontinueContext ctx) {
        ContinueStatement cur = new ContinueStatement();
        values.put(ctx, cur);
    }

    @Override
    public void exitStatementEmpty(MeowParser.StatementEmptyContext ctx) {
        EmptyExpression cur = new EmptyExpression();
        values.put(ctx, cur);
    }

    @Override
    public void exitStatementFor(MeowParser.StatementForContext ctx) {
        ForStatement cur = new ForStatement();
        values.put(ctx, cur);
        if(ctx.forInit != null) {
            cur.init = (Expression) values.get(ctx.forInit);
        } else {
            cur.init = new EmptyExpression();
        }
        if(ctx.forCondition != null) {
            cur.condition = (Expression) values.get(ctx.forCondition);
        } else {
            cur.condition = new EmptyExpression();
        }
        if(ctx.forUpdate != null) {
            cur.update = (Expression) values.get(ctx.forUpdate);
        } else {
            cur.update = new EmptyExpression();
        }
        cur.body = (Statement) values.get(ctx.statement());
    }

    @Override
    public void exitStatementIfElse(MeowParser.StatementIfElseContext ctx) {
        IfStatement cur = new IfStatement();
        values.put(ctx, cur);
        cur.condition = (Expression) values.get(ctx.expression());
        cur.bodyThen = (Statement) values.get(ctx.bodyThen);
        if(ctx.bodyElse != null)
            cur.bodyElse = (Statement) values.get(ctx.bodyElse);
        else
            cur.bodyElse = new EmptyExpression();
    }

    @Override
    public void exitStatementReturn(MeowParser.StatementReturnContext ctx) {
        ReturnStatement cur = new ReturnStatement();
        values.put(ctx, cur);
        if(ctx.expression() != null)
            cur.value = (Expression) values.get(ctx.expression());
        else
            cur.value = new EmptyExpression();
    }

    @Override
    public void exitStatementWhile(MeowParser.StatementWhileContext ctx) {
        WhileStatement cur = new WhileStatement();
        values.put(ctx, cur);
        cur.condition = (Expression) values.get(ctx.expression());
        cur.body = (Statement) values.get(ctx.statement());
    }

    @Override
    public void exitExpressionStatement(MeowParser.ExpressionStatementContext ctx) {
        values.put(ctx, values.get(ctx.expression()));
    }

    @Override
    public void exitProgram(MeowParser.ProgramContext ctx) {
        Program cur = new Program();
        values.put(ctx, cur);
        astRoot = cur;

        if(ctx.translationUnits() != null) {
            cur.list = (ArrayList<TranslationUnit>) values.get(ctx.translationUnits());
        } else {
            cur.list = new ArrayList<>();
        }

    }

    @Override
    public void exitTranslationUnitPre(MeowParser.TranslationUnitPreContext ctx) {
        List<TranslationUnit> cur = new ArrayList<>();
        values.put(ctx, cur);
        if(values.get(ctx.translationUnit()) instanceof TranslationUnit)
            cur.add((TranslationUnit) values.get(ctx.translationUnit()));
        else { // is this right?
            List<VariableDeclarationStatement> tmp =  (List<VariableDeclarationStatement>)values.get(ctx.translationUnit());
            tmp.stream().forEachOrdered(x -> cur.add(x.declaration));
        }
    }

    @Override
    public void exitTranslationUnitsCur(MeowParser.TranslationUnitsCurContext ctx) {
        ArrayList<TranslationUnit> cur = (ArrayList<TranslationUnit>) values.get(ctx.translationUnits());
        values.put(ctx, cur);
        if(values.get(ctx.translationUnit()) instanceof TranslationUnit)
            cur.add((TranslationUnit) values.get(ctx.translationUnit()));
        else { // is this right?
            List<VariableDeclarationStatement> tmp =  (List<VariableDeclarationStatement>)values.get(ctx.translationUnit());
            tmp.stream().forEachOrdered(x -> cur.add(x.declaration));
        }
    }

    @Override
    public void exitTranslationUnitClassDeclaration(MeowParser.TranslationUnitClassDeclarationContext ctx) {
        values.put(ctx, values.get(ctx.classDeclaration()));
    }

    @Override
    public void exitTranslationUnitFunctionDeclaration(MeowParser.TranslationUnitFunctionDeclarationContext ctx) {
        values.put(ctx, values.get(ctx.functionDeclaration()));
    }

    @Override
    public void exitTranslationUnitVariableDeclaration(MeowParser.TranslationUnitVariableDeclarationContext ctx) {
        values.put(ctx, values.get(ctx.variableDeclarationStatement()));
    }

    @Override
    public void exitClassDeclaration(MeowParser.ClassDeclarationContext ctx) {
        ClassDeclaration cur = new ClassDeclaration();
        values.put(ctx, cur);
        cur.id = ctx.Identifier().getText();
        cur.fieldList = (ArrayList<VariableDeclarationStatement>) values.get(ctx.classBody());
    }

    @Override
    public void exitClassBody(MeowParser.ClassBodyContext ctx) {
        List<VariableDeclarationStatement> cur = new ArrayList<>();
        values.put(ctx, cur);

        ctx.classBodyDeclaration().stream().map(values::get).forEachOrdered(x -> cur.addAll((List<VariableDeclarationStatement>)x));
    }
    @Override
    public void exitClassBodyDeclarationEmpty(MeowParser.ClassBodyDeclarationEmptyContext ctx) {
        List<VariableDeclarationStatement> cur = new ArrayList<>();
        values.put(ctx, cur);
    }

    @Override
    public void exitClassBodyDeclarationMember(MeowParser.ClassBodyDeclarationMemberContext ctx) {
        values.put(ctx, values.get(ctx.memberDeclaration()));
    }

    @Override
    public void exitMemberDeclaration(MeowParser.MemberDeclarationContext ctx) {
        values.put(ctx, values.get(ctx.fieldDeclaration()));
    }

    @Override
    public void exitFieldDeclaration(MeowParser.FieldDeclarationContext ctx) {
        TypeNode typeNode = (TypeNode) values.get(ctx.typeName());
        List<VariableDeclarationStatement> cur = (List<VariableDeclarationStatement>) values.get(ctx.variableDeclaratorIDList());
        values.put(ctx,cur);
        for(int i = 0; i < cur.size(); ++i) {
            cur.get(i).declaration.typeNode = typeNode; // static!!!
            cur.get(i).declaration.initValue = new EmptyExpression();
        }
    }

    @Override
    public void exitVariableDeclaratorIDList(MeowParser.VariableDeclaratorIDListContext ctx) {
        List<VariableDeclarationStatement> cur = new ArrayList<>();
        values.put(ctx, cur);
        for (MeowParser.VariableDeclaratorIDContext i : ctx.variableDeclaratorID()) {
            cur.add((VariableDeclarationStatement)values.get(i));
        }
    }

    @Override
    public void exitVariableDeclaratorID(MeowParser.VariableDeclaratorIDContext ctx) {
        VariableDeclarationStatement cur = new VariableDeclarationStatement();
        values.put(ctx, cur);
        cur.declaration.id = ctx.Identifier().getText();


    }

    @Override
    public void exitFunctionDeclaration(MeowParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration cur = new FunctionDeclaration();
        values.put(ctx, cur);
        cur.typeNode = (TypeNode) values.get(ctx.typeName());
        cur.id = ctx.Identifier().getText();
        if(values.get(ctx.formalParameters()) != null)
            cur.argumentlist = (List<VariableDeclarationStatement>) values.get(ctx.formalParameters());
        else
            cur.argumentlist = new ArrayList<>();
        cur.body = (Block) values.get(ctx.block());
    }

    @Override
    public void exitFormalParameters(MeowParser.FormalParametersContext ctx) {
        if(ctx.formalParameterList() != null) {
            values.put(ctx, values.get(ctx.formalParameterList()));
        }
    }

    @Override
    public void exitFormalParameterList(MeowParser.FormalParameterListContext ctx) {
        List<VariableDeclarationStatement> cur = new ArrayList<>();
        values.put(ctx, cur);
        ctx.formalParameter().stream().map(values::get).forEachOrdered(x -> cur.add((VariableDeclarationStatement)x));
    }

    @Override
    public void exitFormalParameter(MeowParser.FormalParameterContext ctx) {
        VariableDeclarationStatement cur = (VariableDeclarationStatement) values.get(ctx.variableDeclaratorID());
        values.put(ctx, cur);
        cur.declaration.initValue = new EmptyExpression();
        cur.declaration.typeNode = (TypeNode) values.get(ctx.typeName());
    }

    @Override
    public void exitVariableDeclarationStatement(MeowParser.VariableDeclarationStatementContext ctx) {
        values.put(ctx, values.get(ctx.variableDeclaration()));
    }

    @Override
    public void exitVariableDeclaration(MeowParser.VariableDeclarationContext ctx) {
        List<VariableDeclarationStatement> cur = (List<VariableDeclarationStatement>) values.get(ctx.variableDeclaratorList());
        values.put(ctx, cur);
        TypeNode typeNode = (TypeNode) values.get(ctx.typeName());
        cur.stream().forEachOrdered(x -> x.declaration.typeNode = typeNode);
    }

    @Override
    public void exitVariableDeclaratorList(MeowParser.VariableDeclaratorListContext ctx) {
        List<VariableDeclarationStatement> cur = new ArrayList<>();
        values.put(ctx, cur);
        ctx.variableDeclarator().stream().map(values::get).forEachOrdered(x -> cur.add((VariableDeclarationStatement)x));
    }

    @Override
    public void exitVariableDeclarator(MeowParser.VariableDeclaratorContext ctx) {

        VariableDeclarationStatement cur = (VariableDeclarationStatement) values.get(ctx.variableDeclaratorID());
        values.put(ctx, cur);

        if(ctx.expression() != null) {
            cur.declaration.initValue = (Expression) values.get(ctx.expression());
        } else {
            cur.declaration.initValue = new EmptyExpression();
        }

    }

    @Override
    public void exitConstantBooleanConstant(MeowParser.ConstantBooleanConstantContext ctx) {
        BoolExpression cur = new BoolExpression();
        values.put(ctx, cur);
        if(ctx.BooleanConstant().getText().equals("true")) {
            cur.value = true;
        } else {
            cur.value = false;
        }
    }

    @Override
    public void exitConstantIntegerConstant(MeowParser.ConstantIntegerConstantContext ctx) {
        IntExpression cur = new IntExpression();
        values.put(ctx, cur);
        cur.value = Integer.valueOf(ctx.IntegerConstant().getText());
    }

    @Override
    public void exitConstantNullConstant(MeowParser.ConstantNullConstantContext ctx) {
        NullExpression cur = new NullExpression();
        values.put(ctx, cur);
    }
}
