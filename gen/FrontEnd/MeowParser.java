// Generated from /Users/lagoon0o0/Documents/Compiler/Meow/src/FrontEnd/Meow.g4 by ANTLR 4.5.1
package FrontEnd;
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		Newline=66, Identifier=67, IdentifierNonDigit=68, LineComment=69;
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
		"IdentifierNonDigit", "LineComment"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPrimaryExpressionIdentifier(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPrimaryExpressionParen(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPrimaryExpressionStringLiteral(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPrimaryExpressionconstant(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPostfixExpressionBracket(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPostfixExpressionDot(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPostfixExpressionMinusMinus(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPostfixExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPostfixExpressionParen(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPostfixExpressionPlusPlus(this);
			else return visitor.visitChildren(this);
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
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitUnaryExpressionPlusPlus(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitUnaryExpressionNew(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitUnaryExpressionMinusMinus(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitUnaryExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitUnaryExpressionNot(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitUnaryExpressionTilde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryExpression);
		try {
			setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitCastExpressionPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_castExpression);
		try {
			_localctx = new CastExpressionPreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitMultiplicativeExpressionDiv(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitMultiplicativeExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitMultiplicativeExpressionMod(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitMultiplicativeExpressionMul(this);
			else return visitor.visitChildren(this);
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

			setState(143);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionMulContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						match(Star);
						setState(147);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionDivContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(Div);
						setState(150);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionModContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(152);
						match(Mod);
						setState(153);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(158);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAddativeExpressionPlus(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAddativeExpressionMinus(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAddativeExpressionPre(this);
			else return visitor.visitChildren(this);
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

			setState(160);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AddativeExpressionPlusContext(new AddativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addativeExpression);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(Plus);
						setState(164);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AddativeExpressionMinusContext(new AddativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addativeExpression);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(Minus);
						setState(167);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(172);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitShiftExpressionLeftShift(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitShiftExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitShiftExpressionRightShift(this);
			else return visitor.visitChildren(this);
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

			setState(174);
			addativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionLeftShiftContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(LeftShift);
						setState(178);
						addativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionRightShiftContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(179);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(180);
						match(RightShift);
						setState(181);
						addativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(186);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitRelationalExpressionLessThan(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitRelationalExpressionGreaterOrEqualThan(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitRelationalExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitRelationalExpressionLessOrEqualThan(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitRelationalExpressionGreaterThan(this);
			else return visitor.visitChildren(this);
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

			setState(188);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionLessThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(Less);
						setState(192);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionGreaterThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(Greater);
						setState(195);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionLessOrEqualThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(LessEqual);
						setState(198);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionGreaterOrEqualThanContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(200);
						match(GreaterEqual);
						setState(201);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(206);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitEqualityExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitEqualityExpressionEqual(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitEqualityExpressionNotEqual(this);
			else return visitor.visitChildren(this);
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

			setState(208);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionEqualContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(Equal);
						setState(212);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionNotEqualContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(213);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(214);
						match(NotEqual);
						setState(215);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(220);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAndExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAndExpressionAnd(this);
			else return visitor.visitChildren(this);
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

			setState(222);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
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
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225);
					match(And);
					setState(226);
					equalityExpression(0);
					}
					} 
				}
				setState(231);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitXorExpressionXor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitXorExpressionPre(this);
			else return visitor.visitChildren(this);
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

			setState(233);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
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
					setState(235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(236);
					match(Caret);
					setState(237);
					andExpression(0);
					}
					} 
				}
				setState(242);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitOrExpressionOr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitOrExpressionPre(this);
			else return visitor.visitChildren(this);
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

			setState(244);
			xorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
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
					setState(246);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(247);
					match(Or);
					setState(248);
					xorExpression(0);
					}
					} 
				}
				setState(253);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitLogicalAndExpressionAnd(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitLogicalAndExpressionPre(this);
			else return visitor.visitChildren(this);
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

			setState(255);
			orExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
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
					setState(257);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(258);
					match(AndAnd);
					setState(259);
					orExpression(0);
					}
					} 
				}
				setState(264);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitLogicalOrExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitLogicalOrExpressionOr(this);
			else return visitor.visitChildren(this);
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

			setState(266);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
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
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(OrOr);
					setState(270);
					logicalAndExpression(0);
					}
					} 
				}
				setState(275);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitConditionalExpressionPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionalExpression);
		try {
			_localctx = new ConditionalExpressionPreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAssignmentExpressionAssgin(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAssignmentExpressionPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentExpression);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new AssignmentExpressionPreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new AssignmentExpressionAssginContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				unaryExpression();
				setState(280);
				assignmentOperator();
				setState(281);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitArgumentExpressionPre(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitArgumentExpressionCur(this);
			else return visitor.visitChildren(this);
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

			setState(288);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
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
					setState(290);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					match(Comma);
					setState(292);
					assignmentExpression();
					}
					} 
				}
				setState(297);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitExpressionPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			_localctx = new ExpressionPreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitCreatorIdentifier(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitCreatorArray(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitCreatorPrimitiveType(this);
			else return visitor.visitChildren(this);
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
			setState(303);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case Void:
				{
				_localctx = new CreatorPrimitiveTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(301);
				primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new CreatorIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
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
					setState(305);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(306);
					match(LeftBracket);
					setState(308);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
						{
						setState(307);
						expression();
						}
					}

					setState(310);
					match(RightBracket);
					}
					} 
				}
				setState(315);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTypeNameArray(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTypeNameIdentifier(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTypeNameprimitiveType(this);
			else return visitor.visitChildren(this);
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
			setState(319);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case Void:
				{
				_localctx = new TypeNameprimitiveTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(317);
				primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new TypeNameIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
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
					setState(321);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(322);
					match(LeftBracket);
					setState(323);
					match(RightBracket);
					}
					} 
				}
				setState(328);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LeftBrace);
			setState(333);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LeftParen) | (1L << LeftBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi) | (1L << New) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Null) | (1L << If) | (1L << While) | (1L << Return) | (1L << Continue) | (1L << Break) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
				{
				setState(332);
				blockStatements(0);
				}
			}

			setState(335);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitBlockStatementsCur(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitBlockStatementsPre(this);
			else return visitor.visitChildren(this);
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

			setState(338);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
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
					setState(340);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(341);
					statement();
					}
					} 
				}
				setState(346);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementExpressionStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementIfElse(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementcontinue(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitStatementEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		int _la;
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				block();
				}
				break;
			case 2:
				_localctx = new StatementVariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				variableDeclarationStatement();
				}
				break;
			case 3:
				_localctx = new StatementExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				expressionStatement();
				}
				break;
			case 4:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(If);
				setState(351);
				match(LeftParen);
				setState(352);
				expression();
				setState(353);
				match(RightParen);
				setState(354);
				((StatementIfElseContext)_localctx).bodyThen = statement();
				setState(357);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(355);
					match(Else);
					setState(356);
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
				setState(359);
				match(T__0);
				setState(360);
				match(LeftParen);
				setState(362);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(361);
					((StatementForContext)_localctx).forInit = expression();
					}
				}

				setState(364);
				match(Semi);
				setState(366);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(365);
					((StatementForContext)_localctx).forCondition = expression();
					}
				}

				setState(368);
				match(Semi);
				setState(370);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(369);
					((StatementForContext)_localctx).forUpdate = expression();
					}
				}

				setState(372);
				match(RightParen);
				setState(373);
				statement();
				}
				break;
			case 6:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				match(While);
				setState(375);
				match(LeftParen);
				setState(376);
				expression();
				setState(377);
				match(RightParen);
				setState(378);
				statement();
				}
				break;
			case 7:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(380);
				match(Return);
				setState(382);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << New) | (1L << Null) | (1L << BooleanConstant) | (1L << IntegerConstant))) != 0) || _la==Stringliteral || _la==Identifier) {
					{
					setState(381);
					expression();
					}
				}

				setState(384);
				match(Semi);
				}
				break;
			case 8:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				match(Break);
				setState(386);
				match(Semi);
				}
				break;
			case 9:
				_localctx = new StatementcontinueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(387);
				match(Continue);
				setState(388);
				match(Semi);
				}
				break;
			case 10:
				_localctx = new StatementEmptyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(389);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			expression();
			setState(393);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Bool - 48)) | (1L << (Int - 48)) | (1L << (String - 48)) | (1L << (Void - 48)) | (1L << (Class - 48)) | (1L << (Identifier - 48)))) != 0)) {
				{
				setState(395);
				translationUnits();
				}
			}

			setState(398);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTranslationUnitPre(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TranslationUnitsCurContext extends TranslationUnitsContext {
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitsContext translationUnits() {
			return getRuleContext(TranslationUnitsContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTranslationUnitsCur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitsContext translationUnits() throws RecognitionException {
		TranslationUnitsContext _localctx = new TranslationUnitsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_translationUnits);
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new TranslationUnitsCurContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				translationUnit();
				setState(401);
				translationUnits();
				}
				break;
			case 2:
				_localctx = new TranslationUnitPreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				translationUnit();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTranslationUnitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTranslationUnitClassDeclaration(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTranslationUnitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_translationUnit);
		try {
			setState(409);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new TranslationUnitClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				classDeclaration();
				}
				break;
			case 2:
				_localctx = new TranslationUnitFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new TranslationUnitVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(Class);
			setState(412);
			match(Identifier);
			setState(413);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LeftBrace);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (Semi - 30)) | (1L << (Bool - 30)) | (1L << (Int - 30)) | (1L << (String - 30)) | (1L << (Void - 30)) | (1L << (Identifier - 30)))) != 0)) {
				{
				{
				setState(416);
				classBodyDeclaration();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitClassBodyDeclarationMember(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitClassBodyDeclarationEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classBodyDeclaration);
		try {
			setState(426);
			switch (_input.LA(1)) {
			case Semi:
				_localctx = new ClassBodyDeclarationEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
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
				setState(425);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			typeName(0);
			setState(431);
			variableDeclaratorIDList();
			setState(432);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			typeName(0);
			setState(435);
			match(Identifier);
			setState(436);
			formalParameters();
			setState(437);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(LeftParen);
			setState(441);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Bool - 48)) | (1L << (Int - 48)) | (1L << (String - 48)) | (1L << (Void - 48)) | (1L << (Identifier - 48)))) != 0)) {
				{
				setState(440);
				formalParameterList();
				}
			}

			setState(443);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			formalParameter();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(446);
				match(Comma);
				setState(447);
				formalParameter();
				}
				}
				setState(452);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			typeName(0);
			setState(454);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			variableDeclaration();
			setState(457);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			typeName(0);
			setState(460);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			variableDeclarator();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(463);
				match(Comma);
				setState(464);
				variableDeclarator();
				}
				}
				setState(469);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			variableDeclaratorID();
			setState(473);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(471);
				match(Assign);
				setState(472);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariableDeclaratorID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIDContext variableDeclaratorID() throws RecognitionException {
		VariableDeclaratorIDContext _localctx = new VariableDeclaratorIDContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclaratorID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariableDeclaratorIDList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIDListContext variableDeclaratorIDList() throws RecognitionException {
		VariableDeclaratorIDListContext _localctx = new VariableDeclaratorIDListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableDeclaratorIDList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			variableDeclaratorID();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(478);
				match(Comma);
				setState(479);
				variableDeclaratorID();
				}
				}
				setState(484);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitConstantNullConstant(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitConstantBooleanConstant(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitConstantIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constant);
		try {
			setState(488);
			switch (_input.LA(1)) {
			case IntegerConstant:
				_localctx = new ConstantIntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(IntegerConstant);
				}
				break;
			case BooleanConstant:
				_localctx = new ConstantBooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(BooleanConstant);
				}
				break;
			case Null:
				_localctx = new ConstantNullConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitTestID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestIDContext testID() throws RecognitionException {
		TestIDContext _localctx = new TestIDContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_testID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2f\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u008d\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00cd\n\t\f\t\16\t\u00d0\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00db\n\n\f\n\16\n\u00de\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e6\n\13\f\13\16\13\u00e9\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f1\n\f\f\f\16\f\u00f4\13\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0107\n\16\f\16\16\16\u010a\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0112\n\17\f\17\16\17\u0115\13\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u011e\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u0128\n\23\f\23\16\23\u012b\13\23\3\24\3\24\3\25\3\25\3\25\5\25\u0132"+
		"\n\25\3\25\3\25\3\25\5\25\u0137\n\25\3\25\7\25\u013a\n\25\f\25\16\25\u013d"+
		"\13\25\3\26\3\26\3\26\5\26\u0142\n\26\3\26\3\26\3\26\7\26\u0147\n\26\f"+
		"\26\16\26\u014a\13\26\3\27\3\27\3\30\3\30\5\30\u0150\n\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\7\31\u0159\n\31\f\31\16\31\u015c\13\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0168\n\32\3\32\3\32"+
		"\3\32\5\32\u016d\n\32\3\32\3\32\5\32\u0171\n\32\3\32\3\32\5\32\u0175\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0181\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0189\n\32\3\33\3\33\3\33\3\34\5\34"+
		"\u018f\n\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0197\n\35\3\36\3\36\3"+
		"\36\5\36\u019c\n\36\3\37\3\37\3\37\3\37\3 \3 \7 \u01a4\n \f \16 \u01a7"+
		"\13 \3 \3 \3!\3!\5!\u01ad\n!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\5%\u01bc\n%\3%\3%\3&\3&\3&\7&\u01c3\n&\f&\16&\u01c6\13&\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3*\7*\u01d4\n*\f*\16*\u01d7\13*\3+\3+\3+\5+\u01dc"+
		"\n+\3,\3,\3-\3-\3-\7-\u01e3\n-\f-\16-\u01e6\13-\3.\3.\3.\5.\u01eb\n.\3"+
		"/\3/\3/\2\21\4\n\f\16\20\22\24\26\30\32\34$(*\60\60\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\3\3\2"+
		"\62\65\u0204\2e\3\2\2\2\4g\3\2\2\2\6\u008c\3\2\2\2\b\u008e\3\2\2\2\n\u0090"+
		"\3\2\2\2\f\u00a1\3\2\2\2\16\u00af\3\2\2\2\20\u00bd\3\2\2\2\22\u00d1\3"+
		"\2\2\2\24\u00df\3\2\2\2\26\u00ea\3\2\2\2\30\u00f5\3\2\2\2\32\u0100\3\2"+
		"\2\2\34\u010b\3\2\2\2\36\u0116\3\2\2\2 \u011d\3\2\2\2\"\u011f\3\2\2\2"+
		"$\u0121\3\2\2\2&\u012c\3\2\2\2(\u0131\3\2\2\2*\u0141\3\2\2\2,\u014b\3"+
		"\2\2\2.\u014d\3\2\2\2\60\u0153\3\2\2\2\62\u0188\3\2\2\2\64\u018a\3\2\2"+
		"\2\66\u018e\3\2\2\28\u0196\3\2\2\2:\u019b\3\2\2\2<\u019d\3\2\2\2>\u01a1"+
		"\3\2\2\2@\u01ac\3\2\2\2B\u01ae\3\2\2\2D\u01b0\3\2\2\2F\u01b4\3\2\2\2H"+
		"\u01b9\3\2\2\2J\u01bf\3\2\2\2L\u01c7\3\2\2\2N\u01ca\3\2\2\2P\u01cd\3\2"+
		"\2\2R\u01d0\3\2\2\2T\u01d8\3\2\2\2V\u01dd\3\2\2\2X\u01df\3\2\2\2Z\u01ea"+
		"\3\2\2\2\\\u01ec\3\2\2\2^f\7E\2\2_f\5Z.\2`f\7B\2\2ab\7\4\2\2bc\5&\24\2"+
		"cd\7\5\2\2df\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2f\3\3\2\2"+
		"\2gh\b\3\1\2hi\5\2\2\2i~\3\2\2\2jk\f\7\2\2kl\7\6\2\2lm\5&\24\2mn\7\7\2"+
		"\2n}\3\2\2\2op\f\6\2\2pr\7\4\2\2qs\5$\23\2rq\3\2\2\2rs\3\2\2\2st\3\2\2"+
		"\2t}\7\5\2\2uv\f\5\2\2vw\7\60\2\2w}\7E\2\2xy\f\4\2\2y}\7\21\2\2z{\f\3"+
		"\2\2{}\7\23\2\2|j\3\2\2\2|o\3\2\2\2|u\3\2\2\2|x\3\2\2\2|z\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\5\3\2\2\2\u0080~\3\2\2\2\u0081\u008d"+
		"\5\4\3\2\u0082\u0083\7\61\2\2\u0083\u008d\5(\25\2\u0084\u0085\7\21\2\2"+
		"\u0085\u008d\5\6\4\2\u0086\u0087\7\23\2\2\u0087\u008d\5\6\4\2\u0088\u0089"+
		"\7\34\2\2\u0089\u008d\5\6\4\2\u008a\u008b\7\35\2\2\u008b\u008d\5\6\4\2"+
		"\u008c\u0081\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0086"+
		"\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d\7\3\2\2\2\u008e"+
		"\u008f\5\6\4\2\u008f\t\3\2\2\2\u0090\u0091\b\6\1\2\u0091\u0092\5\b\5\2"+
		"\u0092\u009e\3\2\2\2\u0093\u0094\f\5\2\2\u0094\u0095\7\24\2\2\u0095\u009d"+
		"\5\b\5\2\u0096\u0097\f\4\2\2\u0097\u0098\7\25\2\2\u0098\u009d\5\b\5\2"+
		"\u0099\u009a\f\3\2\2\u009a\u009b\7\26\2\2\u009b\u009d\5\b\5\2\u009c\u0093"+
		"\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a2\b\7\1\2\u00a2\u00a3\5\n\6\2\u00a3\u00ac\3\2\2\2\u00a4\u00a5"+
		"\f\4\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00ab\5\n\6\2\u00a7\u00a8\f\3\2\2"+
		"\u00a8\u00a9\7\22\2\2\u00a9\u00ab\5\n\6\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\r\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\b\1\2\u00b0\u00b1\5\f\7\2"+
		"\u00b1\u00ba\3\2\2\2\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b9"+
		"\5\f\7\2\u00b5\u00b6\f\3\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00b9\5\f\7\2"+
		"\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\17\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\b\t\1\2\u00be\u00bf\5\16\b\2\u00bf\u00ce\3\2\2\2\u00c0\u00c1\f"+
		"\6\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00cd\5\16\b\2\u00c3\u00c4\f\5\2\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\u00cd\5\16\b\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8\7"+
		"\13\2\2\u00c8\u00cd\5\16\b\2\u00c9\u00ca\f\3\2\2\u00ca\u00cb\7\r\2\2\u00cb"+
		"\u00cd\5\16\b\2\u00cc\u00c0\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c6\3"+
		"\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\n\1"+
		"\2\u00d2\u00d3\5\20\t\2\u00d3\u00dc\3\2\2\2\u00d4\u00d5\f\4\2\2\u00d5"+
		"\u00d6\7-\2\2\u00d6\u00db\5\20\t\2\u00d7\u00d8\f\3\2\2\u00d8\u00d9\7."+
		"\2\2\u00d9\u00db\5\20\t\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\23\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\13\1\2\u00e0\u00e1\5\22\n\2\u00e1"+
		"\u00e7\3\2\2\2\u00e2\u00e3\f\3\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e6\5"+
		"\22\n\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b\f\1"+
		"\2\u00eb\u00ec\5\24\13\2\u00ec\u00f2\3\2\2\2\u00ed\u00ee\f\3\2\2\u00ee"+
		"\u00ef\7\33\2\2\u00ef\u00f1\5\24\13\2\u00f0\u00ed\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\27\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\b\r\1\2\u00f6\u00f7\5\26\f\2\u00f7\u00fd\3"+
		"\2\2\2\u00f8\u00f9\f\3\2\2\u00f9\u00fa\7\30\2\2\u00fa\u00fc\5\26\f\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\31\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\b\16\1\2\u0101\u0102"+
		"\5\30\r\2\u0102\u0108\3\2\2\2\u0103\u0104\f\3\2\2\u0104\u0105\7\31\2\2"+
		"\u0105\u0107\5\30\r\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\33\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\b\17\1\2\u010c\u010d\5\32\16\2\u010d\u0113\3\2\2\2\u010e\u010f"+
		"\f\3\2\2\u010f\u0110\7\32\2\2\u0110\u0112\5\32\16\2\u0111\u010e\3\2\2"+
		"\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\35"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\5\34\17\2\u0117\37\3\2\2\2\u0118"+
		"\u011e\5\36\20\2\u0119\u011a\5\6\4\2\u011a\u011b\5\"\22\2\u011b\u011c"+
		"\5 \21\2\u011c\u011e\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011e"+
		"!\3\2\2\2\u011f\u0120\7\"\2\2\u0120#\3\2\2\2\u0121\u0122\b\23\1\2\u0122"+
		"\u0123\5 \21\2\u0123\u0129\3\2\2\2\u0124\u0125\f\3\2\2\u0125\u0126\7!"+
		"\2\2\u0126\u0128\5 \21\2\u0127\u0124\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a%\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u012d\5 \21\2\u012d\'\3\2\2\2\u012e\u012f\b\25\1\2\u012f\u0132"+
		"\5,\27\2\u0130\u0132\7E\2\2\u0131\u012e\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u013b\3\2\2\2\u0133\u0134\f\3\2\2\u0134\u0136\7\6\2\2\u0135\u0137\5&"+
		"\24\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\7\7\2\2\u0139\u0133\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c)\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f"+
		"\b\26\1\2\u013f\u0142\5,\27\2\u0140\u0142\7E\2\2\u0141\u013e\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0148\3\2\2\2\u0143\u0144\f\3\2\2\u0144\u0145\7\6"+
		"\2\2\u0145\u0147\7\7\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149+\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014b\u014c\t\2\2\2\u014c-\3\2\2\2\u014d\u014f\7\b\2\2\u014e\u0150\5"+
		"\60\31\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\7\t\2\2\u0152/\3\2\2\2\u0153\u0154\b\31\1\2\u0154\u0155\5\62\32"+
		"\2\u0155\u015a\3\2\2\2\u0156\u0157\f\3\2\2\u0157\u0159\5\62\32\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\61\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0189\5.\30\2\u015e\u0189"+
		"\5N(\2\u015f\u0189\5\64\33\2\u0160\u0161\78\2\2\u0161\u0162\7\4\2\2\u0162"+
		"\u0163\5&\24\2\u0163\u0164\7\5\2\2\u0164\u0167\5\62\32\2\u0165\u0166\7"+
		"9\2\2\u0166\u0168\5\62\32\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0189\3\2\2\2\u0169\u016a\7\3\2\2\u016a\u016c\7\4\2\2\u016b\u016d\5&"+
		"\24\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\7 \2\2\u016f\u0171\5&\24\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7 \2\2\u0173\u0175\5&\24\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\5"+
		"\2\2\u0177\u0189\5\62\32\2\u0178\u0179\7;\2\2\u0179\u017a\7\4\2\2\u017a"+
		"\u017b\5&\24\2\u017b\u017c\7\5\2\2\u017c\u017d\5\62\32\2\u017d\u0189\3"+
		"\2\2\2\u017e\u0180\7<\2\2\u017f\u0181\5&\24\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0189\7 \2\2\u0183\u0184\7>\2"+
		"\2\u0184\u0189\7 \2\2\u0185\u0186\7=\2\2\u0186\u0189\7 \2\2\u0187\u0189"+
		"\7 \2\2\u0188\u015d\3\2\2\2\u0188\u015e\3\2\2\2\u0188\u015f\3\2\2\2\u0188"+
		"\u0160\3\2\2\2\u0188\u0169\3\2\2\2\u0188\u0178\3\2\2\2\u0188\u017e\3\2"+
		"\2\2\u0188\u0183\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\63\3\2\2\2\u018a\u018b\5&\24\2\u018b\u018c\7 \2\2\u018c\65\3\2\2\2\u018d"+
		"\u018f\58\35\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\7\2\2\3\u0191\67\3\2\2\2\u0192\u0193\5:\36\2\u0193\u0194"+
		"\58\35\2\u0194\u0197\3\2\2\2\u0195\u0197\5:\36\2\u0196\u0192\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u01979\3\2\2\2\u0198\u019c\5<\37\2\u0199\u019c\5F$\2\u019a"+
		"\u019c\5N(\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2"+
		"\2\u019c;\3\2\2\2\u019d\u019e\7\66\2\2\u019e\u019f\7E\2\2\u019f\u01a0"+
		"\5> \2\u01a0=\3\2\2\2\u01a1\u01a5\7\b\2\2\u01a2\u01a4\5@!\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\t\2\2\u01a9?\3\2\2\2"+
		"\u01aa\u01ad\7 \2\2\u01ab\u01ad\5B\"\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01adA\3\2\2\2\u01ae\u01af\5D#\2\u01afC\3\2\2\2\u01b0\u01b1\5"+
		"*\26\2\u01b1\u01b2\5X-\2\u01b2\u01b3\7 \2\2\u01b3E\3\2\2\2\u01b4\u01b5"+
		"\5*\26\2\u01b5\u01b6\7E\2\2\u01b6\u01b7\5H%\2\u01b7\u01b8\5.\30\2\u01b8"+
		"G\3\2\2\2\u01b9\u01bb\7\4\2\2\u01ba\u01bc\5J&\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\5\2\2\u01beI\3\2\2\2"+
		"\u01bf\u01c4\5L\'\2\u01c0\u01c1\7!\2\2\u01c1\u01c3\5L\'\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"K\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\5*\26\2\u01c8\u01c9\5V,\2\u01c9"+
		"M\3\2\2\2\u01ca\u01cb\5P)\2\u01cb\u01cc\7 \2\2\u01ccO\3\2\2\2\u01cd\u01ce"+
		"\5*\26\2\u01ce\u01cf\5R*\2\u01cfQ\3\2\2\2\u01d0\u01d5\5T+\2\u01d1\u01d2"+
		"\7!\2\2\u01d2\u01d4\5T+\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6S\3\2\2\2\u01d7\u01d5\3\2\2\2"+
		"\u01d8\u01db\5V,\2\u01d9\u01da\7\"\2\2\u01da\u01dc\5&\24\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcU\3\2\2\2\u01dd\u01de\7E\2\2\u01deW"+
		"\3\2\2\2\u01df\u01e4\5V,\2\u01e0\u01e1\7!\2\2\u01e1\u01e3\5V,\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5Y\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01eb\7A\2\2\u01e8\u01eb"+
		"\7@\2\2\u01e9\u01eb\7\67\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb[\3\2\2\2\u01ec\u01ed\7E\2\2\u01ed]\3\2\2\2\60er|"+
		"~\u008c\u009c\u009e\u00aa\u00ac\u00b8\u00ba\u00cc\u00ce\u00da\u00dc\u00e7"+
		"\u00f2\u00fd\u0108\u0113\u011d\u0129\u0131\u0136\u013b\u0141\u0148\u014f"+
		"\u015a\u0167\u016c\u0170\u0174\u0180\u0188\u018e\u0196\u019b\u01a5\u01ac"+
		"\u01bb\u01c4\u01d5\u01db\u01e4\u01ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}