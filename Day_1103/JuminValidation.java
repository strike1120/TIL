import java.util.Scanner;

public class JuminValidation {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String id;
		
		System.out.println("**주민번호 입력: ");
		id = keyin.next();
		
		//14자리인지 길이 체크
		if(id.length() != 14) {
			System.out.println("잘못된 주민번호 입니다.1");
			return; //자바가상머신으로 리턴. == 프로그램 종료.
		}
		
		//6번째 index에 '-'인지 체크
		if(id.charAt(6) != '-') {
			System.out.println("잘못된 주민번호 입니다.2");
			return;
		}
		
		//'-'를 기준으로 앞뒤에 숫자 digit인지 확인
		for(int i=0; i<id.length(); ++i) {
			if(i==6) continue;
			if(!('0'<=id.charAt(i) && id.charAt(i) <= '9')) {
				System.out.println("잘못된 주민번호 입니다.3");
				return;
			}
		}
		//950225-1044433: 8번째 숫자가 1~4인지 확인
		char gender = id.charAt(7);
		if(!(gender >= '1' && gender <= '4')) {
			System.out.println("잘못된 주민번호 입니다4");
			return;
		}
//		int temp = ((int)gender)-48; //49 ---> 1 (연산가능하도록 변환해주기)
		
		
		//검증코드를 확인하는 작업
		//주민번호 한자리씩 따와서 출력
		int temp = 0;
		int weight = 2, total = 0;
		for(int i=0; i<id.length()-1; ++i) { //검증코드는 빼고 출력해야하므로 length-1 
			System.out.println(id.charAt(i));
			if(id.charAt(i)== '-') continue; //특수문자 건너뛰고 숫자만 출력
			temp = (int)id.charAt(i) - 48;
			total += temp * weight; //가중치를 곱하고 누적하고 곱하고 누적하고를 반복
			++weight;
			if(weight >= 10) weight = 2;
		}
		
		int code = 11 - (total % 11); //total을 11로 나눈 나머지를 11에서 뺴라
		if(code >= 10) code = code % 10;
		System.out.println(code);
		if((id.charAt(id.length()-1)-48 != code)){
			System.out.println("잘못된 주민번호입니다.5");
			return;
		}
		System.out.println(code);
	
		//성별확인
		temp = ((int)gender)-48;
		String g = null;
		if(temp %2 != 0) {
			g = "남자";
		} else {
			g = "여자";
		}
		
		//태어난 년도 확인 (몇년생)
		String birthYear = null;
		if(temp == 1 || temp == 2) {
			birthYear = "19" + id.substring(0,2);
		} else {
			birthYear = "20" + id.substring(0,2);
		}
		System.out.println(birthYear);
		
		//태어난 달(몇월)을 추출
		String birthMonth = null;
		birthMonth = id.substring(2,4);
		System.out.println(birthMonth);
		
		//태어난 날(며칠인지) 추출
		String birthday = null;
		birthday = id.substring(4,6);
		System.out.println(birthday);
		
		
	}

}
