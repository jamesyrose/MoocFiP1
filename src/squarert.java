import java.util.Scanner;

public class squarert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter First Integer");
		int first = reader.nextInt();
		System.out.println("Enter Second Integer");
		int second = reader.nextInt(); 
		double squareRT = Math.sqrt(first + second); 
		System.out.println(squareRT);

		
	}

}
