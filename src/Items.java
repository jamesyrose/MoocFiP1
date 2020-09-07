import java.util.ArrayList;
import java.util.Scanner;

public class Items {
	private static ArrayList<String> items = new ArrayList<>();
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true){
			System.out.println("Enter Item");
			String item = reader.nextLine(); 
			if (item.isEmpty()) {
				System.out.println(items.toString());
				break;
			}else {
				items.add(item);
				
			}
		}
	}
	
}
 