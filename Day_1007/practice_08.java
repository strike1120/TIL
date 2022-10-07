import java.util.Scanner;

/*
[ 문제-8 ] 나누어 떨어지는 수 구하기
키보드로 정수를 입력 받아, 
4와 5로 나누어 떨어지는 지의 여부를 구하는 프로그램을 작성하시오
 */
public class practice_08 {

	public static void main(String[] args) {
		int a;
		String result1,result2,result3,result4;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		a = scanner.nextInt();
	    //---------------------------------------------------
		
		result1 = (a % 4 == 0) && (a % 5 == 0)? "4와 5로 나누어 집니다" :"4와 5로 나누어지지 않습니다";
		result2 = (a % 4 == 0) || (a % 5 == 0)? "4또는 5로 나누어 집니다" : "";
		result3 = (a % 4 == 0) ? "4로 나누어집니다": "";
		result4 = (a % 5 == 0) ? "5로 나누어집니다": "";
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
	}

}
