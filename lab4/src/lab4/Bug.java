package lab4;

public class Bug {
	
	private int position = 0;
	private int direction = 1;
	
	public Bug(int initialPosition) {
		this.position = initialPosition;
	}
	
	public void turn() {
		if (direction == 1) {
			direction = -1;
		} else {
			direction = 1;
		}
		
	}	
	
	public void move() {
		this.position += direction;
	}
	
	public int getPosition() {
		return position;
	}
}
