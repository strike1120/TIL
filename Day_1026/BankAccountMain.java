
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		a.accountNum ="1234"; // .(참조연산자) - 우선순위 가장 높음 
		a.name = "홍길동";
		a.balance = 10000;
		
		a.output();
		
		a.deposit(5000);
		a.output();
		//손오공의 예금통장을 만드시오.(예치금 20만원)
		BankAccount son = new BankAccount();
		son.accountNum = "12345";
		son.name = "SOK";
		son.balance = 200000;
		
		son.withdraw(50000);
		
	}

}
