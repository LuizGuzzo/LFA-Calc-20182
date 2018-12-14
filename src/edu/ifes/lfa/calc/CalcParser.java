// Generated from /home/jefferson/Dropbox/2018-2/lfa/workspace/Calc4/grammar/Calc.g4 by ANTLR 4.1
package edu.ifes.lfa.calc;

import java.util.List;
import java.util.LinkedList;
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
		DO=28, DEF=29, INTEGER=30, FLOAT=31, IDENT=32, STRING=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"','", "';'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", 
		"'||'", "'!'", "'true'", "'false'", "'if'", "'then'", "'else'", "'while'", 
		"'do'", "'def'", "INTEGER", "FLOAT", "IDENT", "STRING", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_function_decl = 2, RULE_param_list = 3, 
		RULE_expr = 4, RULE_if_expr = 5, RULE_while_expr = 6, RULE_block_expr = 7, 
		RULE_bexpr = 8, RULE_conj = 9, RULE_disj = 10, RULE_rel_op = 11, RULE_aexpr = 12, 
		RULE_fator = 13, RULE_termo = 14, RULE_atomo = 15, RULE_bool = 16, RULE_func_call = 17, 
		RULE_arg_list = 18;
	public static final String[] ruleNames = {
		"program", "statement", "function_decl", "param_list", "expr", "if_expr", 
		"while_expr", "block_expr", "bexpr", "conj", "disj", "rel_op", "aexpr", 
		"fator", "termo", "atomo", "bool", "func_call", "arg_list"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); ((ProgramContext)_localctx).s = statement();
				_localctx.sttms.add(((ProgramContext)_localctx).s.result);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRC) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << VERUM) | (1L << FALSUM) | (1L << IF) | (1L << WHILE) | (1L << DEF) | (1L << INTEGER) | (1L << FLOAT) | (1L << IDENT) | (1L << STRING))) != 0) );
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
		public Function_declContext f;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			switch (_input.LA(1)) {
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
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); ((StatementContext)_localctx).e = expr();
				setState(46); match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).e.result;
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); ((StatementContext)_localctx).f = function_decl();
				setState(50); match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).f.result;
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

	public static class Function_declContext extends ParserRuleContext {
		public Expr result;
		public Token IDENT;
		public Param_listContext p;
		public ExprContext e;
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEF() { return getToken(CalcParser.DEF, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(DEF);
			setState(56); ((Function_declContext)_localctx).IDENT = match(IDENT);
			setState(57); match(LPAR);
			setState(58); ((Function_declContext)_localctx).p = param_list();
			setState(59); match(RPAR);
			setState(60); ((Function_declContext)_localctx).e = expr();
			((Function_declContext)_localctx).result =  makeFunctionDecl((((Function_declContext)_localctx).IDENT!=null?((Function_declContext)_localctx).IDENT.getText():null), ((Function_declContext)_localctx).p.params, ((Function_declContext)_localctx).e.result);
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

	public static class Param_listContext extends ParserRuleContext {
		public List<String> params;
		public Token IDENT;
		public List<TerminalNode> COMMA() { return getTokens(CalcParser.COMMA); }
		public TerminalNode IDENT(int i) {
			return getToken(CalcParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(CalcParser.IDENT); }
		public TerminalNode COMMA(int i) {
			return getToken(CalcParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param_list);

		    ((Param_listContext)_localctx).params =  new LinkedList<>();

		int _la;
		try {
			setState(74);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); ((Param_listContext)_localctx).IDENT = match(IDENT);
				_localctx.params.add((((Param_listContext)_localctx).IDENT!=null?((Param_listContext)_localctx).IDENT.getText():null));
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(66); match(COMMA);
					setState(67); ((Param_listContext)_localctx).IDENT = match(IDENT);
					_localctx.params.add((((Param_listContext)_localctx).IDENT!=null?((Param_listContext)_localctx).IDENT.getText():null));
					}
					}
					setState(73);
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
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((ExprContext)_localctx).IDENT = match(IDENT);
				setState(77); match(GETS);
				setState(78); ((ExprContext)_localctx).e = expr();
				((ExprContext)_localctx).result =  makeAssign((((ExprContext)_localctx).IDENT!=null?((ExprContext)_localctx).IDENT.getText():null), ((ExprContext)_localctx).e.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); ((ExprContext)_localctx).b = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).b.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); ((ExprContext)_localctx).i = if_expr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).i.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87); ((ExprContext)_localctx).w = while_expr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).w.result;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90); ((ExprContext)_localctx).k = block_expr();
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
		enterRule(_localctx, 10, RULE_if_expr);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(IF);
				setState(96); ((If_exprContext)_localctx).b = bexpr();
				setState(97); match(THEN);
				setState(98); ((If_exprContext)_localctx).t = expr();
				((If_exprContext)_localctx).result =  makeIfThen(((If_exprContext)_localctx).b.result, ((If_exprContext)_localctx).t.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(IF);
				setState(102); ((If_exprContext)_localctx).b = bexpr();
				setState(103); match(THEN);
				setState(104); ((If_exprContext)_localctx).t = expr();
				setState(105); match(ELSE);
				setState(106); ((If_exprContext)_localctx).e = expr();
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
		enterRule(_localctx, 12, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(WHILE);
			setState(112); ((While_exprContext)_localctx).b = bexpr();
			setState(113); match(DO);
			setState(114); ((While_exprContext)_localctx).d = expr();
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
		enterRule(_localctx, 14, RULE_block_expr);

		    List<Expr> body = new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(LBRC);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRC) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << VERUM) | (1L << FALSUM) | (1L << IF) | (1L << WHILE) | (1L << DEF) | (1L << INTEGER) | (1L << FLOAT) | (1L << IDENT) | (1L << STRING))) != 0)) {
				{
				{
				setState(118); ((Block_exprContext)_localctx).s = statement();
				body.add(((Block_exprContext)_localctx).s.result);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126); match(RBRC);
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
		enterRule(_localctx, 16, RULE_bexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((BexprContext)_localctx).c1 = conj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).c1.result;
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(131); match(AND);
				setState(132); ((BexprContext)_localctx).c2 = conj();
				((BexprContext)_localctx).result =  makeCompositeExpr(Functions.AND, _localctx.result, ((BexprContext)_localctx).c2.result);
				}
				}
				setState(139);
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
		enterRule(_localctx, 18, RULE_conj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); ((ConjContext)_localctx).d1 = disj();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).d1.result;
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(142); match(OR);
				setState(143); ((ConjContext)_localctx).d2 = disj();
				((ConjContext)_localctx).result =  makeCompositeExpr(Functions.OR, _localctx.result, ((ConjContext)_localctx).d2.result);
				}
				}
				setState(150);
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
		enterRule(_localctx, 20, RULE_disj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); ((DisjContext)_localctx).a1 = aexpr();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).a1.result;
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << GT) | (1L << GEQ) | (1L << LT) | (1L << LEQ))) != 0)) {
				{
				setState(153); ((DisjContext)_localctx).o = rel_op();
				setState(154); ((DisjContext)_localctx).a2 = aexpr();
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
		enterRule(_localctx, 22, RULE_rel_op);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); match(EQU);
				((Rel_opContext)_localctx).op =  Functions.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(NEQ);
				((Rel_opContext)_localctx).op =  Functions.NEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(163); match(GT);
				((Rel_opContext)_localctx).op =  Functions.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(165); match(GEQ);
				((Rel_opContext)_localctx).op =  Functions.GEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 5);
				{
				setState(167); match(LT);
				((Rel_opContext)_localctx).op =  Functions.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(169); match(LEQ);
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
		enterRule(_localctx, 24, RULE_aexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); ((AexprContext)_localctx).f1 = fator();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).f1.result;
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(183);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(175); match(PLUS);
					setState(176); ((AexprContext)_localctx).f2 = fator();
					((AexprContext)_localctx).result =  makeCompositeExpr(Functions.PLUS, _localctx.result, ((AexprContext)_localctx).f2.result);
					}
					break;
				case MINUS:
					{
					setState(179); match(MINUS);
					setState(180); ((AexprContext)_localctx).f2 = fator();
					((AexprContext)_localctx).result =  makeCompositeExpr(Functions.MINUS, _localctx.result, ((AexprContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
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
		enterRule(_localctx, 26, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); ((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDE) {
				{
				setState(198);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(190); match(TIMES);
					setState(191); ((FatorContext)_localctx).t2 = termo();
					((FatorContext)_localctx).result =  makeCompositeExpr(Functions.TIMES, _localctx.result, ((FatorContext)_localctx).t2.result);
					}
					break;
				case DIVIDE:
					{
					setState(194); match(DIVIDE);
					setState(195); ((FatorContext)_localctx).t2 = termo();
					((FatorContext)_localctx).result =  makeCompositeExpr(Functions.DIVIDE, _localctx.result, ((FatorContext)_localctx).t2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
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
		enterRule(_localctx, 28, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); ((TermoContext)_localctx).a1 = atomo();
			((TermoContext)_localctx).result =  ((TermoContext)_localctx).a1.result;
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				setState(205); match(EXP);
				setState(206); ((TermoContext)_localctx).a2 = atomo();
				((TermoContext)_localctx).result =  makeCompositeExpr(Functions.EXP, _localctx.result, ((TermoContext)_localctx).a2.result);
				}
				}
				setState(213);
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
		public Token STRING;
		public Token IDENT;
		public TerminalNode INTEGER() { return getToken(CalcParser.INTEGER, 0); }
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CalcParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(CalcParser.FLOAT, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public TerminalNode NOT() { return getToken(CalcParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CalcParser.PLUS, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
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
		enterRule(_localctx, 30, RULE_atomo);
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); match(MINUS);
				setState(215); ((AtomoContext)_localctx).t = atomo();
				((AtomoContext)_localctx).result =  makeCompositeExpr(Functions.UMINUS, ((AtomoContext)_localctx).t.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(PLUS);
				setState(219); ((AtomoContext)_localctx).t = atomo();
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).t.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222); match(NOT);
				setState(223); ((AtomoContext)_localctx).t = atomo();
				((AtomoContext)_localctx).result =  makeCompositeExpr(Functions.NOT, ((AtomoContext)_localctx).t.result);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226); match(LPAR);
				setState(227); ((AtomoContext)_localctx).e = expr();
				setState(228); match(RPAR);
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).e.result;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231); ((AtomoContext)_localctx).f = func_call();
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).f.result;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234); ((AtomoContext)_localctx).b = bool();
				((AtomoContext)_localctx).result =  ((AtomoContext)_localctx).b.result;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(237); ((AtomoContext)_localctx).INTEGER = match(INTEGER);
					((AtomoContext)_localctx).result =  makeInt((((AtomoContext)_localctx).INTEGER!=null?((AtomoContext)_localctx).INTEGER.getText():null));
					}
					break;
				case FLOAT:
					{
					setState(239); ((AtomoContext)_localctx).FLOAT = match(FLOAT);
					((AtomoContext)_localctx).result =  makeDecimal((((AtomoContext)_localctx).FLOAT!=null?((AtomoContext)_localctx).FLOAT.getText():null));
					}
					break;
				case STRING:
					{
					setState(241); ((AtomoContext)_localctx).STRING = match(STRING);
					((AtomoContext)_localctx).result =  makeCharSeq((((AtomoContext)_localctx).STRING!=null?((AtomoContext)_localctx).STRING.getText():null));
					}
					break;
				case IDENT:
					{
					setState(243); ((AtomoContext)_localctx).IDENT = match(IDENT);
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
		enterRule(_localctx, 32, RULE_bool);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case VERUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); match(VERUM);
				((BoolContext)_localctx).result =  makeBool(true);
				}
				break;
			case FALSUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); match(FALSUM);
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
		enterRule(_localctx, 34, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); ((Func_callContext)_localctx).IDENT = match(IDENT);
			setState(256); match(LPAR);
			setState(257); ((Func_callContext)_localctx).a = arg_list();
			setState(258); match(RPAR);
			((Func_callContext)_localctx).result =  makeCompositeExpr(makeVariable((((Func_callContext)_localctx).IDENT!=null?((Func_callContext)_localctx).IDENT.getText():null)), ((Func_callContext)_localctx).a.args);
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
		enterRule(_localctx, 36, RULE_arg_list);

		    ((Arg_listContext)_localctx).args =  new LinkedList<>();

		int _la;
		try {
			setState(273);
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
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); ((Arg_listContext)_localctx).e1 = expr();
				_localctx.args.add(((Arg_listContext)_localctx).e1.result);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(264); match(COMMA);
					setState(265); ((Arg_listContext)_localctx).e2 = expr();
					_localctx.args.add(((Arg_listContext)_localctx).e2.result);
					}
					}
					setState(272);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ba\n\16"+
		"\f\16\16\16\u00bd\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00c9\n\17\f\17\16\17\u00cc\13\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00d4\n\20\f\20\16\20\u00d7\13\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f8"+
		"\n\21\5\21\u00fa\n\21\3\22\3\22\3\22\3\22\5\22\u0100\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u010f\n\24"+
		"\f\24\16\24\u0112\13\24\5\24\u0114\n\24\3\24\2\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\2\u0125\2+\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b"+
		"L\3\2\2\2\n_\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20w\3\2\2\2\22\u0083\3\2\2"+
		"\2\24\u008e\3\2\2\2\26\u0099\3\2\2\2\30\u00ad\3\2\2\2\32\u00af\3\2\2\2"+
		"\34\u00be\3\2\2\2\36\u00cd\3\2\2\2 \u00f9\3\2\2\2\"\u00ff\3\2\2\2$\u0101"+
		"\3\2\2\2&\u0113\3\2\2\2()\5\4\3\2)*\b\2\1\2*,\3\2\2\2+(\3\2\2\2,-\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\60\5\n\6\2\60\61\7\r\2\2\61\62\b"+
		"\3\1\2\628\3\2\2\2\63\64\5\6\4\2\64\65\7\r\2\2\65\66\b\3\1\2\668\3\2\2"+
		"\2\67/\3\2\2\2\67\63\3\2\2\28\5\3\2\2\29:\7\37\2\2:;\7\"\2\2;<\7\3\2\2"+
		"<=\5\b\5\2=>\7\4\2\2>?\5\n\6\2?@\b\4\1\2@\7\3\2\2\2AM\3\2\2\2BC\7\"\2"+
		"\2CI\b\5\1\2DE\7\f\2\2EF\7\"\2\2FH\b\5\1\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LA\3\2\2\2LB\3\2\2\2M\t\3\2\2\2NO\7\""+
		"\2\2OP\7\16\2\2PQ\5\n\6\2QR\b\6\1\2R`\3\2\2\2ST\5\22\n\2TU\b\6\1\2U`\3"+
		"\2\2\2VW\5\f\7\2WX\b\6\1\2X`\3\2\2\2YZ\5\16\b\2Z[\b\6\1\2[`\3\2\2\2\\"+
		"]\5\20\t\2]^\b\6\1\2^`\3\2\2\2_N\3\2\2\2_S\3\2\2\2_V\3\2\2\2_Y\3\2\2\2"+
		"_\\\3\2\2\2`\13\3\2\2\2ab\7\32\2\2bc\5\22\n\2cd\7\33\2\2de\5\n\6\2ef\b"+
		"\7\1\2fp\3\2\2\2gh\7\32\2\2hi\5\22\n\2ij\7\33\2\2jk\5\n\6\2kl\7\34\2\2"+
		"lm\5\n\6\2mn\b\7\1\2np\3\2\2\2oa\3\2\2\2og\3\2\2\2p\r\3\2\2\2qr\7\35\2"+
		"\2rs\5\22\n\2st\7\36\2\2tu\5\n\6\2uv\b\b\1\2v\17\3\2\2\2w}\7\5\2\2xy\5"+
		"\4\3\2yz\b\t\1\2z|\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\6\2\2\u0081\u0082\b\t\1\2\u0082"+
		"\21\3\2\2\2\u0083\u0084\5\24\13\2\u0084\u008b\b\n\1\2\u0085\u0086\7\25"+
		"\2\2\u0086\u0087\5\24\13\2\u0087\u0088\b\n\1\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\23\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0096"+
		"\b\13\1\2\u0090\u0091\7\26\2\2\u0091\u0092\5\26\f\2\u0092\u0093\b\13\1"+
		"\2\u0093\u0095\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\25\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\5\32\16\2\u009a\u009f\b\f\1\2\u009b\u009c\5\30\r\2\u009c\u009d"+
		"\5\32\16\2\u009d\u009e\b\f\1\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00ae"+
		"\b\r\1\2\u00a3\u00a4\7\20\2\2\u00a4\u00ae\b\r\1\2\u00a5\u00a6\7\21\2\2"+
		"\u00a6\u00ae\b\r\1\2\u00a7\u00a8\7\22\2\2\u00a8\u00ae\b\r\1\2\u00a9\u00aa"+
		"\7\23\2\2\u00aa\u00ae\b\r\1\2\u00ab\u00ac\7\24\2\2\u00ac\u00ae\b\r\1\2"+
		"\u00ad\u00a1\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a7"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\31\3\2\2\2\u00af"+
		"\u00b0\5\34\17\2\u00b0\u00bb\b\16\1\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3"+
		"\5\34\17\2\u00b3\u00b4\b\16\1\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\7\b\2"+
		"\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\b\16\1\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf"+
		"\5\36\20\2\u00bf\u00ca\b\17\1\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\36\20"+
		"\2\u00c2\u00c3\b\17\1\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5"+
		"\u00c6\5\36\20\2\u00c6\u00c7\b\17\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5 \21"+
		"\2\u00ce\u00d5\b\20\1\2\u00cf\u00d0\7\13\2\2\u00d0\u00d1\5 \21\2\u00d1"+
		"\u00d2\b\20\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\37\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\5 \21\2\u00da\u00db\b\21"+
		"\1\2\u00db\u00fa\3\2\2\2\u00dc\u00dd\7\7\2\2\u00dd\u00de\5 \21\2\u00de"+
		"\u00df\b\21\1\2\u00df\u00fa\3\2\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e2\5"+
		" \21\2\u00e2\u00e3\b\21\1\2\u00e3\u00fa\3\2\2\2\u00e4\u00e5\7\3\2\2\u00e5"+
		"\u00e6\5\n\6\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\b\21\1\2\u00e8\u00fa\3"+
		"\2\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\b\21\1\2\u00eb\u00fa\3\2\2\2\u00ec"+
		"\u00ed\5\"\22\2\u00ed\u00ee\b\21\1\2\u00ee\u00fa\3\2\2\2\u00ef\u00f0\7"+
		" \2\2\u00f0\u00f8\b\21\1\2\u00f1\u00f2\7!\2\2\u00f2\u00f8\b\21\1\2\u00f3"+
		"\u00f4\7#\2\2\u00f4\u00f8\b\21\1\2\u00f5\u00f6\7\"\2\2\u00f6\u00f8\b\21"+
		"\1\2\u00f7\u00ef\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00d8\3\2\2\2\u00f9\u00dc\3\2"+
		"\2\2\u00f9\u00e0\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9"+
		"\u00ec\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00fc\7\30\2\2"+
		"\u00fc\u0100\b\22\1\2\u00fd\u00fe\7\31\2\2\u00fe\u0100\b\22\1\2\u00ff"+
		"\u00fb\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100#\3\2\2\2\u0101\u0102\7\"\2\2"+
		"\u0102\u0103\7\3\2\2\u0103\u0104\5&\24\2\u0104\u0105\7\4\2\2\u0105\u0106"+
		"\b\23\1\2\u0106%\3\2\2\2\u0107\u0114\3\2\2\2\u0108\u0109\5\n\6\2\u0109"+
		"\u0110\b\24\1\2\u010a\u010b\7\f\2\2\u010b\u010c\5\n\6\2\u010c\u010d\b"+
		"\24\1\2\u010d\u010f\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0107\3\2\2\2\u0113\u0108\3\2\2\2\u0114\'\3\2\2\2\27-\67IL"+
		"_o}\u008b\u0096\u009f\u00ad\u00b9\u00bb\u00c8\u00ca\u00d5\u00f7\u00f9"+
		"\u00ff\u0110\u0113";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}