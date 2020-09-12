package Part5;

public class BookMain {
	public static void main(String[] args) { 
		Book harryPotter = new Book("J.K Rowling", "Harry Potter and the Sorcerers Stone", 223);
		System.out.println(harryPotter.getAuthor());
		System.out.println(harryPotter.getName());
		System.out.println(harryPotter.getPages());
		System.out.println(harryPotter.toString());
	}
}
