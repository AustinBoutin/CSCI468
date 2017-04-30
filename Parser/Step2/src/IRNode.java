
public class IRNode {
	private String op, r1, r2, r3;
	public IRNode(String op, String r1, String r2, String r3){
		this.op = op;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String getR1() {
		return r1;
	}
	public void setR1(String r1) {
		this.r1 = r1;
	}
	public String getR2() {
		return r2;
	}
	public void setR2(String r2) {
		this.r2 = r2;
	}
	public String getR3() {
		return r3;
	}
	public void setR3(String r3) {
		this.r3 = r3;
	}
}
