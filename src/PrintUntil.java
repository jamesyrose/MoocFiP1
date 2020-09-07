import java.util.Scanner;

public class PrintUntil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter Number");
		int val = reader.nextInt(); 
		printUntilNumber(val);
		System.out.println(numberUno());
		System.out.println(returnStr());
	}
	
	public static void printUntilNumber(int i) { 
		for (int j = i; j !=0; j--) {
			System.out.println(j);
		}
	}
	public static int numberUno() {
		return 1; 
	}
	public static String returnStr() {
		return "HI"; 
	}

}
