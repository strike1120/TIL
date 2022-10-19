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
		
		
		seats[seatnumber-1] = name;
		
		for(int i=0; i<seats.length; ++i) {
			if(seats[i] != null)
				System.out.print("["+seats[i]+"]");
			
			if(seats[i]== null) {
				System.out.print("[ ]");
			}
		}
		
	}

}
