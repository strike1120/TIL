package global.sesoc.polygon;

public class MyPolygonTest {

	public static void main(String[] args) {
		MyCircle mc = new MyCircle(1, 1, 5);
		MyRectangle mr = new MyRectangle(0,0,4,5);
		MyTriangle mt = new MyTriangle(5,5,5,6);
		
		//println에 객체를 주면
		System.out.println(mc); //mc -> mc.toString()으로 내부적으로 자동으로 바뀜
		System.out.println(mr); //
		System.out.println(mt);
	}

}
