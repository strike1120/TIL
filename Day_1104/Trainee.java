
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
