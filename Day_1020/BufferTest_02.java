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
			scan.nextLine(); //버퍼를 비우는 코드
			System.out.println("데이터: " + str1 +", "+ value);
		
			
		}
		
	}

}
