package lab4;
/**
 * Detta program testar klassen SodaCan.
 * 
 * @author Edi Buhic
 * @version 2024-09-24
 */
class P4_3 {

	public static void main(String[] args) {
		SodaCan soda = new SodaCan(10, 3);		// Genererar en ny instans av klassen SodaCan

		// Anropar volymen, area, mantelarea och totala area
		System.out.println(soda.getVolume());
		System.out.println(soda.getBottomArea());
		System.out.println(soda.getSurfaceArea());
		System.out.println(soda.getCircumference());
	}
}