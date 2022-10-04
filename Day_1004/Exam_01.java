
public class Exam_01 {

	public static void main(String[] args) {
		//정수형 변수 3개(kor, eng, mat) 선언 후 임의의 값으로 초기화
		//실수형 변수 2개 선언 : total, avg
		//세 과목의 점수 합계와 평균을 구하여 출력
		
		int kor = 100;
		int eng = 97;
		int mat = 99;
		double total;
		double avg;
		
		total = kor + eng + mat;
		avg = total / 3 ; // double/int ==> double/double 로 자동형변환(promotion)된다 
		
		System.out.println(total);
		System.out.println(avg);

	}

}
