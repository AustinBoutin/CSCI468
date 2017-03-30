import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
	private Scope root;
	private Scope cur;
	private Symbol curSym;
	
	public SymbolTable(){
		root = new Scope();
		root.name = "GLOBAL";
		root.children = new ArrayList<Scope>();
		cur = root;
	}
	
	public void addScope(String name){
		Scope s = new Scope();
		s.name = name;
		s.parent = cur;
		s.children = new ArrayList<Scope>();
		cur.children.add(s);
		cur = s;
	}
	
	public void addSymbol(String type, String name){
		Symbol s = new Symbol();
		s.name = name;
		s.type = type;
		curSym = s;
		if(!type.equals("STRING")){
			setSymbolValue(null);
		}
	}
	
	public void setSymbolValue(String value){
		curSym.value = value;
		cur.symbols.add(curSym);
	}
	
	public void moveCurToParent(){
		cur = cur.parent;
	}
	
	public void printTable(){
		printTable(root);
	}
	
	public void printTable(Scope curScope){
		System.out.println("Symbol tabel " + curScope.name);
		
		for(Symbol symbol : curScope.symbols){
			if(symbol.type.equals("STRING")){
				System.out.println("name " + symbol.name + " type " + symbol.type + " value" + symbol.value);
			} else {
				System.out.println("name " + symbol.name + " type " + symbol.type);
			}
		}
		
		for(Scope child : curScope.children){
			System.out.println();
			printTable(child);
		}
	}
	
	public static class Scope {
		private String name;
		private Scope parent;
		private List<Scope> children;
		private List<Symbol> symbols = new ArrayList<Symbol>();
	}
	
	public static class Symbol{
		private String name;
		private String type;
		private String value;
	}
}
