
public class Listener extends Little2BaseListener {
	SymbolTable s = new SymbolTable();
	int currentBlock = 1;
	public enum IdType{
		FUNC, STRING, INT, FLOAT, NONE;
	}
	
	IdType curId = IdType.NONE;
	
	@Override 
	public void enterId(Little2Parser.IdContext ctx) {
		switch(curId){
			case FUNC:
				s.addScope(ctx.getText());
				break;
			case STRING: case INT: case FLOAT:
				s.addSymbol(curId.name(), ctx.getText());
				break;
			case NONE:
				break;
		}
	}
	
	@Override 
	public void enterFunc_decl(Little2Parser.Func_declContext ctx) {
		curId = IdType.FUNC;
	}
	
	@Override 
	public void exitFunc_decl(Little2Parser.Func_declContext ctx) {
		s.moveCurToParent();
	}
	
	@Override 
	public void enterString_decl(Little2Parser.String_declContext ctx) {
		curId = IdType.STRING;
	}
	
	@Override 
	public void enterStr(Little2Parser.StrContext ctx) {
		s.setSymbolValue(ctx.getText());
	}
	
	@Override 
	public void enterVar_type(Little2Parser.Var_typeContext ctx) { 
		if(ctx.getText().equals("INT")){
			curId = IdType.INT;
		}
		else if(ctx.getText().equals("FLOAT")){
			curId = IdType.FLOAT;
		}
	}
	
	@Override 
	public void enterIf_stmt(Little2Parser.If_stmtContext ctx) {
		s.addScope("Block " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitIf_stmt(Little2Parser.If_stmtContext ctx) {
		s.moveCurToParent();
	}
	
	@Override 
	public void enterElse_part(Little2Parser.Else_partContext ctx) { 
		s.addScope("Block " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitElse_part(Little2Parser.Else_partContext ctx) {
		s.moveCurToParent();
	}
	
	@Override 
	public void enterWhile_stmt(Little2Parser.While_stmtContext ctx) {
		s.addScope("Block " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitWhile_stmt(Little2Parser.While_stmtContext ctx) {
		s.moveCurToParent();
	}
	
	public SymbolTable getSymbolTable(){
		return s;
	}
}
