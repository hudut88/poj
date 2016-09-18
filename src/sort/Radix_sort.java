package sort;

import java.util.Arrays;
/**
 * »ùÊýÅÅÐò
 * @author ypf
 *
 */
public class Radix_sort {

	public static void main(String[] args) {
		int[] aInteger = {50,123,543,187,49,30,0,2,11,100};
		sort(aInteger);
		System.out.println(Arrays.toString(aInteger));
	}

	public static void sort(int[] intArr){
		int radix = 10;
	}

	private static void swap(int[] intArr, int i, int j) {
		int k = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = k;
	}

}
