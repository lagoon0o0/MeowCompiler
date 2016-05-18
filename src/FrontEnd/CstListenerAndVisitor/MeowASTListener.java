package FrontEnd.CstListenerAndVisitor; /**
 * Created by lagoon0o0 on 16/3/30.
 */
import FrontEnd.LexarAndPaser.*;
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
                content = ctx.getText().substring(1,ctx.getText().length()-1);
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
        values.put(ctx,new MemberExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                parent = (Expression) values.get(ctx.postfixExpression());
                child = ctx.Identifier().getText();
            }
        });

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
                operator = Operator.LogicalNot;
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
                operator = Operator.BitwiseNot;
                expression = (Expression) values.get(ctx.unaryExpression());
            }

        });
    }

    @Override
    public void exitUnaryExpressionMinus(MeowParser.UnaryExpressionMinusContext ctx) {
        values.put(ctx, new UnaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = Operator.Minus;
                expression = (Expression) values.get(ctx.unaryExpression());
            }

        });
    }

    @Override
    public void exitUnaryExpressionPlus(MeowParser.UnaryExpressionPlusContext ctx) {
        values.put(ctx, new UnaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = Operator.Plus;
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
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.RightShift;
                lhs = (Expression) values.get(ctx.shiftExpression());
                rhs = (Expression) values.get(ctx.addativeExpression());
            }
        });

    }

    @Override
    public void exitShiftExpressionPre(MeowParser.ShiftExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.addativeExpression()));
    }

    @Override
    public void exitRelationalExpressionGreaterOrEqualThan(MeowParser.RelationalExpressionGreaterOrEqualThanContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.GreaterOrEqualThan;
                lhs = (Expression) values.get(ctx.relationalExpression());
                rhs = (Expression) values.get(ctx.shiftExpression());
            }
        });

    }

    @Override
    public void exitRelationalExpressionGreaterThan(MeowParser.RelationalExpressionGreaterThanContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.GreaterThan;
                lhs = (Expression) values.get(ctx.relationalExpression());
                rhs = (Expression) values.get(ctx.shiftExpression());
            }
        });

    }

    @Override
    public void exitRelationalExpressionLessOrEqualThan(MeowParser.RelationalExpressionLessOrEqualThanContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.LessOrEqualThan;
                lhs = (Expression) values.get(ctx.relationalExpression());
                rhs = (Expression) values.get(ctx.shiftExpression());
            }
        });

    }
    @Override
    public void exitRelationalExpressionLessThan(MeowParser.RelationalExpressionLessThanContext ctx) {

        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.LessThan;
                lhs = (Expression) values.get(ctx.relationalExpression());
                rhs = (Expression) values.get(ctx.shiftExpression());
            }
        });

    }

    @Override
    public void exitRelationalExpressionPre(MeowParser.RelationalExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.shiftExpression()));
    }

    @Override
    public void exitEqualityExpressionEqual(MeowParser.EqualityExpressionEqualContext ctx) {

        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Equal;
                lhs = (Expression) values.get(ctx.equalityExpression());
                rhs = (Expression) values.get(ctx.relationalExpression());
            }
        });

    }

    @Override
    public void exitEqualityExpressionNotEqual(MeowParser.EqualityExpressionNotEqualContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.NotEqual;
                lhs = (Expression) values.get(ctx.equalityExpression());
                rhs = (Expression) values.get(ctx.relationalExpression());
            }
        });

    }

    @Override
    public void exitEqualityExpressionPre(MeowParser.EqualityExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.relationalExpression()));
    }

    @Override
    public void exitAndExpressionAnd(MeowParser.AndExpressionAndContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.BitwiseAnd;
                lhs = (Expression) values.get(ctx.andExpression());
                rhs = (Expression) values.get(ctx.equalityExpression());
            }
        });

    }

    @Override
    public void exitAndExpressionPre(MeowParser.AndExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.equalityExpression()));
    }

    @Override
    public void exitXorExpressionXor(MeowParser.XorExpressionXorContext ctx) {
        values.put(ctx, new BinaryExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.BitwiseXor;
                lhs = (Expression) values.get(ctx.xorExpression());
                rhs = (Expression) values.get(ctx.andExpression());
            }
        });

    }

    @Override
    public void exitXorExpressionPre(MeowParser.XorExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.andExpression()));
    }

    @Override
    public void exitOrExpressionOr(MeowParser.OrExpressionOrContext ctx) {
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.BitwiseOr;
                lhs = (Expression) values.get(ctx.orExpression());
                rhs = (Expression) values.get(ctx.xorExpression());
            }
        });

    }

    @Override
    public void exitOrExpressionPre(MeowParser.OrExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.xorExpression()));
    }

    @Override
    public void exitLogicalAndExpressionAnd(MeowParser.LogicalAndExpressionAndContext ctx) {
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.LogicalAnd;
                lhs = (Expression) values.get(ctx.logicalAndExpression());
                rhs = (Expression) values.get(ctx.orExpression());
            }
        });

    }

    @Override
    public void exitLogicalAndExpressionPre(MeowParser.LogicalAndExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.orExpression()));
    }

    @Override
    public void exitLogicalOrExpressionOr(MeowParser.LogicalOrExpressionOrContext ctx) {
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.LogicalOr;
                lhs = (Expression) values.get(ctx.logicalOrExpression());
                rhs = (Expression) values.get(ctx.logicalAndExpression());
            }
        });
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
        values.put(ctx, new BinaryExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                operator = BinaryExpression.Operator.Assign;
                lhs = (Expression) values.get(ctx.unaryExpression());
                rhs = (Expression) values.get(ctx.assignmentExpression());
            }
        });
    }

    @Override
    public void exitAssignmentExpressionPre(MeowParser.AssignmentExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.conditionalExpression()));
    }

    @Override
    public void exitArgumentExpressionCur(MeowParser.ArgumentExpressionCurContext ctx) {
        List<Expression> cur = (ArrayList<Expression>) values.get(ctx.argumentExpression());
        values.put(ctx, cur);
        cur.add((Expression) values.get(ctx.assignmentExpression()));
    }

    @Override
    public void exitArgumentExpressionPre(MeowParser.ArgumentExpressionPreContext ctx) {
        ArrayList<Expression> cur = new ArrayList<>();
        values.put(ctx, cur);
        cur.add((Expression) values.get(ctx.assignmentExpression()));
    }

    @Override
    public void exitExpressionPre(MeowParser.ExpressionPreContext ctx) {
        values.put(ctx, values.get(ctx.assignmentExpression()));

    }

    @Override
    public void exitCreatorPrimitiveType(MeowParser.CreatorPrimitiveTypeContext ctx) {
        values.put(ctx, new CreatorExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                typeNodeName = (TypeNode) values.get(ctx.primitiveType());
                dimensionSize = new ArrayList<>();
            }
        });

    }

    @Override
    public void exitCreatorIdentifier(MeowParser.CreatorIdentifierContext ctx) {
        values.put(ctx, new CreatorExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                typeNodeName = new ClassTypeNode() {
                    {
                        row = ctx.getStart().getLine();
                        column = ctx.getStart().getCharPositionInLine();
                        typeName = ctx.Identifier().getText();
                    }
                };
                dimensionSize = new ArrayList<>();
            }
        });

    }

    @Override
    public void exitCreatorArray(MeowParser.CreatorArrayContext ctx) {
        CreatorExpression cur = (CreatorExpression) values.get(ctx.creator());
        values.put(ctx, cur);
        cur.row = ctx.getStart().getLine();
        cur.column = ctx.getStart().getCharPositionInLine();
        cur.typeNodeName = new ArrayTypeNode(){
            {
                row = cur.typeNodeName.row;
                column = cur.typeNodeName.column;
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
        values.put(ctx,  new PrimitiveTypeNode(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                typeName = ctx.primitiveType().getText();
            }
        });
    }

    @Override
    public void exitTypeNameIdentifier(MeowParser.TypeNameIdentifierContext ctx) {
        values.put(ctx, new ClassTypeNode(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                typeName = ctx.Identifier().getText();
            }
        });
    }

    @Override
    public void exitTypeNameArray(MeowParser.TypeNameArrayContext ctx) {

        values.put(ctx,new ArrayTypeNode() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                bodyTypeNode = (TypeNode) values.get(ctx.typeName());
            }
        });
    }

    @Override
    public void exitPrimitiveType(MeowParser.PrimitiveTypeContext ctx) {

        values.put(ctx, new PrimitiveTypeNode() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                typeName = ctx.name.getText();
            }
        });
    }

    @Override
    public void exitBlock(MeowParser.BlockContext ctx) {

        values.put(ctx, new Block() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                if(ctx.blockStatements() != null)
                    list = (List<Statement>) values.get(ctx.blockStatements());
                else
                    list = new ArrayList<>();
            }
        });

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
        values.put(ctx, new BreakStatement() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
            }
        });
    }

    @Override
    public void exitStatementcontinue(MeowParser.StatementcontinueContext ctx) {
        values.put(ctx, new ContinueStatement() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
            }
        });
    }

    @Override
    public void exitStatementEmpty(MeowParser.StatementEmptyContext ctx) {
        values.put(ctx, new EmptyExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
            }
        });
    }

    @Override
    public void exitStatementFor(MeowParser.StatementForContext ctx) {
        values.put(ctx, new ForStatement() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                if(ctx.forInit != null) {
                    init = (Expression) values.get(ctx.forInit);
                } else {
                    init = new EmptyExpression();
                }
                if(ctx.forCondition != null) {
                    condition = (Expression) values.get(ctx.forCondition);
                } else {
                    condition = new EmptyExpression();
                }
                if(ctx.forUpdate != null) {
                    update = (Expression) values.get(ctx.forUpdate);
                } else {
                    update = new EmptyExpression();
                }
                body = (Statement) values.get(ctx.statement());
            }

        });

    }

    @Override
    public void exitStatementIfElse(MeowParser.StatementIfElseContext ctx) {
        values.put(ctx, new IfStatement() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                condition = (Expression) values.get(ctx.expression());
                bodyThen = (Statement) values.get(ctx.bodyThen);
                if(ctx.bodyElse != null)
                    bodyElse = (Statement) values.get(ctx.bodyElse);
                else
                    bodyElse = new EmptyExpression();
            }
        });

    }

    @Override
    public void exitStatementReturn(MeowParser.StatementReturnContext ctx) {
        values.put(ctx, new ReturnStatement() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                if(ctx.expression() != null)
                    value = (Expression) values.get(ctx.expression());
                else
                    value = new EmptyExpression();
            }
        });

    }

    @Override
    public void exitStatementWhile(MeowParser.StatementWhileContext ctx) {
        values.put(ctx, new WhileStatement() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                condition = (Expression) values.get(ctx.expression());
                body = (Statement) values.get(ctx.statement());
            }
        });

    }

    @Override
    public void exitExpressionStatement(MeowParser.ExpressionStatementContext ctx) {
        values.put(ctx, values.get(ctx.expression()));
    }

    @Override
    public void exitProgram(MeowParser.ProgramContext ctx) {
        values.put(ctx, new Program() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                if(ctx.translationUnits() != null) {
                    list = (ArrayList<TranslationUnit>) values.get(ctx.translationUnits());
                } else {
                    list = new ArrayList<>();
                }
            }
        });
        astRoot = (AstNode) values.get(ctx);
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
        values.put(ctx, new ClassDeclaration() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                id = ctx.Identifier().getText();
                ((List)values.get(ctx.classBody())).stream().filter(x -> x instanceof FunctionDeclaration).forEachOrdered(x->methodList.add((FunctionDeclaration)x));
                ((List)values.get(ctx.classBody())).stream().filter(x -> x instanceof VariableDeclarationStatement).forEachOrdered(x->fieldList.add((VariableDeclarationStatement)x));
            }

        });
    }

    @Override
    public void exitClassBody(MeowParser.ClassBodyContext ctx) {
        List<Object> cur = new ArrayList<>();
        values.put(ctx, cur);
        for (MeowParser.ClassBodyDeclarationContext x : ctx.classBodyDeclaration()) {
            Object val = values.get(x);
            if(val instanceof FunctionDeclaration) {
                cur.add(val);
            } else if(val instanceof List){
                cur.addAll((List)val);
            }
        }
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
    public void exitMemberDeclarationfield(MeowParser.MemberDeclarationfieldContext ctx) {
        values.put(ctx,values.get(ctx.fieldDeclaration()));
    }

    @Override
    public void exitMemberDeclarationfunction(MeowParser.MemberDeclarationfunctionContext ctx) {
        values.put(ctx,values.get(ctx.functionDeclaration()));
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
        values.put(ctx, new VariableDeclarationStatement(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                declaration.id = ctx.Identifier().getText();
            }
        });
    }

    @Override
    public void exitFunctionDeclaration(MeowParser.FunctionDeclarationContext ctx) {
        values.put(ctx, new FunctionDeclaration() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                typeNode = (TypeNode) values.get(ctx.typeName());
                id = ctx.Identifier().getText();
                if(values.get(ctx.formalParameters()) != null)
                    argumentlist = (List<VariableDeclarationStatement>) values.get(ctx.formalParameters());
                else
                    argumentlist = new ArrayList<>();
                body = (Block) values.get(ctx.block());
                bodyStatements = body.list;
            }
        });
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
        cur.declaration.initValue = new EmptyExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
            }
        };
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
        values.put(ctx, new BoolExpression(){
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                if(ctx.BooleanConstant().getText().equals("true")) {
                    value = true;
                } else {
                    value = false;
                }
            }
        });

    }

    @Override
    public void exitConstantIntegerConstant(MeowParser.ConstantIntegerConstantContext ctx) {
        values.put(ctx, new IntExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
                //valueIR = Integer.parseInt(ctx.IntegerConstant().getText());
                value = Integer.valueOf(ctx.IntegerConstant().getText());

            }
        });
    }

    @Override
    public void exitConstantNullConstant(MeowParser.ConstantNullConstantContext ctx) {
        values.put(ctx, new NullExpression() {
            {
                row = ctx.getStart().getLine();
                column = ctx.getStart().getCharPositionInLine();
            }
        });
    }

}
