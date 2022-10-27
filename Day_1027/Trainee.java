
public class Trainee {
	private int id;
	private String name;
	private double java;
	private double japan;
	private double basic;
	private double avg;
	
	//기본 생성자 -> 무조건 만들어 놓을 것!!
	public Trainee() {} 
	
	//생성자 오버로딩 (오버로딩된 생성자는 여러개의 매개변수를 가질 수 있음
	public Trainee(int id, String name, double java, double japan, double basic) {
		this.id = id;
		this.name = name;
		this.java = java;
		this.japan = japan;
		this.basic = basic;
		
		this.avg = (this.java * 0.4) + (this.japan * 0.3) + (this.basic *0.3) ; 
	}
	
//	public Trainee() { //개발자가 직접 만든 생성자 (구현부에 아무내용도 없는것이 기본생성자.자동으로 만들어짐)
//		this.id = 100;
//		this.name ="홍길동";
//		this.java = 89;
//		this.japan=90;
//		this.basic=100;
//		
//	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJava(double java) {
		this.java = java;
	}
	public void setJapan(double japan) {
		this.japan =japan;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
		
		
//	public double getAvg() {
//		avg = (java + japan + basic) /3 ;
//		return avg;
//	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getJava() {
		return java;
	}
	public double getJapan() {
		return japan;
	}
	public double getBasic() {
		return basic;
	}
	
	
	public void output() {
//		System.out.println(id+","+name+ ","+java+ ","+japan+ ","+basic+ ","+avg);
		System.out.printf("%2d %4s %.2f %.2f %.2f %.2f%n",id, name, java, japan, basic, avg);
	}
}
