package Part6;

import java.util.ArrayList;

public class Stack {
	private ArrayList<String> stack;
	
	public Stack() {
		stack = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if (stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void add(String value) {
		stack.add(value);
	}
	
	public ArrayList<String> values(){
		return stack; 
	}
	
	public String take() {
		int index = stack.size() - 1;
		if (index >= 0) {
			String val = stack.get(index);
			stack.remove(index);
			return val;
		}else {
			return "";
		}
	}
	
	public void clear() {
		stack.clear();
	}
	
}
