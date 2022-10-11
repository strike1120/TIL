import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		String and,or,result;
		boolean four, five, onlyOne;
		
		System.out.print("정수입력:");
		num = scanner.nextInt();
		
		four = num % 4 == 0;
		five = num % 5 == 0;
		onlyOne = (four && !five) || (five && !four)?true:false;
		//4로만 나누어떨어지거나 5로만 나누어떨어지는 경우
		
		and = four && five ? "4와 5로 나누어집니다":"4와5로 나누어지지 않습니다"; 
		or = four || five ? "4또는 5로 나누어집니다":"4또는 5로 나누어떨어지지 않습니다";
		
		result = onlyOne && four ? "4로 나누어집니다.":"";
		result += onlyOne && five ? "\n5로 나누어집니다":"";
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(result);
		//프로그래밍에 정답은 없다 얻으려고 하는 결과값만 잘 나오면 된다
		
	}

}
