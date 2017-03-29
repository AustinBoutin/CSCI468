import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
	private Scope root;
	private Scope cur;
	
	public SymbolTable()
	{
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
	
	public void addSymbol(String type, String name, String value){
		Symbol s = new Symbol();
		s.name = name;
		s.type = type;
		s.value = value;
		cur.symbols.add(s);
	}
	
	public void moveCurToParent(){
		cur = cur.parent;
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
