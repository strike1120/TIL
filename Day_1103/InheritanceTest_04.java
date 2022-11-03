class AClass {
	private String name;
	private int age; //세터와 게터가 없으면 처음초기화된 값을 변경할 수 없다.
	public AClass() {}
	public AClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
		
	}
}

class BClass extends AClass {
	private String address;
	
	public BClass(String address) { //상속을 받았기 때문에 코드안에 가장먼저 부모의 생성자를 호출해야함
		super(); //오류발생. 부모의 기본생성자가 없음.
		this.address = address;
	}
	
	public BClass(String name, int age, String address) {
		super(name,age);
		this.address = address;
	}
	@Override
	public String toString() {
		return super.toString() + "," + address;
	}
}

public class InheritanceTest_04 {

	public static void main(String[] args) {
		//concreate class : 클래스를 만들어놓고 객체를 생성해서 쓸 수 있는 애들
//		AClass aclass = new AClass("손오공",33);
		BClass b = new BClass("저팔계",29,"미국 뉴욕");
		System.out.println(b);
	}

}

