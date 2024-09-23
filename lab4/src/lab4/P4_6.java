package lab4;

public class P4_6 {

	public static void main(String[] args) {
		Student pucksac = new Student ("pucksac");
		
		pucksac.addQuizScore(0);
		pucksac.addQuizScore(5);
		
		System.out.println(pucksac.getName());
		System.out.println(pucksac.getTotalScore());
		System.out.println(pucksac.getNbrOfQuiz());
		System.out.println(pucksac.getAverageScore());
		
	}

}
