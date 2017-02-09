import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
   
public class LittleRunner 
{
    public static void main( String[] args) throws Exception 
    {

        ANTLRInputStream input = new ANTLRInputStream( System.in);

        LittleLexer lexer = new LittleLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LittleParser parser = new LittleParser(tokens);
        ParseTree tree = parser.r(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}