package lab4;

public class P4_5 {

	public static void main(String[] args) {
		TallyCounter2 count = new TallyCounter2();
		
		count.count();
		count.count();
		count.count();
		
		count.setLimit(5);
		
		System.out.println(count.getValue());
		
		count.count();
		count.count();
		count.count();
	}

}
