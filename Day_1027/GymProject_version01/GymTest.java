
public class GymTest {

	public static void main(String[] args) {
		GymVO cho = new GymVO(123, "shuan",68 ,173.5);
		double bmi = cho.getBmi();
		System.out.printf("%.2f%n", bmi);
		String result = cho.getResult();
		System.out.println(result);
		
		
	}

}
