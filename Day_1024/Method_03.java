
public class Method_03 {
	public static void main(String[] args) {
		double num = devide(10, 20);
		System.out.println(num);
		
		double max = max(9.3,9.8);
		System.out.println(max);
		
		String positive = positive(0);
		System.out.println(positive);
		
		boolean Even = even(5);
		System.out.println(Even);
	}
	
	//입력 받은 두 값을 나누는 함수
	public static double devide(int a, int b) {
		return (double)a / b ;
	}
	
	
	//둘 중 더 큰값을 반환하는 함수
	public static double max(double a, double b) {
		//double max = (a > b) ? a : b;
		//return max; 
		return (a > b) ? a : b;
	}
	
	//a가 양수인지 음수인지 판단하는 함수
	public static String positive(int a) {
		//방법1
//		String str;
//		if(a>0) str = "양수";
//		else if(a<0) str = "음수";
//		else str = "영";
//		return str;
		
		//방법2
		return (a > 0) ? "양수" :(a < 0) ? "음수" : "영";
		
	}
	
	//a가 짝수면 t, 아니면 f
	public static boolean even(int a) {
		return (a%2==0);
	}
}
