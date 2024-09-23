package lab4;

public class P4_4 {

	public static void main(String[] args) {
		TallyCounter1 count = new TallyCounter1();	
		
		count.count();
		count.count();
		
		System.out.println(count.getValue());
		
		count.undo();
		
		System.out.println(count.getValue());
		
	}

}
