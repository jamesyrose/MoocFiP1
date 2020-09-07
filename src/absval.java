import java.util.Scanner;

public class absval {
	public static void main(String[] args) { 
		Scanner reader = new Scanner(System.in);
		int val = reader.nextInt(); 
		if (val < 0) {
			val = val * (-1);
		}
		System.out.println(val);
	}
}
