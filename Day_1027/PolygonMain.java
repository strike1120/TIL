
public class PolygonMain {

	public static void main(String[] args) {
		PolygonVO p = new PolygonVO();
		//p.type = 4; //데이터에 직접 접근해서 값을 수정(private접근제어자로 직접 접근할 수 없게 막을 수 있다)
		p.setType(4); //setter를 통해 값을 수정
		//p.name = "사각형";
		p.setName("사각형");
		
		p = new PolygonVO(); //대략 이때 GC가 기존의 객체를 메모리에서 지운다
		p.setType(5);
		p.setName("오각형");
		
		p = null;
		p.setType(3); // 오류발생(NullPointerException : 아무것도 참조하고 있는게 없는데 참조연산자(.)를 사용하면 발생하는 오류
		
	}

}
