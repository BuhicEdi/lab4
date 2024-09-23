package lab4;

public class P4_1 {

	public static void main(String[] args) {
		CheckNumber chk = new CheckNumber();
		
		chk.setNbr1(3.14);
		chk.setNbr2(2.78);
		chk.setNbr3(1.0);
		
		System.out.println(chk.allTheSame());
		System.out.println(chk.allDifferent());
		System.out.println(chk.isSorted());
	}

}
