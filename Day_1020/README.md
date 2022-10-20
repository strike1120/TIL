# 2022.10.20 Thur (Today I Learnd)

j의목적은 전체 횟수를 제어하기 위한 목적으로 만들었기 때문에 

i,j 같은 횟수를 제어하는 변수는 건드리면 안된다

exam 29

```java
import java.util.Scanner;

public class Exam_29T {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seats = new String[5]; 
		String name;
		int seatNum; // 좌석번호
		
		//출력
		System.out.println("===============================");
		for(int i=0; i<seats.length; ++i) {
			System.out.print(" [ ] ");
		}
		System.out.println("\n");
		
		//입력 - 출력코드와 완전 분리해야함
		for(int i=0; i<seats.length; ++i) {
			System.out.print("예약자 이름 입력: ");
			name = scan.next(); //nextLine()
			
			System.out.print("좌석 입력(1~5): ");
			seatNum = scan.nextInt();
			
			if(seats[seatNum-1] != null) {
				System.out.println("**이미 예약된 좌석입니다");
				--i;
				continue;
			}
			
			seats[seatNum-1] = name;
			System.out.println("예약이 완료되었습니다");
			
			System.out.println("===============================");
			for(int j=0; j<seats.length; ++j) { //꼭 다른변수를 써줘야함
				if(seats[j] == null) {
					System.out.print(" [ ] ");
				}else {
					System.out.print(" [");
					System.out.print(seats[j]);
					System.out.print("] ");
					
				}
			} //end inner for loop
			System.out.println("\n");
		} // end outer for
		
		System.out.println("**모든 예약이 완료되었습니다");
	}

}
```

---

## 입력 버퍼 & 출력 버퍼

buffer : 메모리에서의 완충장치 

Input buffer 

output buffer

- next()
    - 한 단어만 입력받을 수 있음
    - abc def를 입력하면 abc만 변수에 들어가고, def는 버퍼에 남아있는 채로 종료된다
    - 입력버퍼에 아무것도 없을때 키보드로 부터 입력받는다
    - 만약 입력버퍼에 데이터가 남아있다면 키보드로부터 입력받지 않는다
    - 공백, 탭, 엔터(white space)를 입력받을 수 없다.
- nextLine()

```java
str = scan.nextLine(); //버퍼 데이터를 다 가져옴 -> 버퍼가 비게된다
			System.out.println("데이터: " + str);
```

```java
abc def kor
데이터: abc def kor
```

- nextInt()
    - 데이터를 정수로 파싱한다
    
    ```java
    import java.util.Scanner;
    
    public class BufferTest_02 {
    
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		String str;
    		int value;
    		
    		while(true) {
    			System.out.print("입력: ");
    			value = scan.nextInt(); //문자를 입력하면 exception발생
    			System.out.println("데이터: " + value);
    		
    			
    		}
    		
    	}
    
    }
    ```
    
    ```java
    입력: 21 45
    데이터: 21
    입력: 데이터: 45
    
    입력: 23 a
    데이터: 23
    입력: Exception in thread "main" java.util.InputMismatchException
    ```
    

```java
System.out.print("입력: ");
			str1 = scan.next(); //1.첫 단어를 가져감
			str2 = scan.nextLine(); //2.버퍼에 남아있는애들을 가져감
			System.out.println("데이터: " + str1 +", "+ str2);
```

```java
import java.util.Scanner;

public class BufferTest_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1, str2;
		int value;
		
		while(true) {
			System.out.print("이름: ");
			str1 = scan.nextLine(); //2번째 loop부터는 키보드로 입력불가=>이전 루프에서 nextInt()가 남긴 enter때문에 			
			
			System.out.print("번호 : "); //int()
			value = scan.nextInt();
			// scan.nextLine(); //** 버퍼를 비우는 코드 **
			System.out.println("데이터: " + str1 +", "+ value);
		
			
		}
		
	}

}
```

```java
이름: hm son
번호 : 7
데이터: hm son, 7
이름: 번호 :
```

- nextDouble()
    - 데이터를 더블형으로 파싱한다

---

## 2차원 배열

- 배열의 배열

```java
int[][] arr = new 
```

```java
public class TwoDimTest_02 {
//행이 가지는 열의 개수가 다르게 코딩할 수 있다
	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		int count = 0;
		
		//값 넣는 코드 0행은 1, 1행은 2, 2행은 3으로 넣어라
		for(int i=0; i<arr.length; i++) {
			++count;
			for(int j=0; j<arr[i].length; ++j) {
				arr[i][j] = count;
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; ++j) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
```

```java
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3
```

```java
public class TwoDimTest_02 {
//행이 가지는 열의 개수가 다르게 코딩할 수 있다
	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		int count = 0;
		
		//배열초기화 - 값 넣는 코드 0행은 1, 1행은 2, 2행은 3으로 넣어라
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; ++j) {
				++count;
				arr[i][j] = count;
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; ++j) {
//				System.out.print(arr[i][j]+"\t");
				System.out.printf("%4d", arr[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
```

```java
1   2   3   4   5
6   7   8   9   10
11  12  13  14  15
```

Test01

```java

```

```
.****
*.***
**.**
***.*
****.
```

Test02

```java

public class Test_02 {
	
	public static void main(String[] args) {
		String[][] cary = new String[5][5];
		
		
		//초기화
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				cary[i][j] = "*";
				if(i+j == 4) {
					cary[i][j] = ".";
				}
			}
		}
		
		
		//출력
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				System.out.print(cary[i][j]);
			}
			System.out.println();
		}
	}

}
```

```
****.
***.*
**.**
*.***
.****
```

Test03

```java
public class Test_03 {
	
	public static void main(String[] args) {
		int[][] cary = new int[5][5];
		int count =0;
		
		//초기화
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				++count;
				cary[i][j] = count;
				
				}
			}
		

		
		//출력
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				System.out.printf("%4d",cary[i][j]);
			}
			System.out.println();
		}
	}

}
```

```
	1   2   3   4   5
   6   7   8   9  10
  11  12  13  14  15
  16  17  18  19  20
  21  22  23  24  25
```