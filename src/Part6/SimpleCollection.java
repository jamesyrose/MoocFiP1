package Part6;

import java.util.ArrayList;

public class SimpleCollection {
	private ArrayList<String> collection;
	
	public SimpleCollection() {
		this.collection = new ArrayList<>();
	}
	
	public SimpleCollection(String item) {
		this.collection = new ArrayList<>();
		this.collection.add(item);
	}
	
	public void add(String item) {
		collection.add(item);
	}
	
	public String longest() {
		if (!collection.isEmpty()) {
			String longS = ""; 
			for (String s: collection) {
				if (s.length() > longS.length()) {
					longS = s;
				}
			}
			return longS;
		}else {
			return null;
		}

	}

}
