
public class IfTest_03 {

	public static void main(String[] args) {
		int kor = 80, eng=89, mat=70;
		double avg = (kor+eng+mat)/3.0;
		
		String result = null; //String의 초기화값은 null
		
		if(avg >= 90) result="A"; //90점이상 A
		else if (avg >= 80) result="B";//90미만, 80이상 B
		else if (avg >= 70) result="C";// 80미만, 70이상 C
		else if (avg >= 60) result="D";// 70미만, 60이상 D
		else 				result="F";// 그 외 F
		
		System.out.println(result);
	}

}
