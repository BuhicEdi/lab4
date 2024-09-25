package lab4;
/**
 * Detta program testar klassen Student.
 * 
 * @author Edi Buhic
 * @version 2024-09-24
 */

public class P4_6 {

	public static void main(String[] args) {
		Student pucksac = new Student ("pucksac");	// Genererar en ny instans av klassen Student med namnet pucksac

		// Adderar tentamensresultat
		pucksac.addQuizScore(0);
		pucksac.addQuizScore(5);

		// Anropar studentens namn, totala poäng, antalet skrivna tentor och medelpoängvärde
		System.out.println(pucksac.getName());
		System.out.println(pucksac.getTotalScore());
		System.out.println(pucksac.getNbrOfQuiz());
		System.out.println(pucksac.getAverageScore());
	}
}