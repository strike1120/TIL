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
			name = scan.nextLine(); //nextLine()
			
			System.out.print("좌석 입력(1~5): ");
			seatNum = scan.nextInt();
			scan.nextLine();
			
			if(1>seatNum || seatNum>5) {
				System.out.println("**다시 입력해주세요");
				--i;
				continue;
			}
			
			if(seats[seatNum-1] != null) {
				System.out.println("**이미 예약된 좌석입니다");
				--i;
				continue;
			}
			
			seats[seatNum-1] = name;
			System.out.println("예약이 완료되었습니다");
			
			System.out.println("=================================");
			for(int j=0; j<seats.length; ++j) { //꼭 다른변수를 써줘야함
				if(seats[j] == null) { //예약좌석이 없는 경우
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
