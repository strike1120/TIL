package v01;

class Parent02{
	String name; //default (package)
	void methodA() {
		System.out.println("Parent01-"+ name);
		
	}
}

class Child02 extends Parent02{ //private과 생성자는 상속받지 않는다
	int age;
	void methodB() {
		System.out.println("Child01-" + age);
	}
}

}
public class PolyTest_02 {

	public static void main(String[] args) {
		//다형성
		
		Parent02 p2 = new Child02(); //up casting 
		//부모의 참조변수가 자식객체를 가리키고 있음. 단 상속관계에 있는 애들끼리 해야함.
		//p2는 자신은 Parent02라고 인식하고 있다.
		p2.name = "홍길동";
		p2.methodA();
//		p2.age = 34; //오류
//		p2.methodB(); //오류
		
		// down casting - 사실 너는 자식을 가리키고 있는거야. 라고 알려주는 행위
		((Child02)p2).age = 34; //p2의 정체성을 알려준다
		//down casting은 실제 사용하는 시점에서는 down casting이 필요하다.
		((Child02)p2).methodB();
//		(Child02)p2.methodB(); //왜 오류? 연산자 우선순위로 인해 형변환전에 
		
		//but, 다형성은 주로 인터페이스와 함께 사용해야 효과가 좋다 
	}

}
