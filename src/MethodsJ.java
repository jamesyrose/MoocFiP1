import java.util.Scanner;

public class MethodsJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter How many prints");
		int count = reader.nextInt();
		for (int i = 0; i !=count; i ++) {
			printText(); 
		}
	}
	public static void printText() { 
		System.out.println("In a hole in the ground there lived a method\n");
	}

}
