
public class IntegerTest_02 {

	public static void main(String[] args) {
		//1.static int bitCount(int i) - 1의 개수 반환
		System.out.println(Integer.bitCount(7)); //0000 0111 -> 3
		
		System.out.println(Integer.bitCount(-1)); 
		//-1 : 1111 1111 1111 1111 1111 1111 1111 1111 -> 32 (1의갯수)
		
		//2.static int compare(int x, int y) - (두수를 비교하여 앞이크면 1, 앞이작으면 -1, 같으면 0을 반환)
		System.out.println(Integer.compare(2, 4)); //-1
		
		//3.boolean equals(Object obj) - 
		Integer a = 32;
		System.out.println(a.equals(10)); //AutoBoxing 이 일어남 
		
		//4.int intValue() - 정수부분만 취함
		Double i2 = 20.5;
		//아래에서 사용한 intValue()는 사실 double클래스에 있는것을 사용한 것임
		System.out.println(i2.intValue()); //20
		
		//5.static int max(int a, int b)
		System.out.println(Integer.max(4,2));
		
		//6.static int parseInt(String s) - 정수형 문자열을 입력받아 int로 변환
		System.out.println(Integer.parseInt("1234"));
		
		//7.static int parseInt(String s, int radix) -정수형문자열과 변환할 진수
		System.out.println(Integer.parseInt("10", 16));
		
		//8.static String toHexString(int i) - 정수를 16진수 문자열로 변환
		System.out.println(Integer.toHexString(10)); //정수 10을 16진수 형태의 문자열 "a"로 반환
		
		//9.static Integer valueOf(int i) -  다양한 형태의 변수를 int형으로 바꾸어야 하는 경우사용 (parseInt와 같음)
		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf("10");
		System.out.println(i3+ " " + i4);
	}

}
