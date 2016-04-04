// Generated from /Users/lagoon0o0/Documents/Compiler/Meow/src/FrontEnd/Meow.g4 by ANTLR 4.5.1
package FrontEnd;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code primaryExpressionIdentifier}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionIdentifier(MeowParser.PrimaryExpressionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpressionconstant}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionconstant(MeowParser.PrimaryExpressionconstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpressionStringLiteral}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionStringLiteral(MeowParser.PrimaryExpressionStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpressionParen}
	 * labeled alternative in {@link MeowParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionParen(MeowParser.PrimaryExpressionParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpressionBracket}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionBracket(MeowParser.PostfixExpressionBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpressionDot}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionDot(MeowParser.PostfixExpressionDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpressionMinusMinus}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionMinusMinus(MeowParser.PostfixExpressionMinusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpressionPre}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionPre(MeowParser.PostfixExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpressionParen}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionParen(MeowParser.PostfixExpressionParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpressionPlusPlus}
	 * labeled alternative in {@link MeowParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionPlusPlus(MeowParser.PostfixExpressionPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionPre}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPre(MeowParser.UnaryExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionNew}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNew(MeowParser.UnaryExpressionNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionPlusPlus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPlusPlus(MeowParser.UnaryExpressionPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionMinusMinus}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionMinusMinus(MeowParser.UnaryExpressionMinusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionNot}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNot(MeowParser.UnaryExpressionNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionTilde}
	 * labeled alternative in {@link MeowParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionTilde(MeowParser.UnaryExpressionTildeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpressionPre}
	 * labeled alternative in {@link MeowParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpressionPre(MeowParser.CastExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpressionDiv}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpressionDiv(MeowParser.MultiplicativeExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpressionPre}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpressionPre(MeowParser.MultiplicativeExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpressionMod}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpressionMod(MeowParser.MultiplicativeExpressionModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpressionMul}
	 * labeled alternative in {@link MeowParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpressionMul(MeowParser.MultiplicativeExpressionMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addativeExpressionPlus}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddativeExpressionPlus(MeowParser.AddativeExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addativeExpressionMinus}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddativeExpressionMinus(MeowParser.AddativeExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addativeExpressionPre}
	 * labeled alternative in {@link MeowParser#addativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddativeExpressionPre(MeowParser.AddativeExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpressionLeftShift}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpressionLeftShift(MeowParser.ShiftExpressionLeftShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpressionPre}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpressionPre(MeowParser.ShiftExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpressionRightShift}
	 * labeled alternative in {@link MeowParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpressionRightShift(MeowParser.ShiftExpressionRightShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpressionLessThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpressionLessThan(MeowParser.RelationalExpressionLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpressionGreaterOrEqualThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpressionGreaterOrEqualThan(MeowParser.RelationalExpressionGreaterOrEqualThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpressionPre}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpressionPre(MeowParser.RelationalExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpressionLessOrEqualThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpressionLessOrEqualThan(MeowParser.RelationalExpressionLessOrEqualThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpressionGreaterThan}
	 * labeled alternative in {@link MeowParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpressionGreaterThan(MeowParser.RelationalExpressionGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpressionPre}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpressionPre(MeowParser.EqualityExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpressionEqual}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpressionEqual(MeowParser.EqualityExpressionEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpressionNotEqual}
	 * labeled alternative in {@link MeowParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpressionNotEqual(MeowParser.EqualityExpressionNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpressionPre}
	 * labeled alternative in {@link MeowParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpressionPre(MeowParser.AndExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpressionAnd}
	 * labeled alternative in {@link MeowParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpressionAnd(MeowParser.AndExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorExpressionXor}
	 * labeled alternative in {@link MeowParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpressionXor(MeowParser.XorExpressionXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorExpressionPre}
	 * labeled alternative in {@link MeowParser#xorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpressionPre(MeowParser.XorExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpressionOr}
	 * labeled alternative in {@link MeowParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpressionOr(MeowParser.OrExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpressionPre}
	 * labeled alternative in {@link MeowParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpressionPre(MeowParser.OrExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpressionAnd}
	 * labeled alternative in {@link MeowParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpressionAnd(MeowParser.LogicalAndExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpressionPre}
	 * labeled alternative in {@link MeowParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpressionPre(MeowParser.LogicalAndExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpressionPre}
	 * labeled alternative in {@link MeowParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpressionPre(MeowParser.LogicalOrExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpressionOr}
	 * labeled alternative in {@link MeowParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpressionOr(MeowParser.LogicalOrExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpressionPre}
	 * labeled alternative in {@link MeowParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionPre(MeowParser.ConditionalExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpressionPre}
	 * labeled alternative in {@link MeowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpressionPre(MeowParser.AssignmentExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpressionAssgin}
	 * labeled alternative in {@link MeowParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpressionAssgin(MeowParser.AssignmentExpressionAssginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(MeowParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentExpressionPre}
	 * labeled alternative in {@link MeowParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionPre(MeowParser.ArgumentExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentExpressionCur}
	 * labeled alternative in {@link MeowParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionCur(MeowParser.ArgumentExpressionCurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionPre}
	 * labeled alternative in {@link MeowParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPre(MeowParser.ExpressionPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorIdentifier}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorIdentifier(MeowParser.CreatorIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorArray}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorArray(MeowParser.CreatorArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code creatorPrimitiveType}
	 * labeled alternative in {@link MeowParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatorPrimitiveType(MeowParser.CreatorPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeNameArray}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameArray(MeowParser.TypeNameArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeNameIdentifier}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameIdentifier(MeowParser.TypeNameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeNameprimitiveType}
	 * labeled alternative in {@link MeowParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameprimitiveType(MeowParser.TypeNameprimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(MeowParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MeowParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatementsCur}
	 * labeled alternative in {@link MeowParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementsCur(MeowParser.BlockStatementsCurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatementsPre}
	 * labeled alternative in {@link MeowParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementsPre(MeowParser.BlockStatementsPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(MeowParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementVariableDeclarationStatement}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclarationStatement(MeowParser.StatementVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpressionStatement}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionStatement(MeowParser.StatementExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIfElse}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIfElse(MeowParser.StatementIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(MeowParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(MeowParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(MeowParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(MeowParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementcontinue}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementcontinue(MeowParser.StatementcontinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementEmpty}
	 * labeled alternative in {@link MeowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementEmpty(MeowParser.StatementEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MeowParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MeowParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code translationUnitsCur}
	 * labeled alternative in {@link MeowParser#translationUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnitsCur(MeowParser.TranslationUnitsCurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code translationUnitPre}
	 * labeled alternative in {@link MeowParser#translationUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnitPre(MeowParser.TranslationUnitPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code translationUnitClassDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnitClassDeclaration(MeowParser.TranslationUnitClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code translationUnitFunctionDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnitFunctionDeclaration(MeowParser.TranslationUnitFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code translationUnitVariableDeclaration}
	 * labeled alternative in {@link MeowParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnitVariableDeclaration(MeowParser.TranslationUnitVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MeowParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MeowParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclarationEmpty}
	 * labeled alternative in {@link MeowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclarationEmpty(MeowParser.ClassBodyDeclarationEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyDeclarationMember}
	 * labeled alternative in {@link MeowParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclarationMember(MeowParser.ClassBodyDeclarationMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(MeowParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(MeowParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MeowParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(MeowParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(MeowParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(MeowParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(MeowParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MeowParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(MeowParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(MeowParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variableDeclaratorID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorID(MeowParser.VariableDeclaratorIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variableDeclaratorIDList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorIDList(MeowParser.VariableDeclaratorIDListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantIntegerConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIntegerConstant(MeowParser.ConstantIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantBooleanConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantBooleanConstant(MeowParser.ConstantBooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantNullConstant}
	 * labeled alternative in {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantNullConstant(MeowParser.ConstantNullConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#testID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestID(MeowParser.TestIDContext ctx);
}