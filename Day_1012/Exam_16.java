import java.util.Scanner;

/*
[문제-16] if문을 이용한 정렬(To sort three random integers using the if statement)
정수 3개를 입력 받아 if문만 사용하여 오름차순으로 정렬하시오
(To sort in ascending order)
 */
public class Exam_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,temp;
		
		System.out.println("1번 정수:");
		a = scanner.nextInt();
		
		System.out.println("2번 정수:");
		b = scanner.nextInt();
		
		System.out.println("3번 정수:");
		c = scanner.nextInt();
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a + "," + b + "," + c);
	}

}
