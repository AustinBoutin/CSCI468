import java.util.ArrayList;
import java.util.HashMap;


public class TinyGenerator {
	ArrayList<TinyNode> tinyList = new ArrayList<TinyNode>();
	SymbolTable s;
	int curReg = 0;
	int curLabel = 1;
	HashMap<String, String> regHash = new HashMap<String, String>();
	HashMap<String, String> labHash = new HashMap<String, String>();
	public TinyGenerator(ArrayList<IRNode> irList, SymbolTable s){
		this.s = s;
		for(SymbolTable.Symbol sym : s.getRootScope()){
			if(sym.getType() == "INT" || sym.getType()=="FLOAT"){
				tinyList.add(new TinyNode("var", sym.getName(),""));
			}
			else{
				tinyList.add(new TinyNode("str", sym.getName(), sym.getValue()));
			}
		}
		for(IRNode ir : irList){
			ir = convertRegs(ir);
			switch(ir.getOp()){
				case("LABEL"):
					tinyList.add(new TinyNode("label", convertLabel(ir.getR1()),""));
					break;
				case("STOREI"):
					if(ir.getR1().charAt(0)=='r'){
						tinyList.add(new TinyNode("move", ir.getR1(),ir.getR3()));
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR1(),"r"+curReg));
						tinyList.add(new TinyNode("move", "r"+curReg, ir.getR3()));
						curReg++;
					}
					break;
				case("STOREF"):
					if(ir.getR1().charAt(0)=='r'){
						tinyList.add(new TinyNode("move", ir.getR1(),ir.getR3()));
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR1(),"r"+curReg));
						tinyList.add(new TinyNode("move", "r"+curReg, ir.getR3()));
						curReg++;
					}
					break;
				case("READI"):
					tinyList.add(new TinyNode("sys", "readi", ir.getR1()));
					break;
				case("READF"):
					tinyList.add(new TinyNode("sys", "readr", ir.getR1()));
					break;
				case("WRITEI"):
					tinyList.add(new TinyNode("sys", "writei", ir.getR1()));
					break;
				case("WRITEF"):
					tinyList.add(new TinyNode("sys", "writer", ir.getR1()));
					break;
				case("WRITES"):
					tinyList.add(new TinyNode("sys", "writes", ir.getR1()));
					break;
				case("ADDI"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("addi", ir.getR2(), ir.getR3()));
					break;
				case("ADDF"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("addr", ir.getR2(), ir.getR3()));
					break;
				case("SUBI"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("subi", ir.getR2(), ir.getR3()));
					break;
				case("SUBF"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("subr", ir.getR2(), ir.getR3()));
					break;
				case("MULTI"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("muli", ir.getR2(), ir.getR3()));
					break;
				case("MULTF"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("mulr", ir.getR2(), ir.getR3()));
					break;
				case("DIVI"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("divi", ir.getR2(), ir.getR3()));
					break;
				case("DIVF"):
					tinyList.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					tinyList.add(new TinyNode("divr", ir.getR2(), ir.getR3()));
					break;
				case("GT"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpi", ir.getR1(), "r"+curReg));
						curReg++;
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpr", ir.getR1(), "r"+curReg));
						curReg++;
					}
					tinyList.add(new TinyNode("jgt", convertLabel(ir.getR3()), ""));
					break;
				case("GE"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpi", ir.getR1(), "r"+curReg));
						curReg++;
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpr", ir.getR1(), "r"+curReg));
						curReg++;
					}
					tinyList.add(new TinyNode("jge", convertLabel(ir.getR3()), ""));
					break;
				case("LT"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpi", ir.getR1(), "r"+curReg));
						curReg++;
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpr", ir.getR1(), "r"+curReg));
						curReg++;
					}
					tinyList.add(new TinyNode("jlt", convertLabel(ir.getR3()), ""));
					break;
				case("LE"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpi", ir.getR1(), "r"+curReg));
						curReg++;
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpr", ir.getR1(), "r"+curReg));
						curReg++;
					}
					tinyList.add(new TinyNode("jle", convertLabel(ir.getR3()), ""));
					break;
				case("NE"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpi", ir.getR1(), "r"+curReg));
						curReg++;
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpr", ir.getR1(), "r"+curReg));
						curReg++;
					}
					tinyList.add(new TinyNode("jne", convertLabel(ir.getR3()), ""));
					break;
				case("EQ"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpi", ir.getR1(), "r"+curReg));
						curReg++;
					}
					else{
						tinyList.add(new TinyNode("move", ir.getR2(),"r"+curReg));
						tinyList.add(new TinyNode("cmpr", ir.getR1(), "r"+curReg));
						curReg++;
					}
					tinyList.add(new TinyNode("jeq", convertLabel(ir.getR3()), ""));
					break;
				case("JUMP"):
					tinyList.add(new TinyNode("jmp", convertLabel(ir.getR3()),""));
					break;
			}
		}
		tinyList.add(new TinyNode("sys", "halt", ""));
	}
	private String getTypeOfSymbol(String sym){
		for(SymbolTable.Symbol sm : s.getRootScope()){
			if(sm.getName().equals(sym)){
				return sm.getType();
			}
		}
		if(sym.contains(".")){
			return "FLOAT";
		}
		else{
			return "INT";
		}
	}
	
	public void printTiny(){
		for(TinyNode n : tinyList){
			String p = n.op + " " + n.r1;
			if(!n.r2.equals("")){
				p += " " + n.r2; 
			}
			System.out.println(p);
		}
	}
	
	private IRNode convertRegs(IRNode ir){
		if(!ir.getR1().equals("") && ir.getR1().charAt(0) == 'T'){
			if(!regHash.containsKey(ir.getR1())){
				regHash.put(ir.getR1(), "r"+curReg);
				curReg++;
			}
			ir.setR1(regHash.get(ir.getR1()));
		}
		if(!ir.getR2().equals("") && ir.getR2().charAt(0) == 'T'){
			if(!regHash.containsKey(ir.getR2())){
				regHash.put(ir.getR2(), "r"+curReg);
				curReg++;
			}
			ir.setR2(regHash.get(ir.getR2()));
		}
		if(!ir.getR3().equals("") && ir.getR3().charAt(0) == 'T'){
			if(!regHash.containsKey(ir.getR3())){
				regHash.put(ir.getR3(), "r"+curReg);
				curReg++;
			}
			ir.setR3(regHash.get(ir.getR3()));
		}
		return ir;
	}
	
	private String convertLabel(String label){
		if(label.equals("main")){
			return "main";
		}
		if(!labHash.containsKey(label)){
			labHash.put(label, "label"+curLabel);
			curLabel++;
		}
		return labHash.get(label);
	}
	
	
	public class TinyNode{
		String op, r1,r2;
		public TinyNode(String op, String r1, String r2){
			this.op = op;
			this. r1 = r1;
			this.r2 = r2;
		}
	}
}
