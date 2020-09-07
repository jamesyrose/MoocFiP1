import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a file to print");
		String file = reader.nextLine();
		String filePath = "src/text_files/" + file; 
		read_file(filePath);
		
		
		
	}
	
	public static void read_file(String filePath) {
		try(Scanner scanner = new Scanner(Paths.get(filePath))){
			while (scanner.hasNextLine()){
				String line = scanner.nextLine(); 
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
