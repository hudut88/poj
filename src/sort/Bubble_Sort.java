package sort;

import java.util.Arrays;
/**
 * √∞≈›≈≈–Ú
 * @author ypf
 *
 */
public class Bubble_sort {

	public static void main(String[] args) {
		Integer[] aInteger = {1,0,8,2,4,1,3,1,3,7,5,6};
		sort(aInteger);
		System.out.println(Arrays.toString(aInteger));
	}

	public static void sort(Integer[] intArr){
		int length = intArr.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < (length - i -1); j++) {
				if (intArr[j] > intArr[j+1]) {
					swap(intArr , j , j +1);
				}
			}
		}
	}

	private static void swap(Integer[] intArr, int i, int j) {
		int k = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = k;
	}

}
