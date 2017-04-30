import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
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
	        IRGenerator  listener = new  IRGenerator();
	        for(int i=0; i<parser.getErrorListeners().size(); i++){
	        	parser.removeErrorListener(parser.getErrorListeners().get(i));
	        }
	        ParseTreeWalker ptWalker = new  ParseTreeWalker ();
	        ptWalker.walk(listener ,parser.program());
	        SymbolTable s = listener.getSymbolTable();
	        //System.out.println(tokens.getTokens());
	        //s.printTable();
	        //System.out.println();
	        listener.printIR();
	        TinyGenerator tg = new TinyGenerator(listener.getIRList(), s);
	        tg.printTiny();
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

 