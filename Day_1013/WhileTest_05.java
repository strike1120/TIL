import java.util.Scanner;

public class WhileTest_05 {

	public static void main(String[] args) {
		//1~9 출력
		//정수 value변수와 scanner선언
		//value변수에 정수를 입력받는다
		//ex) 5를 입력했으면 ==> 위의 i변수와 함께 사용해서 구구단 5단 출력
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		value = scan.nextInt();
		int i = 1;
		while(i<10) {
			System.out.println(value+"*"+ i + "=" + value * i);
			i = i+1;
		}
		
	}

}