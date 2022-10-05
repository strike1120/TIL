/*
 정수변수 temp에 임의의 값을 넣어 초기화하시오
 그 값이 3의 배수이거나 5의배수이면 true, 아니면 false가 출력되도록 
 */
public class Exam_06 {

	public static void main(String[] args) {
		int temp = 112;
		boolean result ;
		result = temp % 3 == 0 || temp % 5 == 0 ;
		System.out.println(result);
	}

}
