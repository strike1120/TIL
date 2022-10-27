# 22.10.27 Thur 

VO (value object) : 값을 가지고 있는 객체

인스턴스 변수: 멤버변수라고도 불리며 클래스에 선언된 직속 변수이다.

클래스의 선언만 있고 내용이 없는 껍데기뿐인 클래스이다. 

하지만 이 껍데기뿐인 클래스도 아주 중요한 기능을 가지고 있다. 

그 기능은 바로 **객체(object)를 만드는 기능**이다.

객체는 다음과 같이 만들 수 있다.

```java
class Animal {
}

public class Sample {
	public static void main(String[] args) {
		Animal cat = new Animal();
  }
}

```

`new` 는 객체를 생성할 때 사용하는 키워드이다. 

이렇게 하면 Animal 클래스의 인스턴스(instance)인 cat, 즉 Animal의 객체가 만들어진다.

**※ 객체와 인스턴스**

클래스에 의해서 만들어진 객체를 인스턴스라고도 한다. 그렇다면 객체와 인스턴스의 차이는 무엇일까? 이렇게 생각 해 보자. `Animal cat = new Animal()` 이렇게 만들어진 cat은 객체이다. 그리고 cat이라는 객체는 Animal의 **인스턴스(instance)** 이다. 인스턴스라는 말은 특정 객체(cat)가 어떤 클래스(Animal)의 객체인지를 **관계**위주로 설명할 때 사용된다. 즉, "cat은 인스턴스" 보다는 "cat은 객체"라는 표현이 "cat은 Animal의 객체" 보다는 "cat은 Animal의 인스턴스" 라는 표현이 훨씬 잘 어울린다.

```java

Stuedent std = new Student(); //Garbage Collect가 메모리를 비워준다
std = new Student(); // 왜? 새로운 객체를 참조하게 됐으니까
```

더이상 참조되지 않는 객체를 발견하면 GC는 그 메모리를 비워준다

null : 나는 아무것도 참조하지 않겠다는 의미이다

캡슐화(Encapsulation) : 관련있는 데이터들을 하나로 묶는 것이다. 서로 다른 데이터 타입을 서로 묶어내는 것.

자바의 프로그래밍 단위는 클래스이다

관련있는 데이터는 멤버변수와 멤버메소드를 다 포함한 것이다

클래스를 잘 정의하는 것은 굉장히 중요하다.

접근지정자

- public : 다른 클래스에서도 접근 가능
- (default) :
- private : 같은 클래스에서는 접근 가능하지만 외부에서는 접근 불가

## 세터와 게터

private 멤버변수에 접근할 수 있도록 메소드를 만들어줌
Setter : 값을 private변수에 대입하는 메소드 -> public void set변수명(변수타입 변수명)(공식이니까 걍 외우기)
getter : 값을 private변수에서 가져가는 메소드 → public 리턴타입 getType( );

```java

	
	public void setType(int type) {
		this.type = type; //this를 빼버리면 이안에는 지역변수만 존재하게 되는 꼴이된다
	}
	
	public void setName(String name) {
		this.name = name;
	}
```

데이터 추상화 : 데이터를 모아서 하나의 클래스로 모으는 작업

캡슐화 : 관련된 멤버 필드를 묶는 것

정보 은닉 : private접근지정자

데이터 - 멤버 변수

기능 - 멤버 메소드

(객체지향언어의 특징) [https://radait.tistory.com/4](https://radait.tistory.com/4) 

- 캡슐화
- 상속
- 다형성
- 추상화 : 객체의 공통적인 속성(변수)과 기능(매소드)을 추출
- 객체지향언어의 장단점

---

## 생성자

- 멤버변수를 메모리에 생성
- 개발자가 명시적으로 생성자를 만들지 않으면 JVM이 생성자를 만든다
- 리턴타입이 없다
- 생성자의 이름은 클래스명과 동일하다
- 객체를 생성하기 위해서는 반드시 기본생성자가 있어야한다!
- `public Trainee(){ }` 기본생성자 → 반드시 무조건 만들것!
- 오버로딩된 생성자가 있을 경우에는 더더욱 기본생성자를 꼭 만들어야함!

## 생성자 오버로딩

생성자는 오버로딩이 가능하다

- 생성자 이름은 같지만, 전달인자의 개수, 전달인자의 타입이 다르도록 만든 생성자
- 외부로부터 데이터를 받아서 생성자를 초기화 하는 것.
- setter는 이미 만들어져있는 객체의 멤버변수 값을 바꿀때 사용
- 오버로딩된 생성자는 애초부터 객체의 멤버변수들을 초기화 시키고 사용
- setter는 매개변수로 하나만!

```java
public void setId(int id, String name) {  //이러면 세터가 아니다!!
		this.id = id;
	}
```

- 반면 오버로딩된 생성자는 여러개의 매개변수를 가질 수 있음!

```java
//생성자 오버로딩 (오버로딩된 생성자는 여러개의 매개변수를 가질 수 있음
	public Trainee(int id, String name, double java, double japan, double basic) {
		this.id = id;
		this.name = name;
		this.java = java;
		this.japan = japan;
		this.basic = basic;
	}
```

