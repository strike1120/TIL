
public class IntegerTest {

	public static void main(String[] args) {
		System.out.println("최대값: " + Integer.MAX_VALUE);//2^n -1
		System.out.println("최소값: " + Integer.MIN_VALUE);
		System.out.println("Size: " + Integer.SIZE);
		System.out.println("Bytes: " + Integer.BYTES);
		
		Integer i1 = new Integer(15);
		Integer i2 = new Integer("123");
		
		System.out.println(i1); //주소값이 안찍히고 값이 찍힘 -> auto unboxing:참조된 주소값의 값을 알아서 가져오는 것
		System.out.println(i2);
		
		System.out.println(i1.getClass()); //무슨 클래스인지 확인
		
		//Integer객체를 만들어내는 다른 방법 (Auto Boxing) :자동으로 기초자료형을 객체자료형으로 바꾸는 것
		Integer i3 = 45; //int i3 = 45; 그럼 얘는 레퍼런스변수가 아닌거죠?
		System.out.println(i1 + i3); //i1은레퍼런스 변수지만 Auto Unboxing으로 인해 실제 데이터값으로 연산됨
		
	}

}
