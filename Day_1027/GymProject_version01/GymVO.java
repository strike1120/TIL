
public class GymVO {
	private int usrId; //회원번호

	private String usrName; //회원이름
	private double weight; //몸무게
	private double height; //키
	private double bmi; //체질량 지수
	private String result; //결과

	public GymVO() {}

	public GymVO(int usrId, String usrName, double weight, double height) {
		this.usrId = usrId;
		this.usrName = usrName;
		this.weight = weight;
		this.height = height;
		calcBMI();
	}
	public int getUsrId() {
		return usrId;
	}

	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		calcBMI();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		calcBMI();
	}
	
	public double getBmi() {
		return bmi;
	}
	
	public void calcBMI() {
		this.bmi = this.weight / (this.height*0.01*this.height*0.01);
	}
	
	
	public String getResult() {
		if(bmi > 23 ) 
			result = "위험";
		else if(18.5 < bmi && bmi < 22.9)
			result ="정상";
		else if(bmi < 18.5)
			result = "저체중";
		return result;
	}

}