/* 
 * Complexity: O(N) time, O(1) space
 */
public class LinearSearch {
	
	public boolean linearSearch(int [] arr, int value) {
		for(int i : arr) {
			if(i == value)
				return true;
		}
		return false;
	}
	
}
