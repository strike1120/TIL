# TIL (Today I Learnd) - 10.12.2022 WED

## [문제-16] if문을 이용한 정렬
3가지 정수를 입력 받아 if문만 사용하여 오름차순으로 정렬하시오

  임의의 정수 a,b,c 오름차순으로 정렬하기 

```java
import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,temp;
		
		System.out.println("1번 정수:");
		a = scanner.nextInt();
		
		System.out.println("2번 정수:");
		b = scanner.nextInt();
		
		System.out.println("3번 정수:");
		c = scanner.nextInt();
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a + "," + b + "," + c);
	}

}
```

---

[연습문제] BMI 결과 판정하기

키(cm), 몸무게(kg)를 키보드로 입력받는다.

BMI 지수 기준에 따라 과체중,정상,저체중을 판별한다

double height, weight, bmi;

String result = null;

```java
import java.util.Scanner;

public class Prcatice_01 {

	public static void main(String[] args) {
		
		double height, weight, bmi;
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키(cm)를 입력하세요");
		height = scanner.nextDouble();
		System.out.println("체중(kg)을 입력하세요");
		weight = scanner.nextDouble();
		
		// bmi = weight / (height*0.01 * height*0.01);
		height = height * 0.01;
		bmi = weight / (height * height);
//------------------------------------------------------------------------------	
		if(bmi>=23) {
			result = "과체중";
		} else if(bmi > 18.5) {
			result = "정상";
		} else 
			result = "저체중";
//------------------------------------------------------------------------------			
		System.out.printf("키(m) : %.2fm%n", height*0.01);
		System.out.println("몸무게(kg) :" + weight +"kg");
		System.out.printf("당신의 BMI는 %.2f이고 '%s'상태입니다.", bmi, result);
		
		
	}
}
```

- BMI = 몸무게(kg) / 키의 제곱(m)
- cm → m 변환하는 법 : 곱하기 0.01

** nextInt() 에 167.5를 입력하면 → 에러 발생

<실행 결과>

키(m) : ***

몸무게(kg) : ***

당신의 BMI는 23.54이고 ‘과체중’ 상태 입니다.

---

# switch~case~break문

```java
switch(정수변수, 문자열) {
case 값1 : 실행문...; 

	break;

case 값2 : 실행문...;
	
	break;

...

default : 실행문...;
}
```

- break문이 없으면 해당되지 않는 case의 실행문도 실행되게 된다
- default문은 break문이 필요없다. (바로 밑에 닫힌 중괄호가 있으니까)
- 중괄호 생략불가
- default : 특정 case에 걸리지 않는 모든 경우 처리
- break
- 정수변수 자리에는 - byte, short, int, long, char의 자료형을 가진 데이터가 들어갈수있다
    - char는 컴퓨터 내부에서는 정수값이기 때문
    

[예시]

```java
public class SwitchTest_01 {

	public static void main(String[] args) {
		String temp = "Father";  //Father !== father
		
		switch(temp) {
		case "father" : //temp안에 이런값이 들어있니?
			System.out.println("아버지");
			break;
		case "mother" : //temp안에 이런값이 들어있니?
			System.out.println("어머니");
			break;
		case "brother" : //temp안에 이런값이 들어있니?
			System.out.println("남자형제");
			break;
		case "sister" : //temp안에 이런값이 들어있니?
			System.out.println("여자형제");
			break;
		default : //case외의 모든 경우
			System.out.println("이웃");
			
		}

	}

}
```

```java
결과 : 이웃
```

[break문이 없는경우]

```java
public static void main(String[] args) {
		String temp = "father";
		
		switch(temp) {
		case "father" : //temp안에 이런값이 들어있니?
			System.out.println("아버지");
		
		case "mother" : //temp안에 이런값이 들어있니?
			System.out.println("어머니");
			break;
		case "brother" : //temp안에 이런값이 들어있니?
			System.out.println("남자형제");
			break;
		case "sister" : //temp안에 이런값이 들어있니?
			System.out.println("여자형제");
			break;
		default : //case외의 모든 경우
			System.out.println("이웃");
			
		}

	}

```

```java
결과 :
아버지
어머니
```

[father,Father 모두 해당되게 하고 싶은 경우]

```java
public static void main(String[] args) {
		String temp = "father";

switch(temp) {
		case "father" :
		case "Father" :
			System.out.println("아버지");
			break;
		case "mother" : 
			System.out.println("어머니");
			break;
		case "brother" : 
			System.out.println("남자형제");
			break;
		case "sister" : 
			System.out.println("여자형제");
			break;
		default : 
			System.out.println("이웃");
			
		}
		
		System.out.println("종료"); //switch문이 종료되면 여기로 온다
	}
```

---

[문제]

정수 2개, 연산자 1개를 입력받아

사칙연산을 수행하는 코드를 switch~case로 작성하시오

변수

int valuue1,value2;

String operator;

<실행결과>

숫자 1 : 5

