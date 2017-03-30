import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
   
public class ParserRunner 
{
    public static void main( String[] args) throws Exception 
    {
    	File file = new File(args[0]);
    	FileInputStream fis = null;
    	try{
    		fis = new FileInputStream(file);
    		CharStream input = new ANTLRInputStream(fis);
	
	        Little2Lexer lexer = new Little2Lexer(input);
	
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        Little2Parser parser = new Little2Parser(tokens);
	        Listener  listener = new  Listener();
	        for(int i=0; i<parser.getErrorListeners().size(); i++){
	        	parser.removeErrorListener(parser.getErrorListeners().get(i));
	        }
	        new  ParseTreeWalker ().walk(listener ,parser.program());
	        SymbolTable s = listener.getSymbolTable();
	        s.printTable();
	        //prettyPrint(listener.getSymbolTable());
	        
	        /*parser.r();
	        if(parser.getNumberOfSyntaxErrors()>0){
	        	System.out.println("Not accepted");
	        }
	        else{
	        	System.out.println("Accepted");
	        }*/
	        fis.close();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
    }
}