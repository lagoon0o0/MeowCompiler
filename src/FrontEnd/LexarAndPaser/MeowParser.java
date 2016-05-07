// Generated from Meow.g4 by ANTLR 4.5
package FrontEnd.LexarAndPaser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LeftParen=2, RightParen=3, LeftBracket=4, RightBracket=5, LeftBrace=6, 
		RightBrace=7, Less=8, LessEqual=9, Greater=10, GreaterEqual=11, LeftShift=12, 
		RightShift=13, Plus=14, PlusPlus=15, Minus=16, MinusMinus=17, Star=18, 
		Div=19, Mod=20, And=21, Or=22, AndAnd=23, OrOr=24, Caret=25, Not=26, Tilde=27, 
		Question=28, Colon=29, Semi=30, Comma=31, Assign=32, StarAssign=33, DivAssign=34, 
		ModAssign=35, PlusAssign=36, MinusAssign=37, LeftShiftAssign=38, RightShiftAssign=39, 
		AndAssign=40, XorAssign=41, OrAssign=42, Equal=43, NotEqual=44, Arrow=45, 
		Dot=46, New=47, Bool=48, Int=49, String=50, Void=51, Class=52, Null=53, 
		If=54, Else=55, For=56, While=57, Return=58, Continue=59, Break=60, TBD=61, 
		BooleanConstant=62, IntegerConstant=63, Stringliteral=64, Whitespace=65, 
		Newline=66, Identifier=67, IdentifierNonDigit=68, LineComment=69, BlockComment=70;
	public static final int
		RULE_primaryExpression = 0, RULE_postfixExpression = 1, RULE_unaryExpression = 2, 
		RULE_castExpression = 3, RULE_multiplicativeExpression = 4, RULE_addativeExpression = 5, 
		RULE_shiftExpression = 6, RULE_relationalExpression = 7, RULE_equalityExpression = 8, 
		RULE_andExpression = 9, RULE_xorExpression = 10, RULE_orExpression = 11, 
		RULE_logicalAndExpression = 12, RULE_logicalOrExpression = 13, RULE_conditionalExpression = 14, 
		RULE_assignmentExpression = 15, RULE_assignmentOperator = 16, RULE_argumentExpression = 17, 
		RULE_expression = 18, RULE_creator = 19, RULE_typeName = 20, RULE_primitiveType = 21, 
		RULE_block = 22, RULE_blockStatements = 23, RULE_statement = 24, RULE_expressionStatement = 25, 
		RULE_program = 26, RULE_translationUnits = 27, RULE_translationUnit = 28, 
		RULE_classDeclaration = 29, RULE_classBody = 30, RULE_classBodyDeclaration = 31, 
		RULE_memberDeclaration = 32, RULE_fieldDeclaration = 33, RULE_functionDeclaration = 34, 
		RULE_formalParameters = 35, RULE_formalParameterList = 36, RULE_formalParameter = 37, 
		RULE_variableDeclarationStatement = 38, RULE_variableDeclaration = 39, 
		RULE_variableDeclaratorList = 40, RULE_variableDeclarator = 41, RULE_variableDeclaratorID = 42, 
		RULE_variableDeclaratorIDList = 43, RULE_constant = 44, RULE_testID = 45;
	public static final String[] ruleNames = {
		"primaryExpression", "postfixExpression", "unaryExpression", "castExpression", 
		"multiplicativeExpression", "addativeExpression", "shiftExpression", "relationalExpression", 
		"equalityExpression", "andExpression", "xorExpression", "orExpression", 
		"logicalAndExpression", "logicalOrExpression", "conditionalExpression", 
		"assignmentExpression", "assignmentOperator", "argumentExpression", "expression", 
		"creator", "typeName", "primitiveType", "block", "blockStatements", "statement", 
		"expressionStatement", "program", "translationUnits", "translationUnit", 
		"classDeclaration", "classBody", "classBodyDeclaration", "memberDeclaration", 
		"fieldDeclaration", "functionDeclaration", "formalParameters", "formalParameterList", 
		"formalParameter", "variableDeclarationStatement", "variableDeclaration", 
		"variableDeclaratorList", "variableDeclarator", "variableDeclaratorID", 
		"variableDeclaratorIDList", "constant", "testID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", 
		"'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", 
		"'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", 
		"';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'new'", 
		"'bool'", "'int'", "'string'", "'void'", "'class'", "'null'", "'if'", 
		"'else'", "'For'", "'while'", "'return'", "'continue'", "'break'", "'ToBeDone'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
		"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
		"Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", "DivAssign", 
		"ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", 
		"AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", "Arrow", "Dot", 
		"New", "Bool", "Int", "String", "Void", "Class", "Null", "If", "Else", 
		"For", "While", "Return", "Continue", "Break", "TBD", "BooleanConstant", 
		"IntegerConstant", "Stringliteral", "Whitespace", "Newline", "Identifier", 
		"IdentifierNonDigit", "LineComment", "BlockComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Meow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExpressionIdentifierContext extends PrimaryExpressionContext {
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public PrimaryExpressionIdentifierContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPrimaryExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPrimaryExpressionIdentifier(this);
		}
	}
	public static class PrimaryExpressionParenContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionParenContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPrimaryExpressionParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPrimaryExpressionParen(this);
		}
	}
	public static class PrimaryExpressionStringLiteralContext extends PrimaryExpressionContext {
		public TerminalNode Stringliteral() { return getToken(MeowParser.Stringliteral, 0); }
		public PrimaryExpressionStringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPrimaryExpressionStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPrimaryExpressionStringLiteral(this);
		}
	}
	public static class PrimaryExpressionconstantContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PrimaryExpressionconstantContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPrimaryExpressionconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPrimaryExpressionconstant(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new PrimaryExpressionIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(Identifier);
				}
				break;
			case Null:
			case BooleanConstant:
			case IntegerConstant:
				_localctx = new PrimaryExpressionconstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				constant();
				}
				break;
			case Stringliteral:
				_localctx = new PrimaryExpressionStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(Stringliteral);
				}
				break;
			case LeftParen:
				_localctx = new PrimaryExpressionParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(LeftParen);
				setState(96);
				expression();
				setState(97);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExpressionBracketContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionBracketContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPostfixExpressionBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPostfixExpressionBracket(this);
		}
	}
	public static class PostfixExpressionDotContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public PostfixExpressionDotContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPostfixExpressionDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPostfixExpressionDot(this);
		}
	}
	public static class PostfixExpressionMinusMinusContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExpressionMinusMinusContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPostfixExpressionMinusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPostfixExpressionMinusMinus(this);
		}
	}
	public static class PostfixExpressionPreContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionPreContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPostfixExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPostfixExpressionPre(this);
		}
	}
	public static class PostfixExpressionParenContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArgumentExpressionContext argumentExpression() {
			return getRuleContext(ArgumentExpressionContext.class,0);
		}
		public PostfixExpressionParenContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPostfixExpressionParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPostfixExpressionParen(this);
		}
	}
	public static class PostfixExpressionPlusPlusContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExpressionPlusPlusContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPostfixExpressionPlusPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPostfixExpressionPlusPlus(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PostfixExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(102);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionBracketContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						match(LeftBracket);
						setState(106);
						expression();
						setState(107);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionParenContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						match(LeftParen);
						setState(112);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
							{
							setState(111);
							argumentExpression(0);
							}
						}

						setState(114);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionDotContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
						match(Dot);
						setState(117);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionPlusPlusContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(119);
						match(PlusPlus);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionMinusMinusContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpressionMinusContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionMinusContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionMinus(this);
		}
	}
	public static class UnaryExpressionPlusContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionPlusContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionPlus(this);
		}
	}
	public static class UnaryExpressionPlusPlusContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionPlusPlusContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionPlusPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionPlusPlus(this);
		}
	}
	public static class UnaryExpressionNewContext extends UnaryExpressionContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public UnaryExpressionNewContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionNew(this);
		}
	}
	public static class UnaryExpressionMinusMinusContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionMinusMinusContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionMinusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionMinusMinus(this);
		}
	}
	public static class UnaryExpressionPreContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionPreContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionPre(this);
		}
	}
	public static class UnaryExpressionNotContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionNot(this);
		}
	}
	public static class UnaryExpressionTildeContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionTildeContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterUnaryExpressionTilde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitUnaryExpressionTilde(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryExpression);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case LeftParen:
			case Null:
			case BooleanConstant:
			case IntegerConstant:
			case Stringliteral:
			case Identifier:
				_localctx = new UnaryExpressionPreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				postfixExpression(0);
				}
				break;
			case New:
				_localctx = new UnaryExpressionNewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(New);
				setState(129);
				creator(0);
				}
				break;
			case PlusPlus:
				_localctx = new UnaryExpressionPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(PlusPlus);
				setState(131);
				unaryExpression();
				}
				break;
			case MinusMinus:
				_localctx = new UnaryExpressionMinusMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(MinusMinus);
				setState(133);
				unaryExpression();
				}
				break;
			case Not:
				_localctx = new UnaryExpressionNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(Not);
				setState(135);
				unaryExpression();
				}
				break;
			case Tilde:
				_localctx = new UnaryExpressionTildeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(Tilde);
				setState(137);
				unaryExpression();
				}
				break;
			case Plus:
				_localctx = new UnaryExpressionPlusContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(Plus);
				setState(139);
				unaryExpression();
				}
				break;
			case Minus:
				_localctx = new UnaryExpressionMinusContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				match(Minus);
				setState(141);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastExpressionPreContext extends CastExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionPreContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterCastExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitCastExpressionPre(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_castExpression);
		try {
			_localctx = new CastExpressionPreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExpressionDivContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionDivContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterMultiplicativeExpressionDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitMultiplicativeExpressionDiv(this);
		}
	}
	public static class MultiplicativeExpressionPreContext extends MultiplicativeExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionPreContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterMultiplicativeExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitMultiplicativeExpressionPre(this);
		}
	}
	public static class MultiplicativeExpressionModContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionModContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterMultiplicativeExpressionMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitMultiplicativeExpressionMod(this);
		}
	}
	public static class MultiplicativeExpressionMulContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionMulContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterMultiplicativeExpressionMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitMultiplicativeExpressionMul(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(147);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionMulContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
						match(Star);
						setState(151);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionDivContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						match(Div);
						setState(154);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionModContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(155);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(156);
						match(Mod);
						setState(157);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddativeExpressionContext extends ParserRuleContext {
		public AddativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addativeExpression; }
	 
		public AddativeExpressionContext() { }
		public void copyFrom(AddativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddativeExpressionPlusContext extends AddativeExpressionContext {
		public AddativeExpressionContext addativeExpression() {
			return getRuleContext(AddativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AddativeExpressionPlusContext(AddativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAddativeExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAddativeExpressionPlus(this);
		}
	}
	public static class AddativeExpressionMinusContext extends AddativeExpressionContext {
		public AddativeExpressionContext addativeExpression() {
			return getRuleContext(AddativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AddativeExpressionMinusContext(AddativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAddativeExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAddativeExpressionMinus(this);
		}
	}
	public static class AddativeExpressionPreContext extends AddativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AddativeExpressionPreContext(AddativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAddativeExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAddativeExpressionPre(this);
		}
	}

	public final AddativeExpressionContext addativeExpression() throws RecognitionException {
		return addativeExpression(0);
	}

	private AddativeExpressionContext addativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddativeExpressionContext _localctx = new AddativeExpressionContext(_ctx, _parentState);
		AddativeExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_addativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddativeExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(164);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AddativeExpressionPlusContext(new AddativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addativeExpression);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(Plus);
						setState(168);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AddativeExpressionMinusContext(new AddativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addativeExpression);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						match(Minus);
						setState(171);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpressionLeftShiftContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AddativeExpressionContext addativeExpression() {
			return getRuleContext(AddativeExpressionContext.class,0);
		}
		public ShiftExpressionLeftShiftContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterShiftExpressionLeftShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitShiftExpressionLeftShift(this);
		}
	}
	public static class ShiftExpressionPreContext extends ShiftExpressionContext {
		public AddativeExpressionContext addativeExpression() {
			return getRuleContext(AddativeExpressionContext.class,0);
		}
		public ShiftExpressionPreContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterShiftExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitShiftExpressionPre(this);
		}
	}
	public static class ShiftExpressionRightShiftContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AddativeExpressionContext addativeExpression() {
			return getRuleContext(AddativeExpressionContext.class,0);
		}
		public ShiftExpressionRightShiftContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterShiftExpressionRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitShiftExpressionRightShift(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(178);
			addativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionLeftShiftContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						match(LeftShift);
						setState(182);
						addativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionRightShiftContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						match(RightShift);
						setState(185);
						addativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalExpressionLessThanContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionLessThanContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterRelationalExpressionLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitRelationalExpressionLessThan(this);
		}
	}
	public static class RelationalExpressionGreaterOrEqualThanContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionGreaterOrEqualThanContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterRelationalExpressionGreaterOrEqualThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitRelationalExpressionGreaterOrEqualThan(this);
		}
	}
	public static class RelationalExpressionPreContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionPreContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterRelationalExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitRelationalExpressionPre(this);
		}
	}
	public static class RelationalExpressionLessOrEqualThanContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionLessOrEqualThanContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterRelationalExpressionLessOrEqualThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitRelationalExpressionLessOrEqualThan(this);
		}
	}
	public static class RelationalExpressionGreaterThanContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionGreaterThanContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterRelationalExpressionGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitRelationalExpressionGreaterThan(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationalExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(192);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionLessThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(Less);
						setState(196);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionGreaterThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(Greater);
						setState(199);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionLessOrEqualThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						match(LessEqual);
						setState(202);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionGreaterOrEqualThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(203);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(204);
						match(GreaterEqual);
						setState(205);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpressionPreContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionPreContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterEqualityExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitEqualityExpressionPre(this);
		}
	}
	public static class EqualityExpressionEqualContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionEqualContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterEqualityExpressionEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitEqualityExpressionEqual(this);
		}
	}
	public static class EqualityExpressionNotEqualContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionNotEqualContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterEqualityExpressionNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitEqualityExpressionNotEqual(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(212);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionEqualContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(215);
						match(Equal);
						setState(216);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionNotEqualContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(217);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(218);
						match(NotEqual);
						setState(219);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpressionPreContext extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionPreContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAndExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAndExpressionPre(this);
		}
	}
	public static class AndExpressionAndContext extends AndExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionAndContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAndExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAndExpressionAnd(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(226);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionAndContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229);
					match(And);
					setState(230);
					equalityExpression(0);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XorExpressionContext extends ParserRuleContext {
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
	 
		public XorExpressionContext() { }
		public void copyFrom(XorExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XorExpressionXorContext extends XorExpressionContext {
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public XorExpressionXorContext(XorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterXorExpressionXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitXorExpressionXor(this);
		}
	}
	public static class XorExpressionPreContext extends XorExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public XorExpressionPreContext(XorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterXorExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitXorExpressionPre(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		return xorExpression(0);
	}

	private XorExpressionContext xorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, _parentState);
		XorExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_xorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new XorExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(237);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XorExpressionXorContext(new XorExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_xorExpression);
					setState(239);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(240);
					match(Caret);
					setState(241);
					andExpression(0);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
	 
		public OrExpressionContext() { }
		public void copyFrom(OrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrExpressionOrContext extends OrExpressionContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public OrExpressionOrContext(OrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterOrExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitOrExpressionOr(this);
		}
	}
	public static class OrExpressionPreContext extends OrExpressionContext {
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public OrExpressionPreContext(OrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterOrExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitOrExpressionPre(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OrExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(248);
			xorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionOrContext(new OrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(250);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(251);
					match(Or);
					setState(252);
					xorExpression(0);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalAndExpressionAndContext extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public LogicalAndExpressionAndContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterLogicalAndExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitLogicalAndExpressionAnd(this);
		}
	}
	public static class LogicalAndExpressionPreContext extends LogicalAndExpressionContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public LogicalAndExpressionPreContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterLogicalAndExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitLogicalAndExpressionPre(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalAndExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(259);
			orExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionAndContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(261);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(262);
					match(AndAnd);
					setState(263);
					orExpression(0);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrExpressionPreContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionPreContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterLogicalOrExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitLogicalOrExpressionPre(this);
		}
	}
	public static class LogicalOrExpressionOrContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionOrContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterLogicalOrExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitLogicalOrExpressionOr(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalOrExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(270);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionOrContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(272);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(273);
					match(OrOr);
					setState(274);
					logicalAndExpression(0);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExpressionPreContext extends ConditionalExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConditionalExpressionPreContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterConditionalExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitConditionalExpressionPre(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionalExpression);
		try {
			_localctx = new ConditionalExpressionPreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			logicalOrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExpressionAssginContext extends AssignmentExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionAssginContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAssignmentExpressionAssgin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAssignmentExpressionAssgin(this);
		}
	}
	public static class AssignmentExpressionPreContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpressionPreContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAssignmentExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAssignmentExpressionPre(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentExpression);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new AssignmentExpressionPreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new AssignmentExpressionAssginContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				unaryExpression();
				setState(284);
				assignmentOperator();
				setState(285);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
	 
		public ArgumentExpressionContext() { }
		public void copyFrom(ArgumentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentExpressionPreContext extends ArgumentExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionPreContext(ArgumentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterArgumentExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitArgumentExpressionPre(this);
		}
	}
	public static class ArgumentExpressionCurContext extends ArgumentExpressionContext {
		public ArgumentExpressionContext argumentExpression() {
			return getRuleContext(ArgumentExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionCurContext(ArgumentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterArgumentExpressionCur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitArgumentExpressionCur(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		return argumentExpression(0);
	}

	private ArgumentExpressionContext argumentExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, _parentState);
		ArgumentExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_argumentExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentExpressionPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(292);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionCurContext(new ArgumentExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpression);
					setState(294);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(295);
					match(Comma);
					setState(296);
					assignmentExpression();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionPreContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionPreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterExpressionPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitExpressionPre(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			_localctx = new ExpressionPreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	 
		public CreatorContext() { }
		public void copyFrom(CreatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreatorIdentifierContext extends CreatorContext {
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public CreatorIdentifierContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterCreatorIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitCreatorIdentifier(this);
		}
	}
	public static class CreatorArrayContext extends CreatorContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CreatorArrayContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterCreatorArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitCreatorArray(this);
		}
	}
	public static class CreatorPrimitiveTypeContext extends CreatorContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatorPrimitiveTypeContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterCreatorPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitCreatorPrimitiveType(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		return creator(0);
	}

	private CreatorContext creator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CreatorContext _localctx = new CreatorContext(_ctx, _parentState);
		CreatorContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_creator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case Void:
				{
				_localctx = new CreatorPrimitiveTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(305);
				primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new CreatorIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CreatorArrayContext(new CreatorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_creator);
					setState(309);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(310);
					match(LeftBracket);
					setState(312);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
						{
						setState(311);
						expression();
						}
					}

					setState(314);
					match(RightBracket);
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	 
		public TypeNameContext() { }
		public void copyFrom(TypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeNameArrayContext extends TypeNameContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeNameArrayContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTypeNameArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTypeNameArray(this);
		}
	}
	public static class TypeNameIdentifierContext extends TypeNameContext {
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public TypeNameIdentifierContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTypeNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTypeNameIdentifier(this);
		}
	}
	public static class TypeNameprimitiveTypeContext extends TypeNameContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeNameprimitiveTypeContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTypeNameprimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTypeNameprimitiveType(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case Void:
				{
				_localctx = new TypeNameprimitiveTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(321);
				primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new TypeNameIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameArrayContext(new TypeNameContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(325);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(326);
					match(LeftBracket);
					setState(327);
					match(RightBracket);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Token name;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((PrimitiveTypeContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Int) | (1L << String) | (1L << Void))) != 0)) ) {
				((PrimitiveTypeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(LeftBrace);
			setState(337);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi) | (1L << New) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Null) | (1L << If) | (1L << While) | (1L << Return) | (1L << Continue) | (1L << Break) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
				{
				setState(336);
				blockStatements(0);
				}
			}

			setState(339);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
	 
		public BlockStatementsContext() { }
		public void copyFrom(BlockStatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStatementsCurContext extends BlockStatementsContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementsCurContext(BlockStatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterBlockStatementsCur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitBlockStatementsCur(this);
		}
	}
	public static class BlockStatementsPreContext extends BlockStatementsContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementsPreContext(BlockStatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterBlockStatementsPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitBlockStatementsPre(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		return blockStatements(0);
	}

	private BlockStatementsContext blockStatements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, _parentState);
		BlockStatementsContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_blockStatements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BlockStatementsPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(342);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockStatementsCurContext(new BlockStatementsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_blockStatements);
					setState(344);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(345);
					statement();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementExpressionStatementContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementExpressionStatement(this);
		}
	}
	public static class StatementReturnContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementReturn(this);
		}
	}
	public static class StatementForContext extends StatementContext {
		public ExpressionContext forInit;
		public ExpressionContext forCondition;
		public ExpressionContext forUpdate;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementFor(this);
		}
	}
	public static class StatementBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementBlock(this);
		}
	}
	public static class StatementBreakContext extends StatementContext {
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementBreak(this);
		}
	}
	public static class StatementVariableDeclarationStatementContext extends StatementContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public StatementVariableDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementVariableDeclarationStatement(this);
		}
	}
	public static class StatementIfElseContext extends StatementContext {
		public StatementContext bodyThen;
		public StatementContext bodyElse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementIfElseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementIfElse(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementWhile(this);
		}
	}
	public static class StatementcontinueContext extends StatementContext {
		public StatementcontinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementcontinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementcontinue(this);
		}
	}
	public static class StatementEmptyContext extends StatementContext {
		public StatementEmptyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterStatementEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitStatementEmpty(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		int _la;
		try {
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				block();
				}
				break;
			case 2:
				_localctx = new StatementVariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				variableDeclarationStatement();
				}
				break;
			case 3:
				_localctx = new StatementExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				expressionStatement();
				}
				break;
			case 4:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(If);
				setState(355);
				match(LeftParen);
				setState(356);
				expression();
				setState(357);
				match(RightParen);
				setState(358);
				((StatementIfElseContext)_localctx).bodyThen = statement();
				setState(361);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(359);
					match(Else);
					setState(360);
					((StatementIfElseContext)_localctx).bodyElse = statement();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(T__0);
				setState(364);
				match(LeftParen);
				setState(366);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(365);
					((StatementForContext)_localctx).forInit = expression();
					}
				}

				setState(368);
				match(Semi);
				setState(370);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(369);
					((StatementForContext)_localctx).forCondition = expression();
					}
				}

				setState(372);
				match(Semi);
				setState(374);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(373);
					((StatementForContext)_localctx).forUpdate = expression();
					}
				}

				setState(376);
				match(RightParen);
				setState(377);
				statement();
				}
				break;
			case 6:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				match(While);
				setState(379);
				match(LeftParen);
				setState(380);
				expression();
				setState(381);
				match(RightParen);
				setState(382);
				statement();
				}
				break;
			case 7:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(384);
				match(Return);
				setState(386);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(385);
					expression();
					}
				}

				setState(388);
				match(Semi);
				}
				break;
			case 8:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
				match(Break);
				setState(390);
				match(Semi);
				}
				break;
			case 9:
				_localctx = new StatementcontinueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(391);
				match(Continue);
				setState(392);
				match(Semi);
				}
				break;
			case 10:
				_localctx = new StatementEmptyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(393);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			expression();
			setState(397);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MeowParser.EOF, 0); }
		public TranslationUnitsContext translationUnits() {
			return getRuleContext(TranslationUnitsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Bool - 48)) | (1L << (Int - 48)) | (1L << (String - 48)) | (1L << (Void - 48)) | (1L << (Class - 48)) | (1L << (Identifier - 48)))) != 0)) {
				{
				setState(399);
				translationUnits(0);
				}
			}

			setState(402);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitsContext extends ParserRuleContext {
		public TranslationUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnits; }
	 
		public TranslationUnitsContext() { }
		public void copyFrom(TranslationUnitsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TranslationUnitPreContext extends TranslationUnitsContext {
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitPreContext(TranslationUnitsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTranslationUnitPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTranslationUnitPre(this);
		}
	}
	public static class TranslationUnitsCurContext extends TranslationUnitsContext {
		public TranslationUnitsContext translationUnits() {
			return getRuleContext(TranslationUnitsContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitsCurContext(TranslationUnitsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTranslationUnitsCur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTranslationUnitsCur(this);
		}
	}

	public final TranslationUnitsContext translationUnits() throws RecognitionException {
		return translationUnits(0);
	}

	private TranslationUnitsContext translationUnits(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitsContext _localctx = new TranslationUnitsContext(_ctx, _parentState);
		TranslationUnitsContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_translationUnits, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TranslationUnitPreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(405);
			translationUnit();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitsCurContext(new TranslationUnitsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnits);
					setState(407);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(408);
					translationUnit();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	 
		public TranslationUnitContext() { }
		public void copyFrom(TranslationUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TranslationUnitFunctionDeclarationContext extends TranslationUnitContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TranslationUnitFunctionDeclarationContext(TranslationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTranslationUnitFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTranslationUnitFunctionDeclaration(this);
		}
	}
	public static class TranslationUnitClassDeclarationContext extends TranslationUnitContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TranslationUnitClassDeclarationContext(TranslationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTranslationUnitClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTranslationUnitClassDeclaration(this);
		}
	}
	public static class TranslationUnitVariableDeclarationContext extends TranslationUnitContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public TranslationUnitVariableDeclarationContext(TranslationUnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTranslationUnitVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTranslationUnitVariableDeclaration(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_translationUnit);
		try {
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new TranslationUnitClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				classDeclaration();
				}
				break;
			case 2:
				_localctx = new TranslationUnitFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new TranslationUnitVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				variableDeclarationStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Class);
			setState(420);
			match(Identifier);
			setState(421);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(LeftBrace);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (Semi - 30)) | (1L << (Bool - 30)) | (1L << (Int - 30)) | (1L << (String - 30)) | (1L << (Void - 30)) | (1L << (Identifier - 30)))) != 0)) {
				{
				{
				setState(424);
				classBodyDeclaration();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	 
		public ClassBodyDeclarationContext() { }
		public void copyFrom(ClassBodyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassBodyDeclarationMemberContext extends ClassBodyDeclarationContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationMemberContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterClassBodyDeclarationMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitClassBodyDeclarationMember(this);
		}
	}
	public static class ClassBodyDeclarationEmptyContext extends ClassBodyDeclarationContext {
		public ClassBodyDeclarationEmptyContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterClassBodyDeclarationEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitClassBodyDeclarationEmpty(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classBodyDeclaration);
		try {
			setState(434);
			switch (_input.LA(1)) {
			case Semi:
				_localctx = new ClassBodyDeclarationEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(Semi);
				}
				break;
			case Bool:
			case Int:
			case String:
			case Void:
			case Identifier:
				_localctx = new ClassBodyDeclarationMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				memberDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			fieldDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VariableDeclaratorIDListContext variableDeclaratorIDList() {
			return getRuleContext(VariableDeclaratorIDListContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			typeName(0);
			setState(439);
			variableDeclaratorIDList();
			setState(440);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			typeName(0);
			setState(443);
			match(Identifier);
			setState(444);
			formalParameters();
			setState(445);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LeftParen);
			setState(449);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Bool - 48)) | (1L << (Int - 48)) | (1L << (String - 48)) | (1L << (Void - 48)) | (1L << (Identifier - 48)))) != 0)) {
				{
				setState(448);
				formalParameterList();
				}
			}

			setState(451);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			formalParameter();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(454);
				match(Comma);
				setState(455);
				formalParameter();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VariableDeclaratorIDContext variableDeclaratorID() {
			return getRuleContext(VariableDeclaratorIDContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			typeName(0);
			setState(462);
			variableDeclaratorID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			variableDeclaration();
			setState(465);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeName(0);
			setState(468);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			variableDeclarator();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(471);
				match(Comma);
				setState(472);
				variableDeclarator();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIDContext variableDeclaratorID() {
			return getRuleContext(VariableDeclaratorIDContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			variableDeclaratorID();
			setState(481);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(479);
				match(Assign);
				setState(480);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIDContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public VariableDeclaratorIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterVariableDeclaratorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitVariableDeclaratorID(this);
		}
	}

	public final VariableDeclaratorIDContext variableDeclaratorID() throws RecognitionException {
		VariableDeclaratorIDContext _localctx = new VariableDeclaratorIDContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclaratorID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIDListContext extends ParserRuleContext {
		public List<VariableDeclaratorIDContext> variableDeclaratorID() {
			return getRuleContexts(VariableDeclaratorIDContext.class);
		}
		public VariableDeclaratorIDContext variableDeclaratorID(int i) {
			return getRuleContext(VariableDeclaratorIDContext.class,i);
		}
		public VariableDeclaratorIDListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorIDList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterVariableDeclaratorIDList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitVariableDeclaratorIDList(this);
		}
	}

	public final VariableDeclaratorIDListContext variableDeclaratorIDList() throws RecognitionException {
		VariableDeclaratorIDListContext _localctx = new VariableDeclaratorIDListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableDeclaratorIDList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			variableDeclaratorID();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(486);
				match(Comma);
				setState(487);
				variableDeclaratorID();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantNullConstantContext extends ConstantContext {
		public ConstantNullConstantContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterConstantNullConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitConstantNullConstant(this);
		}
	}
	public static class ConstantBooleanConstantContext extends ConstantContext {
		public TerminalNode BooleanConstant() { return getToken(MeowParser.BooleanConstant, 0); }
		public ConstantBooleanConstantContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterConstantBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitConstantBooleanConstant(this);
		}
	}
	public static class ConstantIntegerConstantContext extends ConstantContext {
		public TerminalNode IntegerConstant() { return getToken(MeowParser.IntegerConstant, 0); }
		public ConstantIntegerConstantContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterConstantIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitConstantIntegerConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constant);
		try {
			setState(496);
			switch (_input.LA(1)) {
			case IntegerConstant:
				_localctx = new ConstantIntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(IntegerConstant);
				}
				break;
			case BooleanConstant:
				_localctx = new ConstantBooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(BooleanConstant);
				}
				break;
			case Null:
				_localctx = new ConstantNullConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(Null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestIDContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MeowParser.Identifier, 0); }
		public TestIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).enterTestID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeowListener ) ((MeowListener)listener).exitTestID(this);
		}
	}

	public final TestIDContext testID() throws RecognitionException {
		TestIDContext _localctx = new TestIDContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_testID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 4:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 5:
			return addativeExpression_sempred((AddativeExpressionContext)_localctx, predIndex);
		case 6:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 7:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 8:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 9:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 10:
			return xorExpression_sempred((XorExpressionContext)_localctx, predIndex);
		case 11:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 12:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 13:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 17:
			return argumentExpression_sempred((ArgumentExpressionContext)_localctx, predIndex);
		case 19:
			return creator_sempred((CreatorContext)_localctx, predIndex);
		case 20:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 23:
			return blockStatements_sempred((BlockStatementsContext)_localctx, predIndex);
		case 27:
			return translationUnits_sempred((TranslationUnitsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addativeExpression_sempred(AddativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean xorExpression_sempred(XorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpression_sempred(ArgumentExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean creator_sempred(CreatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockStatements_sempred(BlockStatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnits_sempred(TranslationUnitsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u01f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2f\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bd\n\b\f\b\16\b\u00c0\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d1\n\t\f\t\16"+
		"\t\u00d4\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00df\n\n\f\n\16"+
		"\n\u00e2\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ea\n\13\f\13\16\13"+
		"\u00ed\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f5\n\f\f\f\16\f\u00f8\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16\r\u0103\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u010b\n\16\f\16\16\16\u010e\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0116\n\17\f\17\16\17\u0119\13\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0122\n\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u012c\n\23\f\23\16\23\u012f\13\23\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u0136\n\25\3\25\3\25\3\25\5\25\u013b\n\25\3\25\7\25\u013e\n"+
		"\25\f\25\16\25\u0141\13\25\3\26\3\26\3\26\5\26\u0146\n\26\3\26\3\26\3"+
		"\26\7\26\u014b\n\26\f\26\16\26\u014e\13\26\3\27\3\27\3\30\3\30\5\30\u0154"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u015d\n\31\f\31\16\31\u0160"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016c\n"+
		"\32\3\32\3\32\3\32\5\32\u0171\n\32\3\32\3\32\5\32\u0175\n\32\3\32\3\32"+
		"\5\32\u0179\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0185\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018d\n\32\3\33\3\33\3"+
		"\33\3\34\5\34\u0193\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u019c"+
		"\n\35\f\35\16\35\u019f\13\35\3\36\3\36\3\36\5\36\u01a4\n\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \7 \u01ac\n \f \16 \u01af\13 \3 \3 \3!\3!\5!\u01b5\n!"+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\5%\u01c4\n%\3%\3%\3&\3&\3&\7"+
		"&\u01cb\n&\f&\16&\u01ce\13&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\7*"+
		"\u01dc\n*\f*\16*\u01df\13*\3+\3+\3+\5+\u01e4\n+\3,\3,\3-\3-\3-\7-\u01eb"+
		"\n-\f-\16-\u01ee\13-\3.\3.\3.\5.\u01f3\n.\3/\3/\3/\2\22\4\n\f\16\20\22"+
		"\24\26\30\32\34$(*\608\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\3\3\2\62\65\u020e\2e\3\2\2\2\4"+
		"g\3\2\2\2\6\u0090\3\2\2\2\b\u0092\3\2\2\2\n\u0094\3\2\2\2\f\u00a5\3\2"+
		"\2\2\16\u00b3\3\2\2\2\20\u00c1\3\2\2\2\22\u00d5\3\2\2\2\24\u00e3\3\2\2"+
		"\2\26\u00ee\3\2\2\2\30\u00f9\3\2\2\2\32\u0104\3\2\2\2\34\u010f\3\2\2\2"+
		"\36\u011a\3\2\2\2 \u0121\3\2\2\2\"\u0123\3\2\2\2$\u0125\3\2\2\2&\u0130"+
		"\3\2\2\2(\u0135\3\2\2\2*\u0145\3\2\2\2,\u014f\3\2\2\2.\u0151\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u018c\3\2\2\2\64\u018e\3\2\2\2\66\u0192\3\2\2\28\u0196"+
		"\3\2\2\2:\u01a3\3\2\2\2<\u01a5\3\2\2\2>\u01a9\3\2\2\2@\u01b4\3\2\2\2B"+
		"\u01b6\3\2\2\2D\u01b8\3\2\2\2F\u01bc\3\2\2\2H\u01c1\3\2\2\2J\u01c7\3\2"+
		"\2\2L\u01cf\3\2\2\2N\u01d2\3\2\2\2P\u01d5\3\2\2\2R\u01d8\3\2\2\2T\u01e0"+
		"\3\2\2\2V\u01e5\3\2\2\2X\u01e7\3\2\2\2Z\u01f2\3\2\2\2\\\u01f4\3\2\2\2"+
		"^f\7E\2\2_f\5Z.\2`f\7B\2\2ab\7\4\2\2bc\5&\24\2cd\7\5\2\2df\3\2\2\2e^\3"+
		"\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2f\3\3\2\2\2gh\b\3\1\2hi\5\2\2\2i~"+
		"\3\2\2\2jk\f\7\2\2kl\7\6\2\2lm\5&\24\2mn\7\7\2\2n}\3\2\2\2op\f\6\2\2p"+
		"r\7\4\2\2qs\5$\23\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2t}\7\5\2\2uv\f\5\2\2"+
		"vw\7\60\2\2w}\7E\2\2xy\f\4\2\2y}\7\21\2\2z{\f\3\2\2{}\7\23\2\2|j\3\2\2"+
		"\2|o\3\2\2\2|u\3\2\2\2|x\3\2\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\5\3\2\2\2\u0080~\3\2\2\2\u0081\u0091\5\4\3\2\u0082\u0083"+
		"\7\61\2\2\u0083\u0091\5(\25\2\u0084\u0085\7\21\2\2\u0085\u0091\5\6\4\2"+
		"\u0086\u0087\7\23\2\2\u0087\u0091\5\6\4\2\u0088\u0089\7\34\2\2\u0089\u0091"+
		"\5\6\4\2\u008a\u008b\7\35\2\2\u008b\u0091\5\6\4\2\u008c\u008d\7\20\2\2"+
		"\u008d\u0091\5\6\4\2\u008e\u008f\7\22\2\2\u008f\u0091\5\6\4\2\u0090\u0081"+
		"\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0086\3\2\2\2\u0090"+
		"\u0088\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\7\3\2\2\2\u0092\u0093\5\6\4\2\u0093\t\3\2\2\2\u0094\u0095\b"+
		"\6\1\2\u0095\u0096\5\b\5\2\u0096\u00a2\3\2\2\2\u0097\u0098\f\5\2\2\u0098"+
		"\u0099\7\24\2\2\u0099\u00a1\5\b\5\2\u009a\u009b\f\4\2\2\u009b\u009c\7"+
		"\25\2\2\u009c\u00a1\5\b\5\2\u009d\u009e\f\3\2\2\u009e\u009f\7\26\2\2\u009f"+
		"\u00a1\5\b\5\2\u00a0\u0097\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\13\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\7\1\2\u00a6\u00a7\5\n\6"+
		"\2\u00a7\u00b0\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\20\2\2\u00aa"+
		"\u00af\5\n\6\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00af\5"+
		"\n\6\2\u00ae\u00a8\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b3\u00b4\b\b\1\2\u00b4\u00b5\5\f\7\2\u00b5\u00be\3\2\2\2\u00b6\u00b7"+
		"\f\4\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00bd\5\f\7\2\u00b9\u00ba\f\3\2\2"+
		"\u00ba\u00bb\7\17\2\2\u00bb\u00bd\5\f\7\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\17\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\t\1\2\u00c2\u00c3\5\16\b"+
		"\2\u00c3\u00d2\3\2\2\2\u00c4\u00c5\f\6\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00d1"+
		"\5\16\b\2\u00c7\u00c8\f\5\2\2\u00c8\u00c9\7\f\2\2\u00c9\u00d1\5\16\b\2"+
		"\u00ca\u00cb\f\4\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00d1\5\16\b\2\u00cd\u00ce"+
		"\f\3\2\2\u00ce\u00cf\7\r\2\2\u00cf\u00d1\5\16\b\2\u00d0\u00c4\3\2\2\2"+
		"\u00d0\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\21\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\b\n\1\2\u00d6\u00d7\5\20\t\2\u00d7\u00e0\3"+
		"\2\2\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\7-\2\2\u00da\u00df\5\20\t\2\u00db"+
		"\u00dc\f\3\2\2\u00dc\u00dd\7.\2\2\u00dd\u00df\5\20\t\2\u00de\u00d8\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\23\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\b\13\1"+
		"\2\u00e4\u00e5\5\22\n\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\f\3\2\2\u00e7"+
		"\u00e8\7\27\2\2\u00e8\u00ea\5\22\n\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\25\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\b\f\1\2\u00ef\u00f0\5\24\13\2\u00f0\u00f6\3"+
		"\2\2\2\u00f1\u00f2\f\3\2\2\u00f2\u00f3\7\33\2\2\u00f3\u00f5\5\24\13\2"+
		"\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b\r\1\2\u00fa"+
		"\u00fb\5\26\f\2\u00fb\u0101\3\2\2\2\u00fc\u00fd\f\3\2\2\u00fd\u00fe\7"+
		"\30\2\2\u00fe\u0100\5\26\f\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\31\3\2\2\2\u0103\u0101\3\2\2"+
		"\2\u0104\u0105\b\16\1\2\u0105\u0106\5\30\r\2\u0106\u010c\3\2\2\2\u0107"+
		"\u0108\f\3\2\2\u0108\u0109\7\31\2\2\u0109\u010b\5\30\r\2\u010a\u0107\3"+
		"\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\33\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\b\17\1\2\u0110\u0111\5\32"+
		"\16\2\u0111\u0117\3\2\2\2\u0112\u0113\f\3\2\2\u0113\u0114\7\32\2\2\u0114"+
		"\u0116\5\32\16\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\35\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\5\34\17\2\u011b\37\3\2\2\2\u011c\u0122\5\36\20\2\u011d\u011e\5"+
		"\6\4\2\u011e\u011f\5\"\22\2\u011f\u0120\5 \21\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0122!\3\2\2\2\u0123\u0124\7\"\2\2"+
		"\u0124#\3\2\2\2\u0125\u0126\b\23\1\2\u0126\u0127\5 \21\2\u0127\u012d\3"+
		"\2\2\2\u0128\u0129\f\3\2\2\u0129\u012a\7!\2\2\u012a\u012c\5 \21\2\u012b"+
		"\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e%\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\5 \21\2\u0131\'\3"+
		"\2\2\2\u0132\u0133\b\25\1\2\u0133\u0136\5,\27\2\u0134\u0136\7E\2\2\u0135"+
		"\u0132\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u013f\3\2\2\2\u0137\u0138\f\3"+
		"\2\2\u0138\u013a\7\6\2\2\u0139\u013b\5&\24\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\7\7\2\2\u013d\u0137\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		")\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b\26\1\2\u0143\u0146\5,\27\2"+
		"\u0144\u0146\7E\2\2\u0145\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u014c"+
		"\3\2\2\2\u0147\u0148\f\3\2\2\u0148\u0149\7\6\2\2\u0149\u014b\7\7\2\2\u014a"+
		"\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d+\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\t\2\2\2\u0150-\3\2"+
		"\2\2\u0151\u0153\7\b\2\2\u0152\u0154\5\60\31\2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\t\2\2\u0156/\3\2\2\2"+
		"\u0157\u0158\b\31\1\2\u0158\u0159\5\62\32\2\u0159\u015e\3\2\2\2\u015a"+
		"\u015b\f\3\2\2\u015b\u015d\5\62\32\2\u015c\u015a\3\2\2\2\u015d\u0160\3"+
		"\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\61\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u018d\5.\30\2\u0162\u018d\5N(\2\u0163\u018d\5\64"+
		"\33\2\u0164\u0165\78\2\2\u0165\u0166\7\4\2\2\u0166\u0167\5&\24\2\u0167"+
		"\u0168\7\5\2\2\u0168\u016b\5\62\32\2\u0169\u016a\79\2\2\u016a\u016c\5"+
		"\62\32\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u018d\3\2\2\2\u016d"+
		"\u016e\7\3\2\2\u016e\u0170\7\4\2\2\u016f\u0171\5&\24\2\u0170\u016f\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7 \2\2\u0173"+
		"\u0175\5&\24\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0178\7 \2\2\u0177\u0179\5&\24\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\5\2\2\u017b\u018d\5\62"+
		"\32\2\u017c\u017d\7;\2\2\u017d\u017e\7\4\2\2\u017e\u017f\5&\24\2\u017f"+
		"\u0180\7\5\2\2\u0180\u0181\5\62\32\2\u0181\u018d\3\2\2\2\u0182\u0184\7"+
		"<\2\2\u0183\u0185\5&\24\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u018d\7 \2\2\u0187\u0188\7>\2\2\u0188\u018d\7 \2"+
		"\2\u0189\u018a\7=\2\2\u018a\u018d\7 \2\2\u018b\u018d\7 \2\2\u018c\u0161"+
		"\3\2\2\2\u018c\u0162\3\2\2\2\u018c\u0163\3\2\2\2\u018c\u0164\3\2\2\2\u018c"+
		"\u016d\3\2\2\2\u018c\u017c\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0187\3\2"+
		"\2\2\u018c\u0189\3\2\2\2\u018c\u018b\3\2\2\2\u018d\63\3\2\2\2\u018e\u018f"+
		"\5&\24\2\u018f\u0190\7 \2\2\u0190\65\3\2\2\2\u0191\u0193\58\35\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\2"+
		"\2\3\u0195\67\3\2\2\2\u0196\u0197\b\35\1\2\u0197\u0198\5:\36\2\u0198\u019d"+
		"\3\2\2\2\u0199\u019a\f\4\2\2\u019a\u019c\5:\36\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e9\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u01a0\u01a4\5<\37\2\u01a1\u01a4\5F$\2\u01a2\u01a4"+
		"\5N(\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		";\3\2\2\2\u01a5\u01a6\7\66\2\2\u01a6\u01a7\7E\2\2\u01a7\u01a8\5> \2\u01a8"+
		"=\3\2\2\2\u01a9\u01ad\7\b\2\2\u01aa\u01ac\5@!\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\t\2\2\u01b1?\3\2\2\2\u01b2\u01b5"+
		"\7 \2\2\u01b3\u01b5\5B\"\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"A\3\2\2\2\u01b6\u01b7\5D#\2\u01b7C\3\2\2\2\u01b8\u01b9\5*\26\2\u01b9\u01ba"+
		"\5X-\2\u01ba\u01bb\7 \2\2\u01bbE\3\2\2\2\u01bc\u01bd\5*\26\2\u01bd\u01be"+
		"\7E\2\2\u01be\u01bf\5H%\2\u01bf\u01c0\5.\30\2\u01c0G\3\2\2\2\u01c1\u01c3"+
		"\7\4\2\2\u01c2\u01c4\5J&\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\7\5\2\2\u01c6I\3\2\2\2\u01c7\u01cc\5L\'\2\u01c8"+
		"\u01c9\7!\2\2\u01c9\u01cb\5L\'\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2"+
		"\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdK\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01d0\5*\26\2\u01d0\u01d1\5V,\2\u01d1M\3\2\2\2\u01d2\u01d3"+
		"\5P)\2\u01d3\u01d4\7 \2\2\u01d4O\3\2\2\2\u01d5\u01d6\5*\26\2\u01d6\u01d7"+
		"\5R*\2\u01d7Q\3\2\2\2\u01d8\u01dd\5T+\2\u01d9\u01da\7!\2\2\u01da\u01dc"+
		"\5T+\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01deS\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\5V,\2\u01e1"+
		"\u01e2\7\"\2\2\u01e2\u01e4\5&\24\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4U\3\2\2\2\u01e5\u01e6\7E\2\2\u01e6W\3\2\2\2\u01e7\u01ec\5V,"+
		"\2\u01e8\u01e9\7!\2\2\u01e9\u01eb\5V,\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edY\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f3\7A\2\2\u01f0\u01f3\7@\2\2\u01f1\u01f3\7\67"+
		"\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"[\3\2\2\2\u01f4\u01f5\7E\2\2\u01f5]\3\2\2\2\60er|~\u0090\u00a0\u00a2\u00ae"+
		"\u00b0\u00bc\u00be\u00d0\u00d2\u00de\u00e0\u00eb\u00f6\u0101\u010c\u0117"+
		"\u0121\u012d\u0135\u013a\u013f\u0145\u014c\u0153\u015e\u016b\u0170\u0174"+
		"\u0178\u0184\u018c\u0192\u019d\u01a3\u01ad\u01b4\u01c3\u01cc\u01dd\u01e3"+
		"\u01ec\u01f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}