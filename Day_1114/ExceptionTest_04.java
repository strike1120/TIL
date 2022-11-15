import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest_04 {

	public static void main(String[] args) throws Exception {
		int[] ints = new int[5];
		Scanner keyin = new Scanner(System.in);

		try {
			for(int i=0; i<ints.length; ++i) {
	
				ints[i] = keyin.nextInt();
				if(!(10<=ints[i] && ints[i]<=20)) {
					// --i;
					// continue;
					throw new Exception("입력값이 범주를 벗어났습니다");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못된 문자열이 입력되었습니다");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}

