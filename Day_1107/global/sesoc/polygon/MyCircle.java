package global.sesoc.polygon;

public class MyCircle extends MyPoint implements Calc {
//public, protected만 상속
	private int radius;
	
	public MyCircle() {
		super(); //x,y,radius 모두 0으로 초기화됨. 하위클래스를 생성할때는 무조건 부모부터 생성
	}
	

	public MyCircle(int radius) {
		super();
		this.radius = radius; //전달받은 값으로 초기화됨.
	}
	
	public MyCircle(int x, int y, int radius) {
		super(x, y); //부모의 기본생성자를 호출
		this.radius = radius; //전달받은 값으로 초기화됨.
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int Radius) {
		this.radius = radius;
	}



	//부모클래스(MyPoint)의 setter,getter, toString()
	//부모인터페이스(Calc) area()
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	@Override
	public String toString() {
		String temp = super.toString();
		String temp2 = String.format("%.2f", area()) ;
		return temp + "radius=" + radius +", area =" + temp2;
		
	}

}
