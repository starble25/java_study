package practice.practice23;

public class AccountMain {

	public static void main(String[] args) {
		//2. 
		/*
		다음을 만족하는 클래스 Account를 작성하시오.
		· 다음의 2 개의 필드를 선언
		private String owner;
		private long balance;
		· 위 모든 필드에 대한 getter와 setter의 구현
		· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
		다음 기능을 추가하여 작성하시오.
		· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소
		드
		public long deposit(long amount)
		· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메
		소드
		public long withdraw(long amount)
		· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
		저축과 인출을 수행한 후 잔금을 출력
		메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
		· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
		· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
		출하려는 메소드를 호출하여 출력
		*/
		
		Account a1 = new Account();
		a1.deposit(10000);
		a1.withdraw(5000);
		a1.withdraw(10000);
		
	}

}

class Account {
	private String owner;
	private long balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Account() {
		owner = null;
		balance = 0;
	}
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public long deposit(long amount) {
		balance += amount;
		System.out.println(amount + "원 저축");
		System.out.printf("잔액: %d원\n", balance);
		return amount;
	}
	public long withdraw(long amount) {
		if(balance > amount) {
			balance -= amount;
			System.out.println(amount + "원 인출");
			System.out.printf("잔액: %d원\n", balance);
			return amount;
		} else {
			System.out.println("잔액보다 큰 금액 인출 불가능");
			return amount;
		}
	}
	
}
