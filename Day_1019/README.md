# 2022.10.19 Wed

스택은 한 쪽으로 보관하고 꺼내는 버퍼로 LIFO(Last In First Out)방식으로 동작해요. 

큐는 한 쪽으로 보관하고 다른 쪽으로 꺼내는 버퍼로 FIFO(First In First Out)방식으로 동작해요. 

덱은 양쪽으로 보관하거나 꺼낼 수 있는 버퍼예요.

[https://ehpub.co.kr/3-선형-자료구조/](https://ehpub.co.kr/3-%EC%84%A0%ED%98%95-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0/)

선형 자료구조: 메모리안에서 데이터가 차례대로 있는 구조

- 배열(array)
- stack : LIFO 데이터를 쌓아올리는 형태의 선형 자료구조
- queue : FIFO (프린터 대기열)

비선형 자료구조 : 메모리안에서 데이터가 여기저기 흩어져있는 자료구조

heap영역에 생성된 데이터는 0으로 초기화 된다.

```jsx
double[] dary = new double[5]; //0으로 초기화
```

참조변수 = 4byte

참조변수는 null값으로 초기화

```java
double[] dary = new double[5]; //5 * 8byte = 40byte (메모리상에서 연속적인 40byte의 공간이 있어야지만 할당가능)
```

생성 후 초기화

1. 일반 변수

```java
int[] numbers = {1,2,3,4,5};

char[] chars = {'k','o','r','e','a'};

String[] foods = {"짜장면", "짬뽕", "볶음밥"};
```

- 배열의 장점
- : 같은 데이터 타입의 변수가 여러개 필요할때 유용
- 배열의 단점
- : 동적으로 배열의 크기를 수정할 수 없다

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
```

27

[ 문제-27 ] 배열을 이용한 예약프로그램 작성

좌석이 10개 있는 소극장에 예약을 받는 시스템을 작성하려고 합니다. 예약자의 이름과 좌석 1~10을 입력 받아 전체 출력하는 프로그램을 작성하세요. (1회만 입력 가능)

<실행결과>

[    ][    ][    ][    ][    ][    ][    ][    ][    ][    ]

예약자 이름 입력 : James
좌석 입력 (1~10): 5

[    ][    ][    ][    ][James][    ][    ][    ][    ][    ]

```java
import java.util.Scanner;

public class Exam_27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		int seatnumber; 
		String[] seats = new String[10];
		
		System.out.println("=======================================");
		for(int i=0; i<seats.length; ++i) {
			System.out.print("[ ] ");
		}
		
		System.out.println("\n"); //두줄띄기
		
		System.out.println("예약자 이름 입력: ");
		name = scan.next();
		System.out.println("좌석입력(1~10): ");
		seatnumber = scan.nextInt();
		
		
		for(int i=0; i<seats.length; ++i) {
			seats[i] = " ";
		}
		
		seats[seatnumber-1] = name;
		
		for(int i=0; i<seats.length; ++i) {
			System.out.print("["+seats[i]+"] ");
		}
		
	}

}
```

---

[문제-28] 배열에 특정 데이터 입력받기

정수 배열 5개 선언 후 키보드로 데이터를 입력받아 값이 3의 배수인 경우만 배열의 각 요소에 대입하는 프로그램을 작성하시오.
5개의 배열에 값이 모두 채워지면 프로그램을 종료한다.

<실행 결과>
4
3 입력
6 입력
1
9 입력
7
2
12 입력
11
1
3 입력

입력 완료 결과
3 6 9 12 3

[순서도]

![938AFE8C-C2AC-416B-BBC1-4EB57B88F028.jpeg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/928d3534-4a6c-4482-947e-4360c7e95b44/938AFE8C-C2AC-416B-BBC1-4EB57B88F028.jpeg)

```java
import java.util.Scanner;

public class Exam_28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int[] nums = new int[5];
		
		
		for(int i=0; i<nums.length; ++i) {
			System.out.print("숫자 입력: ");
			num = scan.nextInt();
			if(num % 3 == 0) {
				nums[i] = num;
			} else {
				--i;
				continue; //밑에 코드가 없기때문에 무시할 코드가 없음
			}
		}
		
		for(int i=0; i<nums.length; ++i) {
			System.out.print(nums[i]+" ");
		}
		
		
		
	}

}
```

---

**[ 문제-29 ] 배열을 이용한 예약프로그램 작성**

좌석이 5개 있는 소극장에 예약을 받는 시스템을 작성하려고 합니다. 

예약자의 이름과 좌석 1~5을 입력 받아 전체 출력하는 프로그램을 작성하세요. 

(모든 좌석이 만석일 때까지 예약가능)

<실행결과>

=================================

[    ][    ][    ][    ][    ]

예약자 이름 입력 : James

좌석 입력 (1~5): 5

=================================

[    ][    ][    ][    ][James]

예약자 이름 입력 : Smith

좌석 입력 (1~5): 1

=================================

[ Smith][    ][    ][    ][James]

예약자 이름 입력 : Tom

좌석 입력 (1~5): 1

이미 예약이 되었습니다.

if(iary[seat-1] != null  ) 메출, --i, cont

예약자 이름 입력 : Tom

좌석 입력 (1~5): 2

=================================

[ Smith][ Tom ][    ][    ][James]

...

// 5개의 방에 입력이 완료된 후 아래와 같이 출력한다.

- * 예약 결과

[ Smith ][ Tom ][  Jennifer  ][ LeeSS   ][James]

[내 코드]

```java
import java.util.Scanner;

public class Exam_29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		int seatNumber; 
		String[] seats = new String[5];
		
		System.out.println("=======================================");
		for(int i=0; i<seats.length; ++i) {
				System.out.print("[ ]");
		}
		
		System.out.println("\n");
//		----------------------------------------------------
		for(int i=0; i<seats.length; ++i) {
			seats[i] = "";
		}
		
		
		for(int i=0; i<seats.length; ++i) {
			System.out.println("예약자 이름: ");
			name = scan.next();
			System.out.println("좌석 번호(1~5): ");
			seatNumber = scan.nextInt();
			
			if(seats[seatNumber-1] != "") {
				System.out.println("이미 예약된 좌석입니다");
				--i;
				continue;
			} 
			
			if(seats[seatNumber-1] == "") {
				seats[seatNumber-1] = name;
				
			}
			
			
			for(int j=0; j<seats.length; ++j) {
				System.out.print("[" +seats[j]+ "]" );
			}
			
			
			System.out.println();
			
		}
		
		System.out.println("*예약 결과*");
		for(int i=0; i<seats.length; ++i) {
			System.out.print("[ " +seats[i]+ "]" );
			
		}
		
	}

}


★꺠달은점: 이중for문을 사용할때는 loop변수를 i , j 처럼 각각 다른 문자로 써줘야한다.