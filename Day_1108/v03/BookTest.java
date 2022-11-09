package v03;

public class BookTest {

	public static void main(String[] args) {
		Book book;
		
		book = new Book();
		book.id = "1";
		book.title = "그림으로 보는 자바";
		book.output();
		
		book = new Magazine();
		book.id = "2";
		book.title = "오늘의 집";
//		book.type = "월간"; //오류. 형변환 해줘야함
		((Magazine)book).type = "월간";
		
		book.output(); //11번행의 코드와 같지만 결과값이 다르게 나옴.(다형성) - 가리키는 대상에 따라서 다른 결과값이 나옴
		
		book = new Novel();
		book.id ="3";
		book.title = "데미안";
		((Novel)book).author = "헤르만헤세";
		book.output(); //하나의 타입이 다양한 오브젝트를 가리키는 것. 상속이 없으면 그건 다형성이 아니다.자식관계에 있는 
	}

}
