
public class CheckPermutation {
	
	public boolean checkPermutation(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		int [] charSet = new int [128];
		
		for(int i = 0; i < s1.length(); i++) {
			charSet[s1.charAt(i)]++;
			charSet[s2.charAt(i)]--;
		}
		
		for(int i = 0; i < charSet.length; i++) {
			if(charSet[i] != 0)
				return false;
		}
		return true;
	}
	
}
