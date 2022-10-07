
public class OutputTest_02 {

	public static void main(String[] args) {
		int x = 25, y = 3345;
		
		System.out.printf("x=%d, y=%,d%n", x, y);
		
		
		double a = 256.55, b = 3345.45678;	
		
		System.out.printf("a=%f, b=%f%n", a, b);
		System.out.printf("a=%.2f, b=%.2f%n", a, b);
		System.out.printf("a=%.3f, b=%,.2f%n", a, b);
		
		
		char ch = 'a';
		System.out.printf("character a = %c", ch);
		//System.out.printf("문자 a = %d%n", ch); //Exception : char -> 정수형에 대입
		System.out.printf("character a = %d%n", (int)ch);
		
		
		double discountRate = 10;
		//discountRate is 10%.
		System.out.printf("discount rate is %.0f%%", discountRate);
		
 }
}
