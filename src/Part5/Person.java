package Part5;

import java.time.LocalDate;
import java.time.Month;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;
    private SimpleDate birthday;
    private Pet pet; 

    public Person(String name) {
        this(name, 0);
    }
    
    public Person(String name, int weight) {
    	this(name, 0, 0, 0);
    }
    
    public Person(String name, SimpleDate date) {
    	this.birthday = date; 
    	this.name = name; 
    }
    
    public Person(String name, SimpleDate date, int weight, int age) {
    	this.name = name; 
    	this.birthday = date;
    	this.weight = weight; 
    	this.age = age;
    }
    
    public Person(String name, Pet pet) {
    	this.name = name; 
    	this.pet = pet;
    }
    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }
    
// Cut Out for Birthday Addition    
//    public Person(String name, int age, int height, int weight) {
//    	this.name = name; 
//    	this.age = age; 
//    	this.height = height; 
//    	this.weight = weight; 
//    }
    

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }
    
// Cut Out for Birthday Addition    
//    public String toString() {
//        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
//    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }
    
    public void addWeight() {
    	this.weight++; 
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    
    public int ageAsYears() { 
    	LocalDate now =  LocalDate.now();
    	int year = now.getYear(); 
    	int month = now.getMonthValue();
    	int day = now.getDayOfMonth();
    	int age = year - birthday.getYear(); 
    	
    	if (birthday.getMonth() < month) {
    		if (birthday.getDay() < day) {
    			age--; 
    		}
    	}
    	return age;
    }

    public boolean olderThan(Person person) {
    	int age = ageAsYears(); 
    	if (age > person.ageAsYears()) {
    		return true;
    	} else { 
    		return false;
    	}
    }
    
    public SimpleDate getBirthday() {
    	return birthday;
    }
    
// Cut for pet addition
//    @Override
//    public String toString() {
//        return this.name + ", born on " + this.birthday;
//    }
    @Override
    public String toString() {
    	return name + ", has a friend called " + pet;
    }
    
    
    public boolean equals(Person compare) {
    	if (this.birthday == compare.getBirthday() && this.ageAsYears() == compare.ageAsYears() &&
    			this.name == compare.getName() && this.weight == compare.getWeight()) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
}