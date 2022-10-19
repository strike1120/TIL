# 2022.10.17 (Today I Learnd)

## continue문

continue 다음에 오는 코드가 존재해야 의미를 가진다.

```java
public class CotinueTest {

	public static void main(String[] args) {
//		int i = 0;  //main메소드 소속
		int j=0;
		while (true) {
//			int j=0; //while문을 돌때마다 값을 초기화.1이 무한히 찍힘.
			++j;
			if(j==10) break;
			if(j%2==0) continue;
			System.out.println(j);
		}
		
		for(int i=0; i<10; i++) {
			if(i==5) continue; //continue다음에 오는 모든 코드를 건너뛰고 바로 loop로 돌아감
			if(i%2 == 0) continue; //홀수만 찍어내는 코드
			System.out.println("현재 값 :"+i);
			
		}
		System.out.println("끝!");
	}

}
```

## for문

```java
//1~127가지 코드값:문자를 출력 (for문으로)
//5개 찍을때마다 줄바꿈
public class ForTest {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<128; i++) {
			System.out.print(i+":"+ (char)i+ "\t");
			++cnt
			if(cnt % 5 == 0) {
				System.out.println();
			}
		}
	}

}
```

## 이중반복문

```java
//이중반복문
public class WhileTest {

	public static void main(String[] args) {
		char ch = 'a';
		while(ch <= 'z') {
			System.out.print(ch + ": ");
			++ch;
			int cnt = 0;
			while(cnt<10) {
				System.out.print(cnt +" ");
				++cnt;
			}
			System.out.println();
		}
	
	}

}
```

## 팩토리얼 (while)

```java
import java.util.Scanner;

//10보다 작은 정수값을 입력받아서 해당 갑까지의 factorial을 구하여 출력하시오
//2! = 2
//3! = 6
//4! = 24
public class WhileTest_02 {

	public static void main(String[] args) {
		
		int i=0, fac=1, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("10미만의 정수값을 입력하세요");
		num = scan.nextInt();
		
		while(i<num) {
			++i;
			fac = fac * i;
		}
		System.out.println(num+"!= " + fac);
	}

}
```

## 팩토리얼 (for)

```java
import java.util.Scanner;

//10보다 작은 정수값을 입력받아서 해당 갑까지의 factorial을 구하여 출력하시오
//2! = 2
//3! = 6
//4! = 24
public class ForTest_02 {

	public static void main(String[] args) {
		
		int fac=1, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("10미만의 정수값을 입력하세요");
		num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			fac = fac * i ;
		}
		System.out.println(num+"!= " + fac);
		
}
}
```

## 이중for문

[출력결과]

```java
10미만의 정수값을 입력하세요
4
2!= 2
3!= 6
4!= 24
```

[코드]

```java
import java.util.Scanner;

public class ForTest_02 {

	public static void main(String[] args) {
		
		int fac=1, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("10미만의 정수값을 입력하세요");
		num = scan.nextInt();
		
		for(int j=2; j<=num; j++) {
			fac=1;
			for(int i=1; i<=j; i++) {
				fac = fac * i ;  //1 * 1 * 2 * 3 * 4
			}
			System.out.println(j+"!= " + fac);
		}
}
}
```

우리는 천재가 아니기때문에 반복하는수밖에 없다

알고리즘은 하면 는다. 반복해서 연습만이 답이다

---

```java
#####
#####
#####
#####
#####
```

```java
public class DoubleLooptest_01 {

	public static void main(String[] args) {
		for(int j=0; j<5; ++j) {  //줄의 갯수 제어
			for(int i=0; i<5; ++i) {   //#의 개수 제어
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
```

```java
#####
####
###
##
#
```

```java
public class DoubleLooptest_02 {

	public static void main(String[] args) {
		for(int j=5; j>=1; --j) {
			for(int i=0; i<j; ++i) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
```

---

```java
9*1=9
9*2=18
9*3=27
9*4=36
9*5=45
9*6=54
9*7=63
9*8=72
9*9=81
```

```java
public class DoubleLooptest_02 {

	public static void main(String[] args) {
		int dan = 9;
		for(int i=1; i<=9; ++i) {
			System.out.println(dan+"*"+i +"="+ (dan*i));
			
		}
	}

}
```

---

## 2~9단 구구단

```java
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18

3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27

...
```

```java
public class DoubleLooptest_02 {

	public static void main(String[] args) {
		for(int dan=2; dan<=9; ++dan) {
			for(int i=1; i<=9; ++i) {
				System.out.println(dan +"*"+ i + "="+ dan * i);
			}

		System.out.println();
		}
	}
}
```

---

```java
....*
...**
..***
.****
*****
```

```java
public class DoubleLooptest_04 {

	public static void main(String[] args) {
		for(int j=5; j>=1; --j) {
			for(int i=1; i<j; ++i) {
				System.out.print(".");
			}
			
			for(int i=j-4; i<=1; ++i) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
```