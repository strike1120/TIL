//화씨 -> 섭씨로 바꾸는 프로그램
public class CastingExam {

	public static void main(String[] args) {
		int f = 60;
		//double c = ((double)f-32) * 5/9; // 5/9는 둘다 int형이라서 0 ->
		double c = (f-32) * (5/9.0);   //둘중하나를 double로
		
		System.out.println(c);
	}

}
