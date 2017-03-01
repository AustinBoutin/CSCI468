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
		COMMENT=1, STRINGLITERAL=2, KEYWORD=3, IDENTIFIER=4, FLOATLITERAL=5, INTLITERAL=6, 
		OPERATOR=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "STRINGLITERAL", "KEYWORD", "IDENTIFIER", "FLOATLITERAL", "INTLITERAL", 
		"OPERATOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "STRINGLITERAL", "KEYWORD", "IDENTIFIER", "FLOATLITERAL", 
		"INTLITERAL", "OPERATOR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0087\n\4\3\5\3\5\7\5\u008b"+
		"\n\5\f\5\16\5\u008e\13\5\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6"+
		"\6\6\u0098\n\6\r\6\16\6\u0099\3\7\6\7\u009d\n\7\r\7\16\7\u009e\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\6\t\u00ad\n\t\r\t\16\t"+
		"\u00ae\3\t\3\t\4\31$\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\7\3\2"+
		"C|\4\2\62;C|\3\2\62;\5\2*/\61\61=@\5\2\13\f\17\17\"\"\u00cd\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5 \3\2\2\2\7\u0086\3\2\2\2\t\u0088\3"+
		"\2\2\2\13\u0092\3\2\2\2\r\u009c\3\2\2\2\17\u00a9\3\2\2\2\21\u00ac\3\2"+
		"\2\2\23\24\7/\2\2\24\25\7/\2\2\25\31\3\2\2\2\26\30\13\2\2\2\27\26\3\2"+
		"\2\2\30\33\3\2\2\2\31\32\3\2\2\2\31\27\3\2\2\2\32\34\3\2\2\2\33\31\3\2"+
		"\2\2\34\35\7\f\2\2\35\36\3\2\2\2\36\37\b\2\2\2\37\4\3\2\2\2 $\7$\2\2!"+
		"#\13\2\2\2\"!\3\2\2\2#&\3\2\2\2$%\3\2\2\2$\"\3\2\2\2%\'\3\2\2\2&$\3\2"+
		"\2\2\'(\7$\2\2(\6\3\2\2\2)*\7R\2\2*+\7T\2\2+,\7Q\2\2,-\7I\2\2-.\7T\2\2"+
		"./\7C\2\2/\u0087\7O\2\2\60\61\7D\2\2\61\62\7G\2\2\62\63\7I\2\2\63\64\7"+
		"K\2\2\64\u0087\7P\2\2\65\66\7H\2\2\66\67\7W\2\2\678\7P\2\289\7E\2\29:"+
		"\7V\2\2:;\7K\2\2;<\7Q\2\2<\u0087\7P\2\2=>\7T\2\2>?\7G\2\2?@\7C\2\2@\u0087"+
		"\7F\2\2AB\7Y\2\2BC\7T\2\2CD\7K\2\2DE\7V\2\2E\u0087\7G\2\2FG\7G\2\2GH\7"+
		"N\2\2HI\7U\2\2I\u0087\7G\2\2JK\7G\2\2KL\7P\2\2LM\7F\2\2MN\7K\2\2N\u0087"+
		"\7H\2\2OP\7G\2\2PQ\7P\2\2QR\7F\2\2RS\7Y\2\2ST\7J\2\2TU\7K\2\2UV\7N\2\2"+
		"V\u0087\7G\2\2WX\7E\2\2XY\7Q\2\2YZ\7P\2\2Z[\7V\2\2[\\\7K\2\2\\]\7P\2\2"+
		"]^\7W\2\2^\u0087\7G\2\2_`\7D\2\2`a\7T\2\2ab\7G\2\2bc\7C\2\2c\u0087\7M"+
		"\2\2de\7T\2\2ef\7G\2\2fg\7V\2\2gh\7W\2\2hi\7T\2\2i\u0087\7P\2\2jk\7K\2"+
		"\2kl\7P\2\2l\u0087\7V\2\2mn\7X\2\2no\7Q\2\2op\7K\2\2p\u0087\7F\2\2qr\7"+
		"U\2\2rs\7V\2\2st\7T\2\2tu\7K\2\2uv\7P\2\2v\u0087\7I\2\2wx\7H\2\2xy\7N"+
		"\2\2yz\7Q\2\2z{\7C\2\2{\u0087\7V\2\2|}\7G\2\2}~\7P\2\2~\u0087\7F\2\2\177"+
		"\u0080\7K\2\2\u0080\u0087\7H\2\2\u0081\u0082\7Y\2\2\u0082\u0083\7J\2\2"+
		"\u0083\u0084\7K\2\2\u0084\u0085\7N\2\2\u0085\u0087\7G\2\2\u0086)\3\2\2"+
		"\2\u0086\60\3\2\2\2\u0086\65\3\2\2\2\u0086=\3\2\2\2\u0086A\3\2\2\2\u0086"+
		"F\3\2\2\2\u0086J\3\2\2\2\u0086O\3\2\2\2\u0086W\3\2\2\2\u0086_\3\2\2\2"+
		"\u0086d\3\2\2\2\u0086j\3\2\2\2\u0086m\3\2\2\2\u0086q\3\2\2\2\u0086w\3"+
		"\2\2\2\u0086|\3\2\2\2\u0086\177\3\2\2\2\u0086\u0081\3\2\2\2\u0087\b\3"+
		"\2\2\2\u0088\u008c\t\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\n\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0097\7\60\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\f\3\2\2\2\u009b\u009d\t\4\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\16\3\2\2\2\u00a0\u00a1"+
		"\7<\2\2\u00a1\u00aa\7?\2\2\u00a2\u00a3\7#\2\2\u00a3\u00aa\7?\2\2\u00a4"+
		"\u00a5\7>\2\2\u00a5\u00aa\7?\2\2\u00a6\u00a7\7@\2\2\u00a7\u00aa\7?\2\2"+
		"\u00a8\u00aa\t\5\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a4"+
		"\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\20\3\2\2\2\u00ab"+
		"\u00ad\t\6\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\t\2\2\u00b1"+
		"\22\3\2\2\2\r\2\31$\u0086\u008a\u008c\u0092\u0099\u009e\u00a9\u00ae\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}