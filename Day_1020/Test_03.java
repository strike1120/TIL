
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
