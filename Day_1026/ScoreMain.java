
public class ScoreMain {
	String temp1;
	static String temp2; //static이붙으면 객체생성없이 사용가능
	
	public static void main(String[] args) {
		ScoreClass s = new ScoreClass(); //객체가 생성됨
		s.name ="홍길동";
		s.Kor =98.5;
		s.rank=1;
		
		System.out.printf("%s, %d, %d",s.name, s.Kor, s.rank);
		
		ScoreClass.temp = "임시변수";
		temp2 = "이것도 임시변수"; //같은 클래스에 소속되어 있으면 클래스명 생략가능
		ScoreMain ts = new ScoreMain();
		ts.temp1 = "이것은 임수변수지만 생성했음";
	}

}
