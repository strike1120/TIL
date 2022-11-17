import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamTest_03 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("score.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List<ScoreVO> list = new ArrayList<>(); //ArrayList 객체 생성 
		
		list.add(new ScoreVO("홍길동", 89, 88, 100));
		list.add(new ScoreVO("임꺽정", 99, 78, 100));
		list.add(new ScoreVO("손오공", 79, 77, 80));
		list.add(new ScoreVO("저팔계", 69, 98, 88));
		
		oos.writeObject(list); //list에 한번에 담고 저장
		
		oos.close();
		fos.close();
		System.out.println("쓰기 작업 종료"); //파일 저장 완료
//		==============================================================================================
		FileInputStream fis = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//덩어리째 저장했으므로 while문이 필요없음.
//		while(true) {
//			try {
//				ScoreVO obj1 = (ScoreVO) ois.readObject();
//				System.out.println(obj1);
//			} catch(EOFException e) { //파일의 마지막에 도착했다는 의미의 exception.
//				System.out.println("읽기 작업 종료");
//				break;
//			}
//		
//		}
		
		@SuppressWarnings("unchecked") //이클립스에게 형변환 잘못될까봐 체크하지말라고 알려주는 코드
		List<ScoreVO> tmp = (List<ScoreVO>)ois.readObject(); //형변환
		
		for(ScoreVO s : tmp) { // : 오른쪽(목록-배열이나, arraylist)의 정보를 한개씩 꺼내서 변수 s에 담는다
			System.out.print(s);
		}
		
		ois.close();
		fis.close();
		System.out.println("읽기 작업 종료");
	}

}
