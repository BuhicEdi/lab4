package lab4;
/**
 * Detta program testar klassen Car.
 * 
 * @author Edi Buhic
 * @version 2024-09-24
 */

public class P4_7 {

	public static void main(String[] args) {
		Car lambo = new Car(2.73);				// Genererar en ny instans av klassen Car med förbrukningen 2.73 l/10 km

		lambo.addFuel(25);						// Tankar bilen med 25 liter
		lambo.drive(10);						// Kör bilen 10 mil

		// Matar ut bränslenivån
		System.out.println(lambo.getFuelLevel());	
	}
}