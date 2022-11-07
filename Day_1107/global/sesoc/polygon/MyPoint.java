package global.sesoc.polygon;

public class MyPoint {
	private int x;
	private int y; //private -> 생성자, setter&getter, toString
	
	
	public MyPoint() {
		super();
	};
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
}
