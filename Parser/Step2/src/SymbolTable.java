import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
	private Scope root;
	private Scope cur;
	private Symbol curSym;
	private boolean isError = false;
	private List<String> errorList = new ArrayList<String>();
	
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
		boolean exists = false;
		for(Symbol sym: cur.symbols){
			if(sym.name.equals(name)){
				isError = true;
				errorList.add(name);
			}
		}
		if(!exists){
			Symbol s = new Symbol();
			s.name = name;
			s.type = type;
			curSym = s;
			if(!type.equals("STRING")){
				setSymbolValue(null);
			}
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
		if(!isError){
			printTable(root);
		}
		else{
			System.out.println("DECLARATION ERROR " + errorList.get(0));
		}
	}
	
	public void printTable(Scope curScope){
		if(curScope.equals(root)){
			System.out.print("Symbol table " + curScope.name);
		} else {
			System.out.print("\nSymbol table " + curScope.name);
		}
		
		for(Symbol symbol : curScope.symbols){
			if(symbol.type.equals("STRING")){
				System.out.print("\nname " + symbol.name + " type " + symbol.type + " value " + symbol.value);
			} else {
				System.out.print("\nname " + symbol.name + " type " + symbol.type);
			}
		}
		
		for(Scope child : curScope.children){
			System.out.println();
			printTable(child);
		}
	}
	
	public List<Symbol> getRootScope(){
		return root.symbols;
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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
}
