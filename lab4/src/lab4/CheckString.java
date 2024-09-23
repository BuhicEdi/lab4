package lab4;

public class CheckString {

	private String str = null;
	
	public CheckString(String str) {
		this.str = str;
	}
	
	
	public String getString() {
		return str;
		
	}
	
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
