// Generated from /home/anthony/IdeaProjects/PLCalculator/grammar/poly.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class polyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INTEGER=38, 
		ID=39, EXP=40, TERM=41, MONOMIAL=42, POLYNOMIAL=43, STRING=44, FACTOR=45, 
		EXPLIST=46, PROPEXPLIST=47, IDLIST=48, DEF=49, EMPTY=50, BOOL=51, UNOP=52, 
		SIGN=53, BINOP=54, CONDITIONS=55, WS=56, CHARACTER=57, DIGIT=58, DELIMITER=59, 
		OPERATOR=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "INTEGER", "ID", "EXP", "TERM", "MONOMIAL", 
			"POLYNOMIAL", "STRING", "FACTOR", "EXPLIST", "PROPEXPLIST", "IDLIST", 
			"DEF", "EMPTY", "BOOL", "UNOP", "SIGN", "BINOP", "CONDITIONS", "WS", 
			"CHARACTER", "DIGIT", "DELIMITER", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'if'", "':'", "'else'", "'while'", "'for'", 
			"'in'", "'('", "')'", "'print:'", "';'", "'+'", "'-'", "'*'", "'der'", 
			"'integral'", "','", "'eval'", "'degree'", "'=='", "'^'", "'$'", "'\"'", 
			"'='", "'true'", "'false'", "'~'", "'/'", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'&'", "'|'", "'integer'", "'id'", "'exp'", "'term'", "'monomial'", 
			"'polynomial'", "'string'", "'factor'", "'expList'", "'propExpList'", 
			"'idList'", "'def'", "'empty'", "'bool'", "'unop'", "'sign'", "'binop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INTEGER", "ID", "EXP", "TERM", "MONOMIAL", "POLYNOMIAL", 
			"STRING", "FACTOR", "EXPLIST", "PROPEXPLIST", "IDLIST", "DEF", "EMPTY", 
			"BOOL", "UNOP", "SIGN", "BINOP", "CONDITIONS", "WS", "CHARACTER", "DIGIT", 
			"DELIMITER", "OPERATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public polyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "poly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u019e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\58\u0185\n8\39\69\u0188\n9\r9\169\u0189\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u019d\n=\2\2>\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>\3\2\t\5\2\13\f\16\17\"\"\4\2C\\c|\3\2\62;\7\2*+..==]]__\7\2,-"+
		"//\61\61??\u0080\u0080\4\2>>@@\4\2((~~\2\u01aa\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\u0081\3\2\2"+
		"\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0088\3\2\2\2\r\u008a\3\2\2\2\17"+
		"\u008f\3\2\2\2\21\u0095\3\2\2\2\23\u0099\3\2\2\2\25\u009c\3\2\2\2\27\u009e"+
		"\3\2\2\2\31\u00a0\3\2\2\2\33\u00a7\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3"+
		"\2\2\2!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b3\3\2\2\2\'\u00bc\3\2\2\2)\u00be"+
		"\3\2\2\2+\u00c3\3\2\2\2-\u00ca\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2"+
		"\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00da\3\2\2\2;\u00e0"+
		"\3\2\2\2=\u00e2\3\2\2\2?\u00e4\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E"+
		"\u00eb\3\2\2\2G\u00ee\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2"+
		"\2\2O\u00fd\3\2\2\2Q\u0100\3\2\2\2S\u0104\3\2\2\2U\u0109\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u011d\3\2\2\2[\u0124\3\2\2\2]\u012b\3\2\2\2_\u0133\3\2\2\2a"+
		"\u013f\3\2\2\2c\u0146\3\2\2\2e\u014a\3\2\2\2g\u0150\3\2\2\2i\u0155\3\2"+
		"\2\2k\u015a\3\2\2\2m\u015f\3\2\2\2o\u0184\3\2\2\2q\u0187\3\2\2\2s\u018d"+
		"\3\2\2\2u\u018f\3\2\2\2w\u0191\3\2\2\2y\u019c\3\2\2\2{|\7e\2\2|}\7n\2"+
		"\2}~\7c\2\2~\177\7u\2\2\177\u0080\7u\2\2\u0080\4\3\2\2\2\u0081\u0082\7"+
		"}\2\2\u0082\6\3\2\2\2\u0083\u0084\7\177\2\2\u0084\b\3\2\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7h\2\2\u0087\n\3\2\2\2\u0088\u0089\7<\2\2\u0089\f"+
		"\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e\16\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091\7j\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\20\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\22\3\2\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\24\3\2\2\2\u009c\u009d\7*\2\2\u009d"+
		"\26\3\2\2\2\u009e\u009f\7+\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5\u00a6\7<\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7=\2\2\u00a8\34\3\2\2"+
		"\2\u00a9\u00aa\7-\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac \3\2\2"+
		"\2\u00ad\u00ae\7,\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7"+
		"g\2\2\u00b1\u00b2\7t\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7i\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb&\3\2\2\2\u00bc"+
		"\u00bd\7.\2\2\u00bd(\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7x\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\7?\2"+
		"\2\u00cc.\3\2\2\2\u00cd\u00ce\7`\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7&\2"+
		"\2\u00d0\62\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7"+
		"?\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8"+
		"\7w\2\2\u00d8\u00d9\7g\2\2\u00d98\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df"+
		":\3\2\2\2\u00e0\u00e1\7\u0080\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7\61\2\2"+
		"\u00e3>\3\2\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7?\2\2\u00e6@\3\2\2\2\u00e7"+
		"\u00e8\7>\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7@\2\2\u00eaD\3\2\2\2\u00eb\u00ec"+
		"\7>\2\2\u00ec\u00ed\7?\2\2\u00edF\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7"+
		"~\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fcN\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7f\2\2\u00ff"+
		"P\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102\7z\2\2\u0102\u0103\7r\2\2\u0103"+
		"R\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107"+
		"\u0108\7o\2\2\u0108T\3\2\2\2\u0109\u010a\7o\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7q\2\2\u010d\u010e\7o\2\2\u010e\u010f\7k\2\2"+
		"\u010f\u0110\7c\2\2\u0110\u0111\7n\2\2\u0111V\3\2\2\2\u0112\u0113\7r\2"+
		"\2\u0113\u0114\7q\2\2\u0114\u0115\7n\2\2\u0115\u0116\7{\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0118\7q\2\2\u0118\u0119\7o\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7n\2\2\u011cX\3\2\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2"+
		"\u0122\u0123\7i\2\2\u0123Z\3\2\2\2\u0124\u0125\7h\2\2\u0125\u0126\7c\2"+
		"\2\u0126\u0127\7e\2\2\u0127\u0128\7v\2\2\u0128\u0129\7q\2\2\u0129\u012a"+
		"\7t\2\2\u012a\\\3\2\2\2\u012b\u012c\7g\2\2\u012c\u012d\7z\2\2\u012d\u012e"+
		"\7r\2\2\u012e\u012f\7N\2\2\u012f\u0130\7k\2\2\u0130\u0131\7u\2\2\u0131"+
		"\u0132\7v\2\2\u0132^\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0135\7t\2\2\u0135"+
		"\u0136\7q\2\2\u0136\u0137\7r\2\2\u0137\u0138\7G\2\2\u0138\u0139\7z\2\2"+
		"\u0139\u013a\7r\2\2\u013a\u013b\7N\2\2\u013b\u013c\7k\2\2\u013c\u013d"+
		"\7u\2\2\u013d\u013e\7v\2\2\u013e`\3\2\2\2\u013f\u0140\7k\2\2\u0140\u0141"+
		"\7f\2\2\u0141\u0142\7N\2\2\u0142\u0143\7k\2\2\u0143\u0144\7u\2\2\u0144"+
		"\u0145\7v\2\2\u0145b\3\2\2\2\u0146\u0147\7f\2\2\u0147\u0148\7g\2\2\u0148"+
		"\u0149\7h\2\2\u0149d\3\2\2\2\u014a\u014b\7g\2\2\u014b\u014c\7o\2\2\u014c"+
		"\u014d\7r\2\2\u014d\u014e\7v\2\2\u014e\u014f\7{\2\2\u014ff\3\2\2\2\u0150"+
		"\u0151\7d\2\2\u0151\u0152\7q\2\2\u0152\u0153\7q\2\2\u0153\u0154\7n\2\2"+
		"\u0154h\3\2\2\2\u0155\u0156\7w\2\2\u0156\u0157\7p\2\2\u0157\u0158\7q\2"+
		"\2\u0158\u0159\7r\2\2\u0159j\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7"+
		"k\2\2\u015c\u015d\7i\2\2\u015d\u015e\7p\2\2\u015el\3\2\2\2\u015f\u0160"+
		"\7d\2\2\u0160\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162\u0163\7q\2\2\u0163"+
		"\u0164\7r\2\2\u0164n\3\2\2\2\u0165\u0166\7k\2\2\u0166\u0185\7h\2\2\u0167"+
		"\u0168\7g\2\2\u0168\u0169\7n\2\2\u0169\u016a\7u\2\2\u016a\u0185\7g\2\2"+
		"\u016b\u016c\7h\2\2\u016c\u016d\7q\2\2\u016d\u0185\7t\2\2\u016e\u016f"+
		"\7y\2\2\u016f\u0170\7j\2\2\u0170\u0171\7k\2\2\u0171\u0172\7n\2\2\u0172"+
		"\u0185\7g\2\2\u0173\u0174\7t\2\2\u0174\u0175\7g\2\2\u0175\u0176\7v\2\2"+
		"\u0176\u0177\7w\2\2\u0177\u0178\7t\2\2\u0178\u0185\7p\2\2\u0179\u017a"+
		"\7v\2\2\u017a\u017b\7t\2\2\u017b\u017c\7w\2\2\u017c\u0185\7g\2\2\u017d"+
		"\u017e\7h\2\2\u017e\u017f\7c\2\2\u017f\u0180\7n\2\2\u0180\u0181\7u\2\2"+
		"\u0181\u0185\7g\2\2\u0182\u0183\7k\2\2\u0183\u0185\7p\2\2\u0184\u0165"+
		"\3\2\2\2\u0184\u0167\3\2\2\2\u0184\u016b\3\2\2\2\u0184\u016e\3\2\2\2\u0184"+
		"\u0173\3\2\2\2\u0184\u0179\3\2\2\2\u0184\u017d\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185p\3\2\2\2\u0186\u0188\t\2\2\2\u0187\u0186\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\b9\2\2\u018cr\3\2\2\2\u018d\u018e\t\3\2\2\u018et\3\2\2\2\u018f"+
		"\u0190\t\4\2\2\u0190v\3\2\2\2\u0191\u0192\t\5\2\2\u0192x\3\2\2\2\u0193"+
		"\u019d\t\6\2\2\u0194\u0195\7#\2\2\u0195\u019d\7?\2\2\u0196\u019d\t\7\2"+
		"\2\u0197\u0198\7>\2\2\u0198\u019d\7?\2\2\u0199\u019a\7@\2\2\u019a\u019d"+
		"\7?\2\2\u019b\u019d\t\b\2\2\u019c\u0193\3\2\2\2\u019c\u0194\3\2\2\2\u019c"+
		"\u0196\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019b\3\2"+
		"\2\2\u019dz\3\2\2\2\6\2\u0184\u0189\u019c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}