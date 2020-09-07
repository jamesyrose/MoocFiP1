import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckGuestList {
	private static ArrayList<String> names = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Guest List");
		String guestList = "src/text_files/" + reader.nextLine();
		add_names(guestList); 
		
		boolean contCheck = true; 
		while (contCheck){
			System.out.println("Name of next person");
			String name = reader.nextLine(); 
			if (names.contains(name)) {
				System.out.println(name + " is on the list");
			} else {
				System.out.println(name + " is not on the list");
			}
		}
		
		
	}
	
	public static void add_names(String filePath) {
		try(Scanner scanner = new Scanner(Paths.get(filePath))){
			while (scanner.hasNextLine()){
				String line = scanner.nextLine(); 
				names.add(line);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
