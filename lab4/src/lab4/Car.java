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
		if (dist < 0) {
			dist = Math.abs(dist);
		}

		if ((fuelLevel/fuelPer10Km) >= dist) {
			this.fuelLevel = fuelLevel - (fuelPer10Km * dist);
		} else {
			this.fuelLevel = 0.0;
		}
	}
}
