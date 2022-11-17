import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException { //원래는 try-catch로 잡고 가는게 좋다.왜? 오류가 난 문장의 아래문장들을 마무리 짓지 않고 바로 throw해버리기 때문에.
		ScoreVO vo1 = new ScoreVO("홍길동", 89, 88, 100);
		ScoreVO vo2 = new ScoreVO("임꺽정", 99, 78, 100);
//		System.out.println(vo); // 사실은 vo.toString()임.
		FileOutputStream fos = new FileOutputStream("score.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(vo1); //파일에 object 자체를 저장
		oos.writeObject(vo2); //파일에 object 자체를 저장
		
		oos.close();
		fos.close();
		System.out.println("쓰기 작업 종료"); //파일 저장 완료
//		==============================================================================================
		FileInputStream fis = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		Object obj = ois.readObject(); //존재하는 데이터만 읽을 수 있으므로 오류발생! -> throw
		
		//Object타입을 ScoreVO타입으로 하향캐스팅 한 후 사용 
//		ScoreVO obj1 = (ScoreVO) ois.readObject();
//		ScoreVO obj2 = (ScoreVO) ois.readObject();
//		System.out.println(obj1);
//		System.out.println(obj2);
		while(true) {
			try {
				ScoreVO obj1 = (ScoreVO) ois.readObject();
				System.out.println(obj1);
			} catch(EOFException e) { //파일의 마지막에 도착했다는 의미의 exception.
				System.out.println("읽기 작업 종료");
				break;
			}
		
		}
		
		ois.close();
		fis.close();
		System.out.println("읽기 작업 종료");
	}

}
