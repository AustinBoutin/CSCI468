import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileInputStream;
   
public class TokenizerRunner 
{
    public static void main( String[] args) throws Exception 
    {
    	File file = new File(args[0]);
    	FileInputStream fis = null;
    	try{
    		fis = new FileInputStream(file);
    		CharStream input = new ANTLRInputStream(fis);
	
	        TokenizerLexer lexer = new TokenizerLexer(input);
	
	        Vocabulary vocab = lexer.getVocabulary();
	
	        Token token = lexer.nextToken();
	        while(token.getType() != Token.EOF) {
	          System.out.println("Token Type: " + vocab.getSymbolicName(token.getType()) +
	                             "\nValue: " + token.getText());
	          token = lexer.nextToken();
	        }
	        fis.close();

	      } catch (Exception e) {
	        e.printStackTrace();
	      }
    }
}