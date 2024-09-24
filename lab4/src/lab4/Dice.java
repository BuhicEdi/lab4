package lab4;

import java.util.Random;

public class Dice {

	private int value;
	Random randGenerator = new Random();
	
	public Dice() {
		this.value = randGenerator.nextInt(6);
	}
	
	public void roll() {
		this.value = randGenerator.nextInt(6);
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		String dice = "";
		dice += value;
		
		return dice;
	}
}
