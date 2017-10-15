
public class StringCompression {

	public String stringCompression(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for(int i = 0; i < s.length(); i++) {
			if(i + 1 == s.length() || s.charAt(i) != s.charAt(i + 1)) {
				sb.append(s.charAt(i) + "" + count);
				count = 1;
			}
			else
				count++;
		}
		return s.length() < sb.length() ? s : sb.toString(); 
	}

}
