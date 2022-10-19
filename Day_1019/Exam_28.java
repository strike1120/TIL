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
