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
