import java.util.Scanner;

public class Cubes {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean cont = true;
		int counter = 0; 
		while (cont){
			System.out.println("Enter Number");
			String val = reader.nextLine(); 
			if (isNumeric(val)) {
				counter++;
			}else if (val.equals("End")) {
				System.out.println(counter + " logged");
				cont = false; 
			}
		}
		
	}
	public static boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        return str.chars().allMatch(Character::isDigit);

    }
}
