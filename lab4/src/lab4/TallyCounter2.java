package lab4;
/**
 * Klass som agerar räknare fast med en maxspärrfunktion.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class TallyCounter2 {

	// Klassattribut som lagrar antalet "klick" samt maxtak
	private int counter;
	private int limit;

	// Klassens konstruktor som genererar en ny räknare
	public TallyCounter2() {
		this.counter = 0;
		this.limit = Integer.MAX_VALUE;
	}

	// Metod som adderar 1 till räknaren (ifall maxspärren ej är nådd)
	public void count() {
		if(counter < limit) {
			this.counter++;
		} else {
			System.out.println("Warning: Limit exceeded!");
		}
	}

	// Metod som returnerar antalet "klick"
	public int getValue() {
		return counter;
	}

	// Metod som återställer räknaren
	public void reset() {
		this.counter = 0;
		this.limit = Integer.MAX_VALUE;
	}

	// Metod som ångrar ett "klick"
	public void undo() {
		if (counter > 0) {
			this.counter = counter - 1;
		}
	}

	// Metod som sätter ett maxtak
	public void setLimit(int limit) {
		this.limit = limit;
	}
}