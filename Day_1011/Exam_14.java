import java.util.Scanner;

/*
[ 문제-14 ] 정상체중 구하기
체중(kg)과 키(cm)를 입력 받아 저체중인지 정상체중인지, 과체중인지 여부를 출력하는 프로그램을 작성하시오.
이때 공식은 아래와 같으며, 
체중을 구했을 때 해당 체중의 10kg 미만은 저체중, 
정상체중-10 ~ 정상체중+10 은 정상 체중, 정상체중 +10 초과의 값은 과체중입니다.

<Hint>
적정 체중 = (키-100) X 0.9    ±10kg는 정상
 */

public class Exam_14 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = sc.nextInt();
		System.out.println("체중을 입력하세요");
		double weight  = sc.nextInt();
		
		double proper = (height - 100)* 0.9;
		System.out.println("적정체중: " + proper + "kg");
		//----------------------------------------------------------
		if( weight - proper > 10 ) {
			System.out.println("과체중 입니다");
		} else if ( (weight - proper) <= 10) {
			System.out.println("정상체중 입니다");
		} else 
			System.out.println("저체중 입니다");
//----------------------------------------------------------
	}

}
