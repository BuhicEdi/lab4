package lab4;

public class CheckNumber {

	private double nbr1;
	private double nbr2;
	private double nbr3;


	public void setNbr1(double nbr1) {
		this.nbr1 = nbr1;
	}

	public void setNbr2(double nbr2) {
		this.nbr2 = nbr2;
	}

	public void setNbr3(double nbr3) {
		this.nbr3 = nbr3;
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
