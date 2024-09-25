package lab4;
/**
 * Detta program testar klassen Dice.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class P4_9 {

	public static void main(String[] args) {
		Dice dice = new Dice(); 				// Genererar en ny instans av klassen Dice

		System.out.println(dice.getValue());	// Returnerar senaste värdet

		dice.roll();							// Kastar tärningen

		System.out.println(dice.toString());	// Genererar senaste värdet i Stringfromat
	}
}