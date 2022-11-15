
public class ExceptionTest_01 {

	public static void main(String[] args) {
		String[] str = {"1", "0", "abc", "42.195"};
		int temp;
		
		//null을 참조(.)하려고 하면 null point exception
		
		System.out.println(Integer.parseInt(str[0]));
		
		try {
			temp = Integer.parseInt(str[1]);
			
			//int result = 10 / temp; // Arithmetic Exception : 0으로 나눌 수 없기때문에 나타나는 오류
			//System.out.println(result); 
			
			temp = Integer.parseInt(str[2]); //Number Format Exception : 문자열을 숫자로 바꾸려고 했기 때문에 나타나는 오류
			temp = Integer.parseInt(str[3]); //Number Format Exception : double형을 정수로 바꾸려고 했기 때문에 오류발생
			temp = Integer.parseInt(str[4]); //ArrayIndex Out Of Bounds Exception
		
		} catch(ArithmeticException e) {
			System.out.println("Error!!!");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) { //모든 익셉션의 아버지이므로 가장하단에 쓴다
			e.printStackTrace();
		} finally { //프로그램을 마무리할때 사용
			System.out.println("프로그램 마무리");
		}
		
		System.out.println("Exception과 상관없는 코드");
	}

}
