import java.util.Scanner;

public class If_Prcatice_BMI {

	public static void main(String[] args) {
		
		double height, weight, bmi;
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키(cm)를 입력하세요");
		height = scanner.nextDouble();
		System.out.println("체중(kg)을 입력하세요");
		weight = scanner.nextDouble();
		
		//bmi = weight / (height*0.01 * height*0.01);
		height = height * 0.01;
		bmi = weight / (height * height);
//------------------------------------------------------------------------------	
		if(bmi>=23) {
			result = "과체중";
		} else if(bmi > 18.5) {
			result = "정상";
		} else 
			result = "저체중";
		
		System.out.printf("키(m) : %.2fm%n", height*0.01);
		System.out.println("몸무게(kg) :" + weight +"kg");
		System.out.printf("당신의 BMI는 %.2f이고 '%s'상태입니다.", bmi, result);
		
		
	}
}
