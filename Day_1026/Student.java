/*
[연습문제] Student.java, StudentMain.java 생성하여 테스트하시오
한 학생의 점수를 저장하기 위한 클래스를 생성하시오
클래스명 : Student
멤버변수 : 정수 - 국어, 영어, 수학 / 실수 - 평균
멤버메소드 : output() 멤버를 출력
 */
public class Student {
	int kor;
	int eng;
	int mat;
	double avg;
	
	public void output() {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		avg = (kor + eng + mat) / 3.0f; //원래 인스턴스 변수는 객체를 생성하고 써야하지만, 같은 클래스 안에 있기때문에 그냥 사용가능
		System.out.println(avg);
	}
}
