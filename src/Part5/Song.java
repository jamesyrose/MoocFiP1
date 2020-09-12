package Part5;

public class Song {
	
	private String title;
	private String creator; 
	private int rating;
	
	public Song(String title, String creator, int rating) {
		this.title = title; 
		this.creator = creator; 
		this.rating = rating; 
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public int getRating() {
		return rating;
	}
	
	public boolean equals(Song compare) {
		if ((title + creator + rating).equals(compare.toString())) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return title + creator + rating; 
	}
}
