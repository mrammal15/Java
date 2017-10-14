/* Check if array contains a value
 * NOTE: array must be sorted for binary search
 * Complexity: O(logN) time, O(1) space 
 */
public class BinarySearch {

	/* Recursive */
	public boolean binarySearchRecursive(int [] arr, int value) {
		return binarySearchRecursive(arr,value,0,arr.length - 1);
	}
	
	private boolean binarySearchRecursive(int [] arr, int value, int left, int right) {
		if(left > right)
			return false;
		int mid = left + (right - left) / 2;

		if(arr[mid] == value)
			return true;
		else if(arr[mid] > value)
			return binarySearchRecursive(arr,value,left,mid - 1);
		else
			return binarySearchRecursive(arr,value,mid + 1, right);
	}
	
	/*Iterative*/
	public boolean binarySearchIterative(int [] arr, int value) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == value)
				return true;
			else if(arr[mid] > value)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return false;
	}
	
}
