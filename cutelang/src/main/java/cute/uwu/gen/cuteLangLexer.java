package cute.uwu.gen;// Generated from D:/Studia/sem8/kompilatory/projekt/kompilatory/cutelang/grammar/cuteLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class cuteLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TOINT=7, TOFLOAT=8, WRITE=9, 
		READ=10, STRING=11, ID=12, INT=13, FLOAT=14, TRUE=15, FALSE=16, ADD=17, 
		MULT=18, DIV=19, SUB=20, AND=21, OR=22, XOR=23, NEG=24, NEWLINE=25, WS=26, 
		START=27, END=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TOINT", "TOFLOAT", "WRITE", 
			"READ", "STRING", "ID", "INT", "FLOAT", "TRUE", "FALSE", "ADD", "MULT", 
			"DIV", "SUB", "AND", "OR", "XOR", "NEG", "NEWLINE", "WS", "START", "END"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "','", "']'", "'(int)'", "'(float)'", 
			"'write'", "'read'", null, null, null, null, "'true'", "'false'", "'+'", 
			"'*'", "'/'", "'-'", "'&&'", "'||'", "'^'", "'!'", null, null, "':D'", 
			"':C'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TOINT", "TOFLOAT", "WRITE", 
			"READ", "STRING", "ID", "INT", "FLOAT", "TRUE", "FALSE", "ADD", "MULT", 
			"DIV", "SUB", "AND", "OR", "XOR", "NEG", "NEWLINE", "WS", "START", "END"
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


	public cuteLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cuteLang.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001c\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0005\na\b\n\n\n\f\nd\t\n\u0001\n\u0001\n\u0001\u000b\u0004"+
		"\u000bi\b\u000b\u000b\u000b\f\u000bj\u0001\f\u0004\fn\b\f\u000b\f\f\f"+
		"o\u0001\r\u0004\rs\b\r\u000b\r\f\rt\u0001\r\u0001\r\u0004\ry\b\r\u000b"+
		"\r\f\rz\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0003\u0018\u009b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004"+
		"\u0019\u00a0\b\u0019\u000b\u0019\f\u0019\u00a1\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0000\u0000\u001c\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c\u0001\u0000\u0003\u0002"+
		"\u0000\"\"\\\\\u0002\u0000AZaz\u0002\u0000\t\t  \u00b1\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00019\u0001\u0000"+
		"\u0000\u0000\u0003;\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000"+
		"\u0007?\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bC\u0001"+
		"\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000"+
		"\u0000\u0011S\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015"+
		"^\u0001\u0000\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019m\u0001"+
		"\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001d|\u0001\u0000\u0000"+
		"\u0000\u001f\u0081\u0001\u0000\u0000\u0000!\u0087\u0001\u0000\u0000\u0000"+
		"#\u0089\u0001\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'\u008d"+
		"\u0001\u0000\u0000\u0000)\u008f\u0001\u0000\u0000\u0000+\u0092\u0001\u0000"+
		"\u0000\u0000-\u0095\u0001\u0000\u0000\u0000/\u0097\u0001\u0000\u0000\u0000"+
		"1\u009a\u0001\u0000\u0000\u00003\u009f\u0001\u0000\u0000\u00005\u00a5"+
		"\u0001\u0000\u0000\u00007\u00a8\u0001\u0000\u0000\u00009:\u0005=\u0000"+
		"\u0000:\u0002\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000<\u0004\u0001"+
		"\u0000\u0000\u0000=>\u0005)\u0000\u0000>\u0006\u0001\u0000\u0000\u0000"+
		"?@\u0005[\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0005,\u0000\u0000"+
		"B\n\u0001\u0000\u0000\u0000CD\u0005]\u0000\u0000D\f\u0001\u0000\u0000"+
		"\u0000EF\u0005(\u0000\u0000FG\u0005i\u0000\u0000GH\u0005n\u0000\u0000"+
		"HI\u0005t\u0000\u0000IJ\u0005)\u0000\u0000J\u000e\u0001\u0000\u0000\u0000"+
		"KL\u0005(\u0000\u0000LM\u0005f\u0000\u0000MN\u0005l\u0000\u0000NO\u0005"+
		"o\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005)\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005w\u0000\u0000TU\u0005r\u0000"+
		"\u0000UV\u0005i\u0000\u0000VW\u0005t\u0000\u0000WX\u0005e\u0000\u0000"+
		"X\u0012\u0001\u0000\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005e\u0000\u0000"+
		"[\\\u0005a\u0000\u0000\\]\u0005d\u0000\u0000]\u0014\u0001\u0000\u0000"+
		"\u0000^b\u0005\"\u0000\u0000_a\b\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005"+
		"\"\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\u0018\u0001\u0000\u0000\u0000ln\u0002"+
		"09\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u001a\u0001\u0000\u0000\u0000"+
		"qs\u000209\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t"+
		"r\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0005.\u0000\u0000wy\u000209\u0000xw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u001c\u0001\u0000\u0000\u0000|}\u0005t\u0000\u0000}~\u0005r\u0000"+
		"\u0000~\u007f\u0005u\u0000\u0000\u007f\u0080\u0005e\u0000\u0000\u0080"+
		"\u001e\u0001\u0000\u0000\u0000\u0081\u0082\u0005f\u0000\u0000\u0082\u0083"+
		"\u0005a\u0000\u0000\u0083\u0084\u0005l\u0000\u0000\u0084\u0085\u0005s"+
		"\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086 \u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005+\u0000\u0000\u0088\"\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005*\u0000\u0000\u008a$\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"/\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u008e\u0005-\u0000"+
		"\u0000\u008e(\u0001\u0000\u0000\u0000\u008f\u0090\u0005&\u0000\u0000\u0090"+
		"\u0091\u0005&\u0000\u0000\u0091*\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"|\u0000\u0000\u0093\u0094\u0005|\u0000\u0000\u0094,\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005^\u0000\u0000\u0096.\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005!\u0000\u0000\u00980\u0001\u0000\u0000\u0000\u0099\u009b\u0005"+
		"\r\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005\n\u0000"+
		"\u0000\u009d2\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0002\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0019\u0000\u0000"+
		"\u00a44\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005:\u0000\u0000\u00a6\u00a7"+
		"\u0005D\u0000\u0000\u00a76\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005:"+
		"\u0000\u0000\u00a9\u00aa\u0005C\u0000\u0000\u00aa8\u0001\u0000\u0000\u0000"+
		"\b\u0000bjotz\u009a\u00a1\u0001\u0001\u0019\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}