package lab4;

public class P4_2 {

	public static void main(String[] args) {
		
		
		String strang = "Gävle";
		
		CheckString chk = new CheckString(strang);
		
		
		System.out.println(chk.middle());
		System.out.println(chk.countVowels());
	}

}
