import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest_01 {

	public static void main(String[] args) {
		FileWriter fw = null; //아직 파일이 오픈되지 않았음
		Scanner keyin = new Scanner(System.in);

		char[] ch = {67,68,69,70,130,140};
		try {
			fw = new FileWriter(new File("temp.txt"));
			
			fw.write(ch);//배열안의 정보를 한방에 저장
//			while(true) { //를 반복한다
//				System.out.println("값 입력: ");
//				int value = keyin.nextInt(); //입력받고
//				if(value == -1) break; //while(true)문을 빠져나가기 위한 조건을 준다
//				fw.write(value); //저장하고
//			} 
			System.out.println("끝");
		} catch (IOException e	) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null ) fw.close(); //close하다가 다시 오류가 날 수 있기때문에 try-catch로 감싸줘야함
			} catch(IOException e) {
				e.printStackTrace();

			}
		}
	}

}
