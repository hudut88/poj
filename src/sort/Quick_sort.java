package sort;

import java.util.Arrays;
import java.util.Date;
/**
 * ¿ìËÙÅÅÐò
 * @author ypf
 *
 */
public class Quick_sort {

	public static void main(String[] args) {
		//int[] aInteger = {8,1,0,8,2,4,1,3,1,3,7,5,6};
		int[] intArr = SortUtil.getRanDomIntegersArrays(100,100);
		int length = intArr.length;
		sort(intArr , 0, length -1);
		System.out.println(Arrays.toString(intArr));
		System.out.println(SortUtil.isRightOrder(intArr));
	}
	
	public static void sort(int[] intArr){
		sort(intArr ,0 , intArr.length -1);
	}

	private static void sort(int[] intArr, int bgn, int end){
		//System.out.println("bgn-->" + bgn + " end-->" + end);
		int temp = intArr[bgn];
		int i = bgn;
		int j = end;
		int order = 0;
		while(j > i){
			if (order == 0) {
				if (temp > intArr[j]) {
					intArr[i] = intArr[j];
					order = 1;
					i ++ ;
				}else {
					j -- ;
				}
				
			}else {
				if (temp < intArr[i]) {
					intArr[j] = intArr[i];
					order = 0;
					j -- ;
				}else {
					i ++ ;
				}
			}
			//System.out.println(new Date().getTime()+ "---" + Arrays.toString(intArr));
		}
		intArr[i] = temp;
		//System.out.println(new Date().getTime()+ "***" + Arrays.toString(intArr));
		if (i - 1 > bgn) {
			sort(intArr , bgn, i - 1);
		}
		if (i + 1 < end) {
			sort(intArr , i + 1, end);
		}
	}
}
