package Part5;

public class HealthStation {
	private int weightCount = 0; 
	
	public int weigh(Person person) {
		this.weightCount++;
		return  person.getWeight(); 
	}
	
	public int weighings() {
		return weightCount;
	}
	
	public static void feed(Person person) { 
		person.addWeight();
	}
}
