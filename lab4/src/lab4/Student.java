package lab4;
/**
 * 
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class Student {

	private String name;
	private double totalScore;
	private int nbrOfQuiz;

	public Student(String student) {
		this.name = student;
	}
	
	public void addQuizScore(double score) {
		this.totalScore += score;
		this.nbrOfQuiz++;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTotalScore() {
		return totalScore;
	}
	
	public double getAverageScore() {
		return totalScore / nbrOfQuiz;
	}
	
	public int getNbrOfQuiz() {
		return nbrOfQuiz;
	}
}
