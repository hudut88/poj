package sort;

import java.util.Arrays;
/**
 * 希尔排序
 * @author ypf
 *
 */
public class Shell_sort {

	public static void main(String[] args) {
		int[] intArr = {2,4,1,3,1,3,7,9,10,8,12,3,5,6};
		System.out.println(Arrays.toString(intArr));
		sort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
	
	/**
	 * 希尔排序
	 * @param arr
	 */
	public static void sort(int[] arr) {
		int gap = 1, i, j, len = arr.length;
		int temp;
		while (gap < len / 3)
			gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
			for (; gap > 0; gap /= 3){
				for (i = gap; i < len; i++) {
					temp = arr[i];
					for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap)
						arr[j + gap] = arr[j];
					arr[j + gap] = temp;
				}
			}
	}
	
}
