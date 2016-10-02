package sort;

import java.util.Arrays;
/**
 * 插入排序
 * @author ypf
 *
 */
public class Insertion_sort {

	public static void main(String[] args) {
		int[] aInteger = SortUtil.getRanDomIntegersArrays(100,300);
		//int[] aInteger = {2,4,1,3,1,3,7,9,10,8,12,3,5,6};
		//int[] aInteger ={91, 10, 62, 38, 25, 39, 25, 38, 62, 63, 89, 69, 44, 36, 37, 61, 88, 0, 30, 24, 98, 58, 79, 43, 56, 27, 37, 93, 15, 96, 5};
		System.out.println(Arrays.toString(aInteger));
		//straight_insertion_sort(aInteger);
		binary_insertion_sort(aInteger);
		System.out.println(Arrays.toString(aInteger));
	}

	/**
	 * 直接插入排序
	 * @param intArr
	 * @param end_idx
	 * @param j
	 */
	public static void straight_insertion_sort(int[] intArr) {
		for (int i = 1; i < intArr.length ; i++) {
			int swap_idx = i -1;
			for (int j = i - 1; j >= 0; j --) {
				if (intArr[i] >= intArr[j]) {
					swap_idx = j + 1;
					break;
				}
			}
			executeInsertion(intArr , i , swap_idx);
		}
	}
	
	/**
	 * 折半插入排序
	 * @param intArr
	 */
	public static void binary_insertion_sort(int[] intArr) {
		for (int i = 1; i < intArr.length ; i++) {
			//System.out.println("loop-->"+i);
			int swap_idx = binaryFindInsertionIdx(intArr ,0, i -1 , i);
			//System.out.println("swap_idx-->"+swap_idx +" "+ i);
			executeInsertion(intArr , i , swap_idx);
			//System.out.println(Arrays.toString(intArr));
		}
	}

	/**
	 * 折半查找插入位置
	 * @param intArr
	 * @param bgn
	 * @param end
	 * @param i
	 * @return
	 */
	private static int binaryFindInsertionIdx(int[] intArr, int bgn, int end ,int i) {
		if (bgn <= end) {
			int middle = bgn + (end - bgn) /2;
			//System.out.println("middle-->"+middle);
			if (intArr[i] >= intArr[middle]) {
				return binaryFindInsertionIdx(intArr , middle + 1, end ,i );
			}else {
				return binaryFindInsertionIdx(intArr , bgn, middle -1 ,i );
			}
		}
		return bgn;
	}

	/**
	 * 插入操作
	 * @param intArr
	 * @param end_idx
	 * @param j
	 */
	private static void executeInsertion(int[] intArr, int end_idx, int j) {
		if (end_idx == j) {
			return;
		}
		int k = intArr[end_idx];
		for (int i = end_idx; i > j; i--) {
			intArr[i] = intArr[i-1];
		}
		intArr[j] = k;
	}
	
}
