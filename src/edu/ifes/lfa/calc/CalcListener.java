// Generated from /home/jefferson/Dropbox/2018-2/lfa/workspace/Calc4/grammar/Calc.g4 by ANTLR 4.1
package edu.ifes.lfa.calc;

import java.util.List;
import java.util.LinkedList;
import static edu.ifes.lfa.calc.data.CalcFactory.*;
import edu.ifes.lfa.calc.data.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(@NotNull CalcParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(@NotNull CalcParser.BexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull CalcParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull CalcParser.BoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(@NotNull CalcParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(@NotNull CalcParser.ConjContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CalcParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(@NotNull CalcParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(@NotNull CalcParser.Rel_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull CalcParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull CalcParser.Func_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(@NotNull CalcParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(@NotNull CalcParser.Param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#block_expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expr(@NotNull CalcParser.Block_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#block_expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expr(@NotNull CalcParser.Block_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(@NotNull CalcParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(@NotNull CalcParser.Arg_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(@NotNull CalcParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(@NotNull CalcParser.If_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(@NotNull CalcParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(@NotNull CalcParser.AexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(@NotNull CalcParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(@NotNull CalcParser.Function_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull CalcParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull CalcParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expr(@NotNull CalcParser.While_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expr(@NotNull CalcParser.While_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#disj}.
	 * @param ctx the parse tree
	 */
	void enterDisj(@NotNull CalcParser.DisjContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#disj}.
	 * @param ctx the parse tree
	 */
	void exitDisj(@NotNull CalcParser.DisjContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterAtomo(@NotNull CalcParser.AtomoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitAtomo(@NotNull CalcParser.AtomoContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull CalcParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull CalcParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CalcParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CalcParser.ExprContext ctx);
}