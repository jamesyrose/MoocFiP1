package Part5;

public class Counter {
	private int count; 
	
	public Counter() {
		this(0);
	}
	
	public Counter(int startVal) {
		this.count = startVal;
	}
	
	public int value() {
		return count;
	}
	
	public void increase() {
		this.count++;
	}
	public void increase(int increaseBy) {
		this.count += increaseBy;
	}
	
	public void decrease() {
		this.count--;
	}
	public void decrease(int decreaseBy) {
		this.count -= decreaseBy;
	}
	
	
}
