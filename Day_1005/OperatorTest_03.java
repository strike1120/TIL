
public class OperatorTest_03 {

	public static void main(String[] args) {
		boolean result, result2;
		int age = 6;
		//삼항연산자 
//		result = age < 7 ? true : false ;
		//[조건 판단] 나이가 7세미만인지 아닌지 판단
		result = age < 7;
		System.out.println(result);
		
		// [조건 판단] 나이가 70세 이상인가?
		age = 65;
		result = age >= 70;
		System.out.println(result);
		
		// [(조건)판단] 나이가 6세미만 이거나 65세 이상인가?
		age = 28;
		result = age<6 || age>=65; //or : 둘 중 하나라도 참이면 결과값이 참.
		
		int score = 78;
		result = 90 <= score && score <=100;
		result2 = !(score < 90 || score > 100);
		System.out.println(result);
		System.out.println(result2);
	}

}
