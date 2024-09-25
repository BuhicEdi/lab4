package lab4;
/**
 * Klass som tar emot 3 flyttal och krontrollerar ifall talen är lika, olika alternativt sorterad.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class CheckNumber {

	// Klassattribut som lagrar 3 flyttal
	private double nbr1;
	private double nbr2;
	private double nbr3;

	// Metoder som tar emot flyttalen och lagrar de i ett attribut
	public void setNbr1(double nbr1) {
		this.nbr1 = nbr1;
	}

	public void setNbr2(double nbr2) {
		this.nbr2 = nbr2;
	}

	public void setNbr3(double nbr3) {
		this.nbr3 = nbr3;
	}

	// Metod som kontrollerar samt returnerar ifall talen är lika eller ej
	public boolean allTheSame() {
		if (nbr1 == nbr2 && nbr2 == nbr3) {
			return true;
		} else {
			return false;
		}
	}

	// Metod som kontrollerar samt returnerar ifall alla tal är olika eller ej
	public boolean allDifferent() {
		if (nbr1 != nbr2 && nbr2 != nbr3) {
			return true;
		} else {
			return false;
		}
	}

	// Metod som kontrollerar samt returnerar ifall talen är sorterade eller ej
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