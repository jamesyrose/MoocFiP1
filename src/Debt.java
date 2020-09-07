
public class Debt {
	double balance; 
	double interest; 
	
	public Debt(double balance, double interest) { 
		this.balance = balance;
		if (interest < 1) {
			interest += 1;
		}
		this.interest = interest;
	}
	
	public void printBalance() {
		System.out.println("Current Balance is: " + this.balance);
	} 
	public void waitOneYear() {
		this.balance *= this.interest;
	}
	
}
