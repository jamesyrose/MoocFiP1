package Part6;

import java.util.Scanner;

public class UserInterfaceMain {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    WordSet set = new WordSet();

	    UserInterface userInterface = new UserInterface(set, scanner);
	    userInterface.start();
	}

}
