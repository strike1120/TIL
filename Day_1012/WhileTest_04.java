import java.util.Scanner;

/*
정수 2개를 입력받는다.
이때 첫번째 정수는 두번째 보다 작아야한다.

Two integers are input.
At this time, the first integer must be less than the second.
 */

public class WhileTest_04 {

	public static void main(String[] args) {
		int start, end;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1 입력");
		start = scan.nextInt();
		System.out.println("정수2 입력");
		end = scan.nextInt();
		
		
		while(start < end+1) { // 조건식
			System.out.print(start + " ");
			start = start + 1; // 증감식
			if((start % 5 == 0) && (start >= 10)) {
				System.out.println("");
			}
		
		}
		

	}

}
