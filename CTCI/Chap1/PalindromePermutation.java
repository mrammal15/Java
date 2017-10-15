
public class PalindromePermutation {

	public boolean palindromePermutation(String s) {
		int [] charSet = new int [128];
		int oddCount = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i)))
				charSet[Character.toLowerCase(s.charAt(i))]++;
		}
		
		for(int i = 0; i < charSet.length; i++) {
			if(charSet[i] % 2 == 1)
				oddCount++;
			if(oddCount > 1)
				return false;
		}
		return true;
	}

}
