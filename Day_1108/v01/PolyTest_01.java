//다형성 공부전 상속
package v01;

class Parent01{
	String name; //default (package)
	void methodA() {
		System.out.println("Parent01-"+ name);
		
	}
}

class Child01 extends Parent01{ //private과 생성자는 상속받지 않는다
	int age;
	void methodB() {
		System.out.println("Child01-" + age);
	}
}

class Neighbor{
	String address;
	void methodC() {
		System.out.println("Neighbor-" + address);
		
	}
}
public class PolyTest_01 {

	public static void main(String[] args) {
		Parent01 p1 = new Parent01(); //Parent01() 자바가상머신이 만들어주는 기본생성자
		p1.name = "홍길동";
		p1.methodA();
		
		Child01 c1 = new Child01();
		c1.name="손오공"; //상속받았으므로 이렇게 적는것이 가능
		c1.age = 21;
		c1.methodA();
		c1.methodB();
		
		Neighbor n = new Neighbor();
		
		// 연산자 (instance of) - 상속관계인지 확인할때 사용하는 연산자.
		// return타입 : boolean -> 상속관계이면 t, 아니면 f를 리턴.
		System.out.println(p1 instanceof Parent01); // p1이 Parent01타입인지 확인
		System.out.println(c1 instanceof Child01); // c1이 Child01타입인지 확인
		
		System.out.println(c1 instanceof Parent01); // c1이 Parent01타입인지 확인 -> true
		System.out.println(c1 instanceof Object); // c1이 Object타입인지 확인 -> true
//		System.out.println(c1 instanceof String); // String은 c1의 족보에 없음 -> error
		System.out.println(p1 instanceof Child01); // p1(부모객체)이 자식타입Child01(클래스)의 객체이니? -> false
//		System.out.println(n instanceof Child01); // 
//		System.out.println(c1 instanceof Neighbor); // 전혀 연관 없는애들끼리는 연산자체가 안됨.
		
		
	}

}
