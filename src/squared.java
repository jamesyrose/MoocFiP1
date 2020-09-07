import java.util.Scanner;

public class squared {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Integer");
		int userIn = Integer.valueOf(reader.nextLine());
		int square = (int) Math.pow(userIn, 2);
		System.out.println("Squared " + square);
	}
}
