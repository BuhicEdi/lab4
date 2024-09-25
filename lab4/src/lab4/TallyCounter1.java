package lab4;
/**
 * Klass som agerar räknare.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class TallyCounter1 {

	// Klassattribut som lagrar antalet "klick"
	private int counter;

	// Klassens konstruktor som skapar en ny räknare
	public TallyCounter1() {
		this.counter = 0;
	}

	// Metod som adderar 1 till räknaren (aka "klick")
	public void count() {
		this.counter++;
	}

	// Metod som returnerar antalet "klick"
	public int getValue() {
		return counter;
	}

	// Metod som återstället räknaren
	public void reset() {
		this.counter = 0;
	}

	// Metod som ångrar ett "klick"
	public void undo() {
		if (counter > 0) {
			this.counter = counter - 1;
		}
	}	
}