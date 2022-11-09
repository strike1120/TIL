package v04;

public class MyRectangle implements Polygon {
	int x; //멤버들은 아래로 쓸것
	int y;
	int width;
	int height;

	@Override
	public void output() {
		System.out.println("x=" + x + ", y=" + y + ",width=" + width + ", height=" +height);
	}

}
