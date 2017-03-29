
public class Listener extends Little2BaseListener {
	@Override 
	public void enterStr(Little2Parser.StrContext ctx) {
		System.out.println(ctx.getText());
	}
}
