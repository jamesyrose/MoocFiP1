import java.util.Scanner;
public class loopex {
	public static void main(String[] args) { 
		Scanner reader = new Scanner(System.in); 
		boolean carryon = true; 
		while (carryon) {
			System.out.println("Shall we carry on");
			String user  = reader.next();
			if (user.toLowerCase().contentEquals("no")) {
				carryon = false;
			}
		}
		
	}
}
