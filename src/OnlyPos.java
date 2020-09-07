import java.util.Scanner;

public class OnlyPos {
	public static void main(String[] args) { 
		Scanner reader = new Scanner(System.in); 
		boolean cont = true; 
		while (cont) {
			System.out.println("Enter Integer");
			int val = reader.nextInt();
			if (val < 0) {
				System.out.println("Invalid  Number");
				continue;
			}
			
		}
	}
}
