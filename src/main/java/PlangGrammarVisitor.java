// Generated from /home/ilya/hw/formal_lang/fl_task/src/main/java/PlangGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlangGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlangGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(PlangGrammarParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PlangGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PlangGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(PlangGrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#abody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbody(PlangGrammarParser.AbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PlangGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#rhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhead(PlangGrammarParser.RheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#rbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbody(PlangGrammarParser.RbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#rrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRrule(PlangGrammarParser.RruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#tar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTar(PlangGrammarParser.TarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlangGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PlangGrammarParser.ProgContext ctx);
}