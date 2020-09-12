package Part6;

import java.util.ArrayList;

public class Hold {
	
	private ArrayList<Suitcase> suitcases;
	
	public Hold(int i) {
		this.suitcases = new ArrayList<>(i);
		}
	
	public void addSuitcase(Suitcase sc) {
		suitcases.add(sc);
	}
	
	public int totalWeight() {
		int total = 0;
		if (!suitcases.isEmpty()) {
			for (Suitcase sc: suitcases) {
				total += sc.totalWeight();
			}
		}
		return total;
	}
	
	// prints all items in  all suitcases
	public void printItems() {
		if (!suitcases.isEmpty()) {
			for (Suitcase sc: suitcases) {
				sc.printItems();
			}
		}
		System.out.println("Total Weight of Everything: "  + this.totalWeight());
	}
	
	@Override
	public String toString() {
		return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
	}

}
