import java.util.Scanner;

/*
[ 문제-21 ] 1~n 까지의 자연수의 합계 구하기
키보드로부터 정수를 입력 받아 1에서부터 입력 받은 수까지의 자연수의 합을 모두 구하여 출력하시오.

<실행 결과>
정수 입력 : 100
1~100까지 더한 값 : 5050
정수 입력 : 20
1~20까지 더한 값 : 210
 */
public class Exam_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value, sum=0, i=0;
		
		System.out.println("정수를 입력하세요");
		value = scan.nextInt();
		
		while(i<value) {
			
			i = i+1;
			sum = sum + i;
		}
		
		System.out.println("1~" + value + "까지 더한 값: " + sum);
	}

}
