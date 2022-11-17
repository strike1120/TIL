import java.io.Serializable;

public class ScoreVO implements Serializable { //file로 내보낼때는 직렬화! (파일로 내보내서 저장하거나, 분산프로그래밍시 꼭 필요)
/**
	 * 
	 */
	private static final long serialVersionUID = -7542318441912048923L;
	//	private static final long serialVersionUID = 1L; // implements Serializable -> 버전 넣기 (버전 안넣으면 한번저장후 다시는 못읽게 됨)
	private String name;
	private int it;
	private int japanese;
	private int basic;	
	private int total; //계산해서 나오는 값이므로 생성자 생성시 포함 X
	private double avg; //계산해서 나오는 값이므로 생성자 생성시 포함 X
	
	//생성자
	public ScoreVO() {
		super();
	}

	public ScoreVO(String name, int it, int japanese, int basic) {
		super();
		this.name = name;
		this.it = it;
		this.japanese = japanese;
		this.basic = basic;
		calc();
	}

	private void calc() { //total과 avg를 계산하는 함수
		total = it + japanese + basic;
		avg = it * 0.4 + japanese * 0.3 + basic * 0.3;
	}

	//세터게터
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

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIt(int it) {
		this.it = it;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	// toString
	@Override
	public String toString() {
		String data = String.format("%4s %3d %3d %3d %3d %.2f%n", name,it,japanese,basic, total,avg);
		return data;
	}
	
	
	
	
	
}
