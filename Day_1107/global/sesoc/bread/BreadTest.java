package global.sesoc.bread;

public class BreadTest {

	public static void main(String[] args) {
		Bread br = new Bread("팥빵",1200);
		Cake ca = new Cake("초코케잌", 12000, 25);
		Roll ro = new Roll("롤빵", 9000, 30);
		
		System.out.println(br);
		System.out.println(ca);
		System.out.println(ro);
	}

}
