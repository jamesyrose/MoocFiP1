package Part6;
import java.util.ArrayList;

import Part5.Person;

public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeigth) {
        this.name = name;
        this.minimumHeight = minimumHeigth;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }

        this.visitors++;
        this.riding.add(person);
        return true;
    }
    
    public Person getTallest() {
    	if (this.riding.isEmpty()) {
    		return null;
    	}
    	Person tallest = riding.get(0); 
    	for (Person rider: riding) {
    		if (rider.getHeight() > tallest.getHeight()) {
    			tallest = rider;
    		}
    	}
    	return tallest;
    }
    
    
    
    @Override
    public String toString() {
        return this.name + ", minimum height requirement: " + this.minimumHeight +
            ", visitors: " + this.visitors;
    }

	public double averageHeightOfPeopleOnRide() {
		int total = 0; 
		for (Person rider: riding) {
			total += rider.getHeight();
		}
		double average =  total / riding.size();
		return average;
	}
}