import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest_01 {

	public static void main(String[] args) {

//		1. 객체생성을 한다 (Output)
		FileOutputStream fos = null;
			try {
				//1 여기서 익셉션이 발생되었다면? -> finally에서 바로 close를 할 수가 없음
				fos = new FileOutputStream("temp.txt"); //파일이 생성. 이미 있으면 overwriting
				
				//2.작업을 한다
				fos.write(65);
				int ch = 'A';
				for(int i =ch; i<(ch+26); ++i) {
					fos.write(i);
				}
				fos.write('\n');
				
				ch = 97;
				for(int i =ch; i<(ch+26); ++i) {
					fos.write(i);
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fos !=null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
//		2. 쓰는 작업을 한다 - write
//		3. 마무리 작업을 한다 - 특히, output은 마무리 작업을 안하면 파일 깨
	}

}
