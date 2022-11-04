
public class TraineeTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		String[] str = new String[10];
		// 객체배열 생성(객체들을 담아놓을 상자) 생성
		Trainee[] student = new Trainee[6]; //Trainee클래스의 인스턴스만 담을 수 있는 배열 
		
        String[] s = {
                "홍길동 100 89 78",
                "손오공 99 89 75",
                "저팔계 80 70 50",
                "사오정 100 66 50",
                "이몽룡 70 100 68",
                "김방자 88 90 70"
        };
        
        // string배열의 문자열에서 데이터 하나씩 뽑아내기.
        for(int i=0; i<s.length; ++i) {
        	String[] temp = s[i].split(" ");
        	Trainee trainee = new Trainee(
	        		temp[0], //이름
		        	Integer.parseInt(temp[1]), //it점수
		        	Integer.parseInt(temp[2]), //일본어점수
		        	Integer.parseInt(temp[3]) //기본점수
        	);
        	
        	student[i] = trainee;
        	
        	
        	
        }
        //3번방 학생의 이름과 평균을 출력하시오
        System.out.println(student[3]); //student객체배열에 담겨있는 데이터
        System.out.println(student[3].getName()); //
        System.out.println(student[3].getAvg());
	}

}
