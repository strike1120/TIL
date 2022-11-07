package global.sesoc.polygon;

public class MyRectangle extends MyPoint implements Calc {
	private int width;
	private int height;
	
	public MyRectangle() {
		super();   
	}
	public MyRectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public MyRectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return this.width * this.height;
	}
	@Override
	public String toString() {
		String temp  = super.toString();
		String temp2 = String.format("%.2f", area());
		return  temp + ", width=" + width +", height=" + height 
				+" , area = " + temp2 ;
	}
}