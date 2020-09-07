import java.util.Scanner;

public class IntroCounters {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Integer");
		int val = reader.nextInt();
		// System.out.println(val);
		for (int i = val; i <= 100; i++ ) {
			System.out.println(i);
		}
	}
}
