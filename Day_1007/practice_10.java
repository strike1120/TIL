import java.util.Scanner;

/*
[문제-10] 실수령액 구하기
기본급과 초과 근무 시간을 입력 받아, 실수령액을 구하는 프로그램을 작성하시오.
실수령액 = 기본급 + 시간수당 - 세금(기본급의 10%)
시간수당 = 초과근무시간 X 15000
 */
public class practice_10 {

	public static void main(String[] args) {
		int salary = 0, overtime = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("기본급을 입력해주세요");
		salary = scanner.nextInt();
		System.out.println("초과근무시간을 입력해주세요");
		overtime = scanner.nextInt();

		double tax,extraPay, netPay;
		extraPay = overtime * 15000;
		tax = salary * 0.1;
		netPay = salary + extraPay - tax;
		
		System.out.printf("실수령액: %,.0f",netPay);
	}

}
