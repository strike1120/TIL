import java.util.Scanner;

public class OutputTest_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		double y;
		String str;
		
		System.out.println("정수입력: ");
		x = scanner.nextInt(); //입력받은 값을 정수형태로 x에 대입해라
		
		System.out.println("실수입력: ");
		y = scanner.nextDouble();
		
		System.out.println("문자열입력: ");
		str = scanner.next(); //next()-단어단위 nextLine()-줄단위
		
		System.out.printf("%d %f %s %n", x, y, str);
		
	}

}
