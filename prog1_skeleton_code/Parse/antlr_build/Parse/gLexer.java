// Generated from Parse/gLexer.g4 by ANTLR 4.13.2

   package Parse.antlr_build;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, VAR=3, FUN=4, WHILE=5, CONST=6, STRING=7, VOID=8, RETURN=9, 
		IF=10, ELSE=11, BREAK=12, INT=13, TYPEDEF=14, STRUCT=15, UNION=16, ID=17, 
		ADD=18, ASSIGN=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "VAR", "FUN", "WHILE", "CONST", "STRING", "VOID", "RETURN", 
			"IF", "ELSE", "BREAK", "INT", "TYPEDEF", "STRUCT", "UNION", "ALPHA", 
			"DIGIT", "ID", "ADD", "ASSIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'var'", "'fun'", "'while'", "'const'", "'string'", 
			"'void'", "'return'", "'if'", "'else'", "'break'", "'int'", "'typedef'", 
			"'struct'", "'union'", null, "'+'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "VAR", "FUN", "WHILE", "CONST", "STRING", "VOID", 
			"RETURN", "IF", "ELSE", "BREAK", "INT", "TYPEDEF", "STRUCT", "UNION", 
			"ID", "ADD", "ASSIGN"
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


	   StringBuilder sb;
	   private int stringToInt(String target) {
	      // TODO: Implement me!
	      return 0;
	   }


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gLexer.g4"; }

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
		"\u0004\u0000\u0013\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b"+
		"\u0001\n\u0001\f\u0001:\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0092\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0097\b\u0012\n\u0012\f\u0012\u009a\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0000#\u0000%\u0011\'\u0012)\u0013\u0001\u0000\u0004\u0002"+
		"\u0000\t\n  \u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0001\u000009\u00a2\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0001,\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000"+
		"\u0005=\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\tE\u0001"+
		"\u0000\u0000\u0000\u000bK\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000"+
		"\u0000\u000fX\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013"+
		"d\u0001\u0000\u0000\u0000\u0015g\u0001\u0000\u0000\u0000\u0017l\u0001"+
		"\u0000\u0000\u0000\u0019r\u0001\u0000\u0000\u0000\u001bv\u0001\u0000\u0000"+
		"\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0085\u0001\u0000\u0000\u0000"+
		"!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000%\u0091"+
		"\u0001\u0000\u0000\u0000\'\u009b\u0001\u0000\u0000\u0000)\u009d\u0001"+
		"\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0006\u0000\u0000\u00001\u0002\u0001"+
		"\u0000\u0000\u000023\u0005/\u0000\u000034\u0005/\u0000\u000048\u0001\u0000"+
		"\u0000\u000057\b\u0001\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0006\u0001\u0000\u0000"+
		"<\u0004\u0001\u0000\u0000\u0000=>\u0005v\u0000\u0000>?\u0005a\u0000\u0000"+
		"?@\u0005r\u0000\u0000@\u0006\u0001\u0000\u0000\u0000AB\u0005f\u0000\u0000"+
		"BC\u0005u\u0000\u0000CD\u0005n\u0000\u0000D\b\u0001\u0000\u0000\u0000"+
		"EF\u0005w\u0000\u0000FG\u0005h\u0000\u0000GH\u0005i\u0000\u0000HI\u0005"+
		"l\u0000\u0000IJ\u0005e\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005"+
		"c\u0000\u0000LM\u0005o\u0000\u0000MN\u0005n\u0000\u0000NO\u0005s\u0000"+
		"\u0000OP\u0005t\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005s\u0000"+
		"\u0000RS\u0005t\u0000\u0000ST\u0005r\u0000\u0000TU\u0005i\u0000\u0000"+
		"UV\u0005n\u0000\u0000VW\u0005g\u0000\u0000W\u000e\u0001\u0000\u0000\u0000"+
		"XY\u0005v\u0000\u0000YZ\u0005o\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005"+
		"d\u0000\u0000\\\u0010\u0001\u0000\u0000\u0000]^\u0005r\u0000\u0000^_\u0005"+
		"e\u0000\u0000_`\u0005t\u0000\u0000`a\u0005u\u0000\u0000ab\u0005r\u0000"+
		"\u0000bc\u0005n\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005i\u0000"+
		"\u0000ef\u0005f\u0000\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005e\u0000"+
		"\u0000hi\u0005l\u0000\u0000ij\u0005s\u0000\u0000jk\u0005e\u0000\u0000"+
		"k\u0016\u0001\u0000\u0000\u0000lm\u0005b\u0000\u0000mn\u0005r\u0000\u0000"+
		"no\u0005e\u0000\u0000op\u0005a\u0000\u0000pq\u0005k\u0000\u0000q\u0018"+
		"\u0001\u0000\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000tu\u0005"+
		"t\u0000\u0000u\u001a\u0001\u0000\u0000\u0000vw\u0005t\u0000\u0000wx\u0005"+
		"y\u0000\u0000xy\u0005p\u0000\u0000yz\u0005e\u0000\u0000z{\u0005d\u0000"+
		"\u0000{|\u0005e\u0000\u0000|}\u0005f\u0000\u0000}\u001c\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005s\u0000\u0000\u007f\u0080\u0005t\u0000\u0000\u0080"+
		"\u0081\u0005r\u0000\u0000\u0081\u0082\u0005u\u0000\u0000\u0082\u0083\u0005"+
		"c\u0000\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u001e\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005u\u0000\u0000\u0086\u0087\u0005n\u0000\u0000\u0087"+
		"\u0088\u0005i\u0000\u0000\u0088\u0089\u0005o\u0000\u0000\u0089\u008a\u0005"+
		"n\u0000\u0000\u008a \u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0002\u0000"+
		"\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0003\u0000\u0000"+
		"\u008e$\u0001\u0000\u0000\u0000\u008f\u0092\u0003!\u0010\u0000\u0090\u0092"+
		"\u0005_\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0098\u0001\u0000\u0000\u0000\u0093\u0097\u0003"+
		"!\u0010\u0000\u0094\u0097\u0005_\u0000\u0000\u0095\u0097\u0003#\u0011"+
		"\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099&\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005+\u0000\u0000\u009c(\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005=\u0000\u0000\u009e*\u0001\u0000\u0000\u0000\u0006\u0000.8\u0091"+
		"\u0096\u0098\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}