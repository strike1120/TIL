package global.sesoc.phonebook.ui;

import java.util.Scanner;

import global.sesoc.phonebook.service.PhoneService;
import global.sesoc.phonebook.service.PhoneServiceImpl;
import global.sesoc.phonebook.vo.Phone;

public class PhoneUI {
	Scanner keyin = new Scanner(System.in);
	PhoneService service = new PhoneServiceImpl();
	
	//생성자
	public PhoneUI() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : insert();    break;	//입력
			case "2" : selectOne(); break;	//전화번호를 이용해 조회
			case "3" : update();    break;	//데이터 수정
			case "4" : delete();    break;	//데이터 삭제
			case "5" : selectAll(); break;	//전체 출력
			case "0" : 
				System.out.println("** 프로그램을 종료합니다");
				System.exit(0);
			default :
				System.out.println("** 메뉴를 다시 선택해주세요");
			}
		}
	}

	private void menu() {
		System.out.println("===[전화번호부 관리]===");
		System.out.println("     1.등 록");
		System.out.println("     2.조 회");
		System.out.println("     3.수 정");
		System.out.println("     4.삭 제");
		System.out.println("     5.전체출력");
		System.out.println("     0.종 료");
		System.out.println("===================");
		System.out.print("     > 선택 : ");
	}

	private void insert() {
		// TODO Auto-generated method stub
		
	}

	private void selectOne() {
		String number;
		System.out.println("조회할 전화번호 :");
		number = keyin.next();
		
		Phone phone = service.selectOne(number);
		if(phone == null)
			System.out.println("**조회하려는 전화번호가 없음");
		else
			System.out.println("존재합니다  " + phone);
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		
	}
}
