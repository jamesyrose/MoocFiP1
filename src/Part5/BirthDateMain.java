package Part5;

public class BirthDateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDate date = new SimpleDate(1, 1, 780);
		Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
		Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

		System.out.println(muhammad);
		System.out.println(pascal);
		
		if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
		    System.out.println(muhammad.getName() + " is older than " + pascal.getName());
		} else {
		    System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
		}
	}

}
