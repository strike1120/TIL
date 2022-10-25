import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지 ");
		int menu = scan.nextInt();
		switch(menu) {
		case 1: 
			int add = add(a,b);
			System.out.println(add);
			break;
		case 2: 
			int minus = minus(a,b); 
			System.out.println(minus);
			break;
		case 3: 
			int multiply = multiply(a,b); 
			System.out.println(multiply);
			break;
		case 4: 
			int divide = divide(a,b); 
			System.out.println(divide);
			break;
		default: 
			System.out.println("프로그램 종료"); return;
		}
		
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int minus(int a, int b) {
		return a + b;
	}
	
	public static int multiply(int a, int b) {
		return a + b;
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}

}
