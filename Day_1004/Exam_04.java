/* 
  실수형 변수 3개 선언 (키, 몸무게, bmi)
  키의 단위는 cm, 몸무게의 단위는 kg으로 각각 초기화
  bmi = 몸무게(kg) / 키(m)의 제곱
  bmi를 출력
  
  Declare 3 float type variables (height, weight, bmi)
  Initialize the unit of height in cm and the unit of weight in kg
  bmi =  weight (kg) / squared height (m)
 */
public class Exam_04 {

	public static void main(String[] args) {
		double weight, height, bmi;
		weight = 66.7;
		height = 172.5;
		
		height = height * 0.01;
		
		bmi = weight / (height * height);
	
		
//		double height = 173.0;
//		double weight = 68.5;
//		double bmi = weight / Math.pow((height * 0.01), 2);
////	double bmi = (weight / (height * 0.01)*(height * 0.01)) 
		System.out.println(bmi);
		
	}

}
