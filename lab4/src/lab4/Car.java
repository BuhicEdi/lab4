package lab4;
/**
 * Klass som agerar en bil med egenskaper som t.ex bränslenivå och förbrukning.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class Car {

	// Klassattribut som lagrar bilens maxolym i bränsletanken, nuvarande bränslenivå samt förbrukningen
	private static final double FUEL_TANK_VOLUME = 55.0;
	private double fuelLevel = 0.0;
	private double fuelPer10Km = 0.0;


	// Klassens konstruktor som efterfrågar bilens förbrukning
	public Car(double fuelEfficiency) {
		this.fuelPer10Km = fuelEfficiency;
	}

	// Metod som returnerar nuvarande bränslenivå
	public double getFuelLevel() {
		return fuelLevel;
	}

	// Metod som adderar bränsle i bilen beroende på om det finns utrymme
	public void addFuel(double fuel) {
		if (fuelLevel > FUEL_TANK_VOLUME) {
			this.fuelLevel = 55.0;
		} else {
			this.fuelLevel += fuel;
		}
	}

	// Metod för att köra bilen som baseras på distans samt hur mycket bränsle som finns
	public void drive(double distance) {
		if (distance < 0) {
			distance = Math.abs(distance);
		}

		if ((fuelLevel/fuelPer10Km) >= distance) {
			this.fuelLevel = fuelLevel - (fuelPer10Km * distance);
		} else {
			this.fuelLevel = 0.0;
		}
	}
}