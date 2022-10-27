public class PolygonVO {
	private int type; //다각형의 종류(몇각형?)
	private String name; //다각형의 이름
	
	
	//private 멤버변수에 접근할 수 있도록 메소드를 만들어줌
	//값을 private변수에 대입하는 메소드: setter -> public void set변수명(변수타입 변수명)(공식이니까 걍 외우기)
	//값을 private변수에서 가져가는 메소드 : getter -> public 리턴타입 getType();
	
	public void setType(int type) {
		this.type = type; //this를 빼버리면 이안에는 지역변수만 존재하게 되는 꼴이되므로 꼭 써줘야함.
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getType() {
		return type;
	}
	
	public String getName()	{
		return name;
	}
	
	public void output() {
		System.out.println(type + "," + name);
	}
	
}
