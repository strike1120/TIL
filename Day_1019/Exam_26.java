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
