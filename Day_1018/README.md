# 2022.10.18 Tue (Today I Learnd)

조건식 → 몇번출력할것인가를 결정

그래서 고정된 값을 사용하면 계속 같은 값이 나오기때문에 변수를 써줘야 함

print() → 괄호안에 반드시 어떤 값을 써줘야함. 안쓰면 오류남

들여쓰기는 프로그램상 아무 의미가 없고 

그냥 가독성 때문에 하는 행위임

```java
public class Exam_23 {

	public static void main(String[] args) {
		for(char i='A'; i<='Z'; ++i) {
			for(char j='A'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
```

```java
for(char j='A'; j<=i; j++) 의

```

이 코드로 인해 매 행은 ‘A’로 시작된다

왜냐하면 이 loop를 돌때마다 값이 A로 초기화 되니까

---

끝값이 A로 고정.

```java
for(char j=i;9 j>='A'; --j) 에서

j>='A';

이 부분이 끝값을 A로 고정하는 코드
```

```java
public class Exam_24 {

	public static void main(String[] args) {
		for(char i='A'; i<='Z'; ++i) {
			for(char j=i; j>='A'; --j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
```

---

1에서부터 9보다 작을때까지 1씩 증가 (1 2 3 4 5 6 7 8 9)

```java
for(int i=1; i<=9; ++i)
```

9에서 시작해서 1보다 크거나 같을때까지 1씩 감소시키면서 // 9 8 7 6 5 4 3 2 1

```java

		for(int i=9; i>=1; i--)

```

이중for문

```java
public class Practice_01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; ++i) {
			for(int j=2; j<=5; ++j) {
				System.out.print(j +"*"+i +"=" +(j*i)+"\t");
			}
			
		
			for(int k=6; k<=9; ++k) {
				System.out.print(k +"*"+i +"=" +(k*i)+"\t");
			}
			System.out.println();
		}
	}

}
```

```java
2*1=2	3*1=3	4*1=4	5*1=5	6*1=6	7*1=7	8*1=8	9*1=9	
2*2=4	3*2=6	4*2=8	5*2=10	6*2=12	7*2=14	8*2=16	9*2=18	
2*3=6	3*3=9	4*3=12	5*3=15	6*3=18	7*3=21	8*3=24	9*3=27	
2*4=8	3*4=12	4*4=16	5*4=20	6*4=24	7*4=28	8*4=32	9*4=36	
2*5=10	3*5=15	4*5=20	5*5=25	6*5=30	7*5=35	8*5=40	9*5=45	
2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	7*6=42	8*6=48	9*6=54	
2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	8*7=56	9*7=63	
2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	9*8=72	
2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
```

반복되는 횟수를 알때 → for문

반복되는 횟수를 모를때 → while문

do-while은 문법정도만 알고 있으면 됌.굳이 쓰는사람이 잘 없음

---

[https://wikidocs.net/206](https://wikidocs.net/206) (배열)



# 배열 (Array)

- 동일한 데이터타입의 데이터 여러개를 하
- 선형 자료형이다. (Linear)
    - 데이터를 여러개 선언하면 메모리안에서 첫번째 데이터와 두번째데이터가 나란히 서있어서 선형
- 참조 자료형이다
    - 주소값만 가지고 있는 변수 (참조변수)
    - 5개의 변수를 담을 수 있는 int형 배열을 만들어서 참조변수 a에 대입해라
        
        ```java
        int[] a = new int[5];
        ```
        
        ```java
        System.out.println(a); //hash값
        System.out.println(a[0]); //배열은 초기화 안해도 0으로 초기화됨
        ```
        

```java
import java.util.Scanner;

public class ArrayTest_01 {

	public static void main(String[] args) {
		int[] a = new int[10]; //a는 메모리상 위치값(hash값)만 가지고 있음
		Scanner scan = new Scanner(System.in);
		
		System.out.println(a.length);
		System.exit(0);
		
		//입력
		for(int i=0; i<5; ++i) {
			System.out.println("정수 입력:");
			a[i] = scan.nextInt();
		}
		
		//출력
		for(int i=0; i<5; ++i) {
			System.out.println(a[i]);
		}
		
		System.out.println(a); //hash값
		System.out.println(a[0]); //배열은 초기화 안해도 0으로 초기화됨	
		
		
	}

}
```

a.length - 배열의 길이 구하기

```java
int[] odds = {1, 3, 5, 7, 9};
```

```java
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
```

```java
String[] weeks = new String[7];
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
```

```java
int[] a = new int[5]; //a는 메모리상 위치값(hash값)만 가지고 있음
```


```java
		//입력
		for(int i=0; i<5; ++i) {
			System.out.println("정수 입력:");
			a[i] = scan.nextInt();
		}
		
		//출력
		for(int i=0; i<5; ++i) {
			System.out.println(a[i]);
		}
```

```

---

[문제 25]

size라는 이름의 정수변수를 선언한후 정수를 입력받는다

size는 정수배열의 크기이다

배열에 자연수 1~방크기 값까지 넣어 출력하시오

<실행>

배열의 크기

arr[0] = 1

arr[1] = 2

arr[2] = 3

…

arr[9] = 10

```java
/*
size라는 이름의 정수변수를 선언한후 정수를 입력받는다

size는 정수배열의 크기이다

배열에 자연수 1~방크기 값까지 넣어 출력하시오
 */
import java.util.Scanner;

public class Exam_25 {

	public static void main(String[] args) {
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		size = scan.nextInt();
		
		int[] numbers = new int[size];
		
		//처리
		for(int i=0; i<numbers.length; ++i) {
			numbers[i] = i+1;
		}
		
		//출력
		System.out.println("배열의 크기:"+size);
		for(int i=0; i<numbers.length; ++i) {
			System.out.println("numbers[" + i + "]" + "=" +numbers[i]);
		}
		
	}

}
```

---

[문제-26]

정수 배열 10개를 선언하고 임의의 값을 입력받는다.

입력받은 배열의

가장 앞에 위치한 데이터와 마지막 위치의 데이터의 값을 교환

1번방 데이터와 마지막-1방 위치의 데이터 값 교환..

<실습결과>

데이터를 입력하시오: (10개 입력함)

바뀌기 전

5 3 8 10 12 4 1 22 34 2

바뀐 후

2 34 22 1 4 12 10 8 3 5

```java
import java.util.Scanner;

public class Exam_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ary = new int[10];
		int temp;
		//반복적으로 입력받아야함 -> while or for 사용
		//몇번 loop를 돌지 아니까 -> for문 사용
		
		//입력
		for(int i=0; i<ary.length; i++) {
			System.out.print(i+"번째 방: ");
			ary[i]=scan.nextInt();
		}
		
		//데이터가 잘 입력됐는지 확인하기 위한 출력
		System.out.println("바뀌기 전");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		//처리 --> 절반만
		for(int i=0; i<ary.length/2; ++i) {
			temp = ary[i];
			ary[i]= ary[ary.length-1-i]; //가장끝 방
			ary[ary.length-1-i] = temp;
		}
		
		
		//처리가 잘 됐는지 확인하기 위해 출력
		System.out.println("바뀐 후");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();

	}

}
