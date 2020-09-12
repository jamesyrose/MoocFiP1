package Part6;

public class LongestInCollection {

	public static void main(String[] args) {
		SimpleCollection j = new SimpleCollection();
		System.out.println("Longest: " + j.longest());
		
		j.add("magneto");
		j.add("mystique");
		j.add("phoenix");
		
		System.out.println("Longest: " + j.longest());
	}

}
