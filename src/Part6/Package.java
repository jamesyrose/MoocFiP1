package Part6;

import java.util.ArrayList;

public class Package {
	private ArrayList<Gift> packages;
	
	public Package() {
		this.packages = new ArrayList<>();
	}
	
	public void addGift(Gift g) {
		packages.add(g);
	}
	
	public int totalWeight() {
		int total = 0;
		for (Gift g: packages) {
			total += g.getWeight();
		}
		return total;
	}

}
