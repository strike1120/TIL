//1~127가지 코드값:문자를 출력 (for문으로)
//5개 찍을때마다 줄바꿈
public class ForTest {

	public static void main(String[] args) {
		int cnt = 1;
		for(int i=1; i<128; i++) {
			System.out.print(i+":"+ (char)i+ "\t");
			if(i%5==0) {
				++cnt;
				System.out.println();
			}
		}
	}

}
