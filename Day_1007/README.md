# TIL (Today I Learnd) - 10.07.22

## 증감연산자

++x : x를 먼저 1증가시킨 후 그값을 사용

—x : x값을 먼저 1 감소 후 그 값을 사용  

x++ : x값을 먼저 사용한 후 1 증가

x— : x값을 먼저 사용한 후 1 감소

```java
int x=0;
++x; // 1순위
x+1; //오류  x = x+1 (x+=1) 이렇게 써야함
x++; // 15순위
```

```java
//증감연산자 테스트
public class OperatorTest_06 {

	public static void main(String[] args) {
		int x=0;
		int result = 0;
		
		result = ++x; //먼저 값 증가, 후 대입
		System.out.println(x+","+result);
		
		x=0;
		result = x++;//먼저 대입 후 값 증가
		System.out.println(x+","+result);
		
		x=0;
		result = x--;//먼저 대입 후 값 증가
		System.out.println(x+","+result);
		
		x=0;
		result = --x; //먼저 값 증가, 후 대입
		System.out.println(x+","+result);
	}

}
```

---

초기화

```java
//일반적인 경우의 초기화
public class InitTest {

	public static void main(String[] args) {
		int x = 0;
		double y = 0;
		boolean a = false; 
		char ch = 0; // ' '(스페이스):32, 'a':97, 'A':65
		String name = null; // 참조값 자체가 없음
		String grade = ""; // (빈문자열의) 참조값이 있음
		
		
	}

}
```

## 여러 종류의 데이터 입력받기

Scanner 객체 선언

int , double, String

print - 아무것도 안쓰면 오류

println - 아무것도 안써도 된다

printf - 무조건 “”이 처음으로 온다

- 지정된 format에 맞춘 문자열을 출력

### 형식변환 문자열 -printf에서 사용

%c - 문자 1개

%d - 정수

%s - 문자열

%f - 실수

%% - %자체를 출력

%n - 줄바꿈 

```java
import java.util.Scanner;

public class OutputTest_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		double y;
		String str;
		
		System.out.println("정수입력: ");
		x = scanner.nextInt(); //입력받은 값을 정수형태로 x에 대입해라
		
		System.out.println("실수입력: ");
		y = scanner.nextDouble();
		
		System.out.println("문자열입력: ");
		str = scanner.next(); //next()-단어단위 nextLine()-줄단위
		
		System.out.printf("%d %f %s %n", x, y, str);
		
	}

}
```

```java
public class OutputTest_02 {

	public static void main(String[] args) {
		int x = 25, y = 3345;
		
		System.out.printf("x=%d, y=%,d%n", x, y);
		
		
		double a = 256.55, b = 3345.45678;	
		
		System.out.printf("a=%f, b=%f%n", a, b);
		System.out.printf("a=%.2f, b=%.2f%n", a, b);
		System.out.printf("a=%.3f, b=%,.2f%n", a, b);
		
		
		char ch = 'a';
		System.out.printf("character a = %c", ch);
		//System.out.printf("문자 a = %d%n", ch); //Exception : char -> 정수형에 대입
		System.out.printf("character a = %d%n", (int)ch);
		
		
		double discountRate = 10;
		//discountRate is 10%.
		System.out.printf("discount rate is %.0f%%", discountRate);
		
 }
}
```

문법은 그냥 암기

일본은 대기업 이직 쉬움

---

## Escape Sequence (특수문자) - println에서 사용됨

‘\n’ : new line

‘\t ‘ : tab

‘\\ ‘ : \출력

‘\r ‘ : 현재 커서가 위치한 줄의 맨앞으로 이동

‘\’ ‘ : 작은 따옴표 출력

‘\’’’ : 큰 따옴표 출력

자바에서 Enter Key ⇒ \r\n  (맨 앞으로 이동 후 줄바꿈)

```java
//escape sequence test
public class EscapeTest {

	public static void main(String[] args) {
		String tmp = "korea";
		System.out.println(tmp);
		System.out.println("\n" + tmp); //new line
		System.out.println("\t" + tmp); //8칸 이동(Move 8 spaces)
		
		System.out.println("Kim's Bakery");
		//In Java, the string must be in double quotes
		System.out.println("My name is \"jay\"");
		/* -----------------------------------------------*/
		char a = '\r';
		char b = '\n';
				
		System.out.println("\\r의 코드값은" + (int)a +"이다.");
		System.out.println("\\n의 코드값은" + (int)b+ "이다.");
		
		
	}

}
```

```java
korea

korea
	korea
Kim's Bakery
My name is "jay"
\r의 코드값은13이다.
\n의 코드값은10이다.
```

  

참고 - [https://developer-yeony.tistory.com/82](https://developer-yeony.tistory.com/82)

---