import java.util.Scanner;

/*
[문제-11] 세 수의 정렬 (Option)
세 가지 수를 입력 받아, 
세 가지 수 중에 가장 큰 수부터 내림차순으로 정렬하여 출력하시오.
(단,삼항 연산자만 사용해야 하며, if문은 사용할 수 없다.)
(출력문은 프로그램 하단에 단 한 줄만 사용해야 한다.)
 */
public class practice_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1,num2,num3;
		int max, min, mid;
		
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		(num1>num2)&&(num1>num3)? max=num1 :"";
		(num2>num1)&&(num2>num3)? max=num2 :"";
		(num3>num1)&&(num3>num2)? max=num3 :"";
		
		(num1<num2)&&(num1<num3)? min=num1 :"";
		(num2<num1)&&(num2<num3)? min=num2 :"";
		(num3<num1)&&(num3<num2)? min=num3 :"";

		(num1<num2)&&(num1>num3)? mid=num1 :"";
		(num2<num1)&&(num2>num3)? mid=num2 :"";
		(num3<num1)&&(num3>num2)? mid=num3 :"";
		
		
		System.out.println(max,mid,min);
		
	}

}
