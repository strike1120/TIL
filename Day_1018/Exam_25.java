/*
size라는 이름의 정수변수를 선언한후 정수를 입력받는다

size는 정수배열의 크기이다

배열에 자연수 1~방크기 값까지 넣어 출력하시오
 */
import java.util.Scanner;

public class Exam_25 {

	public static void main(String[] args) {
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		size = scan.nextInt();
		
		int[] numbers = new int[size];
		
		//처리
		for(int i=0; i<numbers.length; ++i) {
			numbers[i] = i+1;
		}
		
		//출력
		System.out.println("배열의 크기:"+size);
		for(int i=0; i<numbers.length; ++i) {
			System.out.println("numbers[" + i + "]" + "=" +numbers[i]);
		}
		
	}

}
