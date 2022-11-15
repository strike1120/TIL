import java.util.Scanner;

public class ExceptionTest_03 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int x,y;
		
		System.out.println("두 개의 정수를 입력하세요");
		x = keyin.nextInt();
		y = keyin.nextInt();
		
		try {
			int result = calc(x,y);
			System.out.println("결과: " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static int calc(int x, int y) throws Exception { //예외가 발생하면 호출했던 곳으로 던져서 그 쪽에서 해결하도록 함
		//y는 0을 초과하는 값이어야 한다!
		if(y <= 0) {
			throw new Exception("y는 0을 초과해야합니다");//익셉션 객체를 만들어서 자바가상머신에게 던진다
			//return 0; //호출한 쪽에서 정상적인 처리라고 인식(오해)할 수 있으므로 좋은 리턴값이 아님
		}
		return x + y;
	}

}
