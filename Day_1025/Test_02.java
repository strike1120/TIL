/*
 [연습문제2] 정수 배열 20개를 생성하여
 그 배열 안에 피보나치 수열을 넣은 후 출력하시오.
 */
public class Test_02 {

	public static void main(String[] args) {
		int[] ary = new int[20];

		fibonacci(ary); 
		for(int i=0; i<ary.length; ++i) {
			System.out.println(ary[i]);
		}
		output(ary); //전달받은 ary배열의 모든 데이터 출력
	}

	public static void fibonacci(int[] ary) {
		ary[0]=1; 
		ary[1]=1;
		
		for(int i=2; i<ary.length; ++i) {
			ary[i] = ary[i-2]+ ary[i-1]; 
		}

	}

	public static void output(int[] ary) {
		for(int i=0; i<ary.length; ++i) {
			System.out.print(ary[i]+" ");
		}
	}

}
