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
		Scanner sc = new Scanner(System.in);
		int a,b,c, temp;
		System.out.print("첫 번째 수: ");
		a = sc.nextInt();
		System.out.print("세 번째 수: ");
		b = sc.nextInt();
		System.out.print("두 번째 수: ");
		c = sc.nextInt();
		
		//두 수를 비교하여 a가 b보다 큰 값을 갖도록 정렬
		//Compare two numbers and sort so that a is greater than b
		temp = (b > a) ? a : 0; //a,b둘중 작은 값을 temp에 넣는다
		a = (temp != 0)? b : a;
		b = (temp !=0) ? temp : b;
		
		temp = 0;//temp값을 0으로 초기화
		temp = (c > a) ? a : 0; //a,c둘 중 더 작은 값을 temp에 넣는다
		a = (temp != 0)? c : a;
		c = (temp !=0) ? temp : c;
		
		temp = 0;//temp값을 0으로 초기화
		temp = (c > b) ? b : 0; //a,c둘 중 더 작은 값을 temp에 넣는다
		b = (temp != 0)? c : b;
		c = (temp !=0) ? temp : c;
		
		System.out.println(a+","+ b +"," + c);
	}

}
