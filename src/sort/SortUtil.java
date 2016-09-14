package sort;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRanDomIntegersArrays(50)));

	}
	
	public static int[] getRanDomIntegersArrays(Integer size){
		Random random =new Random();
		int[] intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = random.nextInt(100);
		}
		return intArr;
	}
	
	public static int[] getRanDomIntegersArrays(Integer size , Integer range){
		Random random =new Random();
		int[] intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = random.nextInt(range);
		}
		return intArr;
	}

}
