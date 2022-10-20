import java.util.Scanner;

public class BufferTest_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		while(true) {
//			System.out.print("입력: ");
//			str = scan.next(); //한 단어만 입력받을 수 있다
//			
//			System.out.println("데이터: " + str);
			
			str = scan.nextLine(); //버퍼 데이터를 다 가져옴 -> 버퍼가 비게된다
			System.out.println("데이터: " + str);
			
		}
		
	}

}
