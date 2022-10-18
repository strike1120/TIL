/*
[문제-26]
정수 배열 10개를 선언하고 임의의 값을 입력받는다.
입력받은 배열의
가장 앞에 위치한 데이터와 마지막 위치의 데이터의 값을 교환
1번방 데이터와 마지막-1방 위치의 데이터 값 교환..

<실습결과>
데이터를 입력하시오: (10개 입력함)

바뀌기 전
5 3 8 10 12 4 1 22 34 2

바뀐 후
2 34 22 1 4 12 10 8 3 5
 */
import java.util.Scanner;

public class Exam_26 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		
		for(int i=0; i<a.length; ++i) {
			a[i] = scan.nextInt();
		}
		
		//출력
		for(int i=0; i<a.length; ++i)
			System.out.print(a[i]+" ");
		
		System.out.println();
		
		

		for(int i=a.length-1; i>=0; --i) {
			System.out.print(a[i]+" ");
	
		}
	}

}
