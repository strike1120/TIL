/*
 * 배열 10개를 생성하여 그 배열안에 수열을 넣은 후 출력하시오
 */
public class Test_01 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		sequence(ary); //5의 배수로 채워 넣으시오
		for(int i=0; i<ary.length; ++i) {
			System.out.println(ary[i]);
		}
		output(ary); //전달받은 ary배열의 모든 데이터 출력
	}
	
	public static void sequence(int[] ary) {
		for(int i=0; i<ary.length; ++i) {
			ary[i] = 5*i+5; 
		}
		
	}
	
	public static void output(int[] ary) {
		for(int i=0; i<ary.length; ++i) {
			System.out.print(ary[i]+" ");
		}
	}
}
