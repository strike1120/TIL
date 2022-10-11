import java.util.Scanner;

/*
[ 문제-12 ] if문을 이용한 합격 여부 출력
한 과목의 점수를 입력 받은 후 합격 여부를 출력하는 프로그램을 작성하시오.
<조건>
70점 이상은 합격
50~69점은 재시험
50점 미만은 탈락
 */

public class Exam_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String result = null;
//----------------------------------------------------------
		if(score >= 70) result="합격";
		else if(score >= 50) result ="재시험";
		else result="탈락";
//----------------------------------------------------------
		System.out.println(result);
	}

}
