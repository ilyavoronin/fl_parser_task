// Generated from /home/ilya/hw/formal_lang/fl_task/src/main/anltr/PlangGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlangGrammarParser}.
 */
public interface PlangGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PlangGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PlangGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PlangGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PlangGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PlangGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PlangGrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#abody}.
	 * @param ctx the parse tree
	 */
	void enterAbody(PlangGrammarParser.AbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#abody}.
	 * @param ctx the parse tree
	 */
	void exitAbody(PlangGrammarParser.AbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PlangGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PlangGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#rhead}.
	 * @param ctx the parse tree
	 */
	void enterRhead(PlangGrammarParser.RheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#rhead}.
	 * @param ctx the parse tree
	 */
	void exitRhead(PlangGrammarParser.RheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#rbody}.
	 * @param ctx the parse tree
	 */
	void enterRbody(PlangGrammarParser.RbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#rbody}.
	 * @param ctx the parse tree
	 */
	void exitRbody(PlangGrammarParser.RbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#rrule}.
	 * @param ctx the parse tree
	 */
	void enterRrule(PlangGrammarParser.RruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#rrule}.
	 * @param ctx the parse tree
	 */
	void exitRrule(PlangGrammarParser.RruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#tar}.
	 * @param ctx the parse tree
	 */
	void enterTar(PlangGrammarParser.TarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#tar}.
	 * @param ctx the parse tree
	 */
	void exitTar(PlangGrammarParser.TarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlangGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PlangGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlangGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PlangGrammarParser.ProgContext ctx);
}