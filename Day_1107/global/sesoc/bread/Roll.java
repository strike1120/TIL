package global.sesoc.bread;

public class Roll extends Bread {
	
	private int length;
	
	public Roll() {
		super();
	}
	
	public Roll(int length) {
		super();
		this.length = length;
	}


	public Roll(String name, int price, int length) {
		super(name, price);
		this.length = length;
	}


	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		String temp = super.toString();
		return temp +", 롤빵길이=" + this.length;
	}
}
