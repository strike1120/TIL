
public class Gugudan_02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; ++i) {
			for(int j=2; j<=5; ++j) {
				System.out.print(j +"*"+i +"=" +(j*i)+"\t");
			}
			
		
			for(int k=6; k<=9; ++k) {
				System.out.print(k +"*"+i +"=" +(k*i)+"\t");
			}
			System.out.println();
		}
	}

}
