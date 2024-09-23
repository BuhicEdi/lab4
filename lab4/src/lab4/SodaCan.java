package lab4;

public class SodaCan {

	private double height;
	private double radius;
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getVolume() {
		double canVolume;
		canVolume = Math.PI * Math.pow(radius, 2) * height;
		
		return canVolume;
	}
	
	public double getSurfaceArea() {
		double canSurfArea;
		canSurfArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
		
		return canSurfArea;
		
	}
	
	public double getBottomArea() {
		double canBaseArea;
		canBaseArea = (Math.PI * Math.pow(radius, 2));
		
		return canBaseArea;
	}
	
	public double getCircumference() {
		double canCircumference;
		canCircumference = 2 * Math.PI * radius;
		
		return canCircumference;
		
	}
	
}
