
public class URLify {
	
	public void urlify(char [] url, int length) {
		int spaceCount = 0;
		
		for(int i = 0; i < length; i++)
			if(url[i] == ' ')
				spaceCount++;
		int index = length + 2*spaceCount - 1;
		if(length < url.length) 
			url[length] = '\0';
		for(int i = length - 1; i >= 0; i--) {
			if(url[i] == ' ') {
				url[index] = '0';
				url[index - 1] = '2';
				url[index - 2] = '%';
				index -= 3;
			}
			else
				url[index--] = url[i];
		}
	}

}
