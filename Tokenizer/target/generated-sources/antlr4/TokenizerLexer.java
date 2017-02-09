// Generated from Tokenizer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TokenizerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, STRINGLITERAL=2, IDENTIFIER=3, FLOATLITERAL=4, INTLITERAL=5, 
		KEYWORD=6, OPERATOR=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "STRINGLITERAL", "IDENTIFIER", "FLOATLITERAL", "INTLITERAL", 
		"KEYWORD", "OPERATOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "STRINGLITERAL", "IDENTIFIER", "FLOATLITERAL", "INTLITERAL", 
		"KEYWORD", "OPERATOR", "WS"
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


	public TokenizerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokenizer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\7\3!\n\3\f\3\16\3$\13"+
		"\3\3\3\3\3\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\5\5\60\n\5\3\5\7\5\63\n"+
		"\5\f\5\16\5\66\13\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\6\5\6?\n\6\3\6\6\6B\n"+
		"\6\r\6\16\6C\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9"+
		"\n\b\3\t\6\t\u00ac\n\t\r\t\16\t\u00ad\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\3\2\7\3\2C|\4\2\62;C|\3\2\62;\5\2*/\61\61=@\5\2\13\13"+
		"\17\17\"\"\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\36\3\2\2"+
		"\2\7\'\3\2\2\2\t/\3\2\2\2\13>\3\2\2\2\r\u009d\3\2\2\2\17\u00a8\3\2\2\2"+
		"\21\u00ab\3\2\2\2\23\24\7/\2\2\24\25\7/\2\2\25\31\3\2\2\2\26\30\13\2\2"+
		"\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2"+
		"\2\33\31\3\2\2\2\34\35\7\f\2\2\35\4\3\2\2\2\36\"\7$\2\2\37!\13\2\2\2 "+
		"\37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7$"+
		"\2\2&\6\3\2\2\2\'+\t\2\2\2(*\t\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,\b\3\2\2\2-+\3\2\2\2.\60\7/\2\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2"+
		"\2\2\61\63\t\4\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\67\3\2\2\2\66\64\3\2\2\2\679\7\60\2\28:\t\4\2\298\3\2\2\2:;\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<\n\3\2\2\2=?\7/\2\2>=\3\2\2\2>?\3\2\2\2?A\3"+
		"\2\2\2@B\t\4\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\f\3\2\2\2EF"+
		"\7R\2\2FG\7T\2\2GH\7Q\2\2HI\7I\2\2IJ\7T\2\2JK\7C\2\2K\u009e\7O\2\2LM\7"+
		"D\2\2MN\7G\2\2NO\7I\2\2OP\7K\2\2P\u009e\7P\2\2QR\7H\2\2RS\7W\2\2ST\7P"+
		"\2\2TU\7E\2\2UV\7V\2\2VW\7K\2\2WX\7Q\2\2X\u009e\7P\2\2YZ\7T\2\2Z[\7G\2"+
		"\2[\\\7C\2\2\\\u009e\7F\2\2]^\7Y\2\2^_\7T\2\2_`\7K\2\2`a\7V\2\2a\u009e"+
		"\7G\2\2bc\7G\2\2cd\7N\2\2de\7U\2\2e\u009e\7G\2\2fg\7G\2\2gh\7P\2\2hi\7"+
		"F\2\2ij\7K\2\2j\u009e\7H\2\2kl\7G\2\2lm\7P\2\2mn\7F\2\2no\7Y\2\2op\7J"+
		"\2\2pq\7K\2\2qr\7N\2\2r\u009e\7G\2\2st\7E\2\2tu\7Q\2\2uv\7P\2\2vw\7V\2"+
		"\2wx\7K\2\2xy\7P\2\2yz\7W\2\2z\u009e\7G\2\2{|\7D\2\2|}\7T\2\2}~\7G\2\2"+
		"~\177\7C\2\2\177\u009e\7M\2\2\u0080\u0081\7T\2\2\u0081\u0082\7G\2\2\u0082"+
		"\u0083\7V\2\2\u0083\u0084\7W\2\2\u0084\u0085\7T\2\2\u0085\u009e\7P\2\2"+
		"\u0086\u0087\7K\2\2\u0087\u0088\7P\2\2\u0088\u009e\7V\2\2\u0089\u008a"+
		"\7X\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7K\2\2\u008c\u009e\7F\2\2\u008d"+
		"\u008e\7U\2\2\u008e\u008f\7V\2\2\u008f\u0090\7T\2\2\u0090\u0091\7K\2\2"+
		"\u0091\u0092\7P\2\2\u0092\u009e\7I\2\2\u0093\u0094\7H\2\2\u0094\u0095"+
		"\7N\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7C\2\2\u0097\u009e\7V\2\2\u0098"+
		"\u0099\7G\2\2\u0099\u009a\7P\2\2\u009a\u009e\7F\2\2\u009b\u009c\7K\2\2"+
		"\u009c\u009e\7H\2\2\u009dE\3\2\2\2\u009dL\3\2\2\2\u009dQ\3\2\2\2\u009d"+
		"Y\3\2\2\2\u009d]\3\2\2\2\u009db\3\2\2\2\u009df\3\2\2\2\u009dk\3\2\2\2"+
		"\u009ds\3\2\2\2\u009d{\3\2\2\2\u009d\u0080\3\2\2\2\u009d\u0086\3\2\2\2"+
		"\u009d\u0089\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0098"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\16\3\2\2\2\u009f\u00a0\7<\2\2\u00a0"+
		"\u00a9\7?\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a9\7?\2\2\u00a3\u00a4\7>\2\2"+
		"\u00a4\u00a9\7?\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a9\7?\2\2\u00a7\u00a9"+
		"\t\5\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\20\3\2\2\2\u00aa\u00ac\t\6\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\t\2\2\u00b0\22\3\2\2\2\17\2"+
		"\31\")+/\64;>C\u009d\u00a8\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}