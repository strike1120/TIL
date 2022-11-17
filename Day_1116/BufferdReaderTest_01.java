import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class BufferdReaderTest_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		FileReader fr = null;
		
		fr = new FileReader(new File("score.txt"));
		br = new BufferedReader(fr);
		
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
			total = it + japanese + basic;
			avg = total /3.0f;
//			System.out.println(score); //김유신 100 98 88 - split을 사용해서 정보를 끊을 수 있다.
//			System.out.printf("합계 : %d%n", total); //합계 출력
//			System.out.printf("평균 : %.2f%n", avg); //평균 출력
		//	System.out.printf("%4s %3d %3d %3d %3d %.2f%n", name,it,japanese,basic, total,avg); //평균 출력
			
			String data = String.format("%4s %3d %3d %3d %3d %.2f%n", name,it,japanese,basic, total,avg);
			System.out.println(data);
		}
//		br.close();
//		fr.close();
	}

}
