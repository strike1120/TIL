
/*
 ****
 */

public class Test_01 {
	
	public static void main(String[] args) {
		String[][] cary = new String[5][5];
		
		
		//초기화
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				cary[i][j] = "*";
				if(i==j) {
					cary[i][j] = ".";
				}
			}
		}
		
		
		//출력
		for(int i=0; i<cary.length; ++i) {
			for(int j=0; j<cary[i].length; ++j) {
				System.out.print(cary[i][j]);
			}
			System.out.println();
		}
	}

}
