//escape sequence test
public class EscapeTest {

	public static void main(String[] args) {
		String tmp = "korea";
		System.out.println(tmp);
		System.out.println("\n" + tmp); //new line
		System.out.println("\t" + tmp); //8칸 이동(Move 8 spaces)
		
		System.out.println("Kim's Bakery");
		//In Java, the string must be in double quotes
		System.out.println("My name is \"jay\"");
		/* -----------------------------------------------*/
		char a = '\r';
		char b = '\n';
				
		System.out.println("\\r의 코드값은" + (int)a +"이다.");
		System.out.println("\\n의 코드값은" + (int)b+ "이다.");
		System.out.println();
		System.out.println("\\n의 코드값은" + (int)'\r'+ "이다.");
		System.out.println("\\n의 코드값은" + (int)'\n'+ "이다.");
		
		
	}

}
