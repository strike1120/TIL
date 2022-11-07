# TIL (Today I Learnd) 22.11.07

## 인터페이스

- 클래스와 유사
- 객체를 생성하지 못함
- 멤버필드를 가질 수 없다 —> 상수를 가질 수 있다 (public static final)
- abstract 메소드만 갖는다 - 구현부(body)가 없이 선언부(signiture)만 있는 것
- 오직 상속 해주기위해서만 만들어진 문법
- 사용하고 싶으면 객체를 생성하는 것이 아니라,
- 인터페이스를 구현한(implement) 새로운 클래스를 재정의 해서 만들어야한다
- super class는 1개만 상속받을 수 있지만, super interface는 여러 개 구현 가능
- 자바에서는 다중상속 불가 / 인터페이스 다중 구현은 가능
- 구현을 강제화 시킴(이기능은 꼭 있어야해)

[클래스]

```java
public class Myclass
	private int age;
	public static final int	MAX_VALUE = 14;
	public int methodA(int a, int b) {return a+b;}
```

[인터페이스]

```java
public interface MyInterface // 인터페이스 -> 객체생성불가
	public static final int AGE = 10 ; //상수변수는 대문자로 쓴다
  public int methodB(int a, int b); //추상메소드 - 본체가 없음 
```

[인터페이스 구현]

```java
public class MyClass_2 implements MyInterface { //MyInterface는 super를 대

	@Override
	public int methodB(int a, int b) {
		return a * b;
	}
}
```