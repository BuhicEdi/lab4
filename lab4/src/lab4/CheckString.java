package lab4;
/**
 * Klass som tar emot en sträng och returnear mittersta bokstaven samt antalet vokaler.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class CheckString {

	// Klassattribut som lagrar inmatade strängen
	private String str = null;

	// Klassens konstruktor som tar emot strängen som ska kontrolleras
	public CheckString(String str) {
		this.str = str;
	}

	// Metod som returnerar strängen
	public String getString() {
		return str;
	}

	// Metod som returnerar mittersta bokstaven (2 ifall strängens är jämnt antal bokstäver långt)
	public String middle() {
		String midStr = null;
		int strLength = str.length();

		if (strLength %2 == 0) {
			midStr = str.substring((strLength/2)-1, (strLength/2)+1);

		} else if (strLength %2 != 0) {
			midStr = str.substring((strLength/2), (strLength/2)+1);
		}
		return midStr;
	}

	// Metod som räknar samt returnerar antalet vokaler i strängen
	public int countVowels() {
		String voList = "aoueiyåäöAOUEIYÅÄÖ";
		int voCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (voList.contains(str.substring(i, i+1))) {
				voCount++;
			}
		}
		return voCount;
	}
}