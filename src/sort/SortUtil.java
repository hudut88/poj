package sort;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRanDomIntegers(50)));

	}
	
	public static int[] getRanDomIntegers(Integer size){
		Random random =new Random();
		int[] intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = random.nextInt(100);
		}
		return intArr;
	}

}
