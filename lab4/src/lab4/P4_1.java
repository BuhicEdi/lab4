package lab4;
/**
 * Detta program testar klassen CheckNumber.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class P4_1 {

	public static void main(String[] args) {
		CheckNumber chk = new CheckNumber();	// Genererar en ny instans av klassen CheckNumber

		// Skickar tre värden till våran klass
		chk.setNbr1(3.14);
		chk.setNbr2(2.78);
		chk.setNbr3(1.0);

		// Anropar metoder som ska kontrollera ifall värdena är lika, olika eller i ordning
		System.out.println(chk.allTheSame());
		System.out.println(chk.allDifferent());
		System.out.println(chk.isSorted());
	}
}