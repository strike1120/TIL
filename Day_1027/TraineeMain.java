
public class TraineeMain {

	public static void main(String[] args) {
		Trainee t = new Trainee();
		//t.output();
		
		Trainee t1 = new Trainee(2,"저팔계", 50, 70, 80);
		t1.output();
		t1.setJapan(100);
		t1.output();
	}

}
