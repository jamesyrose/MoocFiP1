package Part6;

import java.util.ArrayList;

import Part5.Person;

public class Room {
	private ArrayList<Person> people;
	
	
	public Room() {
		this.people = new ArrayList<>();
	}
	
	public void add(Person person) {
		people.add(person);
	}
	
	public boolean isEmpty() {
		return people.isEmpty();
	}
	
	public ArrayList<Person> getPersons(){
		return people;
	}
}
