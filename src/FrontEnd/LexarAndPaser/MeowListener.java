// Generated from Meow.g4 by ANTLR 4.5
package FrontEnd.LexarAndPaser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeowParser}.
 */
public interface MeowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionIdentifier}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionIdentifier(MeowParser.PrimaryExpressionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionIdentifier}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionIdentifier(MeowParser.PrimaryExpressionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionconstant}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionconstant(MeowParser.PrimaryExpressionconstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionconstant}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionconstant(MeowParser.PrimaryExpressionconstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionStringLiteral}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionStringLiteral(MeowParser.PrimaryExpressionStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionStringLiteral}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionStringLiteral(MeowParser.PrimaryExpressionStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpressionParen}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionParen(MeowParser.PrimaryExpressionParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpressionParen}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionParen(MeowParser.PrimaryExpressionParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpressionBracket}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionBracket(MeowParser.PostfixExpressionBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpressionBracket}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionBracket(MeowParser.PostfixExpressionBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpressionDot}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionDot(MeowParser.PostfixExpressionDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpressionDot}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionDot(MeowParser.PostfixExpressionDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpressionMinusMinus}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionMinusMinus(MeowParser.PostfixExpressionMinusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpressionMinusMinus}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionMinusMinus(MeowParser.PostfixExpressionMinusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpressionPre}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionPre(MeowParser.PostfixExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpressionPre}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionPre(MeowParser.PostfixExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpressionParen}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionParen(MeowParser.PostfixExpressionParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpressionParen}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionParen(MeowParser.PostfixExpressionParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpressionPlusPlus}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionPlusPlus(MeowParser.PostfixExpressionPlusPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpressionPlusPlus}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionPlusPlus(MeowParser.PostfixExpressionPlusPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionPre}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPre(MeowParser.UnaryExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionPre}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPre(MeowParser.UnaryExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionNew}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNew(MeowParser.UnaryExpressionNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionNew}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNew(MeowParser.UnaryExpressionNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionPlusPlus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPlusPlus(MeowParser.UnaryExpressionPlusPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionPlusPlus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPlusPlus(MeowParser.UnaryExpressionPlusPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionMinusMinus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionMinusMinus(MeowParser.UnaryExpressionMinusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionMinusMinus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionMinusMinus(MeowParser.UnaryExpressionMinusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionNot}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNot(MeowParser.UnaryExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionNot}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNot(MeowParser.UnaryExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionTilde}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionTilde(MeowParser.UnaryExpressionTildeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionTilde}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionTilde(MeowParser.UnaryExpressionTildeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionPlus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPlus(MeowParser.UnaryExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionPlus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPlus(MeowParser.UnaryExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionMinus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionMinus(MeowParser.UnaryExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionMinus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionMinus(MeowParser.UnaryExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpressionPre}
	 * labeled alternative in {@link MeowParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpressionPre(MeowParser.CastExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpressionPre}
	 * labeled alternative in {@link MeowParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpressionPre(MeowParser.CastExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpressionDiv}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpressionDiv(MeowParser.MultiplicativeExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpressionDiv}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpressionDiv(MeowParser.MultiplicativeExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpressionPre}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpressionPre(MeowParser.MultiplicativeExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpressionPre}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpressionPre(MeowParser.MultiplicativeExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpressionMod}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpressionMod(MeowParser.MultiplicativeExpressionModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpressionMod}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpressionMod(MeowParser.MultiplicativeExpressionModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpressionMul}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpressionMul(MeowParser.MultiplicativeExpressionMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpressionMul}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpressionMul(MeowParser.MultiplicativeExpressionMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addativeExpressionPlus}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddativeExpressionPlus(MeowParser.AddativeExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addativeExpressionPlus}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddativeExpressionPlus(MeowParser.AddativeExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addativeExpressionMinus}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddativeExpressionMinus(MeowParser.AddativeExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addativeExpressionMinus}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddativeExpressionMinus(MeowParser.AddativeExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addativeExpressionPre}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddativeExpressionPre(MeowParser.AddativeExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addativeExpressionPre}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddativeExpressionPre(MeowParser.AddativeExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpressionLeftShift}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpressionLeftShift(MeowParser.ShiftExpressionLeftShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpressionLeftShift}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpressionLeftShift(MeowParser.ShiftExpressionLeftShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpressionPre}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpressionPre(MeowParser.ShiftExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpressionPre}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpressionPre(MeowParser.ShiftExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpressionRightShift}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpressionRightShift(MeowParser.ShiftExpressionRightShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpressionRightShift}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpressionRightShift(MeowParser.ShiftExpressionRightShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpressionLessThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpressionLessThan(MeowParser.RelationalExpressionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpressionLessThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpressionLessThan(MeowParser.RelationalExpressionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpressionGreaterOrEqualThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpressionGreaterOrEqualThan(MeowParser.RelationalExpressionGreaterOrEqualThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpressionGreaterOrEqualThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpressionGreaterOrEqualThan(MeowParser.RelationalExpressionGreaterOrEqualThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpressionPre}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpressionPre(MeowParser.RelationalExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpressionPre}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpressionPre(MeowParser.RelationalExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpressionLessOrEqualThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpressionLessOrEqualThan(MeowParser.RelationalExpressionLessOrEqualThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpressionLessOrEqualThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpressionLessOrEqualThan(MeowParser.RelationalExpressionLessOrEqualThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpressionGreaterThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpressionGreaterThan(MeowParser.RelationalExpressionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpressionGreaterThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpressionGreaterThan(MeowParser.RelationalExpressionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpressionPre}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpressionPre(MeowParser.EqualityExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpressionPre}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpressionPre(MeowParser.EqualityExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpressionEqual}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpressionEqual(MeowParser.EqualityExpressionEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpressionEqual}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpressionEqual(MeowParser.EqualityExpressionEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpressionNotEqual}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpressionNotEqual(MeowParser.EqualityExpressionNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpressionNotEqual}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpressionNotEqual(MeowParser.EqualityExpressionNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpressionPre}
	 * labeled alternative in {@link MeowParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpressionPre(MeowParser.AndExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpressionPre}
	 * labeled alternative in {@link MeowParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpressionPre(MeowParser.AndExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpressionAnd}
	 * labeled alternative in {@link MeowParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpressionAnd(MeowParser.AndExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpressionAnd}
	 * labeled alternative in {@link MeowParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpressionAnd(MeowParser.AndExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExpressionXor}
	 * labeled alternative in {@link MeowParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpressionXor(MeowParser.XorExpressionXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExpressionXor}
	 * labeled alternative in {@link MeowParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpressionXor(MeowParser.XorExpressionXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExpressionPre}
	 * labeled alternative in {@link MeowParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpressionPre(MeowParser.XorExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExpressionPre}
	 * labeled alternative in {@link MeowParser#xorExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpressionPre(MeowParser.XorExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpressionOr}
	 * labeled alternative in {@link MeowParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpressionOr(MeowParser.OrExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpressionOr}
	 * labeled alternative in {@link MeowParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpressionOr(MeowParser.OrExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpressionPre}
	 * labeled alternative in {@link MeowParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpressionPre(MeowParser.OrExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpressionPre}
	 * labeled alternative in {@link MeowParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpressionPre(MeowParser.OrExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpressionAnd}
	 * labeled alternative in {@link MeowParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpressionAnd(MeowParser.LogicalAndExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpressionAnd}
	 * labeled alternative in {@link MeowParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpressionAnd(MeowParser.LogicalAndExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpressionPre}
	 * labeled alternative in {@link MeowParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpressionPre(MeowParser.LogicalAndExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpressionPre}
	 * labeled alternative in {@link MeowParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpressionPre(MeowParser.LogicalAndExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpressionPre}
	 * labeled alternative in {@link MeowParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpressionPre(MeowParser.LogicalOrExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpressionPre}
	 * labeled alternative in {@link MeowParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpressionPre(MeowParser.LogicalOrExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpressionOr}
	 * labeled alternative in {@link MeowParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpressionOr(MeowParser.LogicalOrExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpressionOr}
	 * labeled alternative in {@link MeowParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpressionOr(MeowParser.LogicalOrExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpressionPre}
	 * labeled alternative in {@link MeowParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpressionPre(MeowParser.ConditionalExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpressionPre}
	 * labeled alternative in {@link MeowParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpressionPre(MeowParser.ConditionalExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpressionPre}
	 * labeled alternative in {@link MeowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpressionPre(MeowParser.AssignmentExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpressionPre}
	 * labeled alternative in {@link MeowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpressionPre(MeowParser.AssignmentExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpressionAssgin}
	 * labeled alternative in {@link MeowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpressionAssgin(MeowParser.AssignmentExpressionAssginContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpressionAssgin}
	 * labeled alternative in {@link MeowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpressionAssgin(MeowParser.AssignmentExpressionAssginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MeowParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MeowParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentExpressionPre}
	 * labeled alternative in {@link MeowParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionPre(MeowParser.ArgumentExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentExpressionPre}
	 * labeled alternative in {@link MeowParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionPre(MeowParser.ArgumentExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentExpressionCur}
	 * labeled alternative in {@link MeowParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionCur(MeowParser.ArgumentExpressionCurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentExpressionCur}
	 * labeled alternative in {@link MeowParser#argumentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionCur(MeowParser.ArgumentExpressionCurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionPre}
	 * labeled alternative in {@link MeowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPre(MeowParser.ExpressionPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionPre}
	 * labeled alternative in {@link MeowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPre(MeowParser.ExpressionPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creatorIdentifier}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreatorIdentifier(MeowParser.CreatorIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code creatorIdentifier}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreatorIdentifier(MeowParser.CreatorIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creatorArray}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreatorArray(MeowParser.CreatorArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code creatorArray}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreatorArray(MeowParser.CreatorArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code creatorPrimitiveType}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreatorPrimitiveType(MeowParser.CreatorPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code creatorPrimitiveType}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreatorPrimitiveType(MeowParser.CreatorPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNameArray}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameArray(MeowParser.TypeNameArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNameArray}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameArray(MeowParser.TypeNameArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNameIdentifier}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameIdentifier(MeowParser.TypeNameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNameIdentifier}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameIdentifier(MeowParser.TypeNameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNameprimitiveType}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameprimitiveType(MeowParser.TypeNameprimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNameprimitiveType}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameprimitiveType(MeowParser.TypeNameprimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MeowParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MeowParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MeowParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MeowParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatementsCur}
	 * labeled alternative in {@link MeowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementsCur(MeowParser.BlockStatementsCurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatementsCur}
	 * labeled alternative in {@link MeowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementsCur(MeowParser.BlockStatementsCurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatementsPre}
	 * labeled alternative in {@link MeowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementsPre(MeowParser.BlockStatementsPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatementsPre}
	 * labeled alternative in {@link MeowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementsPre(MeowParser.BlockStatementsPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(MeowParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(MeowParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVariableDeclarationStatement}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclarationStatement(MeowParser.StatementVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVariableDeclarationStatement}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclarationStatement(MeowParser.StatementVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementExpressionStatement}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionStatement(MeowParser.StatementExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementExpressionStatement}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionStatement(MeowParser.StatementExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIfElse}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIfElse(MeowParser.StatementIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIfElse}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIfElse(MeowParser.StatementIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(MeowParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(MeowParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(MeowParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(MeowParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(MeowParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(MeowParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(MeowParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(MeowParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementcontinue}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementcontinue(MeowParser.StatementcontinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementcontinue}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementcontinue(MeowParser.StatementcontinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementEmpty}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementEmpty(MeowParser.StatementEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementEmpty}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementEmpty(MeowParser.StatementEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MeowParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MeowParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MeowParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MeowParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code translationUnitPre}
	 * labeled alternative in {@link MeowParser#translationUnits}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnitPre(MeowParser.TranslationUnitPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translationUnitPre}
	 * labeled alternative in {@link MeowParser#translationUnits}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnitPre(MeowParser.TranslationUnitPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code translationUnitsCur}
	 * labeled alternative in {@link MeowParser#translationUnits}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnitsCur(MeowParser.TranslationUnitsCurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translationUnitsCur}
	 * labeled alternative in {@link MeowParser#translationUnits}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnitsCur(MeowParser.TranslationUnitsCurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code translationUnitClassDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnitClassDeclaration(MeowParser.TranslationUnitClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translationUnitClassDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnitClassDeclaration(MeowParser.TranslationUnitClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code translationUnitFunctionDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnitFunctionDeclaration(MeowParser.TranslationUnitFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translationUnitFunctionDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnitFunctionDeclaration(MeowParser.TranslationUnitFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code translationUnitVariableDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnitVariableDeclaration(MeowParser.TranslationUnitVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translationUnitVariableDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnitVariableDeclaration(MeowParser.TranslationUnitVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MeowParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MeowParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MeowParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MeowParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclarationEmpty}
	 * labeled alternative in {@link MeowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationEmpty(MeowParser.ClassBodyDeclarationEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclarationEmpty}
	 * labeled alternative in {@link MeowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationEmpty(MeowParser.ClassBodyDeclarationEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyDeclarationMember}
	 * labeled alternative in {@link MeowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationMember(MeowParser.ClassBodyDeclarationMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyDeclarationMember}
	 * labeled alternative in {@link MeowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationMember(MeowParser.ClassBodyDeclarationMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(MeowParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(MeowParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MeowParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MeowParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MeowParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MeowParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MeowParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MeowParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MeowParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MeowParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MeowParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MeowParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(MeowParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(MeowParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MeowParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MeowParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(MeowParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(MeowParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(MeowParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(MeowParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#variableDeclaratorID}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorID(MeowParser.VariableDeclaratorIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#variableDeclaratorID}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorID(MeowParser.VariableDeclaratorIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#variableDeclaratorIDList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorIDList(MeowParser.VariableDeclaratorIDListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#variableDeclaratorIDList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorIDList(MeowParser.VariableDeclaratorIDListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantIntegerConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstantIntegerConstant(MeowParser.ConstantIntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantIntegerConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstantIntegerConstant(MeowParser.ConstantIntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantBooleanConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstantBooleanConstant(MeowParser.ConstantBooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantBooleanConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstantBooleanConstant(MeowParser.ConstantBooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantNullConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstantNullConstant(MeowParser.ConstantNullConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantNullConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstantNullConstant(MeowParser.ConstantNullConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeowParser#testID}.
	 * @param ctx the parse tree
	 */
	void enterTestID(MeowParser.TestIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeowParser#testID}.
	 * @param ctx the parse tree
	 */
	void exitTestID(MeowParser.TestIDContext ctx);
}