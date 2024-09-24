package lab4;

public class P4_8 {

	public static void main(String[] args) {
		Bug kryp = new Bug(2);
		
		kryp.move();
		kryp.move();
		
		System.out.println("Bugs position: " + kryp.getPosition());
		
		kryp.turn();
		
		kryp.move();
		kryp.move();
		
		System.out.println("Bugs position: " + kryp.getPosition());
		
		
		
	}

}
