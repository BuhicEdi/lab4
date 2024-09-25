package lab4;
import java.util.Random;
/**
 * Klass som agerar 6-sidig tärning.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class Dice {

	// Klassattribut som lagrar senaste slaget
	private int value;
	Random randGenerator = new Random();

	// Klassens konstruktor som generar samt slår tärningen
	public Dice() {
		this.value = randGenerator.nextInt(6);
	}

	// Metod som slår tärningen
	public void roll() {
		this.value = randGenerator.nextInt(6);
	}

	// Metod som returnerar senaste slagets
	public int getValue() {
		return value;
	}

	// Metod som returnerar senaste slaget som en sträng
	public String toString() {
		String dice = "";
		dice += value;

		return dice;
	}
}