// Generated from Tokenizer.g4 by ANTLR 4.6
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
	void enterR(TokenizerParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(TokenizerParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link TokenizerParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(TokenizerParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TokenizerParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(TokenizerParser.TokenContext ctx);
}