package searching;

public class RecursiveBinarySearch {
	public static int recursiveBinarySearch(double[] list, double key) {
		int low = 0;
		int high = list.length-1;
		return recursiveBinarySearch(list, key, low, high);
	}

	private static int recursiveBinarySearch(double[] list, double key, int low, int high) {
		if (low > high) {
			return -low-1; //return negative if not found
		}
		
		int mid = (low+high)/2;
		if (key < list[mid]) {
			return recursiveBinarySearch(list, key, low, mid-1);
		}
		else if (key == list[mid]) {
			return mid;
		}
		else {
			return recursiveBinarySearch(list, key, mid+1, high);
		}
	}
}
