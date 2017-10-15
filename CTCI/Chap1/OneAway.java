
public class OneAway {

	public boolean oneAway(String s1, String s2) {
		if(s1 == null || s2 == null)
			return false;
		int min = Math.min(s1.length(), s2.length());
		
		for(int i = 0; i < min; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(s1.length() == s2.length())
					return oneAway(s1.substring(i + 1), s2.substring(i + 1));
				else if(s1.length() < s2.length())
					return oneAway(s1, s2.substring(i + 1));
				else
					return oneAway(s1.substring(i + 1), s2);
			}
		}
		return Math.abs(s1.length() - s2.length()) <= 1;	
	}

}
