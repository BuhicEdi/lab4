package lab4;
/**
 * Detta program testar klassen Bug.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class P4_8 {

	public static void main(String[] args) {
		Bug kryp = new Bug(2);					// Genererar en ny instans av klassen Bug med startpositionen 2

		// Flyttar krypet 1 steg per anrop
		kryp.move();													
		kryp.move();

		// Matar ut krypets nuvarande position
		System.out.println("Bugs position: " + kryp.getPosition());

		// Byter riktning på krypet
		kryp.turn();

		// Flyttar krypet 1 steg per anrop
		kryp.move();
		kryp.move();

		// Matar ut krypets nuvarande position
		System.out.println("Bugs position: " + kryp.getPosition());
	}
}