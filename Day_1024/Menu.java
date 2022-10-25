import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice;
		
		while(true) {
			System.out.println("1.입력 2.출력 3.삭제 4.수정 0.종료 ");
			choice = scan.next();
			switch(choice) {
			case "1" : input(); break;
			case "2" : output(); break;
			case "3" : delete(); break;
			case "4" : update(); break;
			case "0" : 
				System.out.println("프로그램 종료"); 
				return;//main메소드를 호출한 자바가상머신한테로 되돌아가라
			default : System.out.println("메뉴를 다시 선택해주세요");
			}
		}
	}
	
//	input() : "input"이라고 출력하는 문장 하나만 있음
	public static void input() {
		System.out.println("input");
	}
//	output()
	public static void output() {
		System.out.println("output");
	}
//	delete()
	public static void delete() {
		System.out.println("delete");
	}
//	update()
	public static void update() {
		System.out.println("update");
	}
	

}
