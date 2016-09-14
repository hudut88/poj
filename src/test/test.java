package test;

import java.util.Arrays;

import sort.Bubble_sort;
import sort.Insertion_sort;
import sort.Merge_sort;
import sort.Quick_sort;
import sort.Selection_sort;
import sort.Shell_sort;
import sort.SortUtil;

public class test {

	public static void main(String[] args) throws InterruptedException {
		int[] intArr = SortUtil.getRanDomIntegersArrays(100000,100000);
		int[] copyArr ;
		long bgnTime ;
		long endTime;
		
		System.out.println("快速排序：");
		copyArr = intArr.clone();
		System.out.println("before:"+SortUtil.isRightOrder(copyArr));
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Quick_sort.sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
		
		System.out.println("\n*********************************");
		System.out.println("归并排序：");
		copyArr = intArr.clone();
		System.out.println("before:"+SortUtil.isRightOrder(copyArr));
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Merge_sort.sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
		
		System.out.println("\n*********************************");
		System.out.println("折半插入排序：");
		copyArr = intArr.clone();
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Insertion_sort.binary_insertion_sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
		
		System.out.println("\n*********************************");
		System.out.println("直接插入排序：");
		copyArr = intArr.clone();
		System.out.println("before:"+SortUtil.isRightOrder(copyArr));
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Insertion_sort.straight_insertion_sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
		
		System.out.println("\n*********************************");
		System.out.println("冒泡排序：");
		copyArr = intArr.clone();
		System.out.println("before:"+SortUtil.isRightOrder(copyArr));
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Bubble_sort.sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
		
		System.out.println("\n*********************************");
		System.out.println("选择排序：");
		copyArr = intArr.clone();
		System.out.println("before:"+SortUtil.isRightOrder(copyArr));
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Selection_sort.sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
		
		System.out.println("\n*********************************");
		System.out.println("希尔排序：");
		copyArr = intArr.clone();
		System.out.println("before:"+SortUtil.isRightOrder(copyArr));
		bgnTime = System.currentTimeMillis();
		System.err.println("bgn time:"+ bgnTime);
		Shell_sort.sort(copyArr);
		endTime = System.currentTimeMillis();
		System.err.println("end time:"+ endTime);
		System.out.println("用时：" + (endTime - bgnTime));
		System.out.println("end:"+SortUtil.isRightOrder(copyArr));
		Thread.sleep(1000);
	}
}
