/*
 [ 문제-3 ] 제품의 원가 구하기
우리가 구매하는 제품은 10%의 부가세가 포함된 가격이다. 
제품의 가격을 입력하여 10% 부가세를 제외한 원가를 구하여 출력하는 프로그램을 작성하시오
 */
public class Practice_01 {

	public static void main(String[] args) {
		double 부가세 = 0.1;
		double 제품가격 = 99.9;
		double 원가 = 제품가격 - (제품가격 * 부가세);
		System.out.println("원가 : " + 원가 + "달러");
		
		
	}

}
