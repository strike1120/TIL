//형변환
public class CastingTest {

	public static void main(String[] args) {
		int a;
		double result;
		
		a = 15;
		result = 15 * 1.7;
		
		int b;
		b = (int)12.7; // casting :
		
		// boolean b = (boolean)1; // boolean은 casting 불가.
		
		//byte < short < int < long < float < double (작은 -> 큰)
		//char(음수처리불가) short(음수처리가능) -> 처리할 수 있는 값의 크기가 다르다
		//float < double
		//int < float
		//long < float (양수의 절대값이 큰쪽이 크다)
	}

}
