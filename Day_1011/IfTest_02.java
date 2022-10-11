// 나이 10살 미만이면 요금을 1000원 할인해준다 (요금 - 1000)
// If you are under 10 years old, you can get a 1,000 won discount
// 그게 아니라면 요금을 500원 할인해준다. (요금-500)
// If not, they give you a 500 won discount.
public class IfTest_02 {

	public static void main(String[] args) {
		int age = 20;
		int charge = 12000;
		
		if (age < 10) {
			charge = charge - 1000;
		} else {
			charge = charge - 500;
		}
		
			
		System.out.printf("price : %,d Won%n", charge);
	}

}
