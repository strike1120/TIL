
public class FloatTest {

	public static void main(String[] args) {
		//부동소수점 (floating point)
		System.out.println(1.1);
		System.out.println(1.3);
		System.out.println(1.1+1.3);
		System.out.println((1.1+1.3)==2.4); //소수점으로 연산을 같다연산자를 사용하면 안됨false
		System.out.println((1+3) == 4);
		
		// 5/0
		System.out.println(5.0/0.0); //무한대
		System.out.println(5.0/-0.0); //음의무한대-컴퓨터가 표현할수없을정도로 작은수
	}

}
