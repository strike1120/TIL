import java.util.Scanner;

public class Method_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 2개 입력: ");
		int a =scan.nextInt(), b=scan.nextInt();
		add(a,b); //호출하는 쪽의 값(argument)
		minus(b, a);
		
		System.out.println("End");
	}
	
	
	public static void add(int value1, int value2) { //매개변수(parameter)
		int result = value1 + value2;
		System.out.println("결과: "+result);
	}
	
	public static void minus(int value1, int value2) { //매개변수는 위치가 중요.입력된 순서대로 대입됨
		int result = value1 - value2;
		System.out.println("결과: " + result);
	}
	

}
