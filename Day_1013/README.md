# TIL (Today I Learnd) 10.13.22 Thur

## 3

```java
public class Test {

	public static void main(String[] args) {
		int cnt=0, sum=0;
		while (cnt<10) {
			++cnt;
			sum += cnt;
			
		}
		System.out.println(cnt+", "+ sum);

	}

}
```

```java
public class Test {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			System.out.println("*");
			if(i++ > 5) break;
		}

	}

}
```

```java

```

## 2

```java
import java.util.Scanner;

public class Test {

public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	System.out.print("점수를 입력하세여:;");
	int score = keyin.nextInt();

	switch(score/20) {
	case 5 : System.out.print("*");
	case 4 : System.out.print("*");
	case 3 : System.out.print("*");
	case 2 : System.out.print("*");
	case 1 : System.out.print("*");
	}
	System.out.println();

}
}
```

## 4

```java
public class Test {

	public static void main(String[] args) {
		int data = 10;
		if(true) {
		    System.out.print(data);
		}
		System.out.println("  끝");
	}
}
```

## 5

```java
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int i=0;
		while(i>5) {
			System.out.print("*");
			i--;
		}
	}
}
```

---

```java
public class Test {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			System.out.println("*");
			if(i++ > 5) break;
		}

	}

}
```

- 무한반복 → 조건에 의해 while 문을 벗어날 수 있도록 프로그래밍 해야한다. (if, break사용)
- break
    - while문이나 switch를 벗어남
    - ★감싸고 있는 1개의 반복문만 벗어난다!

---

문자열 + 숫자 = 문자열

```java
String t = 1 + 2 // 오류
String t = "1" + 2 // "12"가 t에 대입
```

증감연산자, 비교연산자 우선순위

```java
if (i++ > 5) break;
// 1. i > 5 (먼저비교 후)
// 2. i++ (값 증가)
```

```java
if (++i > 5) break;
// 1. i++ (먼저 값 증가)
// 2. i > 5 (비교)
```

---

## while 과 do-while

while문

- 1번도 반복 못할 수 있다.
- 왜? 조건을 먼저 판단하기 때문에

```java
int i = 0;

while(i>10) {
   System.out.print("hi")
}
```

do-while문

- 무조건 1회는 실행가능
- 조건을 보지않고 일단 먼저 실행하기 때문
- (do-while을 쓰는 경우는 많지 않기 때문에 while문을 더 )

```java
int i = 0;

do {
  System.out.print("hi")
} while (i > 10);
```

수식이나 변수가 들어간

switch(수식이나 변수)

프로그램을 (강제로) 종료

```java
System.exit(0); 
```

```java
import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		String choice;
		Scanner keyin = new Scanner(System.in);
		//반복적으로 문자열을 입력받는다
		//입력받은 데이터를 choice변수에 넣는다
		//어떤게 반복되느냐를 생각
		//몇번반복할지를 정하지 않았다면 true
		while(true) {
			System.out.println("*메뉴를 선택 : ");
			choice = keyin.next();
			
			switch(choice) {
			case "1" : 
				System.out.println("1번을 선택하셨습니다");
				break;
			case "2" : 
				System.out.println("2번을 선택하셨습니다");
				break;
			case "0" : 
				System.out.println("종료합니다");
				System.exit(0); // 프로그램 종료 
			default : 
				System.out.println("err > 선택 오류");
			}
		}
	}

}
```

---

### 소수인지 아닌지 판별하는 프로그램

- 소수 : 1과 자기자신 외의 모든 자연수와 나누어떨어지지 않는 수

```java
import java.util.Scanner;

public class ForTest_01 {

	public static void main(String[] args) {

		int value, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("100이하의정수 입력");
		value = scan.nextInt();
//============================================================	

		if(value < 0 || value > 100) {
			System.out.println("잘못된값이 입력되었음");
			System.exit(0); //early stopping (맨위에서 해야함)
		}
		

		if(value == 1) {
				System.out.println("소수가 아님");
				System.exit(0);
			}

		for(i=2; i<value; i++) {			
			if(value % i == 0) {
				System.out.println("소수 아님");
				System.exit(0);
			}
		}
			
	
		System.out.println("소수다");

	}
}
```

문제발생

- 숫자 1을 입력한 경우 ‘소수가 아니다’를 출력하고 프로그램이 종료되게 하고 싶었는데
- 아래처럼 작성하니까 1을 입력하면 ‘소수다’라고 출력이 되었다

```java
int value, i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("100이하의정수 입력");
		value = scan.nextInt();
//=======================================================
		if(value < 0 || value > 100) {
			System.out.println("잘못된값이 입력되었음");
			System.exit(0); //early stopping (맨위에서 해야함)
		}
			
		for(i=2; i<value; i++) {
			if(value == 1) {
				System.out.println("소수가 아님");
				System.exit(0);
			}

			if(value % i == 0) {
				System.out.println("소수 아님");
				System.exit(0);
			}
		}
			
		
		System.out.println("소수다");
```

원인

```java
for(i=2; i<value; i++) {
			if(value == 1) {
				System.out.println("소수가 아님");
				System.exit(0);
			}

```

- scanner로 value에 1을 넣었어도, 다시 for문에서 i값을 2로 초기화했기때문에
- 아래의 if문은 시작부터 false를 가지게 되어 작동할 수 없었던 것.

해결

```java
import java.util.Scanner;

public class ForTest_01 {

	public static void main(String[] args) {

		int value, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("100이하의정수 입력");
		value = scan.nextInt();
		

		if(value < 0 || value > 100) {
			System.out.println("잘못된값이 입력되었음");
			System.exit(0); //early stopping (맨위에서 해야함)
		}
		

		if(value == 1) {
				System.out.println("소수가 아님");
				System.exit(0);
			}

		for(i=2; i<value; i++) {			
			if(value % i == 0) {
				System.out.println("소수 아님");
				System.exit(0);
			}
		}
			
		
		System.out.println("소수다");

	}
}
```

- 문제가 되었던 if문을 for문 바깥으로 빼주었더니 바로 해결되었다

