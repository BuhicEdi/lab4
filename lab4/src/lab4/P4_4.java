package lab4;
/**
 * Detta program testar klassen TallyCounter1.
 * 
 * @author Edi Buhic
 * @version 2024-09-24
 */

public class P4_4 {

	public static void main(String[] args) {
		TallyCounter1 count = new TallyCounter1();		// Genererar en ny instans av klassen TallyCounter1

		// Ökar räknaren med 1 per anrop
		count.count();
		count.count();

		// Anropar nuvarande räknarvärde
		System.out.println(count.getValue());

		// Minskar räknaren med 1
		count.undo();

		// Anropar nuvarande räknarvärde
		System.out.println(count.getValue());
	}
}
