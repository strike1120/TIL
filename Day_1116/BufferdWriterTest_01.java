import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterTest_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader(new File("score.txt"));
		fw = new FileWriter(new File("score_result.txt")); //File객체를 인자로 받는 FileWriter객체 생성
		
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw); //객체를 인자로 받는 BufferedWriter객체 생성
		
		String score;
		String name;
		int it, japanese, basic, total;
		double avg;
		while(true) {
			score = br.readLine(); //학생 한 명의 정보를 score변수에 담는다
			if(score == null) break; //더이상 읽어올 정보가 없으면 break로 while문을 빠져나간다
			//1. split
			String[] arr = score.split(" ");
			//2. parse
			name = arr[0];
			it = Integer.parseInt(arr[1]);
			japanese = Integer.parseInt(arr[2]);
			basic = Integer.parseInt(arr[3]);
			
			//3. 합계와 평균 구하기
//			total = it + japanese + basic;
//			avg = total /3.0f;
			
			
//			System.out.println(score); //김유신 100 98 88 - split을 사용해서 정보를 끊을 수 있다.

			// String 형태로 형변환 시켜서 data 변수에 저장
			// String data = String.format("%4s %3d %3d %3d %3d %.2f%n", name,it,japanese,basic, total, avg); 
			//VO 객체에 저장함
			ScoreVO vo = new ScoreVO(name, it, japanese, basic);
			System.out.print(vo); //화면(콘솔창)으로 
			bw.write(vo.toString()); //파일로
		}
		br.close();
		fr.close();
		
		bw.close();
		fw.close();
	}

}

