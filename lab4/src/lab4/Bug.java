package lab4;
/**
 * Denna klass agerar som ett kryp som kan röra sig 1 steg samt byta riktning.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class Bug {

	// Klassattributer som lagrar krypets position samt riktning
	private int position = 0;
	private int direction = 1;

	// Klassens konstruktor med en parameter som anger startposition
	public Bug(int initialPosition) {
		this.position = initialPosition;
	}

	// Metod som byter kry
	public void turn() {
		if (direction == 1) {
			direction = -1;
		} else {
			direction = 1;
		}	
	}	

	// Metod som flyttar krypet ett steg beroende på riktning
	public void move() {
		if (direction == 1) {
			this.position++;
		} else {
			this.position--;
		}
	}

	// Metod som returnerar krypets nuvarande position
	public int getPosition() {
		return position;
	}
}