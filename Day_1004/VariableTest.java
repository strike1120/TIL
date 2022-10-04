
public class VariableTest {
	public static void main(String[] args) {
		//정수 변수 선언 -> 어떤용도로 사용할지 알수있게 변수명 설정하기
		int age; //뱐수 선언
		age = 31; //초기화
		System.out.println(age);
		
		age=45; //초기화
		System.out.println(age);
		
		int grade = 4; // 선언과 초기화를 동시에
		System.out.println(grade);
		
		byte by = 125;
		short sh = 125;
		int in = 125;
		long lo = 125L;
		long loong = 125; // 작은 데이터가 큰 변수안에 들어가는 것은 가능
		
		//float fl = 42.195; //큰 데이터가 작은 변수안에 못들어감
		float fl = 42.195f;
		double dbl = 42.195f;
		
		// 문자형
		char ch = '%'; //ASCII -> UniCode
		
		//불린형
		boolean bool = true;
	}
}
