import java.util.*;

public class IsUnique {

	public boolean isUnique(String s) {
		if(s == null)
			return false;
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			if(!set.add(s.charAt(i)))
				return false;
		}
		return true;
	}
	
	public boolean isUniqueV2(String s) {
		if(s == null)
			return false;
		boolean [] charSet = new boolean [128];
		
		for(int i = 0; i < s.length(); i++) {
			if(charSet[s.charAt(i)])
				return false;
			charSet[s.charAt(i)] = true;
		}
		return true;
	}
	
}
