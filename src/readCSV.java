import java.nio.file.Paths;
import java.util.Scanner;

public class readCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter file path");
		String file = reader.nextLine(); 
		try(Scanner scanner = new Scanner(Paths.get(file))){
			while (scanner.hasNextLine()) {
				String buf = scanner.nextLine(); 
				if (!buf.isEmpty()) {
					String[] data = buf.split(",");
					System.out.println(data[0] + " is " + data[1] + " years old");
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
