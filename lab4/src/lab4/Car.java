package lab4;

public class Car {

	private static final double FUEL_TANK_VOLUME = 55.0;
	private double fuelLevel = 0.0;
	private double fuelPer10Km = 0.0;

	public Car(double fuelEfficiency) {
		this.fuelPer10Km = fuelEfficiency;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void addFuel(double fuel) {
		if (fuelLevel > FUEL_TANK_VOLUME) {
			this.fuelLevel = 55.0;
		} else {
			this.fuelLevel += fuel;
		}
	}

	public void drive(double dist) {
		double gasMile = fuelLevel / fuelPer10Km;

		if ((gasMile + 100) >= (dist + 100)) {
			this.fuelLevel = fuelLevel - ((fuelPer10Km + 100) * (dist + 100));
		} else {
			this.fuelLevel = 0.0;
		}
	}
}
