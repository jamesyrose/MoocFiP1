package Part5;

public class Cube {
	private int edgeLength; 
	
	// Constructor
	public Cube(int edgeLength){
		this.edgeLength = edgeLength;
	}
	
	public int volume() {
		int volume = (int) Math.pow(edgeLength, 3);
		return volume;
	}
	
	public String toString(){
		String message = "The length of the edge is " + edgeLength + " and the Volume is " + volume();
		return message;
	}
}
