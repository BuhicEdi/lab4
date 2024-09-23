package lab4;

public class CheckNumber {
	
	private double nbr1;
	private double nbr2;
	private double nbr3;
	
	
	public void setNbr1(double setNbr1) {
		nbr1 = setNbr1;
	}
	
	public void setNbr2(double setNbr2) {
		nbr2 = setNbr2;
	}

	public void setNbr3(double setNbr3) {
		nbr3 = setNbr3;
	}
	
	public boolean allTheSame() {
		if (nbr1 == nbr2 && nbr2 == nbr3) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean allDifferent() {
		if (nbr1 != nbr2 && nbr2 != nbr3) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSorted() {
		if (nbr1 >= nbr2 && nbr2 >= nbr3) {
			return true;
		} else if (nbr1 <= nbr2 && nbr2 <= nbr3) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
