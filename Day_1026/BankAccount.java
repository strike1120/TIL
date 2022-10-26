
public class BankAccount { //한명의 계좌를 만드는 거니까 VO
	//계좌번호, 예금주, 잔액 (명사 -> 인스턴스 변수)
	//예금했다(deposit), 출금했다(withdraw) (동사(동작) -> 멤버 메소드)
	//출력하기 (멤버 메소드)
	//계좌번호는 int가 아닌 string에 담는다 -> int는 연산이 필요한 경우!
	
	//인스턴스 변수
	String accountNum;
	String name;
	int balance;
	
	//멤버메소드 - 예금하기, 출금하기, 출력하기
		//출력하기
	public void output() {
		System.out.println("계좌번호:" + this.accountNum);
		System.out.println("이름:" + this.name);
		System.out.println("잔액:" + this.balance +"원");
	}
		//예금하기 - 누군가에게 돈을 받아서 집어넣는다
	public void deposit(int money) {
		balance = balance + money;
	}
		//출금하기 -얼마를 출금할건지 입력,+잔액보다 많은 돈을 출금하려고 하면 에러.
	public void withdraw(int money) {
		if(balance<money) {
			System.out.println("돈부족");
		} else {
			System.out.println("현재 돈:" + balance);
			balance = balance - money;
			System.out.println("남은 돈:" + balance);
			
		}
			
	}
	
	

}
