package Part5;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMainTwo {
	private static ArrayList<Book> books = new ArrayList<>();
	private static Scanner reader = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		boolean cont = true; 
		while (cont) {
			System.out.println("Name ('end' will stop)");
			String name = reader.next();
			if (name.equals("end")) {
				cont = false;
			}
			System.out.println("Publication Year");
			int pubYear = reader.nextInt();
			Book newBook = new Book(name, pubYear);
			if (bookExists(newBook)) {
				System.out.println("Book Already Exists");
			}else {
				books.add(newBook);
			}
		}
		System.out.println("Total number of Books: " + books.size());

	}
	
	public static boolean bookExists(Book newBook) {
		for (int i = 0; i < books.size(); i++) {
			Book oldBook = books.get(i); 
			if (oldBook.equals(newBook)){
				return true;
			}
		}
		return false;
	}


}
