/* 
 * Complexity: O(N^2) time, O(1) space 
 */
public class BubbleSort {
	
	public void sort(int [] arr) {
		int lastElement = arr.length - 1;
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < lastElement; i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
					isSorted = false;
				}
			}
			lastElement--;
		}
	}
	
	public void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
