// 나이 10살 이하이면 요금을 1000원 할인해준다
// If you are under 10 years old, you can get a 1,000 won discount
public class IfTest_01 {

	public static void main(String[] args) {
		int age = 20;
		int charge = 12000;
		
		if (age < 10) {
			charge = charge - 1000;
		}
		
			
		System.out.printf("지불요금 : %,d원%n", charge);
	}

}
