public class WhileTest_03 {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			System.out.print(i++);
			//System.out.print(i);
			// i++;
			if(i == 10) break;
		}
		System.out.println("end" + i);
	}

}