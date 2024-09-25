package lab4;
/**
 * Detta program testar klassen CheckString.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class P4_2 {

	public static void main(String[] args) {

		String str = "Gävle";						// Provsträng
		CheckString chk = new CheckString(str);		// Genererar en ny instans av klassen CheckString

		//Anropar metoder som ska returnera mittersta bokstaven och antalet vokaler
		System.out.println(chk.middle());
		System.out.println(chk.countVowels());
	}
}