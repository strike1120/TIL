class Parent {
	private String data;
	public Parent() { //parent라는 객체가 생성될때 아래코드가 실행됨
		System.out.println("부모클래스의 객체 생성");
	}
	public Parent(String data) { //기본생성자 오버로딩
		this.data = data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
}

class Child extends Parent{
	private int number;
	public Child() { // Child의 인스턴스가 생성될때 아래코드가 실행된다
		//super(); // 부모클래스의 기본생성자를 호출.
		System.out.println("자식클래스의 객체 생성");
	}

	public Child(int number) {
		super(); //모든 생성자에는 부모의 기본생성자를 호출하는 코드가 있다. 생략가능(자동생성).항상 최상단.
		this.number = number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
}
public class InheritanceTest_01 {

	public static void main(String[] args) {
		Child c2 = new Child(27);
		System.out.println(c2.getData()+","+ c2.getNumber()); //부모클래스에는 null
//		Parent p1 = new Parent(); 
//		Child c1 = new Child(); //자식클래스의 객체를 생성할때 부모클래스가 먼저 생성된다.
		
		
//		Parent p = new Parent();
//		p.setData("대한민국");
//		System.out.println(p.getData());
//		
//		Child c = new Child();
//		c.setData("일본");
//		c.setNumber(10);
//		System.out.println(c.getData()+ " "+ c.getNumber());
	}

}
