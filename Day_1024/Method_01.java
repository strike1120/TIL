
public class Method_01 {

	public static void main(String[] args) {
		int a =10, b=15;
		
		System.out.println("start");
		output();
		
		//call by value (값을 입력받아 호출한다)
		add(a,b); //호출하는 쪽의 값(argument)
		minus(b, a);
		System.out.println("End");
	}
	
	//메소드 정의
	public static void output() {
		System.out.println("output method");
		return;
		
		//System.out.println(2); //return 밑에 코드를 적으면 dead code
	}
	
	//함수 만들기 - 더하기
	public static void add(int value1, int value2) { //매개변수(parameter)
		//int value1 = 10, value2=20;  //지역변수
		int result = value1 + value2;
		System.out.println("결과: "+result);
	}
	
	//함수만들기 - 빼기
	public static void minus(int value1, int value2) { //매개변수는 위치가 중요.입력된 순서대로 대입됨
		int result = value1 - value2;
		System.out.println("결과: " + result);
	}
	

}
