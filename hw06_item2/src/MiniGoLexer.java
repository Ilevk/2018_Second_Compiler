// Generated from /Users/kyle/Documents/Git/2018_Second_Compiler/hw06_item2/src/MiniGo.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, VOID=20, VAR=21, FUNC=22, FMT=23, INT=24, FOR=25, 
		IF=26, ELSE=27, RETURN=28, OR=29, AND=30, LE=31, GE=32, EQ=33, NE=34, 
		IDENT=35, LITERAL=36, DecimalConstant=37, OctalConstant=38, HexadecimalConstant=39, 
		WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "VOID", "VAR", "FUNC", "FMT", "INT", "FOR", "IF", "ELSE", 
		"RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", "IDENT", "LITERAL", "DecimalConstant", 
		"OctalConstant", "HexadecimalConstant", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'['", "']'", "'('", "')'", "'='", "'{'", "'}'", "'.'", "'-'", 
		"'+'", "'--'", "'++'", "'!'", "'*'", "'/'", "'%'", "'<'", "'>'", "'void'", 
		"'var'", "'func'", "'fmt'", "'int'", "'for'", "'if'", "'else'", "'return'", 
		"'or'", "'and'", "'<='", "'>='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "VOID", "VAR", "FUNC", 
		"FMT", "INT", "FOR", "IF", "ELSE", "RETURN", "OR", "AND", "LE", "GE", 
		"EQ", "NE", "IDENT", "LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
		"WS"
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


	public MiniGoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\7$\u00ba\n$\f$\16$\u00bd\13$\3%\3%\3%\5%"+
		"\u00c2\n%\3&\3&\3&\7&\u00c7\n&\f&\16&\u00ca\13&\5&\u00cc\n&\3\'\3\'\7"+
		"\'\u00d0\n\'\f\'\16\'\u00d3\13\'\3(\3(\3(\6(\u00d8\n(\r(\16(\u00d9\3)"+
		"\6)\u00dd\n)\r)\16)\u00de\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\n\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2\629\4\2ZZzz\5\2\62;CHch\5\2"+
		"\13\f\17\17\"\"\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3"+
		"\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31"+
		"i\3\2\2\2\33l\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3"+
		"\2\2\2\'y\3\2\2\2){\3\2\2\2+\u0080\3\2\2\2-\u0084\3\2\2\2/\u0089\3\2\2"+
		"\2\61\u008d\3\2\2\2\63\u0091\3\2\2\2\65\u0095\3\2\2\2\67\u0098\3\2\2\2"+
		"9\u009d\3\2\2\2;\u00a4\3\2\2\2=\u00a7\3\2\2\2?\u00ab\3\2\2\2A\u00ae\3"+
		"\2\2\2C\u00b1\3\2\2\2E\u00b4\3\2\2\2G\u00b7\3\2\2\2I\u00c1\3\2\2\2K\u00cb"+
		"\3\2\2\2M\u00cd\3\2\2\2O\u00d4\3\2\2\2Q\u00dc\3\2\2\2ST\7.\2\2T\4\3\2"+
		"\2\2UV\7]\2\2V\6\3\2\2\2WX\7_\2\2X\b\3\2\2\2YZ\7*\2\2Z\n\3\2\2\2[\\\7"+
		"+\2\2\\\f\3\2\2\2]^\7?\2\2^\16\3\2\2\2_`\7}\2\2`\20\3\2\2\2ab\7\177\2"+
		"\2b\22\3\2\2\2cd\7\60\2\2d\24\3\2\2\2ef\7/\2\2f\26\3\2\2\2gh\7-\2\2h\30"+
		"\3\2\2\2ij\7/\2\2jk\7/\2\2k\32\3\2\2\2lm\7-\2\2mn\7-\2\2n\34\3\2\2\2o"+
		"p\7#\2\2p\36\3\2\2\2qr\7,\2\2r \3\2\2\2st\7\61\2\2t\"\3\2\2\2uv\7\'\2"+
		"\2v$\3\2\2\2wx\7>\2\2x&\3\2\2\2yz\7@\2\2z(\3\2\2\2{|\7x\2\2|}\7q\2\2}"+
		"~\7k\2\2~\177\7f\2\2\177*\3\2\2\2\u0080\u0081\7x\2\2\u0081\u0082\7c\2"+
		"\2\u0082\u0083\7t\2\2\u0083,\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7"+
		"w\2\2\u0086\u0087\7p\2\2\u0087\u0088\7e\2\2\u0088.\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7o\2\2\u008b\u008c\7v\2\2\u008c\60\3\2\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\62\3\2\2\2\u0091\u0092"+
		"\7h\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\64\3\2\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7h\2\2\u0097\66\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c8\3\2\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7p\2\2\u00a3:\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6<\3\2\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7f\2\2\u00aa>\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad"+
		"@\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0B\3\2\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2\u00b3\7?\2\2\u00b3D\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6F\3\2\2\2\u00b7\u00bb\t\2\2\2\u00b8\u00ba\t\3\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"H\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c2\5K&\2\u00bf\u00c2\5M\'\2\u00c0"+
		"\u00c2\5O(\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2"+
		"\2\u00c2J\3\2\2\2\u00c3\u00cc\7\62\2\2\u00c4\u00c8\t\4\2\2\u00c5\u00c7"+
		"\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00c3\3\2"+
		"\2\2\u00cb\u00c4\3\2\2\2\u00ccL\3\2\2\2\u00cd\u00d1\7\62\2\2\u00ce\u00d0"+
		"\t\6\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2N\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\62\2\2"+
		"\u00d5\u00d7\t\7\2\2\u00d6\u00d8\t\b\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00daP\3\2\2\2\u00db"+
		"\u00dd\t\t\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b)\2\2\u00e1"+
		"R\3\2\2\2\13\2\u00b9\u00bb\u00c1\u00c8\u00cb\u00d1\u00d9\u00de\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}