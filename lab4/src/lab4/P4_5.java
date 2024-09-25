package lab4;
/**
 * Detta program testar klassen TallyCounter2.
 * 
 * @author Edi Buhic
 * @version 2024-09-24
 */

public class P4_5 {

	public static void main(String[] args) {
		TallyCounter2 count = new TallyCounter2();		// Genererar en ny instans av klassen TallyCounter2

		// Ökar räknaren med 1 per anrop
		count.count();
		count.count();
		count.count();

		// Ställer in en maxgräns på 6
		count.setLimit(6);

		// Anropar nuvarande räknarvärde
		System.out.println(count.getValue());

		// Ökar räknaren med fler (för att testa gränsmetoden)
		count.count();
		count.count();
		count.count();
		count.count();
	}
}