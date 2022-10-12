//정수 2개, 연산자 1개를 입력받아
//사칙연산을 수행하는 코드를 switch~case로 작성하시오


import java.util.Scanner;

public class Switch_Prcatice_02 {

	public static void main(String[] args) {
		
		int num1, num2;
		String operator;
		String result;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num1 = scanner.nextInt();
		System.out.println("숫자를 입력하세요");
		num2 = scanner.nextInt();
		System.out.println("연산자를 입력하세요");
		operator = scanner.next();
		
		
//------------------------------------------------------------------------------	
		switch(operator) {
		
		case "*" :
			result = num1 +"*"+ num2 + "=" + num1 * num2;
			break;
			
		case "/" :
			result = num1 +"/"+ num2 + "=" + num1 / num2;
			break;
			
		case "+" :
			result = num1 +"+"+ num2 + "=" + (num1 + num2);
			break;
		
		case "-" :
			result = num1 +"-"+ num2 + "=" + (num1 - num2);
			break;
			
		default : 
			result = "연산자 오류";
		}
//----------------------------------------------------------------------	
		System.out.println("숫자1 : " + num1);
		System.out.println("숫자1 : " + num2);
		System.out.println("연산자(+ - * /) : " + operator);
		System.out.println("결과 : " + result);
	}
}
