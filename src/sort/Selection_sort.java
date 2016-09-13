package sort;

import java.util.Arrays;
/**
 * —°‘Ò≈≈–Ú
 * @author ypf
 *
 */
public class Selection_sort {

	public static void main(String[] args) {
		Integer[] aInteger = {4,1,3,1,3,7,9,10,8,12,3,5,6};
		Selection_sort(aInteger);
		System.out.println(Arrays.toString(aInteger));

	}

	public static void Selection_sort(Integer[] intArr) {
		int swap_idx = 0;
		for (int i = 0; i < intArr.length; i++) {
			swap_idx = i;
			for (int j = (i + 1); j < intArr.length; j++) {
				if (intArr[j] < intArr[swap_idx]) {
					swap_idx = j;
				}
			}
			swap(intArr, swap_idx, i);
		}
		
	}
	private static void swap(Integer[] intArr, int i, int j) {
		int k = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = k;
	}
}
