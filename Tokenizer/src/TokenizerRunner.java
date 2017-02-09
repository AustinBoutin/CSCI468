import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
   
public class TokenizerRunner 
{
    public static void main( String[] args) throws Exception 
    {

        ANTLRInputStream input = new ANTLRInputStream( System.in);

        TokenizerLexer lexer = new TokenizerLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TokenizerParser parser = new TokenizerParser(tokens);
        ParseTree tree = parser.r(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}