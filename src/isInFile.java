import java.nio.file.Paths;
import java.util.Scanner;

public class isInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Enter File path");
			String file = reader.nextLine();
			if (file.equals("end")){
				break;
			}
			System.out.println("Search for: ");
			String search = reader.nextLine(); 
			checkContents(file, search);

			
			
		}
	}

	public static void checkContents(String filePath, String search) {
		try(Scanner scanner = new Scanner(Paths.get(filePath))){
			while (scanner.hasNextLine()){
				String line = scanner.nextLine();
				if (line.contains(search)) {
					System.out.println(filePath + " contains " + search);
					break;
				}else {
					System.out.println("Not Found");
				}				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
