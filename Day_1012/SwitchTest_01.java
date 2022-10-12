
public class SwitchTest_01 {

	public static void main(String[] args) {
		String temp = "father";
		
		switch(temp) {
		case "father" : //temp안에 이런값이 들어있니?
			System.out.println("아버지");
			break;
		case "mother" : //temp안에 이런값이 들어있니?
			System.out.println("어머니");
			break;
		case "brother" : //temp안에 이런값이 들어있니?
			System.out.println("남자형제");
			break;
		case "sister" : //temp안에 이런값이 들어있니?
			System.out.println("여자형제");
			break;
		default : //case외의 모든 경우
			System.out.println("이웃");
			
		}
		
		System.out.println("종료"); //switch문이 종료되면 여기로 온다
	}

}
