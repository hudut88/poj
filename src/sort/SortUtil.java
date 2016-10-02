package sort;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRanDomIntegersArrays(10000,10000)));

	}
	
	/**
	 * 检查数组是否有序
	 * @param intArr 数组
	 * @return
	 */
	public static boolean isRightOrder(int[] intArr){
		for (int i = 1; i < intArr.length; i++) {
			if (intArr[i] < intArr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 获取指定长度的数组（100以内随机数）
	 * @param size 数组长度
	 * @return
	 */
	public static int[] getRanDomIntegersArrays(Integer size){
		Random random =new Random();
		int[] intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = random.nextInt(100);
		}
		return intArr;
	}
	
	/**
	 * 获取指定长度的数组 且指定随机数范围
	 * @param size 数组长度
	 * @param range 随机数范围
	 * @return
	 */
	public static int[] getRanDomIntegersArrays(Integer size , Integer range){
		Random random =new Random();
		int[] intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = random.nextInt(range);
		}
		return intArr;
	}

}
