import java.util.Scanner;

public class Verification {

	public static void main(String[] args) {
		
		String rNum;
		
		Scanner scan = new Scanner(System.in);
		
		//올바른 주민번호인지 체크
		while(true) {
			System.out.println("입력");
			rNum = scan.next();
			String tmp = String.valueOf(rNum.charAt(6));
			
			if(!tmp.equals("-") || rNum.length() > 15) {
				System.out.println("잘못된 주민번호 입니다");
				continue;
			} else 
				break;
		}
		
		//주민번호를 전달받아 성별 위치의 값이 1,2이면 1900년대생 3,4면 2000년대생으로 작성하여 반환
		rNum.charAt(7) ==
	}

}

