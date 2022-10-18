//삼중for문
public class Gugudan_03 {

	public static void main(String[] args) {
		
		for(int k=2; k<=6; ++k) {
			for(int i=1; i<10; ++i) {
				for(int dan=k; dan<=k+3; ++dan) {
					System.out.print(dan+"*"+i+"="+(dan*i)+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
