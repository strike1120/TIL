import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTest_01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File file1 = new File("song.txt");
		
		if(!file1.exists()) {
			System.out.println("소스가 존재하지 않습니다");
			return;
		}
		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream("copy.txt");
			
			int data;
			
			while(true) {
				data = fis.read();
				
				if(data == -1) break;
				
				fos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos !=null) fos.close();
				if(fis !=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("복사완료");
	}

}
