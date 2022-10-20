
public class TwoDimTest_02 {
//행이 가지는 열의 개수가 다르게 코딩할 수 있다
	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		int count = 0;
		
		//배열초기화 - 값 넣는 코드 0행은 1, 1행은 2, 2행은 3으로 넣어라
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; ++j) {
				++count;
				arr[i][j] = count;
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; ++j) {
//				System.out.print(arr[i][j]+"\t");
				System.out.printf("%4d", arr[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
