package searching;

public class RecursiveBinarySearch {
	public static int recursiveBinarySearch(double[] list, double key) {
		int low = 0;
		int high = list.length-1;
		return recursiveBinarySearch(list, key, low, high);
	}

	private static int recursiveBinarySearch(double[] list, double key, int low, int high) {
		if (low > high) {
			return -low-1; //return negative index of where it would be if it was here, but its NOT. 
		}
		
		int mid = (low+high)/2;
		if (key < list[mid]) { // we have to go lower
			return recursiveBinarySearch(list, key, low, mid-1);
		}
		else if (key == list[mid]) {//found it
			return mid;
		}
		else {// we have to go higher
			return recursiveBinarySearch(list, key, mid+1, high);
		}
	}
}
