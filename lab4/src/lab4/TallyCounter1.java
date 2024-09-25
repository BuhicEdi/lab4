package lab4;
/**
 * 
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class TallyCounter1 {

	private int counter;
	
	public TallyCounter1() {
		this.counter = 0;
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
}
