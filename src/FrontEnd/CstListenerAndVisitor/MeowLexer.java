// Generated from /Users/lagoon0o0/Documents/Compiler/MeowCompiler/src/FrontEnd/Meow.g4 by ANTLR 4.5.1
package FrontEnd.CstListenerAndVisitor;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeowLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
		"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
		"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", 
		"Colon", "Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", 
		"XorAssign", "OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "New", "Bool", 
		"Int", "String", "Void", "Class", "Null", "If", "Else", "For", "While", 
		"Return", "Continue", "Break", "TBD", "BooleanConstant", "IntegerConstant", 
		"Stringliteral", "Whitespace", "Newline", "Identifier", "IdentifierNonDigit", 
		"LineComment", "Char", "EscapeSequence", "DecimalConstant", "NonzeroDigit", 
		"Digit"
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


	public MeowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Meow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u01b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\3"+
		"8\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\5?\u016b\n?\3@\3@\3A\3A\7A\u0171\nA\fA\16A\u0174\13A\3A"+
		"\3A\3B\6B\u0179\nB\rB\16B\u017a\3B\3B\3C\5C\u0180\nC\3C\3C\3C\3C\3D\3"+
		"D\3D\7D\u0189\nD\fD\16D\u018c\13D\3E\3E\3F\3F\3F\3F\7F\u0194\nF\fF\16"+
		"F\u0197\13F\3F\3F\3G\3G\5G\u019d\nG\3H\3H\3H\3I\3I\7I\u01a4\nI\fI\16I"+
		"\u01a7\13I\3I\6I\u01aa\nI\rI\16I\u01ab\5I\u01ae\nI\3J\3J\3K\3K\2\2L\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d\2"+
		"\u008f\2\u0091\2\u0093\2\u0095\2\3\2\n\4\2\13\13\"\"\5\2C\\aac|\4\2\f"+
		"\f\17\17\5\2\f\f$$^^\6\2$$^^pptt\3\2\62\62\3\2\63;\3\2\62;\u01b8\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u0097\3\2\2"+
		"\2\5\u009b\3\2\2\2\7\u009d\3\2\2\2\t\u009f\3\2\2\2\13\u00a1\3\2\2\2\r"+
		"\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21\u00a7\3\2\2\2\23\u00a9\3\2\2\2\25\u00ac"+
		"\3\2\2\2\27\u00ae\3\2\2\2\31\u00b1\3\2\2\2\33\u00b4\3\2\2\2\35\u00b7\3"+
		"\2\2\2\37\u00b9\3\2\2\2!\u00bc\3\2\2\2#\u00be\3\2\2\2%\u00c1\3\2\2\2\'"+
		"\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2"+
		"\2\2\61\u00ce\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2"+
		"\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2?\u00dd\3\2\2\2A\u00df"+
		"\3\2\2\2C\u00e1\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I\u00ea\3\2\2\2K"+
		"\u00ed\3\2\2\2M\u00f0\3\2\2\2O\u00f4\3\2\2\2Q\u00f8\3\2\2\2S\u00fb\3\2"+
		"\2\2U\u00fe\3\2\2\2W\u0101\3\2\2\2Y\u0104\3\2\2\2[\u0107\3\2\2\2]\u010a"+
		"\3\2\2\2_\u010c\3\2\2\2a\u0110\3\2\2\2c\u0115\3\2\2\2e\u0119\3\2\2\2g"+
		"\u0120\3\2\2\2i\u0125\3\2\2\2k\u012b\3\2\2\2m\u0130\3\2\2\2o\u0133\3\2"+
		"\2\2q\u0138\3\2\2\2s\u013c\3\2\2\2u\u0142\3\2\2\2w\u0149\3\2\2\2y\u0152"+
		"\3\2\2\2{\u0158\3\2\2\2}\u016a\3\2\2\2\177\u016c\3\2\2\2\u0081\u016e\3"+
		"\2\2\2\u0083\u0178\3\2\2\2\u0085\u017f\3\2\2\2\u0087\u0185\3\2\2\2\u0089"+
		"\u018d\3\2\2\2\u008b\u018f\3\2\2\2\u008d\u019c\3\2\2\2\u008f\u019e\3\2"+
		"\2\2\u0091\u01ad\3\2\2\2\u0093\u01af\3\2\2\2\u0095\u01b1\3\2\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\4\3\2\2\2\u009b"+
		"\u009c\7*\2\2\u009c\6\3\2\2\2\u009d\u009e\7+\2\2\u009e\b\3\2\2\2\u009f"+
		"\u00a0\7]\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7_\2\2\u00a2\f\3\2\2\2\u00a3"+
		"\u00a4\7}\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7\177\2\2\u00a6\20\3\2\2\2"+
		"\u00a7\u00a8\7>\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7"+
		"?\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad\26\3\2\2\2\u00ae\u00af"+
		"\7@\2\2\u00af\u00b0\7?\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3"+
		"\7>\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\7@\2\2\u00b6\34"+
		"\3\2\2\2\u00b7\u00b8\7-\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba"+
		"\u00bb\7-\2\2\u00bb \3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\"\3\2\2\2\u00be"+
		"\u00bf\7/\2\2\u00bf\u00c0\7/\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2"+
		"&\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6"+
		"*\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca."+
		"\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7(\2\2\u00cd\60\3\2\2\2\u00ce"+
		"\u00cf\7~\2\2\u00cf\u00d0\7~\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7`\2\2\u00d2"+
		"\64\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7\u0080\2"+
		"\2\u00d68\3\2\2\2\u00d7\u00d8\7A\2\2\u00d8:\3\2\2\2\u00d9\u00da\7<\2\2"+
		"\u00da<\3\2\2\2\u00db\u00dc\7=\2\2\u00dc>\3\2\2\2\u00dd\u00de\7.\2\2\u00de"+
		"@\3\2\2\2\u00df\u00e0\7?\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\7?\2\2\u00e6F"+
		"\3\2\2\2\u00e7\u00e8\7\'\2\2\u00e8\u00e9\7?\2\2\u00e9H\3\2\2\2\u00ea\u00eb"+
		"\7-\2\2\u00eb\u00ec\7?\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef"+
		"\7?\2\2\u00efL\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3N\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7P\3\2\2\2\u00f8\u00f9\7(\2\2\u00f9\u00fa\7?\2\2\u00faR\3"+
		"\2\2\2\u00fb\u00fc\7`\2\2\u00fc\u00fd\7?\2\2\u00fdT\3\2\2\2\u00fe\u00ff"+
		"\7~\2\2\u00ff\u0100\7?\2\2\u0100V\3\2\2\2\u0101\u0102\7?\2\2\u0102\u0103"+
		"\7?\2\2\u0103X\3\2\2\2\u0104\u0105\7#\2\2\u0105\u0106\7?\2\2\u0106Z\3"+
		"\2\2\2\u0107\u0108\7/\2\2\u0108\u0109\7@\2\2\u0109\\\3\2\2\2\u010a\u010b"+
		"\7\60\2\2\u010b^\3\2\2\2\u010c\u010d\7p\2\2\u010d\u010e\7g\2\2\u010e\u010f"+
		"\7y\2\2\u010f`\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112\7q\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7n\2\2\u0114b\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0118\7v\2\2\u0118d\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b"+
		"\7v\2\2\u011b\u011c\7t\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e"+
		"\u011f\7i\2\2\u011ff\3\2\2\2\u0120\u0121\7x\2\2\u0121\u0122\7q\2\2\u0122"+
		"\u0123\7k\2\2\u0123\u0124\7f\2\2\u0124h\3\2\2\2\u0125\u0126\7e\2\2\u0126"+
		"\u0127\7n\2\2\u0127\u0128\7c\2\2\u0128\u0129\7u\2\2\u0129\u012a\7u\2\2"+
		"\u012aj\3\2\2\2\u012b\u012c\7p\2\2\u012c\u012d\7w\2\2\u012d\u012e\7n\2"+
		"\2\u012e\u012f\7n\2\2\u012fl\3\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7"+
		"h\2\2\u0132n\3\2\2\2\u0133\u0134\7g\2\2\u0134\u0135\7n\2\2\u0135\u0136"+
		"\7u\2\2\u0136\u0137\7g\2\2\u0137p\3\2\2\2\u0138\u0139\7H\2\2\u0139\u013a"+
		"\7q\2\2\u013a\u013b\7t\2\2\u013br\3\2\2\2\u013c\u013d\7y\2\2\u013d\u013e"+
		"\7j\2\2\u013e\u013f\7k\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141"+
		"t\3\2\2\2\u0142\u0143\7t\2\2\u0143\u0144\7g\2\2\u0144\u0145\7v\2\2\u0145"+
		"\u0146\7w\2\2\u0146\u0147\7t\2\2\u0147\u0148\7p\2\2\u0148v\3\2\2\2\u0149"+
		"\u014a\7e\2\2\u014a\u014b\7q\2\2\u014b\u014c\7p\2\2\u014c\u014d\7v\2\2"+
		"\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f\u0150\7w\2\2\u0150\u0151"+
		"\7g\2\2\u0151x\3\2\2\2\u0152\u0153\7d\2\2\u0153\u0154\7t\2\2\u0154\u0155"+
		"\7g\2\2\u0155\u0156\7c\2\2\u0156\u0157\7m\2\2\u0157z\3\2\2\2\u0158\u0159"+
		"\7V\2\2\u0159\u015a\7q\2\2\u015a\u015b\7D\2\2\u015b\u015c\7g\2\2\u015c"+
		"\u015d\7F\2\2\u015d\u015e\7q\2\2\u015e\u015f\7p\2\2\u015f\u0160\7g\2\2"+
		"\u0160|\3\2\2\2\u0161\u0162\7v\2\2\u0162\u0163\7t\2\2\u0163\u0164\7w\2"+
		"\2\u0164\u016b\7g\2\2\u0165\u0166\7h\2\2\u0166\u0167\7c\2\2\u0167\u0168"+
		"\7n\2\2\u0168\u0169\7u\2\2\u0169\u016b\7g\2\2\u016a\u0161\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016b~\3\2\2\2\u016c\u016d\5\u0091I\2\u016d\u0080\3\2\2"+
		"\2\u016e\u0172\7$\2\2\u016f\u0171\5\u008dG\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7$\2\2\u0176\u0082\3\2\2\2\u0177"+
		"\u0179\t\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\bB\2\2\u017d"+
		"\u0084\3\2\2\2\u017e\u0180\7\17\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\f\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\bC\2\2\u0184\u0086\3\2\2\2\u0185\u018a\5\u0089E\2\u0186\u0189\5"+
		"\u0089E\2\u0187\u0189\5\u0095K\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2"+
		"\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0088"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\t\3\2\2\u018e\u008a\3\2\2\2\u018f"+
		"\u0190\7\61\2\2\u0190\u0191\7\61\2\2\u0191\u0195\3\2\2\2\u0192\u0194\n"+
		"\4\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\bF"+
		"\2\2\u0199\u008c\3\2\2\2\u019a\u019d\n\5\2\2\u019b\u019d\5\u008fH\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u008e\3\2\2\2\u019e\u019f\7^"+
		"\2\2\u019f\u01a0\t\6\2\2\u01a0\u0090\3\2\2\2\u01a1\u01a5\5\u0093J\2\u01a2"+
		"\u01a4\5\u0095K\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01ae\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01aa\t\7\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a1\3\2\2\2\u01ad"+
		"\u01a9\3\2\2\2\u01ae\u0092\3\2\2\2\u01af\u01b0\t\b\2\2\u01b0\u0094\3\2"+
		"\2\2\u01b1\u01b2\t\t\2\2\u01b2\u0096\3\2\2\2\16\2\u016a\u0172\u017a\u017f"+
		"\u0188\u018a\u0195\u019c\u01a5\u01ab\u01ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}