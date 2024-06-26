// Generated from LangLexer.g4 by ANTLR 4.7.1
package antlr.output;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INT=2, FLOAT=3, CHAR=4, DATA=5, IF=6, ELSE=7, ITERATE=8, NEW=9, 
		RETURN=10, READ=11, PRINT=12, ID=13, DATA_ID=14, INT_LITERAL=15, FLOAT_LITERAL=16, 
		CHAR_LITERAL=17, BOOLEAN_LITERAL=18, NULL_LITERAL=19, LPAREN=20, RPAREN=21, 
		LBRACK=22, RBRACK=23, LBRACE=24, RBRACE=25, DOT=26, COMMA=27, SEMI=28, 
		COLON=29, COLONCOLON=30, GT=31, LT=32, ASSIGN=33, EQUAL=34, BANG=35, NOTEQUAL=36, 
		AND=37, ADD=38, SUB=39, MUL=40, DIV=41, MOD=42, WS=43, COMMENT=44, LINE_COMMENT=45, 
		ERROR=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "INT", "FLOAT", "CHAR", "DATA", "IF", "ELSE", "ITERATE", "NEW", 
		"RETURN", "READ", "PRINT", "ID", "DATA_ID", "INT_LITERAL", "FLOAT_LITERAL", 
		"CHAR_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "LBRACE", "RBRACE", "DOT", "COMMA", "SEMI", "COLON", 
		"COLONCOLON", "GT", "LT", "ASSIGN", "EQUAL", "BANG", "NOTEQUAL", "AND", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "WS", "COMMENT", "LINE_COMMENT", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Bool'", "'Int'", "'Float'", "'Char'", "'data'", "'if'", "'else'", 
		"'iterate'", "'new'", "'return'", "'read'", "'print'", null, null, null, 
		null, null, null, "'null'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'.'", "','", "';'", "':'", "'::'", "'>'", "'<'", "'='", "'=='", "'!'", 
		"'!='", "'&&'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "INT", "FLOAT", "CHAR", "DATA", "IF", "ELSE", "ITERATE", 
		"NEW", "RETURN", "READ", "PRINT", "ID", "DATA_ID", "INT_LITERAL", "FLOAT_LITERAL", 
		"CHAR_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "LBRACE", "RBRACE", "DOT", "COMMA", "SEMI", "COLON", 
		"COLONCOLON", "GT", "LT", "ASSIGN", "EQUAL", "BANG", "NOTEQUAL", "AND", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "WS", "COMMENT", "LINE_COMMENT", "ERROR"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\7\16\u00a1\n\16\f\16\16\16\u00a4\13\16\3\17\3\17\7\17\u00a8"+
		"\n\17\f\17\16\17\u00ab\13\17\3\20\6\20\u00ae\n\20\r\20\16\20\u00af\3\20"+
		"\3\20\7\20\u00b4\n\20\f\20\16\20\u00b7\13\20\5\20\u00b9\n\20\3\21\6\21"+
		"\u00bc\n\21\r\21\16\21\u00bd\3\21\3\21\7\21\u00c2\n\21\f\21\16\21\u00c5"+
		"\13\21\3\21\3\21\7\21\u00c9\n\21\f\21\16\21\u00cc\13\21\3\21\3\21\6\21"+
		"\u00d0\n\21\r\21\16\21\u00d1\3\21\3\21\6\21\u00d6\n\21\r\21\16\21\u00d7"+
		"\5\21\u00da\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e3\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\6,\u0128\n,\r,\16,\u0129\3,\3,\3-\3-\3-\3-\7-\u0132\n-\f-\16"+
		"-\u0135\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0140\n.\f.\16.\u0143\13.\3"+
		".\3.\3/\3/\3\u0133\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\f\3"+
		"\2c|\6\2\62;C\\aac|\3\2C\\\3\2\62\62\3\2\63;\3\2\62;\6\2\f\f\17\17))^"+
		"^\7\2^^ddppttvv\5\2\n\f\17\17\"\"\4\2\f\f\17\17\2\u0158\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7h\3\2\2"+
		"\2\tn\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17{\3\2\2\2\21\u0080\3\2\2\2\23\u0088"+
		"\3\2\2\2\25\u008c\3\2\2\2\27\u0093\3\2\2\2\31\u0098\3\2\2\2\33\u009e\3"+
		"\2\2\2\35\u00a5\3\2\2\2\37\u00b8\3\2\2\2!\u00d9\3\2\2\2#\u00e2\3\2\2\2"+
		"%\u00ed\3\2\2\2\'\u00ef\3\2\2\2)\u00f4\3\2\2\2+\u00f6\3\2\2\2-\u00f8\3"+
		"\2\2\2/\u00fa\3\2\2\2\61\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0100\3\2\2"+
		"\2\67\u0102\3\2\2\29\u0104\3\2\2\2;\u0106\3\2\2\2=\u0108\3\2\2\2?\u010b"+
		"\3\2\2\2A\u010d\3\2\2\2C\u010f\3\2\2\2E\u0111\3\2\2\2G\u0114\3\2\2\2I"+
		"\u0116\3\2\2\2K\u0119\3\2\2\2M\u011c\3\2\2\2O\u011e\3\2\2\2Q\u0120\3\2"+
		"\2\2S\u0122\3\2\2\2U\u0124\3\2\2\2W\u0127\3\2\2\2Y\u012d\3\2\2\2[\u013b"+
		"\3\2\2\2]\u0146\3\2\2\2_`\7D\2\2`a\7q\2\2ab\7q\2\2bc\7n\2\2c\4\3\2\2\2"+
		"de\7K\2\2ef\7p\2\2fg\7v\2\2g\6\3\2\2\2hi\7H\2\2ij\7n\2\2jk\7q\2\2kl\7"+
		"c\2\2lm\7v\2\2m\b\3\2\2\2no\7E\2\2op\7j\2\2pq\7c\2\2qr\7t\2\2r\n\3\2\2"+
		"\2st\7f\2\2tu\7c\2\2uv\7v\2\2vw\7c\2\2w\f\3\2\2\2xy\7k\2\2yz\7h\2\2z\16"+
		"\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2\177\20\3\2\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087\22\3\2\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7g\2\2\u008a\u008b\7y\2\2\u008b\24\3\2\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f\u0090\7w\2\2"+
		"\u0090\u0091\7t\2\2\u0091\u0092\7p\2\2\u0092\26\3\2\2\2\u0093\u0094\7"+
		"t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7f\2\2\u0097\30"+
		"\3\2\2\2\u0098\u0099\7r\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\32\3\2\2\2\u009e\u00a2\t\2\2\2"+
		"\u009f\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\34\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a9\t\4\2\2\u00a6\u00a8\t\3\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\36\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1\u00b5\t\6"+
		"\2\2\u00b2\u00b4\t\7\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b9 \3\2\2\2\u00ba\u00bc"+
		"\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\7\60\2\2\u00c0\u00c2\t"+
		"\7\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00da\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\t\6"+
		"\2\2\u00c7\u00c9\t\7\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00cf\7\60\2\2\u00ce\u00d0\t\7\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00da\3\2"+
		"\2\2\u00d3\u00d5\7\60\2\2\u00d4\u00d6\t\7\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00bb\3\2\2\2\u00d9\u00c6\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da"+
		"\"\3\2\2\2\u00db\u00dc\7)\2\2\u00dc\u00dd\n\b\2\2\u00dd\u00e3\7)\2\2\u00de"+
		"\u00df\7)\2\2\u00df\u00e0\7^\2\2\u00e0\u00e1\t\t\2\2\u00e1\u00e3\7)\2"+
		"\2\u00e2\u00db\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3$\3\2\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7w\2\2\u00e7\u00ee\7g\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2"+
		"\u00ec\u00ee\7g\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee&\3\2"+
		"\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3(\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5*\3\2\2\2\u00f6\u00f7\7"+
		"+\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7]\2\2\u00f9.\3\2\2\2\u00fa\u00fb\7_"+
		"\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7}\2\2\u00fd\62\3\2\2\2\u00fe\u00ff"+
		"\7\177\2\2\u00ff\64\3\2\2\2\u0100\u0101\7\60\2\2\u0101\66\3\2\2\2\u0102"+
		"\u0103\7.\2\2\u01038\3\2\2\2\u0104\u0105\7=\2\2\u0105:\3\2\2\2\u0106\u0107"+
		"\7<\2\2\u0107<\3\2\2\2\u0108\u0109\7<\2\2\u0109\u010a\7<\2\2\u010a>\3"+
		"\2\2\2\u010b\u010c\7@\2\2\u010c@\3\2\2\2\u010d\u010e\7>\2\2\u010eB\3\2"+
		"\2\2\u010f\u0110\7?\2\2\u0110D\3\2\2\2\u0111\u0112\7?\2\2\u0112\u0113"+
		"\7?\2\2\u0113F\3\2\2\2\u0114\u0115\7#\2\2\u0115H\3\2\2\2\u0116\u0117\7"+
		"#\2\2\u0117\u0118\7?\2\2\u0118J\3\2\2\2\u0119\u011a\7(\2\2\u011a\u011b"+
		"\7(\2\2\u011bL\3\2\2\2\u011c\u011d\7-\2\2\u011dN\3\2\2\2\u011e\u011f\7"+
		"/\2\2\u011fP\3\2\2\2\u0120\u0121\7,\2\2\u0121R\3\2\2\2\u0122\u0123\7\61"+
		"\2\2\u0123T\3\2\2\2\u0124\u0125\7\'\2\2\u0125V\3\2\2\2\u0126\u0128\t\n"+
		"\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b,\2\2\u012cX\3\2\2\2\u012d"+
		"\u012e\7}\2\2\u012e\u012f\7/\2\2\u012f\u0133\3\2\2\2\u0130\u0132\13\2"+
		"\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7/"+
		"\2\2\u0137\u0138\7\177\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b-\2\2\u013a"+
		"Z\3\2\2\2\u013b\u013c\7/\2\2\u013c\u013d\7/\2\2\u013d\u0141\3\2\2\2\u013e"+
		"\u0140\n\13\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\b.\2\2\u0145\\\3\2\2\2\u0146\u0147\13\2\2\2\u0147^\3\2\2\2\23\2"+
		"\u00a2\u00a9\u00af\u00b5\u00b8\u00bd\u00c3\u00ca\u00d1\u00d7\u00d9\u00e2"+
		"\u00ed\u0129\u0133\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}