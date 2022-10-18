import java.util.Scanner;

//10보다 작은 정수값을 입력받아서 해당 갑까지의 factorial을 구하여 출력하시오
//2! = 2
//3! = 6
//4! = 24
public class WhileTest_02 {

	public static void main(String[] args) {
		
		int i=0, fac=1, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("10미만의 정수값을 입력하세요");
		num = scan.nextInt();
		
		while(i<num) {
			++i;
			fac = fac * i;
		}
		System.out.println(num+"!= " + fac);
	}

}
