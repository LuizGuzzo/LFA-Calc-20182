// Generated from /home/jefferson/Dropbox/2018-2/lfa/workspace/Calc4/grammar/Calc.g4 by ANTLR 4.1
package edu.ifes.lfa.calc;

import java.util.List;
import java.util.LinkedList;
import static edu.ifes.lfa.calc.data.CalcFactory.*;
import edu.ifes.lfa.calc.data.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, LBRC=3, RBRC=4, PLUS=5, MINUS=6, TIMES=7, DIVIDE=8, EXP=9, 
		COMMA=10, SEMI=11, GETS=12, EQU=13, NEQ=14, GT=15, GEQ=16, LT=17, LEQ=18, 
		AND=19, OR=20, NOT=21, VERUM=22, FALSUM=23, IF=24, THEN=25, ELSE=26, WHILE=27, 
		DO=28, DEF=29, INTEGER=30, FLOAT=31, IDENT=32, STRING=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'^'", "','", 
		"';'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
		"'!'", "'true'", "'false'", "'if'", "'then'", "'else'", "'while'", "'do'", 
		"'def'", "INTEGER", "FLOAT", "IDENT", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"LPAR", "RPAR", "LBRC", "RBRC", "PLUS", "MINUS", "TIMES", "DIVIDE", "EXP", 
		"COMMA", "SEMI", "GETS", "EQU", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", 
		"OR", "NOT", "VERUM", "FALSUM", "IF", "THEN", "ELSE", "WHILE", "DO", "DEF", 
		"DIGIT", "INTEGER", "FLOAT", "IDENT", "STRING", "WS"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2$\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3 \6 \u00a2\n \r \16 \u00a3\3!\6!\u00a7\n!\r!\16!\u00a8"+
		"\3!\3!\7!\u00ad\n!\f!\16!\u00b0\13!\3!\3!\3!\5!\u00b5\n!\3!\6!\u00b8\n"+
		"!\r!\16!\u00b9\5!\u00bc\n!\3!\3!\6!\u00c0\n!\r!\16!\u00c1\3!\3!\3!\5!"+
		"\u00c7\n!\3!\6!\u00ca\n!\r!\16!\u00cb\5!\u00ce\n!\5!\u00d0\n!\3\"\3\""+
		"\7\"\u00d4\n\"\f\"\16\"\u00d7\13\"\3#\3#\3#\3#\7#\u00dd\n#\f#\16#\u00e0"+
		"\13#\3#\3#\3$\3$\3$\3$\2%\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1=\2\1? \1A!\1C\"\1E#\1G$\2\3\2\b\3\2\62;\4\2GGgg\5\2C\\"+
		"aac|\7\2))\62;C\\aac|\4\2$$^^\5\2\13\f\17\17\"\"\u00f3\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M"+
		"\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23"+
		"Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2"+
		"\37g\3\2\2\2!i\3\2\2\2#l\3\2\2\2%n\3\2\2\2\'q\3\2\2\2)t\3\2\2\2+w\3\2"+
		"\2\2-y\3\2\2\2/~\3\2\2\2\61\u0084\3\2\2\2\63\u0087\3\2\2\2\65\u008c\3"+
		"\2\2\2\67\u0091\3\2\2\29\u0097\3\2\2\2;\u009a\3\2\2\2=\u009e\3\2\2\2?"+
		"\u00a1\3\2\2\2A\u00cf\3\2\2\2C\u00d1\3\2\2\2E\u00d8\3\2\2\2G\u00e3\3\2"+
		"\2\2IJ\7*\2\2J\4\3\2\2\2KL\7+\2\2L\6\3\2\2\2MN\7}\2\2N\b\3\2\2\2OP\7\177"+
		"\2\2P\n\3\2\2\2QR\7-\2\2R\f\3\2\2\2ST\7/\2\2T\16\3\2\2\2UV\7,\2\2V\20"+
		"\3\2\2\2WX\7\61\2\2X\22\3\2\2\2YZ\7`\2\2Z\24\3\2\2\2[\\\7.\2\2\\\26\3"+
		"\2\2\2]^\7=\2\2^\30\3\2\2\2_`\7?\2\2`\32\3\2\2\2ab\7?\2\2bc\7?\2\2c\34"+
		"\3\2\2\2de\7#\2\2ef\7?\2\2f\36\3\2\2\2gh\7@\2\2h \3\2\2\2ij\7@\2\2jk\7"+
		"?\2\2k\"\3\2\2\2lm\7>\2\2m$\3\2\2\2no\7>\2\2op\7?\2\2p&\3\2\2\2qr\7(\2"+
		"\2rs\7(\2\2s(\3\2\2\2tu\7~\2\2uv\7~\2\2v*\3\2\2\2wx\7#\2\2x,\3\2\2\2y"+
		"z\7v\2\2z{\7t\2\2{|\7w\2\2|}\7g\2\2}.\3\2\2\2~\177\7h\2\2\177\u0080\7"+
		"c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\60"+
		"\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\62\3\2\2\2\u0087"+
		"\u0088\7v\2\2\u0088\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2"+
		"\u008b\64\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7"+
		"u\2\2\u008f\u0090\7g\2\2\u0090\66\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093"+
		"\7j\2\2\u0093\u0094\7k\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096"+
		"8\3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7q\2\2\u0099:\3\2\2\2\u009a\u009b"+
		"\7f\2\2\u009b\u009c\7g\2\2\u009c\u009d\7h\2\2\u009d<\3\2\2\2\u009e\u009f"+
		"\t\2\2\2\u009f>\3\2\2\2\u00a0\u00a2\5=\37\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4@\3\2\2\2"+
		"\u00a5\u00a7\5=\37\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae\7\60\2\2"+
		"\u00ab\u00ad\5=\37\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00bb\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\t\3\2\2\u00b2\u00b5\5\13\6\2\u00b3\u00b5\5\r\7\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\5=\37\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00d0\3\2\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\5=\37\2\u00bf\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00cd\3\2\2\2\u00c3\u00c6\t\3\2\2\u00c4\u00c7\5\13\6\2\u00c5\u00c7\5"+
		"\r\7\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00ca\5=\37\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00a6\3\2\2\2\u00cf\u00bd\3\2"+
		"\2\2\u00d0B\3\2\2\2\u00d1\u00d5\t\4\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"D\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00de\7$\2\2\u00d9\u00da\7^\2\2\u00da"+
		"\u00dd\13\2\2\2\u00db\u00dd\n\6\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3"+
		"\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2F\3\2\2\2\u00e3"+
		"\u00e4\t\7\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b$\2\2\u00e6H\3\2\2\2\21"+
		"\2\u00a3\u00a8\u00ae\u00b4\u00b9\u00bb\u00c1\u00c6\u00cb\u00cd\u00cf\u00d5"+
		"\u00dc\u00de";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}