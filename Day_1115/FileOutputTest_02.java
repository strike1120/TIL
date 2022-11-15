import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest_02 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file = new File("temp2.txt"); //파일자체가 생성된것이 아님., directory, file을 다룸
		byte[] by = {65, 78, 45, 123, 127}; // 134는 byte배열 사이즈를 넘어감, -127은 문자로 처리할 수 있는 범위가 아님
		
		try {
			//fos = new FileOutputStream(file); //파일객체를 생성 한 후 전달
			fos = new FileOutputStream( new File("temp2.txt"));//전달인자 안에다가 직접 넣는 방식
			
			fos.write(by); //for문 5번 돌린것과 동일한 효과가 있다
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작업종료!!");
	}

}
