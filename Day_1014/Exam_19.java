import java.util.Scanner;

/*
[ 문제-19 ] while문을 이용한 횟수 구하기
반복적으로 값을 입력받아 합계를 구하여 
그 합계가 100을 초과하기까지 몇 번의 입력이 있었는지 횟수를 세는 프로그램을 작성하시오

<실행결과>
정수 입력 : 12
현재까지 합계 : 12
정수 입력 : 63
현재까지 합계 : 75
정수 입력 : 12
현재까지 합계 : 87
정수 입력 : 56
현재까지 합계 : 143
총 4회 입력을 받았습니다.

 */
public class Exam_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value, sum=0, cnt=0;
		
		while(sum < 101) {
			System.out.println("정수를 입력하세요");
			value = scan.nextInt();
		
			sum = sum + value;
			System.out.println("현재까지의 합계:" + sum);
			
			cnt = cnt + 1;
		}
		System.out.printf("총 %d회 입력을 받았습니다%n", cnt);

		
	}

}
