// Generated from /home/jefferson/Dropbox/2018-1/lfa/workspace/Calc3/Calc.g4 by ANTLR 4.1
package edu.ifes.lfa.calc;

import static edu.ifes.lfa.calc.data.CalcFactory.*;
import edu.ifes.lfa.calc.data.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, LBRC=3, RBRC=4, PLUS=5, MINUS=6, TIMES=7, DIVIDE=8, EXP=9, 
		COMMA=10, SEMI=11, GETS=12, EQU=13, NEQ=14, GT=15, GEQ=16, LT=17, LEQ=18, 
		AND=19, OR=20, NOT=21, VERUM=22, FALSUM=23, IF=24, THEN=25, ELSE=26, WHILE=27, 
		DO=28, INTEGER=29, FLOAT=30, IDENT=31, WS=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"','", "';'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", 
		"'||'", "'!'", "'true'", "'false'", "'if'", "'then'", "'else'", "'while'", 
		"'do'", "INTEGER", "FLOAT", "IDENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr = 2, RULE_if_expr = 3, 
		RULE_while_expr = 4, RULE_block_expr = 5, RULE_bexpr = 6, RULE_conj = 7, 
		RULE_disj = 8, RULE_rel_op = 9, RULE_aexpr = 10, RULE_fator = 11, RULE_termo = 12, 
		RULE_atomo = 13, RULE_bool = 14, RULE_func_call = 15, RULE_arg_list = 16;
	public static final String[] ruleNames = {
		"program", "statement", "expr", "if_expr", "while_expr", "block_expr", 
		"bexpr", "conj", "disj", "rel_op", "aexpr", "fator", "termo", "atomo", 
		"bool", "func_call", "arg_list"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Expr> sttms;
		public StatementContext s;
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);

		    ((ProgramContext)_localctx).sttms =  new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); ((ProgramContext)_localctx).s = statement();
				_localctx.sttms.add(((ProgramContext)_localctx).s.result);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRC) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << VERUM) | (1L << FALSUM) | (1L << IF) | (1L << WHILE) | (1L << INTEGER) | (1L << FLOAT) | (1L << IDENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Expr result;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); ((StatementContext)_localctx).e = expr();
			setState(42); match(SEMI);
			((StatementContext)_localctx).result =  ((StatementContext)_localctx).e.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr result;
		public Token IDENT;
		public ExprContext e;
		public BexprContext b;
		public If_exprContext i;
		public While_exprContext w;
		public Block_exprContext k;
		public Block_exprContext block_expr() {
			return getRuleContext(Block_exprContext.class,0);
		}
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public TerminalNode GETS() { return getToken(CalcParser.GETS, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); ((ExprContext)_localctx).IDENT = match(IDENT);
				setState(46); match(GETS);
				setState(47); ((ExprContext)_localctx).e = expr();
				((ExprContext)_localctx).result =  makeAssign((((ExprContext)_localctx).IDENT!=null?((ExprContext)_localctx).IDENT.getText():null), ((ExprContext)_localctx).e.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); ((ExprContext)_localctx).b = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).b.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); ((ExprContext)_localctx).i = if_expr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).i.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); ((ExprContext)_localctx).w = while_expr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).w.result;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); ((ExprContext)_localctx).k = block_expr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).k.result;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_exprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext b;
		public ExprContext t;
		public ExprContext e;
		public TerminalNode ELSE() { return getToken(CalcParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CalcParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(CalcParser.THEN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_expr);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(IF);
				setState(65); ((If_exprContext)_localctx).b = bexpr();
				setState(66); match(THEN);
				setState(67); ((If_exprContext)_localctx).t = expr();
				((If_exprContext)_localctx).result =  makeIfThen(((If_exprContext)_localctx).b.result, ((If_exprContext)_localctx).t.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(IF);
				setState(71); ((If_exprContext)_localctx).b = bexpr();
				setState(72); match(THEN);
				setState(73); ((If_exprContext)_localctx).t = expr();
				setState(74); match(ELSE);
				setState(75); ((If_exprContext)_localctx).e = expr();
				((If_exprContext)_localctx).result =  makeIfThenElse(((If_exprContext)_localctx).b.result, ((If_exprContext)_localctx).t.result, ((If_exprContext)_localctx).e.result);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_exprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext b;
		public ExprContext d;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(CalcParser.DO, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CalcParser.WHILE, 0); }
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(WHILE);
			setState(81); ((While_exprContext)_localctx).b = bexpr();
			setState(82); match(DO);
			setState(83); ((While_exprContext)_localctx).d = expr();
			((While_exprContext)_localctx).result =  makeWhile(((While_exprContext)_localctx).b.result, ((While_exprContext)_localctx).d.result);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_exprContext extends ParserRuleContext {
		public Expr result;
		public StatementContext s;
		public TerminalNode LBRC() { return getToken(CalcParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(CalcParser.RBRC, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Block_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_expr; }
	}

	public final Block_exprContext block_expr() throws RecognitionException {
		Block_exprContext _localctx = new Block_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block_expr);

		    List<Expr> body = new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(LBRC);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRC) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << VERUM) | (1L << FALSUM) | (1L << IF) | (1L << WHILE) | (1L << INTEGER) | (1L << FLOAT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(87); ((Block_exprContext)_localctx).s = statement();
				body.add(((Block_exprContext)_localctx).s.result);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); match(RBRC);
			((Block_exprContext)_localctx).result =  makeBlock(body);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BexprContext extends ParserRuleContext {
		public Expr result;
		public ConjContext c1;
		public ConjContext c2;
		public TerminalNode AND(int i) {
			return getToken(CalcParser.AND, i);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(CalcParser.AND); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); ((BexprContext)_localctx).c1 = conj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).c1.result;
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(100); match(AND);
				setState(101); ((BexprContext)_localctx).c2 = conj();
				((BexprContext)_localctx).result =  makeCompositeExpr(Functions.AND, _localctx.result, ((BexprContext)_localctx).c2.result);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjContext extends ParserRuleContext {
		public Expr result;
		public DisjContext d1;
		public DisjContext d2;
		public List<DisjContext> disj() {
			return getRuleContexts(DisjContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(CalcParser.OR); }
		public DisjContext disj(int i) {
			return getRuleContext(DisjContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(CalcParser.OR, i);
		}
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); ((ConjContext)_localctx).d1 = disj();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).d1.result;
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(111); match(OR);
				setState(112); ((ConjContext)_localctx).d2 = disj();
				((ConjContext)_localctx).result =  makeCompositeExpr(Functions.OR, _localctx.result, ((ConjContext)_localctx).d2.result);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjContext extends ParserRuleContext {
		public Expr result;
		public AexprContext a1;
		public Rel_opContext o;
		public AexprContext a2;
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public DisjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disj; }
	}

	public final DisjContext disj() throws RecognitionException {
		DisjContext _localctx = new DisjContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_disj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); ((DisjContext)_localctx).a1 = aexpr();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).a1.result;
			setState(126);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << GT) | (1L << GEQ) | (1L << LT) | (1L << LEQ))) != 0)) {
				{
				setState(122); ((DisjContext)_localctx).o = rel_op();
				setState(123); ((DisjContext)_localctx).a2 = aexpr();
				((DisjContext)_localctx).result =  makeCompositeExpr(((DisjContext)_localctx).o.op, _localctx.result, ((DisjContext)_localctx).a2.result);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Operator op;
		public TerminalNode GEQ() { return getToken(CalcParser.GEQ, 0); }
		public TerminalNode NEQ() { return getToken(CalcParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(CalcParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(CalcParser.LT, 0); }
		public TerminalNode GT() { return getToken(CalcParser.GT, 0); }
		public TerminalNode EQU() { return getToken(CalcParser.EQU, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rel_op);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(EQU);
				((Rel_opContext)_localctx).op =  Functions.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(NEQ);
				((Rel_opContext)_localctx).op =  Functions.NEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); match(GT);
				((Rel_opContext)_localctx).op =  Functions.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(GEQ);
				((Rel_opContext)_localctx).op =  Functions.GEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 5);
				{
				setState(136); match(LT);
				((Rel_opContext)_localctx).op =  Functions.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(138); match(LEQ);
				((Rel_opContext)_localctx).op =  Functions.LEQ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AexprContext extends ParserRuleContext {
		public Expr result;
		public FatorContext f1;
		public FatorContext f2;
		public TerminalNode MINUS(int i) {
			return getToken(CalcParser.MINUS, i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalcParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(CalcParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalcParser.PLUS, i);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ((AexprContext)_localctx).f1 = fator();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).f1.result;
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(152);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(144); match(PLUS);
					setState(145); ((AexprContext)_localctx).f2 = fator();
					((AexprContext)_localctx).result =  makeCompositeExpr(Functions.PLUS, _localctx.result, ((AexprContext)_localctx).f2.result);
					}
					break;
				case MINUS:
					{
					setState(148); match(MINUS);
					setState(149); ((AexprContext)_localctx).f2 = fator();
					((AexprContext)_localctx).result =  makeCompositeExpr(Functions.MINUS, _localctx.result, ((AexprContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public Expr result;
		public TermoContext t1;
		public TermoContext t2;
		public TerminalNode DIVIDE(int i) {
			return getToken(CalcParser.DIVIDE, i);
		}
		public TerminalNode TIMES(int i) {
			return getToken(CalcParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalcParser.TIMES); }
		public List<TerminalNode> DIVIDE() { return getTokens(CalcParser.DIVIDE); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); ((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDE) {
				{
				setState(167);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(159); match(TIMES);
					setState(160); ((FatorContext)_localctx).t2 = termo();
					((FatorContext)_localctx).result =  makeCompositeExpr(Functions.TIMES, _localctx.result, ((FatorContext)_localctx).t2.result);
					}
					break;
				case DIVIDE:
					{
					setState(163); match(DIVIDE);
					setState(164); ((FatorContext)_localctx).t2 = termo();
					((FatorContext)_localctx).result =  makeCompositeExpr(Functions.DIVIDE, _localctx.result, ((FatorContext)_localctx).t2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public Expr result;
		public AtomoContext a1;
		public AtomoContext a2;
		public AtomoContext atomo(int i) {
			return getRuleContext(AtomoContext.class,i);
		}
		public List<AtomoContext> atomo() {
			return getRuleContexts(AtomoContext.class);
		}
		public TerminalNode EXP(int i) {
			return getToken(CalcParser.EXP, i);
		}
		public List<TerminalNode> EXP() { return getTokens(CalcParser.EXP); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); ((TermoContext)_localctx).a1 = atomo();
			((TermoContext)_localctx).result =  ((TermoContext)_localctx).a1.result;
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				setState(174); match(EXP);
				setState(175); ((TermoContext)_localctx).a2 = atomo();
				((TermoContext)_localctx).result =  makeCompositeExpr(Funcionts.EXP, _localctx.result, ((TermoContext)_localctx).a2.result);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomoContext extends ParserRuleContext {
		public Expr result;
		public AtomoContext t;
		public ExprContext e;
		public Func_callContext f;
		public BoolContext b;
		public Token INTEGER;
		public Token FLOAT;
		public Token IDENT;
		public TerminalNode NOT() { return getToken(CalcParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CalcParser.INTEGER, 0); }
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CalcParser.PLUS, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(CalcParser.FLOAT, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atomo);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); match(MINUS);
				setState(184); ((AtomoContext)_localctx).t = atomo();
				((AtomoContext)_localctx).result =  makeCompositeExpr(Functions.UMINUS, ((AtomoContext)_localctx).t.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(PLUS);
				setState(188); ((AtomoContext)_localctx).t = atomo();
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).t.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(NOT);
				setState(192); ((AtomoContext)_localctx).t = atomo();
				((AtomoContext)_localctx).result =  makeCompositeExpr(Functions.NOT, ((AtomoContext)_localctx).t.result);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195); match(LPAR);
				setState(196); ((AtomoContext)_localctx).e = expr();
				setState(197); match(RPAR);
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).e.result;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200); ((AtomoContext)_localctx).f = func_call();
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).f.result;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203); ((AtomoContext)_localctx).b = bool();
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).b.result;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(206); ((AtomoContext)_localctx).INTEGER = match(INTEGER);
					((AtomoContext)_localctx).result =  makeInt((((AtomoContext)_localctx).INTEGER!=null?((AtomoContext)_localctx).INTEGER.getText():null));
					}
					break;
				case FLOAT:
					{
					setState(208); ((AtomoContext)_localctx).FLOAT = match(FLOAT);
					((AtomoContext)_localctx).result =  makeDecimal((((AtomoContext)_localctx).FLOAT!=null?((AtomoContext)_localctx).FLOAT.getText():null));
					}
					break;
				case IDENT:
					{
					setState(210); ((AtomoContext)_localctx).IDENT = match(IDENT);
					((AtomoContext)_localctx).result =  makeVariable((((AtomoContext)_localctx).IDENT!=null?((AtomoContext)_localctx).IDENT.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public Expr result;
		public TerminalNode FALSUM() { return getToken(CalcParser.FALSUM, 0); }
		public TerminalNode VERUM() { return getToken(CalcParser.VERUM, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case VERUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(VERUM);
				((BoolContext)_localctx).result =  makeBool(true);
				}
				break;
			case FALSUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(FALSUM);
				((BoolContext)_localctx).result =  makeBool(false);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public Expr result;
		public Token IDENT;
		public Arg_listContext a;
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); ((Func_callContext)_localctx).IDENT = match(IDENT);
			setState(223); match(LPAR);
			setState(224); ((Func_callContext)_localctx).a = arg_list();
			setState(225); match(RPAR);
			((Func_callContext)_localctx).result =  makeComposisteExpr(makeVariable((((Func_callContext)_localctx).IDENT!=null?((Func_callContext)_localctx).IDENT.getText():null)), ((Func_callContext)_localctx).a.args);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public List<Expr> args;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalcParser.COMMA, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg_list);

		    ((Arg_listContext)_localctx).args =  new LinkedList<>();

		int _la;
		try {
			setState(240);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LPAR:
			case LBRC:
			case PLUS:
			case MINUS:
			case NOT:
			case VERUM:
			case FALSUM:
			case IF:
			case WHILE:
			case INTEGER:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); ((Arg_listContext)_localctx).e1 = expr();
				_localctx.args.add(((Arg_listContext)_localctx).e1.result);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231); match(COMMA);
					setState(232); ((Arg_listContext)_localctx).e2 = expr();
					_localctx.args.add(((Arg_listContext)_localctx).e2.result);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\"\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tv\n\t"+
		"\f\t\16\ty\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b5\n\16\f\16\16\16\u00b8\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00d7\n\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\5\20\u00df\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00ee\n\22\f\22\16\22\u00f1\13\22\5\22\u00f3\n\22\3\22\2\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\2\u0102\2\'\3\2\2\2\4+\3\2\2\2\6@\3"+
		"\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fX\3\2\2\2\16d\3\2\2\2\20o\3\2\2\2\22z\3"+
		"\2\2\2\24\u008e\3\2\2\2\26\u0090\3\2\2\2\30\u009f\3\2\2\2\32\u00ae\3\2"+
		"\2\2\34\u00d8\3\2\2\2\36\u00de\3\2\2\2 \u00e0\3\2\2\2\"\u00f2\3\2\2\2"+
		"$%\5\4\3\2%&\b\2\1\2&(\3\2\2\2\'$\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2"+
		"\2*\3\3\2\2\2+,\5\6\4\2,-\7\r\2\2-.\b\3\1\2.\5\3\2\2\2/\60\7!\2\2\60\61"+
		"\7\16\2\2\61\62\5\6\4\2\62\63\b\4\1\2\63A\3\2\2\2\64\65\5\16\b\2\65\66"+
		"\b\4\1\2\66A\3\2\2\2\678\5\b\5\289\b\4\1\29A\3\2\2\2:;\5\n\6\2;<\b\4\1"+
		"\2<A\3\2\2\2=>\5\f\7\2>?\b\4\1\2?A\3\2\2\2@/\3\2\2\2@\64\3\2\2\2@\67\3"+
		"\2\2\2@:\3\2\2\2@=\3\2\2\2A\7\3\2\2\2BC\7\32\2\2CD\5\16\b\2DE\7\33\2\2"+
		"EF\5\6\4\2FG\b\5\1\2GQ\3\2\2\2HI\7\32\2\2IJ\5\16\b\2JK\7\33\2\2KL\5\6"+
		"\4\2LM\7\34\2\2MN\5\6\4\2NO\b\5\1\2OQ\3\2\2\2PB\3\2\2\2PH\3\2\2\2Q\t\3"+
		"\2\2\2RS\7\35\2\2ST\5\16\b\2TU\7\36\2\2UV\5\6\4\2VW\b\6\1\2W\13\3\2\2"+
		"\2X^\7\5\2\2YZ\5\4\3\2Z[\b\7\1\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\6\2\2bc\b\7\1\2c\r\3\2\2\2de\5"+
		"\20\t\2el\b\b\1\2fg\7\25\2\2gh\5\20\t\2hi\b\b\1\2ik\3\2\2\2jf\3\2\2\2"+
		"kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2nl\3\2\2\2op\5\22\n\2pw\b\t"+
		"\1\2qr\7\26\2\2rs\5\22\n\2st\b\t\1\2tv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3\2\2\2z{\5\26\f\2{\u0080\b\n\1\2|}\5\24"+
		"\13\2}~\5\26\f\2~\177\b\n\1\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\7\17\2\2\u0083\u008f\b\13\1\2\u0084"+
		"\u0085\7\20\2\2\u0085\u008f\b\13\1\2\u0086\u0087\7\21\2\2\u0087\u008f"+
		"\b\13\1\2\u0088\u0089\7\22\2\2\u0089\u008f\b\13\1\2\u008a\u008b\7\23\2"+
		"\2\u008b\u008f\b\13\1\2\u008c\u008d\7\24\2\2\u008d\u008f\b\13\1\2\u008e"+
		"\u0082\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0088\3\2"+
		"\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091"+
		"\5\30\r\2\u0091\u009c\b\f\1\2\u0092\u0093\7\7\2\2\u0093\u0094\5\30\r\2"+
		"\u0094\u0095\b\f\1\2\u0095\u009b\3\2\2\2\u0096\u0097\7\b\2\2\u0097\u0098"+
		"\5\30\r\2\u0098\u0099\b\f\1\2\u0099\u009b\3\2\2\2\u009a\u0092\3\2\2\2"+
		"\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\27\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\32\16\2\u00a0"+
		"\u00ab\b\r\1\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\b"+
		"\r\1\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\5\32\16\2\u00a7"+
		"\u00a8\b\r\1\2\u00a8\u00aa\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\31\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\34\17\2\u00af\u00b6\b\16"+
		"\1\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\b\16\1\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba"+
		"\7\b\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\b\17\1\2\u00bc\u00d9\3\2\2"+
		"\2\u00bd\u00be\7\7\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\b\17\1\2\u00c0"+
		"\u00d9\3\2\2\2\u00c1\u00c2\7\27\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4"+
		"\b\17\1\2\u00c4\u00d9\3\2\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\5\6\4\2"+
		"\u00c7\u00c8\7\4\2\2\u00c8\u00c9\b\17\1\2\u00c9\u00d9\3\2\2\2\u00ca\u00cb"+
		"\5 \21\2\u00cb\u00cc\b\17\1\2\u00cc\u00d9\3\2\2\2\u00cd\u00ce\5\36\20"+
		"\2\u00ce\u00cf\b\17\1\2\u00cf\u00d9\3\2\2\2\u00d0\u00d1\7\37\2\2\u00d1"+
		"\u00d7\b\17\1\2\u00d2\u00d3\7 \2\2\u00d3\u00d7\b\17\1\2\u00d4\u00d5\7"+
		"!\2\2\u00d5\u00d7\b\17\1\2\u00d6\u00d0\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00b9\3\2\2\2\u00d8\u00bd\3\2"+
		"\2\2\u00d8\u00c1\3\2\2\2\u00d8\u00c5\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8"+
		"\u00cd\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db\7\30\2"+
		"\2\u00db\u00df\b\20\1\2\u00dc\u00dd\7\31\2\2\u00dd\u00df\b\20\1\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00e1\7!\2\2"+
		"\u00e1\u00e2\7\3\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5"+
		"\b\21\1\2\u00e5!\3\2\2\2\u00e6\u00f3\3\2\2\2\u00e7\u00e8\5\6\4\2\u00e8"+
		"\u00ef\b\22\1\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec\b"+
		"\22\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00e7\3\2\2\2\u00f3#\3\2\2\2\24)@P^lw\u0080"+
		"\u008e\u009a\u009c\u00a9\u00ab\u00b6\u00d6\u00d8\u00de\u00ef\u00f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}