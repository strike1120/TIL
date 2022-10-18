//이중반복문
public class WhileTest {

	public static void main(String[] args) {
		char ch = 'a';
		while(ch <= 'z') {
			System.out.print(ch + ": ");
			++ch;
			int cnt = 0;
			while(cnt<10) {
				System.out.print(cnt +" ");
				++cnt;
			}
			System.out.println();
		}
	
	}

}
