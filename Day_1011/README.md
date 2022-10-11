# TIL (Today I Learnd)
## 10.11.22


# 제어문

## if문

1. if - Version 1 (기본 형식)

```java
if(조건식) {

  // 조건식==true일때 수행할 문장들

}
```

** { }내부의 작업이 1개만 있을 때는 { } 생략가능

```java
// 나이 10살 이하이면 요금을 1000원 할인해준다
// If you are under 10 years old, you can get a 1,000 won discount
public class IfTest_01 {

	public static void main(String[] args) {
		int age = 20;
		int charge = 12000;
		
		if (age < 10) {
			charge = charge - 1000;
		}
		
			
		System.out.printf("지불요금 : %,d원%n", charge);
	}

}
```

1. if - Version 2 (else)

```java
if (조건식) {

  // 조건식이 true일때 실행할 문장

} else {

  // 조건식이 false일때 실행할 문장

}
```

[else 사용예시]

```java
// 나이 10살 미만이면 요금을 1000원 할인해준다 (요금 - 1000)
// If you are under 10 years old, you can get a 1,000 won discount
// 그게 아니라면 요금을 500원 할인해준다. (요금-500)
// If not, they give you a 500 won discount.
public class IfTest_02 {

	public static void main(String[] args) {
		int age = 20;
		int charge = 12000;
		
		if (age < 10) {
			charge = charge - 1000;
		} else {
			charge = charge - 500;
		}
		
			
		System.out.printf("price : %,d Won%n", charge);
	}

}
```

---

[else 사용예시]

// 정수값을 입력받아 짝수인지 홀수인지 판별하는 프로그램.
// A program that receives an integer value 
// and determines whether it is even or odd.

```java
import java.util.Scanner;

public class Practice_02 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력: ");
			int a = scan.nextInt();
			
			if(a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			
		}
	}

}
```

---

[else 사용예시]

char타입의 변수 ch에 임의의 영문자 1개를 저장하고,
대문자면 소문자로, 소문자면 대문자로 변환하여 출력.

After storing one random alphabet in the char type variable ch,
Write a program that converts uppercase letters to lowercase letters and lowercase letters to uppercase letters.

//대문자 A이상이고 대문자Z이하이면 대문자
//소문자 a이상이고 소문자z이하이면 소문자
// 32 === ''(스페이스, 공백)
// 'a' > 'A'

```java
import java.util.Scanner;

public class Practice_01 {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		if ('a'<= ch && ch <= 'z') {
			System.out.println((char)(ch - 32));
			
		} else { 
			System.out.println((char)(ch + 32));
			
		}
	
  }

}
```

1. if - Version 3

```java
if(조건1) {
  //조건 1이 참일때
} else if (조건2) {
  // 조건1이 아니면서 조건2에 만족할때
} else if (조건3) {
  // 조건1,2가 아니면서 조건3에 만족할때
} else {
  // 모든 조건에 다 만족하지 않을때
}
```

- 조건 1과 2에서 다른 변수를 쓰면 안됨
- 마지막 else는 생략가능

[사용예시]

```java
public class IfTest_03 {

	public static void main(String[] args) {
		int kor = 80, eng=89, mat=70;
		double avg = (kor+eng+mat)/3.0;
		
		String result = null; //String의 초기화값은 null
		
		if(avg >= 90) result="A"; //90점이상 A
		else if (avg >= 80) result="B";//90미만, 80이상 B
		else if (avg >= 70) result="C";// 80미만, 70이상 C
		else if (avg >= 60) result="D";// 70미만, 60이상 D
		else 				result="F";// 그 외 F
		
		System.out.println(result);
	}

}
```

================================================================================================================================

<프로그램>

1. 변수선언
2. 초기화
3. (if문같은) 처리문

---

[ 문제-12 ] if문을 이용한 합격 여부 출력
한 과목의 점수를 입력 받은 후 합격 여부를 출력하는 프로그램을 작성하시오.

<조건>
70점 이상은 합격
50~69점은 재시험
50점 미만은 탈락

```java
import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String result = null;
//----------------------------------------------------------
		if(score >= 70) result="합격";
		else if(score >= 50) result ="재시험";
		else result="탈락";
//----------------------------------------------------------
		System.out.println(result);
	}

}
```

---

[ 문제-14 ] 정상체중 구하기
체중(kg)과 키(cm)를 입력 받아 저체중인지 정상체중인지, 과체중인지 여부를 출력하는 프로그램을 작성하시오.
이때, 공식은 아래와 같으며, 체중을 구했을 때 해당 체중의 10kg 미만은 저체중, 정상체중 -10~ 정상체중 +10 은 정상 체중, 정상체중 +10 초과의 값은 과체중입니다.

<Hint>
적정 체중 = (키-100) X 0.9    ±10kg는 정상

```java
import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = sc.nextInt();
		System.out.println("체중을 입력하세요");
		double weight  = sc.nextInt();
		
		double proper = (height - 100)* 0.9;
		System.out.println("적정체중: " + proper + "kg");
		//----------------------------------------------------------
		if( weight - proper > 10 ) {
			System.out.println("과체중 입니다");
		} else if ( (weight - proper) <= 10) {
			System.out.println("정상체중 입니다");
		} else 
			System.out.println("저체중 입니다");
//----------------------------------------------------------
	}

}
```

<실행 결과>
키 입력 : 187
몸무게 입력 : 75
정상 체중입니다.

키 입력 : 164
몸무게 입력 : 70
과 체중입니다.