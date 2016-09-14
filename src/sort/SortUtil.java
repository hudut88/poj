package sort;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRanDomIntegersArrays(10000,10000)));

	}
	
	/**
	 * ��������Ƿ�����
	 * @param intArr ����
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
	 * ��ȡ�ƶ����ȵ����飨100�����������
	 * @param size ���鳤��
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
	 * ��ȡ�ƶ����ȵ����� ���ƶ��������Χ
	 * @param size ���鳤��
	 * @param range �������Χ
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
