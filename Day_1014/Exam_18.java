import java.util.Scanner;

/*
[ 문제-18 ] while과 if를 이용하여 약수 구하기
정수를 입력 받아 약수를 모두 출력하는 프로그램을 작성하시오

<실행 결과>
정수를 입력 하세요.64
1
2
4
8
16
32
64
 */
public class Exam_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=1, num, result=0;
		System.out.println("정수를 입력하세요");
		num = scan.nextInt();
		
		while(i<=num) {
			if(num % i == 0) {
				result = i ;
				System.out.println(result);
				++i;
			} else
				++i;
			
		}
		
	}

}
