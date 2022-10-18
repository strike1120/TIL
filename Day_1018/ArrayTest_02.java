import java.util.Scanner;

//정수 변수 5개를 선언한 후 데이터를 입력받아 합계와 평균을 구하여 출력하시오

public class ArrayTest_02 {

	public static void main(String[] args) {
		
		int a,b,c,d,e,sum;
		double avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력: ");
		a = scan.nextInt();
		System.out.println("정수입력: ");
		b = scan.nextInt();
		System.out.println("정수입력: ");
		c = scan.nextInt();
		System.out.println("정수입력: ");
		d = scan.nextInt();
		System.out.println("정수입력: ");
		e = scan.nextInt();
		
		sum = a+b+c+d+e;
		avg = sum / 5.0;
		
		System.out.printf("합계: %,d, 평균: %.3f",sum,avg);
	}

}
