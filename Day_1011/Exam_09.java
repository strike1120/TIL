import java.util.Scanner;

/*
[ 문제-9 ] 자릿수 합계 구하기
키보드로 0 부터 999까지의 정수를 입력 받은 수
각각의 자릿수의 합한 결과를 출력하는 프로그램을 작성하시오
(단,  사용자가 입력한 수는 999를 넘지 않는 것으로 한다.)
 */
public class Exam_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number, digit, decimal, hundred;
		
		System.out.println("0~999 중 정수를 입력하세요"); 
		number = scanner.nextInt();
		
		hundred = number / 100; //100으로 나눈 몫
		decimal = number % 100 / 10; 
		digit = number % 100 % 10;
		
		System.out.println(hundred + decimal + digit);
		

	}

}
