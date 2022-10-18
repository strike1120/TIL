import java.util.Scanner;

public class ArrayTest_01 {

	public static void main(String[] args) {
		
		int[] a = new int[3]; //a는 메모리상 위치값(hash값)만 가지고 있음
		int sum = 0;
		double avg;
		Scanner scan = new Scanner(System.in);
		
		
		//입력
		for(int i=0; i<a.length; ++i) {
			System.out.println("정수 입력:");
			a[i] = scan.nextInt();
		}
		
		//처리
		for(int i=0; i<a.length; ++i) {
			sum = sum + a[i];
		}
		
		avg = (double)sum / a.length;
		
		//출력
		for(int i=0; i<a.length; ++i) {
			System.out.print(a[i]+" ");
		}
		System.out.printf("합계: %d점, 평균: %.2f점", sum, avg);
			
	}

}
