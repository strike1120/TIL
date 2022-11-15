import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest_01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("data.txt");
			if(!file.exists()){ //inputstream하기전에 실제로 존재하는지를 먼저 체크해야함
				System.out.println("파일이 존재하지 않습니다. 확인 해주세여");
				return;
			}
			
//			fis = new FileInputStream("data.txt");
			fis = new FileInputStream(file);
			int result =0; 
			while(true) {
				result = fis.read(); //-1이 리턴되면 데이터가 없음을 나타냄
				if(result == -1) break;
				System.out.print((char)result);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
