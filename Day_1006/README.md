# TIL (Today I Learnd) - 10.06.22
## 삼항연산자

```java
public class OperatorTest_04 {

	public static void main(String[] args) {
		// x가 5이상이면, "x가 5이상이다"출력, 아니면 "x가 5미만이다" 출력 
		int x = 3;
		String msg;
		
		msg = (x >= 5)? "x가 5이상이다" : "x가 5미만이다";

		System.out.println(msg);
```

```java
//올바른 코드
System.out.println((x > 4)? "크다" : "크지 않다");
```

```java
// 틀린 코드
(x > 4) ? System.out.println("크다"):System.out.println("크지않다");;
```

식 : (x >= 5) ? "x가 5이상이다" : "x가 5미만이다" ;

문장 : System.out.println((x >= 5) ? "x가 5이상이다" : "x가 5미만이다");

**콜론과 물음표사이에 문장이 들어가면 안된다. !!**

## 복합대입 연산자
```java
a = a + 1; => a += 1;
```

---
## 간단한 프로그램 만들기

```java
//변수 x에 임의의 정수값을 초기화 시킨다.
// 그 값이 홀수이면 "x는 홀수입니다."
// 그 값이 짝수이면 "x는 짝수입니다." 를 출력하는 프로그램 만들어보기

public class Exam_07 {

	public static void main(String[] args) {
		int x = 0;
		String msg = (x % 2 == 1) ? "x는 홀수입니다." : "x는 짝수입니다." ;
		System.out.println(msg);

	}

}
```
```java
//메일의 총개수 : 152통
//한 페이지에 보여질 메일의 수: 10통 -> 보통 개발자가 정해놓고 변경되지 않는 값(final)
// 이때 총페이지수는?
// 메일의 총갯수를 페이지당매일수로 나누고, 나머지가 없으면 total=몫, 나머지가 있으면 total=몫+1 
public class Exam_08 {

	public static void main(String[] args) {
		int total = 152;
		int countPerPage = 10;
		int pages = total / countPerPage;
		int totalPages;
		
		if (total % countPerPage == 0)
			totalPages = pages;
		else {
			totalPages = pages +1;
		}
		System.out.println(totalPages);

	}

}

//삼항연산자를 사용하는 방법
public class Exam_08 {

	public static void main(String[] args) {
		int total = 201;
		final int countsPerPage = 10;
		int totalPages = 0;
		
		totalPages = total / countsPerPage;
		totalPages = (total % countsPerPage == 0) ? totalPages : totalPages + 1; 
		
		System.out.println(totalPages);
	
	}

}
```

키보드로부터 입력받으려면 ?
-> scanner 

```java
Scanner keyin = new Scanner(System.in);
```

ctrl shift O 눌러서 

```java
import java.util.Scanner;
```

정수를 입력받아 변수에 저장
```java
int a = scan.nextInt();
```

### 키보드로부터 정수를 입력받아 짝홀 판별하는 프로그램

```java
import java.util.Scanner;

public class OperatorTest_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a ;

		System.out.println("숫자를 입력하세요");
		a = scan.nextInt();

		String result = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);

	}

}
```

nextInt() : 얘를 만나면 프로그램이 값을 입력받기위해 잠시 멈춘다

---

[요구사항]

세 과목의 점수가 70점 이상이면 수료가능, 아니면 수료불가능이 출력되는 프로그램 

[분석]

1. 세 과목 점수를 입력받는다
2. 조건 - 세 과목 모두 70점 이상이어야 수료

[구현]

```java
import java.util.Scanner;

// 세과목의 점수를 입력받는다
public class InputTest_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		String result;
		
		System.out.println("국어 점수를 입력하세요");
		a = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		b = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		c = scan.nextInt();
		
		result = (a>=70 && b>=70 && c>=70) ? "수료가능" : "수료불가능";
		
		System.out.println(result);
		
		
	}

}
```