# TIL (Today I Learnd) - 10.14.2022 Fri

## [ 문제-17 ] while문을 이용하여 올바른 값 입력 받기

while문과 if문을 사용하여 정수를 입력 받되, 0미만의 값이나 100초과한 값이 입력되면 계속 다시 받는 프로그램을 작성하시오. 단, 0이 입력되면 프로그램 종료

<실행 결과>
정수를 입력 : 123
입력 값 오류
정수를 입력 : -67
입력 값 오류
정수를 입력 : 70

[구현]

```java
import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		
		while(true) {
			System.out.println("정수를 입력하세요");
			num = scan.nextInt();
		
			if(num == 0)
				System.exit(0); //break; 써도 됨
			
			if(num <0 || num > 100)
				System.out.println("입력값 오류");
			else
				System.exit(0);
		}	

	}

}
```

- 몇번 반복할지 모를때는 while(true)

---

## [ 문제-18 ] while과 if를 이용하여 약수 구하기

정수를 입력 받아 약수를 모두 출력하는 프로그램을 작성하시오

<실행 결과>
정수를 입력 하세요.64
1
2
4
8
16
32
64

[사고 과정]

약수 - 1, 자기자신 & 2로 나눈 몫 (

[구현]

```java
import java.util.Scanner;

/*
[ 문제-18 ] while과 if를 이용하여 약수 구하기
정수를 입력 받아 약수를 모두 출력하는 프로그램을 작성하시오

<실행 결과>
정수를 입력 하세요.64
1
2
4
8
16
32
64
 */
public class Exam_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=1, num, result=0;
		System.out.println("정수를 입력하세요");
		num = scan.nextInt();
		
		while(i<=num) {
			if(num % i == 0) {
				System.out.println(i);
				++i;
			}
		}
		
	}

}
```

---

## [ 문제-19 ] while문을 이용한 횟수 구하기

반복적으로 값을 입력받아 합계를 구하여 그 합계가 100을 초과하기까지 몇 번의 입력이 있었는지 횟수를 세는 프로그램을 작성하시오

<실행결과>
정수 입력 : 12
현재까지 합계 : 12
정수 입력 : 63
현재까지 합계 : 75
정수 입력 : 12
현재까지 합계 : 87
정수 입력 : 56
현재까지 합계 : 143
총 4회 입력을 받았습니다.

반복적으로 값을 입력받아  → while문 안쪽에 로직이 있어야함

문제를 읽고 → 몇개의 변수가 필요할지 먼저 생각해보기

[풀기 전 사고과정]

변수

- 입력 값 (value)
- 입력한 값들의 합계 (sum)
- 값을 입력한 횟수 (cnt)

while(sum<100)
값을 한번입력할때마다 cnt +1

[내 코드]

```java
import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value, sum=0, cnt=0;
		
		while(sum < 101) {
			System.out.println("정수를 입력하세요");
			value = scan.nextInt();
		
			sum = sum + value;
			System.out.println("현재까지의 합계:" + sum);
			
			cnt = cnt + 1;
		}
		System.out.printf("총 %d회 입력을 받았습니다%n", cnt);

		
	}

}
```

[강사님 코드]

```java
import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value, sum=0, cnt=0;
		
		while(true) {
			System.out.println("정수를 입력하세요");
			value = scan.nextInt();
			++cnt; //cnt = cnt + 1;
			sum = sum + value;
			System.out.println("현재까지의 합계:" + sum);
			
			if(sum > 100) break;
			
		}
		System.out.printf("총 %d회 입력을 받았습니다%n", cnt);

		
	}

}
```

---

## [ 문제-20 ] for문을 이용하여 1~10 자연수의 합계 구하기

1~10까지 자연수를 모두 더한 합계를 출력하시오

<실행 결과>
1~10까지 더한 값 : 55

```java
public class Exam_20 {

	public static void main(String[] args) {
	
		int sum=0;
		
		for (int i=0; i<11; i++) {
			sum = sum + i; //sum += i;
		}
		System.out.println("1~10까지 더한 값: "+ sum);
	}

}
```

---

# [ 문제-21 ] 1~n 까지의 자연수의 합계 구하기

키보드로부터 정수를 입력 받아 1에서부터 입력 받은 수까지의 자연수의 합을 모두 구하여 출력하시오.

<실행 결과>
정수 입력 : 100
1~100까지 더한 값 : 5050
정수 입력 : 20
1~20까지 더한 값 : 210

변수

- 입력 받은 정수 값
- 합계
- i

```java
public class Exam_20 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int sum=0, n;
		n = keyin.nextInt();

		for (int i=0; i<n; i++) {
			sum = sum + i; //sum += i;
		}
		System.out.printf("1~%d까지 더한 값: %d%n",n, sum);
	}

}
```

---

## [ 문제-22 ] 돼지의 해 구하기

연도를 입력 받아 서기 0년~입력 년도 n 사이의 모든 돼지의 해를 출력하시오

<Hint> 돼지의 해는 연도를 12로 나누어 나머지가 3인 해이다.

<실행 결과>
년도 입력 : 2019
1년 2019년까지 돼지의 해 :
3년
15년
27년
39년
51년
63년
75년
…
2019년

현재까지 돼지의 해는 xxx번 있었습니다.

---

[구현 전 사고]

변수

- 현재년도 (year)
- 돼지의 해 (pig)

---

[구현]

<강사님 코드>

```java
import java.util.Scanner;

public class Exam_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year, pig, cnt=0;
		
		System.out.println("연도를 입력하세요");
		year = scan.nextInt();
		System.out.println("1년~"+year+"년 까지 돼지의 해: ");
		
		for(int i=1; i<=year; ++i) { //for안의 문장이 if문 하나이기때문에 중괄호 생략가능
			if(i % 12 == 3) {
				pig = i;
				System.out.println(pig +"년");
				++cnt;
			}
		}
		System.out.printf("서기 1년~ %d년까지 돼지의 해는 %d번 있었습니다.%n",year,cnt);
	}

}
```

<내 코드>

```java
import java.util.Scanner;

/*
[ 문제-22 ] 특정 년도 구하기
연도를 입력 받아 서기 0년~입력 년도 n사이의 모든 돼지의 해를 출력하시오

<Hint>
돼지의 해는 연도를 12로 나누어 나머지가 3인 해이다.

<실행 결과>
년도 입력 : 2019
1년 2019년까지 돼지의 해 :
3년
15년
27년
39년
51년
63년
75년
…
2019년
 */
public class Exam_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=1, year, pig;
		
		System.out.println("연도를 입력하세요");
		year = scan.nextInt();
		System.out.println("1년~"+year+"년 까지 돼지의 해: ");
		
		while(i<=year) {
			if(i % 12 == 3) {
				pig = i;
				System.out.println(pig +"년");
				i++;
			} else   
				++i;
		}
	}

}
```