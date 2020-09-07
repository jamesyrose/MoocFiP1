import java.util.Scanner;

public class summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter Start Integer");
		int val1 = reader.nextInt();
		System.out.println("Enter Last Ineger");
		int val2 = reader.nextInt(); 
		
		int count = 0;
		for (int i = val1; i <= val2; i ++) { 
			count = count + i;
		}
		System.out.println("Sum is : " + count);
	}

}
