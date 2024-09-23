package lab4;

public class TallyCounter2 {
	
	private int counter;
	private int limit;
	
	public TallyCounter2() {
		this.counter = 0;
		this.limit = Integer.MAX_VALUE;
	}
	
	public void count() {
		this.counter++;
	}
	
	public int getValue() {
		return counter;
	}
	
	public void reset() {
		this.counter = 0;
	}
	
	public void undo() {
		if (counter > 0) {
			this.counter = counter - 1;
		}
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
}
