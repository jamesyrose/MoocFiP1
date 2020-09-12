package Part6;

import java.util.ArrayList;

public class Suitcase {
	private ArrayList<Item> items; 
	private int maxWeight;
	
	public Suitcase() {
		this.items = new ArrayList<>();
		this.maxWeight = 100000;
	}
	
	public Suitcase(int i) {
		this(i, 100000);
	}
	
	public Suitcase(int i, int maxWeight) {
		this.items = new ArrayList<>(i);
		this.maxWeight =  maxWeight;
	}
	
	public void setMaxWeight(int i) {
		this.maxWeight = i;
	}
	
	public void addItem(Item item) {
		if ((this.totalWeight() + item.getWeight()) < this.maxWeight) {
			items.add(item);
		}else {
			System.out.println("Item not added, Suitcase overweight");
		}
	}
	
	public int totalWeight() {
		int total = 0;
		if (!items.isEmpty()) {
			for (Item item: items) {
				total += item.getWeight();
			}
		}
		return total;
	}
	
	public Item heaviestItem() {
		if (!items.isEmpty()) {
			Item heavy = items.get(0);
			for (Item item: items) {
				if (item.getWeight() > heavy.getWeight()) {
					heavy = item;
				}
			}
			return heavy;
		}
		return null;
	}
	
	public void printItems() {
		if (!items.isEmpty()) {
			for(Item item: items) {
				System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
			}
		}
		System.out.println("Total Weight: " + this.totalWeight());
	}
	
	@Override
	public String toString() {
		if (items.size() == 0) {
			return "no items (" + this.totalWeight() + " kg)";
		}else if( items.size() == 1) {
			return items.size() + " item (" + this.totalWeight() + " kg)";
		}else {
			return items.size() + " items (" + this.totalWeight() + " kg)";
		} 
	}

}
