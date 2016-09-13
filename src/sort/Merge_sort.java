package sort;
import java.awt.List;
import java.util.Arrays;
/**
 * 归并排序
 * @author ypf
 *
 */
public class Merge_sort {
	//逆序数
	public static int nixuNum = 0;
	public static void main(String[] args) {
		char[] IntArr = {3,6,1,2,5,4};
		mergeSort(IntArr , 0  , IntArr.length -1);
		System.out.println(Arrays.toString(IntArr));
		System.out.println(nixuNum);
	}
	//归并排序
	public static int mergeSort(char[] IntArr){
		nixuNum = 0;
		mergeSort(IntArr, 0, IntArr.length-1);
		System.out.println(Arrays.toString(IntArr));
		return nixuNum;
	}
	//二路归并
	private static char[] mergeSort(char[] IntArr, int bgn, int end) {
		int middle = (bgn + end )/2;
		if (bgn < end) {
			if (middle > bgn) {
				mergeSort(IntArr , bgn , middle);
			}
			if (end > middle + 1) {
				mergeSort(IntArr , middle + 1 , end);
			}
			merge(IntArr , bgn ,middle, end);
		}
		return IntArr;
	}
	//合并两个区间
	private static void merge(char[] IntArr, int bgn, int middle, int end) {
		char[] temArr = new char[end - bgn + 1];
		int i = bgn;
		int j = middle + 1;
		int k = 0;
		while(i <= middle && j <= end){
			if (IntArr[i] > IntArr[j]) {
				temArr[k++] = IntArr[j++];
				nixuNum += (middle - i +1);
			}else {
				temArr[k++] = IntArr[i++];
			}
		}
		while(i <= middle){
			temArr[k++] = IntArr[i++];
		}
		while(j <= end){
			temArr[k++] = IntArr[j++];
		}
		for (int idx = 0; idx < temArr.length; idx++) {
			IntArr[bgn++] =temArr[idx];
		}
	}

}
