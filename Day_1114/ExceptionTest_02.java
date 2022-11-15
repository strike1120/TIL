import java.util.InputMismatchException;
import java.util.Scanner;

//사용자에게 입력받은 정보로 인한 오류를 처리하기

public class ExceptionTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int count = 0; //귤의 개수를 세는 변수
		int weight = 0; //귤의 무게를 입력받는 변수
		
		
		while(true) {
			System.out.print("귤의 크기: ");
			try {
				weight = keyin.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("입력오류");
				keyin.nextLine(); //버퍼를 비운다.
				continue;
			}
			if(10 <= weight && weight <=15) {
				System.out.println("1개포장완료");
				++count;
			} 
			System.out.println(count+"개 포장"); //if와 상관없이 항상 출력
			
			if( count == 5)
				break;
			
		}
		System.out.println("포장완료");
	}

}
