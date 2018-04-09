package sorting;

public class RecursiveSelectionSort {
	public static void sort(double[] list) {
		sort(list, 0, list.length-1);
	}
	
	private static void sort(double[] list, int low, int high) {
		if (low<high) {
			int inedxOfKey = low;
			double key = list[low];
			for (int i=low+1; i<=high; i++) {
				if (key>list[i]) {
					key = list[i];
					inedxOfKey = i;
				}
			}
			list[inedxOfKey]=list[low];
			list[low]=key;
			//"Here we go again."
			sort(list, low+1, high);
		}
	}
}
