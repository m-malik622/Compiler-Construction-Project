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
		WS=1, COMMENT=2, KEYWORD=3, ID=4, ADD=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "KEYWORD", "ALPHA", "DIGIT", "ID", "ADD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "KEYWORD", "ID", "ADD"
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
		"\u0004\u0000\u0005u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b"+
		"\b\u0001\n\u0001\f\u0001\u001e\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002b\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"j\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005"+
		"\f\u0005r\t\u0005\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0000\t\u0000\u000b\u0004\r\u0005\u0001"+
		"\u0000\u0004\u0002\u0000\t\n  \u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0001"+
		"\u000009\u0085\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u0010\u0001\u0000\u0000"+
		"\u0000\u0003\u0016\u0001\u0000\u0000\u0000\u0005a\u0001\u0000\u0000\u0000"+
		"\u0007c\u0001\u0000\u0000\u0000\te\u0001\u0000\u0000\u0000\u000bi\u0001"+
		"\u0000\u0000\u0000\rs\u0001\u0000\u0000\u0000\u000f\u0011\u0007\u0000"+
		"\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0006\u0000"+
		"\u0000\u0000\u0015\u0002\u0001\u0000\u0000\u0000\u0016\u0017\u0005/\u0000"+
		"\u0000\u0017\u0018\u0005/\u0000\u0000\u0018\u001c\u0001\u0000\u0000\u0000"+
		"\u0019\u001b\b\u0001\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001f \u0006\u0001\u0000\u0000 \u0004\u0001"+
		"\u0000\u0000\u0000!\"\u0005v\u0000\u0000\"#\u0005a\u0000\u0000#b\u0005"+
		"r\u0000\u0000$%\u0005f\u0000\u0000%&\u0005u\u0000\u0000&b\u0005n\u0000"+
		"\u0000\'(\u0005w\u0000\u0000()\u0005h\u0000\u0000)*\u0005i\u0000\u0000"+
		"*+\u0005l\u0000\u0000+b\u0005e\u0000\u0000,-\u0005c\u0000\u0000-.\u0005"+
		"o\u0000\u0000./\u0005n\u0000\u0000/0\u0005s\u0000\u00000b\u0005t\u0000"+
		"\u000012\u0005s\u0000\u000023\u0005t\u0000\u000034\u0005r\u0000\u0000"+
		"45\u0005i\u0000\u000056\u0005n\u0000\u00006b\u0005g\u0000\u000078\u0005"+
		"v\u0000\u000089\u0005o\u0000\u00009:\u0005i\u0000\u0000:b\u0005d\u0000"+
		"\u0000;<\u0005r\u0000\u0000<=\u0005e\u0000\u0000=>\u0005t\u0000\u0000"+
		">?\u0005u\u0000\u0000?@\u0005r\u0000\u0000@b\u0005n\u0000\u0000AB\u0005"+
		"i\u0000\u0000Bb\u0005f\u0000\u0000CD\u0005e\u0000\u0000DE\u0005l\u0000"+
		"\u0000EF\u0005s\u0000\u0000Fb\u0005e\u0000\u0000GH\u0005b\u0000\u0000"+
		"HI\u0005r\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005a\u0000\u0000Kb\u0005"+
		"k\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000\u0000Nb\u0005t\u0000"+
		"\u0000OP\u0005t\u0000\u0000PQ\u0005y\u0000\u0000QR\u0005p\u0000\u0000"+
		"RS\u0005e\u0000\u0000ST\u0005d\u0000\u0000TU\u0005e\u0000\u0000Ub\u0005"+
		"f\u0000\u0000VW\u0005s\u0000\u0000WX\u0005t\u0000\u0000XY\u0005r\u0000"+
		"\u0000YZ\u0005u\u0000\u0000Z[\u0005c\u0000\u0000[b\u0005t\u0000\u0000"+
		"\\]\u0005u\u0000\u0000]^\u0005n\u0000\u0000^_\u0005i\u0000\u0000_`\u0005"+
		"o\u0000\u0000`b\u0005n\u0000\u0000a!\u0001\u0000\u0000\u0000a$\u0001\u0000"+
		"\u0000\u0000a\'\u0001\u0000\u0000\u0000a,\u0001\u0000\u0000\u0000a1\u0001"+
		"\u0000\u0000\u0000a7\u0001\u0000\u0000\u0000a;\u0001\u0000\u0000\u0000"+
		"aA\u0001\u0000\u0000\u0000aC\u0001\u0000\u0000\u0000aG\u0001\u0000\u0000"+
		"\u0000aL\u0001\u0000\u0000\u0000aO\u0001\u0000\u0000\u0000aV\u0001\u0000"+
		"\u0000\u0000a\\\u0001\u0000\u0000\u0000b\u0006\u0001\u0000\u0000\u0000"+
		"cd\u0007\u0002\u0000\u0000d\b\u0001\u0000\u0000\u0000ef\u0007\u0003\u0000"+
		"\u0000f\n\u0001\u0000\u0000\u0000gj\u0003\u0007\u0003\u0000hj\u0005_\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jp\u0001\u0000"+
		"\u0000\u0000ko\u0003\u0007\u0003\u0000lo\u0005_\u0000\u0000mo\u0003\t"+
		"\u0004\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\f\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0005+\u0000\u0000t\u000e\u0001\u0000\u0000\u0000\u0007\u0000"+
		"\u0012\u001cainp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}