
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
		//System.out.println(ctx.getText());
	}
	
	@Override 
	public void enterString_decl(Little2Parser.String_declContext ctx) {
		curId = IdType.STRING;
	}
	
	@Override 
	public void enterStr(Little2Parser.StrContext ctx) {
		//System.out.println(ctx.getText());
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
}
