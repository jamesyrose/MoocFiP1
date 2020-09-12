package Part5;

public class nullPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bill = new Person("Bill"); 
		bill = null;
		
		bill.growOlder();
	}

}
