
public class ExceptionTest_05 {

	public static void main(String[] args) {
		try {
			String[] str = {"abc", "0"}; //double.parseDouble 
			int data = Integer.parseInt(str[0]); //오류발생
		} catch(Exception e) {
			System.out.println("Exception 발생");
			e.printStackTrace();
			// return; //main은 자바가상머신이 호출했으므로 거기로 돌아간다. return밑에있는 코드는 다 무시하지만 finally는 실행된다.
			System.exit(0); //finally(마무리작업)도 실행하지않고 그냥 종료한다
		} finally { 
			//마무리 작업 실시
			System.out.println("마무리");
		}
		
		System.out.println("프로그램 종료");
	}

}
