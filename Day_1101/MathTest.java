
public class MathTest {

	public static void main(String[] args) {
		//static double abs(double a)
				//static으로 선언되면? -> 클래스명.메소드명();
				
				//static double ceil(double a) - 올림하는 메소드
				double result1 = Math.ceil(33.3);
				System.out.println(result1);
				
				
				//static double floor(double a) - 소수점을 버려주는 메소드
				System.out.println(Math.floor(56.7890));
				
				//static int max(int a, int b)
				System.out.println(Math.max(10, 9));
				//max()는 두 수 중 큰 값을 뱉는다 
				
				//static double pow(double a, double b) - a^b(a의b제곱)하는 메소드
				System.out.println(Math.pow(2.0, 3.0));
				
				//static double random() - 0~1사이의 랜덤값을 발생시키는 메소드
				System.out.println(Math.random());
				
				//static long round(double a) - 반올림하는 메소드
				System.out.println(Math.round(23.23));
				
				//static double sqrt(double a) - 제곱근을 구하는 메소드
				System.out.println(Math.sqrt(25.0));
	}

}
