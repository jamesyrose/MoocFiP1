package Part5;

public class Book {
	private static int pages; 
	private static String name; 
	private static String author; 
	
	public Book (String author, String name, int pages) {
		this.pages = pages; 
		this.name = name; 
		this.author = author;
	}
	public static String getAuthor() {
		return author; 
	}
	public static String getName() {
		return name;
	}
	public static int getPages() {
		return pages;
	}
	public String toString(){
		String title = author + ", " + name + ", " + pages + " pages";
		return title;
	}
}
