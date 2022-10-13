import java.util.Scanner;

public class ForTest_01 {

	public static void main(String[] args) {

		int i=0; // i가 for문 밖에서도 필요할 때 이런식으로 사용한다.
		for(i=0; i<10; ++i) {
			System.out.print(i + " ");
		}

		//System.out.println("end :" + i); //오류발생 : i는 for문안에서만 사용가능한 지역변수 

		System.out.println("");
		
		//1~20짝수만 출력
		for(i=0; i<20; i+=2) {
			System.out.print(i+2 + " ");
		}

		System.out.println();

		//1~20 홀수만 출력
		for(i=1; i<20; i+=2) {
			System.out.print(i + " ");		
		}

		//1~20까지 3의배수 이거나 5의 배수만 출력

		for(i=1; i<=20; ++i) {
			if((i % 3 ==0) || (i % 5 == 0))
				System.out.print(i + " ");
		}

		System.out.println();
		//정수변수 value 선언, 입력받는다.
		//value는 100을 초과하거나 음수가 입력되면 종료
		//value값이 소수인지 확인 
		//소수 : 1과 자기자신 외의 모든 자연수와 나누어떨어지지 않는 수
		//입력된 value값
		//소수인지 아닌지 판별하는 프로그램 (소수가 아니면 프로그램 종료)
		int value=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("100이하의정수 입력");
		value = scan.nextInt();
		
		if(value < 0 || value > 100) {
			System.out.println("잘못된값이 입력되었음");
			System.exit(0); //early stopping (맨위에서 해야함)
		}
		
		if(value == 1) {
			System.out.println("소수가 아님");
			System.exit(0);
		}
		
		for(i=2; i<value; i++) {
			if(value % i == 0) {
				System.out.println("소수 아님");
				System.exit(0);
			}
		}
			
		
		System.out.println("소수다");

	}
}