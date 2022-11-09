package v03;

public class Magazine extends Book {
	String type;

	@Override
	public void output() {
		System.out.println("발행되는 타입 : " + type);
		
	} 
	
}
