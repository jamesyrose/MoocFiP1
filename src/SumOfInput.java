import java.util.Scanner;

public class SumOfInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		boolean cont = true; 
		int counter = 0;
		int cnt = 0; 
		while (cont) {
			System.out.println("Enter Integer");
			int val = reader.nextInt(); 
			if (val == 0 ) { 
				cont = false; 
			} else { 
				counter = counter + val;
				cnt = cnt + 1;
			}
		}
		System.out.println(counter + " Is the Sum");
		System.out.println(cnt + " Numbers added");
		System.out.println(counter / cnt + " Is the Average");
	}

}
