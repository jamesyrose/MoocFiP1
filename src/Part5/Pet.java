package Part5;

public class Pet {
	private String name;
	private String breed; 
	private int age; 
	
	public Pet(String name, String breed) {
		this.name = name; 
		this.breed = breed; 
	}
	
	@Override
	public String toString() {
		return name + " (" + breed + ")";
	}
}
