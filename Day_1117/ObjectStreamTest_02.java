import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamTest_02 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("score.dat"));
		
		while(true){
			try {
				ScoreVO vo = (ScoreVO) ois.readObject(); //파일을 다 읽었을때 EOF익셉션이 발생(정상적인 일)
				System.out.println(vo);
			} catch(EOFException e) {
				System.out.println("종료");
				break;
			}
		}
		
		ois.close();
	}

}
