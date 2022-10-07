//두개의 변수에 들어있는 각 값을 서로 교환하기
//temp 변수를 만들어 한 값을 저장해 놓는다.
public class ExchangeTest {

	public static void main(String[] args) {
		int a = 10, b = 20, temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+ a +", b = "+ b);
	}

}
