import java.util.Scanner;

public class JuminValidation {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String id;
		
		System.out.println("**주민번호 입력: ");
		id = keyin.next();
		
		//14자리인지 길이 체크
		if(id.length() != 14) {
			System.out.println("잘못된 주민번호 입니다.");
			return; //자바가상머신으로 리턴. == 프로그램 종료.
		}
		
		//6번째 index에 '-'인지 체크
		if(id.charAt(6) != '-') {
			System.out.println("잘못된 주민번호 입니다.");
			return;
		}
		
		//'-'를 기준으로 앞뒤에 숫자 digit인지 확인
		for(int i=0; i<id.length(); ++i) {
			if(i==6) continue;
			if(!('0'<=id.charAt(i) && id.charAt(i) <= '9')) {
				System.out.println("잘못된 주민번호 입니다.");
				return;
			}
		}
		
		
		//전체 문자열중에 일부만 가져오기 -substring
		String data = id.substring(0, 6);//0번째 이후로 6개 가져오기
		for(int i=0; i<data.length(); ++i) {
			if(!('0'<=data.charAt(i) && data.charAt(i) <= '9'))
				System.out.println("잘못된 주민번호 입니다.");
				return;
		}
		
		data = id.substring(7); //7번째 이후로 싸그리다 가져오기
		for(int i=0; i<data.length(); ++i) {
			if(!('0'<=data.charAt(i) && data.charAt(i) <= '9'))
				System.out.println("잘못된 주민번호 입니다.");
				return;
		}
	}

}
