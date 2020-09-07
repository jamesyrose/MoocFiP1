
public class BankAcc {
	public static void main(String[] args) {
		Account artosAccount = new Account("Astro Acc", 100.00);
		artosAccount.deposit(20.0);
		System.out.println("Artos Acc Balance : " + artosAccount.balance());
		
		Account mattsAcc = new Account("Matts Acc", 1000.00); 
		Account myAcc = new Account("mine", 0.0); 
		mattsAcc.withdrawal(100.0);
		myAcc.deposit(100.00);
		System.out.println("100 moved from Matts to Mine");
		System.out.println("My Acc Balance: " + myAcc.balance() );
		System.out.println("Matts Acc Balance: " + mattsAcc.balance());
	}
}
