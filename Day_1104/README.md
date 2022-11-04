# TIL (Today I Learnd) - 22.11.04

[ 연습문제]
아래 주어진 문자열 배열에는 6명의 점수정보(IT, 일본어, Basic)가 저장되어 있다.
학생들의 정보를 한 명씩 읽어 Trainee 객체 정보에 각각 분리하여 저장하고 평균을 구하여 출력하는 코드를 완성하시오.


※ 아직, 객체 배열에 대해 배우지 않았으므로 한 명씩 처리하고 출력하는 코드로 작성하면 됩니다.

1) TraineeTest.java
```

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

```

2) Trainee.java
```

public class Trainee {
	private String name;   // 이름
    private int it;        // it점수
    private int japanese;  // 일본어점수
    private int basic;     // basic 점수
    private double avg;    // 평균 => IT 40%, 일본어 30%,  베이직 30%
   
    
    // 2종류의 생성자를 작성하시오
	public Trainee() {
		super(); //상위클래스인 object의 생성자 호출
	}

	public Trainee(String name, int it, int japanese, int basic) {
		super();
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;
		calcAvg(); //같은 클래스내에서는 private도 막 호출 가능. setter들은 다 calcAvg()를 가져야함. 점수가 바뀌면 평균이 바뀌니까.
	}
	
	private void calcAvg() {
		this.avg = it*0.4 + japanese*0.3 + basic*0.3;
	}

	// Setter, Getter 메소드를 작성하시오
	public String getName() {
		return name;
	}

	public int getIt() {
		return it;
	}

	public int getJapanese() {
		return japanese;
	}

	public int getBasic() {
		return basic;
	}

	public double getAvg() {
		return avg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIt(int it) {
		this.it = it;
		calcAvg();  //setter들은 다 calcAvg()를 가져야함. 점수가 바뀌면 평균이 바뀌니까.
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
		calcAvg(); //setter들은 다 calcAvg()를 가져야함. 점수가 바뀌면 평균이 바뀌니까.
	}

	public void setBasic(int basic) {
		this.basic = basic; 
		calcAvg(); //setter들은 다 calcAvg()를 가져야함. 점수가 바뀌면 평균이 바뀌니까.
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	// 전체 데이터를 출력하는 toString()메소드를 작성하시오
	@Override
	public String toString() { //object한테 물려받은 toString메소드를 커스터마이징
		return "Trainee [name=" + name + ", it=" + it + ", japanese=" + japanese + ", basic=" + basic + ", avg=" + avg
				+ "]";
	}

	
	
}
```