숫자 2 : 4

연산자(+ - * /) : *

결과 : 5 * 4 = 20

숫자 1 : 5

숫자 2 : 4

연산자(+ - * /) : ^

결과 : 연산자 오류

[구현]

```java
import java.util.Scanner;

public class Prcatice_02 {

	public static void main(String[] args) {
		
		int num1, num2;
		String operator;
		String result;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num1 = scanner.nextInt();
		System.out.println("숫자를 입력하세요");
		num2 = scanner.nextInt();
		System.out.println("연산자를 입력하세요");
		operator = scanner.next();
		
		
//------------------------------------------------------------------------------	
		switch(operator) {
		
		case "*" :
			result = num1 +"*"+ num2 + "=" + num1 * num2;
			break;
			
		case "/" :
			result = num1 +"/"+ num2 + "=" + num1 / num2;
			break;
			
		case "+" :
			result = num1 +"+"+ num2 + "=" + (num1 + num2);
			break;
		
		case "-" :
			result = num1 +"-"+ num2 + "=" + (num1 - num2);
			break;
			
		default : 
			result = "연산자 오류";
		}
//----------------------------------------------------------------------	
		System.out.println("숫자1 : " + num1);
		System.out.println("숫자1 : " + num2);
		System.out.println("연산자(+ - * /) : " + operator);
		System.out.println("결과 : " + result);
	}
}
```

- 문자(한단어)를 입력받을때는 scanner.next(); 로 입력받는다
- nextLine() -
- nextInt() - 정수
- nextDoutble() - 실수

[구현 도중 실수했던 내용]

```java
case "+" :
	  //result = num1 +"+"+ num2 + "=" + (num1 + num2); //괄호를 빼면 문자열 계산이 되어버려서 숫자가붙어버림
			result = num1 +"+"+ num2 + "=" + (num1 + num2);
			break;
		
		case "-" :
   // result = num1 +"-"+ num2 + "=" + num1 - num2;   //괄호를 빼면 문자열 계산이 되어버려서 오류발생
			result = num1 +"-"+ num2 + "=" + (num1 - num2); 
			break;
```

최적화 = 읽기 수월하게 만드는 코드

코드를 혼자짜는게 아니고 팀단위로 짜기 때문에

누가봐도 이해하기 쉬운 코드가 중요.

특히 자바는 더 그렇다

하드웨어 성능이 올라가서 최적화 보다는 잘 읽히는 코드를 작성하는 것이 더 중요.

================================================================================================================================

# 반복문 (Loop)

1. while문
2. do~while문
3. for문 
4. for~each문

## while문

```java
while(조건문) {
    실행문;
}
```

- 조건문안에는
- 비교연산자(<,>,≥,≤,==), && , ||

```java
int cnt = 0;
while(cnt < 5) {
  sysout.println("안녕하세요");
  cnt = cnt + 1; //cnt값이 1증가
}
```

```java
안녕하세요
안녕하세요
안녕하세요
안녕하세요
안녕하세요
```

```java
public class WhileTest_01 {

	public static void main(String[] args) {
		int cnt = 0; // 초기식
		
		while(cnt < 10) { // 조건식
			System.out.println(cnt);
			++cnt //증감식. 이런 형태는 가능하면 변수 앞에 ++를 쓸것!
		}
		
		System.out.println("종료");

	}

}
```

- cnt++은 다른연산자와 함께 썼을때 연산자 우선순위가 확 떨어지기때문에
- ++cnt 처럼 앞쪽에 써주는것이좋다

[10부터 10씩 증가시켜서 100까지 출력]

```java
public class WhileTest_01 {

	public static void main(String[] args) {
		int cnt = 0; // 초기식
		
		while(cnt < 100) { // 조건식
			cnt = cnt + 10; //증감식
			System.out.println(cnt);
			
		}
		
		System.out.println("종료");

	}

}
```

```java
10
20
30
40
50
60
70
80
90
100
종료
```

[연습문제]

5 10 15 … 50 까지 가로로 출력

```java
public class WhileTest_03 {

	public static void main(String[] args) {
		int cnt = 0; // 초기식
		
		while(cnt < 10) { // 조건식
			System.out.println("안녕하세요");
			cnt = cnt + 1; // 증감식
		
		}
		
		System.out.println("종료");

	}

}
```

```java
5 10 15 20 25 30 35 40 45 50 
종료!!
```

---

[연습문제]

정수 2개를 입력받는다

이때 첫번째 정수는 두번째 보다 작아야 한다.

5개씩 출력 후 줄바꿈

```java
import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		int start, end;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1 입력");
		start = scan.nextInt();
		System.out.println("정수2 입력");
		end = scan.nextInt();
		
		
		while(start < end+1) { // 조건식
			System.out.print(start + " ");
			start = start + 1; // 증감식
			if((start % 5 == 0) && (start >= 10)) {
				System.out.println("");
			}
		
		}
		

	}

}
```