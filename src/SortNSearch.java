import sorting.*;
import searching.*;

public class SortNSearch {

	public static void main(String[] args) {
		//20 random doubles between 1 and 100.
		double[] nums = {77.96,51.51,60.48,60.94,4.75,14.05,17.99,61.72,82.12,46.7,
						77.26,16.69,11.64,52.05,9.02,93.91,56.18,17.79,97.93,81.25};
		RecursiveSelectionSort.sort(nums);
		
		//print sorted list
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		//finding 16.69
		System.out.println("found at "+
		RecursiveBinarySearch.recursiveBinarySearch(nums, 16.69));
	}
}