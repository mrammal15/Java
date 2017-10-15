
public class StringRotation {
	
	public static boolean stringRotation(String s1, String s2) {
		if(s1 == null || s2 == null)
			return false;
		return s1.length() == s2.length() && (s1+s1).contains(s2);
	}

}
