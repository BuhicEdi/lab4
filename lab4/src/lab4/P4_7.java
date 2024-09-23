package lab4;

public class P4_7 {

	public static void main(String[] args) {
		Car lambo = new Car(2.73);
		
		lambo.addFuel(25);
		
		lambo.drive(10);
		System.out.println(lambo.getFuelLevel());
	}

}
