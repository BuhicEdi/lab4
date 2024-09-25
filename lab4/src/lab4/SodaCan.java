package lab4;
/**
 * Klass som räknar ut diverse volymer på en burk (cylinder)
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class SodaCan {

	// Klassattribut som lagrar burkens radie samt höjd
	private double height;
	private double radius;

	// Klassens konstruktor som tar emot och lagrar burkens höjd samt radie
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	// Metod som returnerar burkens höjd
	public double getHeight() {
		return height;
	}

	// Metod som returnerar burkens radie
	public double getRadius() {
		return radius;
	}

	// Metod som räknar ut samt returnerar burkens volym
	public double getVolume() {
		double canVolume;
		canVolume = Math.PI * Math.pow(radius, 2) * height;

		return canVolume;
	}

	// Metod som räknar ut samt returnerar burkens mantelarea
	public double getSurfaceArea() {
		double canSurfArea;
		canSurfArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);

		return canSurfArea;

	}

	// Metod som räknar ut samt returnerar burkens bottenarea
	public double getBottomArea() {
		double canBaseArea;
		canBaseArea = (Math.PI * Math.pow(radius, 2));

		return canBaseArea;
	}

	// Metod som räknar ut samt returnerar burkens omkrets
	public double getCircumference() {
		double canCircumference;
		canCircumference = 2 * Math.PI * radius;

		return canCircumference;	
	}
}