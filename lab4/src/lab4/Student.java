package lab4;
/**
 * Klass som genererar en student och lagrar dess tentamensresultat
 * 
 * @author Edi Buhic
 * @version 2024-10-23
 */

public class Student {

	// Klassattribut som lagrar namn, totalpoäng samt antalet skrivna tentamem
	private String name;
	private double totalScore;
	private int nbrOfQuiz;

	// Klassens konstruktor som tar emot namnet på studenten
	public Student(String student) {
		this.name = student;
		this.totalScore = 0.0;
		this.nbrOfQuiz = 0;
	}

	// Metod som adderar nytt provresultat
	public void addQuizScore(double score) {
		this.totalScore += score;
		this.nbrOfQuiz++;
	}

	// Metod som returnerar studentens namn
	public String getName() {
		return name;
	}

	// Metod som returnerar totalpoängen
	public double getTotalScore() {
		return totalScore;
	}

	// Metod som returnerar ett medelvärde på totalpoängen
	public double getAverageScore() {
		if (nbrOfQuiz == 0 || totalScore < 0) {
			return 0;
		}
		return totalScore / nbrOfQuiz;
	}

	// Metod som returnerar antalet skrivna tentamen
	public int getNbrOfQuiz() {
		return nbrOfQuiz;
	}
}