import java.util.Scanner;

public class GiveAnumba {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean cont = true;
		while (cont) {
			int val = reader.nextInt(); 
			if (val == 4) {
				cont = false;
			}
		}
	}
}
