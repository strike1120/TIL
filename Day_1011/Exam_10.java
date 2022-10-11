import java.util.Scanner;

/*
[문제-10] 실수령액 구하기
기본급과 초과 근무 시간을 입력 받아, 실수령액을 구하는 프로그램을 작성하시오.
실수령액 = 기본급 + 시간수당 - 세금(기본급의 10%)
시간수당 = 초과근무시간 X 15000
 */ 
public class Exam_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic, overtime; // 기본급, 초과근무시간
		double total; //실수령액

		System.out.println("기본급: ");
		basic = sc.nextInt();
		System.out.println("초과근무시간: ");
		overtime = sc.nextInt();
		
		total = basic * 0.9 + (overtime * 15000);
		System.out.printf("실수령액: %,d%n", (int)total);

	}

}
