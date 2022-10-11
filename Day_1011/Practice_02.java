import java.util.Scanner;

// 정수값을 입력받아 짝수인지 홀수인지 판별하는 프로그램.
// A program that receives an integer value 
// and determines whether it is even or odd.
public class Practice_02 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력: ");
			int a = scan.nextInt();
			
			if(a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			
		}
	}

}
