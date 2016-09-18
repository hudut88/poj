package sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
/**
 * »ùÊýÅÅÐò
 * @author ypf
 *
 */
public class Radix_sort {

	public static void main(String[] args) {
		Queue<Integer>  queue= new LinkedList();
		int[] aInteger = {50,123,543,187,49,30,0,2,11,100};
		sort(aInteger);
		System.out.println(Arrays.toString(aInteger));
	}

	public static void sort(int[] intArr){
		int radix = 10;
		int length = intArr.length;
		int 
		for (int i = 0; i < length; i++) {
			intArr[i] / radix;
		}
	}

	private static void swap(int[] intArr, int i, int j) {
		int k = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = k;
	}

}
