import java.util.Scanner;

public class NegativeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		boolean cont = true; 
		int counter = 0;
		while (cont) {
			System.out.println("Enter Integer");
			int val = reader.nextInt(); 
			if (val == 0 ) { 
				cont = false; 
			} else if (val < 0) { 
				counter = counter + 1;
			}
		}
		System.out.println(counter + " Negative Integers Added");
	}

}
