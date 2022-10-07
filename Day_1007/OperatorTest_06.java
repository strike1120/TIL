//증감연산자 테스트
public class OperatorTest_06 {

	public static void main(String[] args) {
		int x=0;
		int result = 0;
		
		result = ++x; //먼저 값 증가, 후 대입
		System.out.println(x+","+result);
		
		x=0;
		result = x++;//먼저 대입 후 값 증가
		System.out.println(x+","+result);
		
		x=0;
		result = x--;//먼저 대입 후 값 증가
		System.out.println(x+","+result);
		
		x=0;
		result = --x; //먼저 값 증가, 후 대입
		System.out.println(x+","+result);
	}

}
