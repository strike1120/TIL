
public class Exchange {
	static double data = 25; //클래스 변수
	double value =34.5; //인스턴스 변수
	
	public static void main(String[] args) {
		int x=10, y=20; //지역변수
		System.out.println("x="+x+","+"y:"+ y);
		
		//call by value : 원본 접근 불가!
		exchange(x,y);
		System.out.println("** Exchange Method");
		System.out.println("x="+x+","+"y:"+ y);
		System.out.println("인스턴스 변수 출력:" +data);
		
	}
	
	public static void exchange(int x, int y) {
		int temp;
		temp =x;
		x=y;
		y=temp;
		
		
	}

}
