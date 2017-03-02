// Generated from Tokenizer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TokenizerParser}.
 */
public interface TokenizerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull TokenizerParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull TokenizerParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(@NotNull TokenizerParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(@NotNull TokenizerParser.TokenContext ctx);
}