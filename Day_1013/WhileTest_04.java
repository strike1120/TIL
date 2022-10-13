import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		String choice;
		Scanner keyin = new Scanner(System.in);
		//반복적으로 문자열을 입력받는다
		//입력받은 데이터를 choice변수에 넣는다
		//어떤게 반복되느냐를 생각
		//몇번반복할지를 정하지 않았다면 true
		while(true) {
			System.out.println("*메뉴를 선택 : ");
			choice = keyin.next();
			
			switch(choice) {
			case "1" : 
				System.out.println("1번을 선택하셨습니다");
				break;
			case "2" : 
				System.out.println("2번을 선택하셨습니다");
				break;
			case "0" : 
				System.out.println("종료합니다");
				System.exit(0); // 프로그램을 종료시키는 메소드 
			default : 
				System.out.println("err > 선택 오류");
			}
		}
	}

}