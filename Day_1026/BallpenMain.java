class Ballpen {
	double size; //불펜 심굵기
	String color; //볼펜 색깔
	
	public void output() {//Ballpen pen빼도 됨
		//System.out.println("size:" + pen.size+"mm"+ ","+ "color:" + pen.color);
		
		System.out.println(this.size+"mm"+ ","+ this.color); //this는 우리 멤버 color, 우리 멤버 size 라는 의미
		//this 생략가능
	}
}


public class BallpenMain { //main함수를 가지고 있는 애만 public을 붙일수있다

	public static void main(String[] args) {
		//black
		Ballpen black = new Ballpen();
		black.color = "black";
		black.size = 0.5;
		black.output();
		//red
		Ballpen red = new Ballpen();
		red.color = "red";
		red.size = 0.7;
		red.output();
	}
	
	public void output(Ballpen pen) {
		System.out.println("size:" + pen.size+"mm"+ ","+ "color:" + pen.color);
		
	}
	
	


}
