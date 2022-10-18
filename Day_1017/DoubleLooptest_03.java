
public class DoubleLooptest_03 {

	public static void main(String[] args) {
		for(int j=5; j>=1; --j) {
			for(int i=0; i<j; ++i) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
