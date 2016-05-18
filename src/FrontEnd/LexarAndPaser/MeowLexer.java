// Generated from /Users/lagoon0o0/Documents/Compiler/MeowCompiler/src/FrontEnd/LexarAndPaser/Meow.g4 by ANTLR 4.5.1
package FrontEnd.LexarAndPaser;
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
		Newline=66, Identifier=67, IdentifierNonDigit=68, LineComment=69, BlockComment=70;
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
		"LineComment", "BlockComment", "Char", "EscapeSequence", "DecimalConstant", 
		"NonzeroDigit", "Digit"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2H\u01c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38"+
		"\38\38\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\5?\u016d\n?\3@\3@\3A\3A\7A\u0173\nA\fA\16A\u0176\13"+
		"A\3A\3A\3B\6B\u017b\nB\rB\16B\u017c\3B\3B\3C\5C\u0182\nC\3C\3C\3C\3C\3"+
		"D\3D\3D\7D\u018b\nD\fD\16D\u018e\13D\3E\3E\3F\3F\3F\3F\7F\u0196\nF\fF"+
		"\16F\u0199\13F\3F\3F\3G\3G\3G\3G\7G\u01a1\nG\fG\16G\u01a4\13G\3G\3G\3"+
		"G\3G\3G\3H\3H\5H\u01ad\nH\3I\3I\3I\3J\3J\7J\u01b4\nJ\fJ\16J\u01b7\13J"+
		"\3J\6J\u01ba\nJ\rJ\16J\u01bb\5J\u01be\nJ\3K\3K\3L\3L\3\u01a2\2M\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\3\2\n\4\2\13\13\"\"\5\2C\\aac|\4\2"+
		"\f\f\17\17\5\2\f\f$$^^\6\2$$^^pptt\3\2\62\62\3\2\63;\3\2\62;\u01c9\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u0099\3\2\2\2\5\u009d\3\2\2\2\7\u009f\3\2\2\2\t\u00a1\3\2\2\2\13"+
		"\u00a3\3\2\2\2\r\u00a5\3\2\2\2\17\u00a7\3\2\2\2\21\u00a9\3\2\2\2\23\u00ab"+
		"\3\2\2\2\25\u00ae\3\2\2\2\27\u00b0\3\2\2\2\31\u00b3\3\2\2\2\33\u00b6\3"+
		"\2\2\2\35\u00b9\3\2\2\2\37\u00bb\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2"+
		"%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00cb\3"+
		"\2\2\2/\u00cd\3\2\2\2\61\u00d0\3\2\2\2\63\u00d3\3\2\2\2\65\u00d5\3\2\2"+
		"\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00dd\3\2\2\2?\u00df"+
		"\3\2\2\2A\u00e1\3\2\2\2C\u00e3\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3\2\2\2I"+
		"\u00ec\3\2\2\2K\u00ef\3\2\2\2M\u00f2\3\2\2\2O\u00f6\3\2\2\2Q\u00fa\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0100\3\2\2\2W\u0103\3\2\2\2Y\u0106\3\2\2\2[\u0109"+
		"\3\2\2\2]\u010c\3\2\2\2_\u010e\3\2\2\2a\u0112\3\2\2\2c\u0117\3\2\2\2e"+
		"\u011b\3\2\2\2g\u0122\3\2\2\2i\u0127\3\2\2\2k\u012d\3\2\2\2m\u0132\3\2"+
		"\2\2o\u0135\3\2\2\2q\u013a\3\2\2\2s\u013e\3\2\2\2u\u0144\3\2\2\2w\u014b"+
		"\3\2\2\2y\u0154\3\2\2\2{\u015a\3\2\2\2}\u016c\3\2\2\2\177\u016e\3\2\2"+
		"\2\u0081\u0170\3\2\2\2\u0083\u017a\3\2\2\2\u0085\u0181\3\2\2\2\u0087\u0187"+
		"\3\2\2\2\u0089\u018f\3\2\2\2\u008b\u0191\3\2\2\2\u008d\u019c\3\2\2\2\u008f"+
		"\u01ac\3\2\2\2\u0091\u01ae\3\2\2\2\u0093\u01bd\3\2\2\2\u0095\u01bf\3\2"+
		"\2\2\u0097\u01c1\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7t\2\2\u009c\4\3\2\2\2\u009d\u009e\7*\2\2\u009e\6\3\2\2\2\u009f\u00a0"+
		"\7+\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2\n\3\2\2\2\u00a3\u00a4"+
		"\7_\2\2\u00a4\f\3\2\2\2\u00a5\u00a6\7}\2\2\u00a6\16\3\2\2\2\u00a7\u00a8"+
		"\7\177\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\22\3\2\2\2\u00ab"+
		"\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7@\2\2\u00af"+
		"\26\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\30\3\2\2\2\u00b3"+
		"\u00b4\7>\2\2\u00b4\u00b5\7>\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7"+
		"\u00b8\7@\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\36\3\2\2\2\u00bb"+
		"\u00bc\7-\2\2\u00bc\u00bd\7-\2\2\u00bd \3\2\2\2\u00be\u00bf\7/\2\2\u00bf"+
		"\"\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c2\7/\2\2\u00c2$\3\2\2\2\u00c3"+
		"\u00c4\7,\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6(\3\2\2\2\u00c7"+
		"\u00c8\7\'\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7(\2\2\u00ca,\3\2\2\2\u00cb"+
		"\u00cc\7~\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7(\2\2\u00cf"+
		"\60\3\2\2\2\u00d0\u00d1\7~\2\2\u00d1\u00d2\7~\2\2\u00d2\62\3\2\2\2\u00d3"+
		"\u00d4\7`\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\66\3\2\2\2\u00d7"+
		"\u00d8\7\u0080\2\2\u00d88\3\2\2\2\u00d9\u00da\7A\2\2\u00da:\3\2\2\2\u00db"+
		"\u00dc\7<\2\2\u00dc<\3\2\2\2\u00dd\u00de\7=\2\2\u00de>\3\2\2\2\u00df\u00e0"+
		"\7.\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7"+
		",\2\2\u00e4\u00e5\7?\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8"+
		"\7?\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\7?\2\2\u00ebH\3"+
		"\2\2\2\u00ec\u00ed\7-\2\2\u00ed\u00ee\7?\2\2\u00eeJ\3\2\2\2\u00ef\u00f0"+
		"\7/\2\2\u00f0\u00f1\7?\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4"+
		"\7>\2\2\u00f4\u00f5\7?\2\2\u00f5N\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7\u00f8"+
		"\7@\2\2\u00f8\u00f9\7?\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7`\2\2\u00fe\u00ff\7?\2\2\u00ffT\3"+
		"\2\2\2\u0100\u0101\7~\2\2\u0101\u0102\7?\2\2\u0102V\3\2\2\2\u0103\u0104"+
		"\7?\2\2\u0104\u0105\7?\2\2\u0105X\3\2\2\2\u0106\u0107\7#\2\2\u0107\u0108"+
		"\7?\2\2\u0108Z\3\2\2\2\u0109\u010a\7/\2\2\u010a\u010b\7@\2\2\u010b\\\3"+
		"\2\2\2\u010c\u010d\7\60\2\2\u010d^\3\2\2\2\u010e\u010f\7p\2\2\u010f\u0110"+
		"\7g\2\2\u0110\u0111\7y\2\2\u0111`\3\2\2\2\u0112\u0113\7d\2\2\u0113\u0114"+
		"\7q\2\2\u0114\u0115\7q\2\2\u0115\u0116\7n\2\2\u0116b\3\2\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011ad\3\2\2\2\u011b\u011c"+
		"\7u\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7i\2\2\u0121f\3\2\2\2\u0122\u0123\7x\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7k\2\2\u0125\u0126\7f\2\2\u0126h\3\2\2\2\u0127"+
		"\u0128\7e\2\2\u0128\u0129\7n\2\2\u0129\u012a\7c\2\2\u012a\u012b\7u\2\2"+
		"\u012b\u012c\7u\2\2\u012cj\3\2\2\2\u012d\u012e\7p\2\2\u012e\u012f\7w\2"+
		"\2\u012f\u0130\7n\2\2\u0130\u0131\7n\2\2\u0131l\3\2\2\2\u0132\u0133\7"+
		"k\2\2\u0133\u0134\7h\2\2\u0134n\3\2\2\2\u0135\u0136\7g\2\2\u0136\u0137"+
		"\7n\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139p\3\2\2\2\u013a\u013b"+
		"\7H\2\2\u013b\u013c\7q\2\2\u013c\u013d\7t\2\2\u013dr\3\2\2\2\u013e\u013f"+
		"\7y\2\2\u013f\u0140\7j\2\2\u0140\u0141\7k\2\2\u0141\u0142\7n\2\2\u0142"+
		"\u0143\7g\2\2\u0143t\3\2\2\2\u0144\u0145\7t\2\2\u0145\u0146\7g\2\2\u0146"+
		"\u0147\7v\2\2\u0147\u0148\7w\2\2\u0148\u0149\7t\2\2\u0149\u014a\7p\2\2"+
		"\u014av\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e\7p\2"+
		"\2\u014e\u014f\7v\2\2\u014f\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151\u0152"+
		"\7w\2\2\u0152\u0153\7g\2\2\u0153x\3\2\2\2\u0154\u0155\7d\2\2\u0155\u0156"+
		"\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7c\2\2\u0158\u0159\7m\2\2\u0159"+
		"z\3\2\2\2\u015a\u015b\7V\2\2\u015b\u015c\7q\2\2\u015c\u015d\7D\2\2\u015d"+
		"\u015e\7g\2\2\u015e\u015f\7F\2\2\u015f\u0160\7q\2\2\u0160\u0161\7p\2\2"+
		"\u0161\u0162\7g\2\2\u0162|\3\2\2\2\u0163\u0164\7v\2\2\u0164\u0165\7t\2"+
		"\2\u0165\u0166\7w\2\2\u0166\u016d\7g\2\2\u0167\u0168\7h\2\2\u0168\u0169"+
		"\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7u\2\2\u016b\u016d\7g\2\2\u016c"+
		"\u0163\3\2\2\2\u016c\u0167\3\2\2\2\u016d~\3\2\2\2\u016e\u016f\5\u0093"+
		"J\2\u016f\u0080\3\2\2\2\u0170\u0174\7$\2\2\u0171\u0173\5\u008fH\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7$\2\2\u0178"+
		"\u0082\3\2\2\2\u0179\u017b\t\2\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\bB\2\2\u017f\u0084\3\2\2\2\u0180\u0182\7\17\2\2\u0181\u0180\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7\f\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\bC\2\2\u0186\u0086\3\2\2\2\u0187\u018c\5\u0089"+
		"E\2\u0188\u018b\5\u0089E\2\u0189\u018b\5\u0097L\2\u018a\u0188\3\2\2\2"+
		"\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u0088\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\t\3\2\2\u0190"+
		"\u008a\3\2\2\2\u0191\u0192\7\61\2\2\u0192\u0193\7\61\2\2\u0193\u0197\3"+
		"\2\2\2\u0194\u0196\n\4\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u019a\u019b\bF\2\2\u019b\u008c\3\2\2\2\u019c\u019d\7\61\2\2\u019d"+
		"\u019e\7,\2\2\u019e\u01a2\3\2\2\2\u019f\u01a1\13\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7,\2\2\u01a6\u01a7\7\61"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\bG\2\2\u01a9\u008e\3\2\2\2\u01aa"+
		"\u01ad\n\5\2\2\u01ab\u01ad\5\u0091I\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01ad\u0090\3\2\2\2\u01ae\u01af\7^\2\2\u01af\u01b0\t\6\2\2\u01b0"+
		"\u0092\3\2\2\2\u01b1\u01b5\5\u0095K\2\u01b2\u01b4\5\u0097L\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01be\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\t\7\2\2\u01b9\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01b1\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u0094\3\2"+
		"\2\2\u01bf\u01c0\t\b\2\2\u01c0\u0096\3\2\2\2\u01c1\u01c2\t\t\2\2\u01c2"+
		"\u0098\3\2\2\2\17\2\u016c\u0174\u017c\u0181\u018a\u018c\u0197\u01a2\u01ac"+
		"\u01b5\u01bb\u01bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}