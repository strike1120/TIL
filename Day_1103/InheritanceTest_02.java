class Person {
	private String name;
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	public void output() {
		System.out.println("이름: " + this.name);
	}
}

class Student extends Person {
	private int score;
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	
	@Override
	public void output() {
		//output(); //자기자신. 오버라이드 하는 순간 부모의 output함수는 가려져서 호출할수없다.
		//super(); // 부모의 생성자를 호출하는 코드
		super.output(); // 부모의 output함수를 호출하는 코드
		System.out.println("점수:" + this.score);
	}
	
	@Override
	public String toString() {
//		String temp = this.getName()+ ","+ this.score;
//		return temp;
		return this.getName()+ ","+ this.score;
	}
	
}
public class InheritanceTest_02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setScore(90);
		System.out.println(s.getName()+","+s.getScore());
		
		s.output();
		
		System.out.println(s.toString());
		System.out.println(s);
		//원래는 주소값이 찍혀야하지만, 
		//println은 출력하려는 참조변수의 객체가 toString()을 오버라이딩 했을 경우에는
		//자동으로 s.toString()으로 변환해서 출력한다.
		System.out.print(s);
		System.out.printf("%s%n", s.toString()); //printf는 객체를 전달할 경우 풀네임을 적어서 호출해야함
	}
}
