/* 
  실수형 변수 : height(키), weight(적정 몸무게), 
  적정몸무게 = (키-100) * 0.9
  
  Getting the Right Weight
  floating data type :height, weight
  the right weight = (height -100) * 0.9
 */
public class Exam_03 {

	public static void main(String[] args) {
		double height = 173.0 ;
		double weight = (height-100) * 0.9 ;
		System.out.println(weight + "kg");
	}

}
