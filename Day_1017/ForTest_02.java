import java.util.Scanner;

public class ForTest_02 {

	public static void main(String[] args) {
		
		int fac=1, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("10미만의 정수값을 입력하세요");
		num = scan.nextInt();
		
		for(int j=2; j<=num; j++) {
			fac=1;
			for(int i=1; i<=j; i++) {
				fac = fac * i ; //1*1*2*3*4
			}
			System.out.println(j+"!= " + fac);
		}
}
}