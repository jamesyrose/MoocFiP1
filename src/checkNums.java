import java.nio.file.Paths;
import java.util.Scanner;

public class checkNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter File Path");
		String file = reader.nextLine(); 
		System.out.println("Enter Lower Bound");
		int lb = reader.nextInt();
		System.out.println("Enter Upper Bound");
		int ub = reader.nextInt(); 
		int count = countNumbers(file, lb, ub);
		System.out.println(count + " found in file" );
		
	}
	
	public static int countNumbers(String file, int lower, int upper){
		int counter = 0;
		try(Scanner scanner = new Scanner(Paths.get(file))){
			while (scanner.hasNextLine()){
				String curr = scanner.nextLine();
				try{
					int currInt = Integer.parseInt(curr);
					if (lower <= currInt && currInt <= upper){
						counter++;
						}
				}catch(Exception e) {
					continue;
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return counter;
	}
}
