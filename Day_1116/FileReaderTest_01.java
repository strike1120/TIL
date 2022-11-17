import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest_01 {

	public static void main(String[] args) {
		//file에서 읽어서 화면에 출력
		FileReader fr = null;
		
		try {
			fr = new FileReader("song1.txt");
			while(true) {
				int data = fr.read(); //데이터를 한글자씩 읽어서 (복사)
				if(data == -1) break;
				System.out.print((char)data); //화면(메모장)에 출력 (붙여넣기)
			} 
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close(); //null-메모장을 열지 못했을때 / !null - 메모장을 열었을 때
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
