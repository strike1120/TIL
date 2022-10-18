/*
 
....*
...**
..***
.****
*****

 */
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
