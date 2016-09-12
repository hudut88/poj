import java.io.*;
import java.util.*;
/**
 * 逆序数/归并排序
 * @author ypf
 *
 */
public class poj_1007 {
	static class Node{
		public Node(int num , String str) {
			this.num = num;
			this.str = str;
		}
		int num;
		String str;
	}
	static class NodeComparator implements Comparator {  
        public int compare(Object object1, Object object2) {// 实现接口中的方法  
        	Node n1 = (Node) object1; // 强制转换  
        	Node n2 = (Node) object2;  
            return n1.num - n2.num;  
        }  
    }
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int len=cin.nextInt(),num=cin.nextInt();
        //cin.nextLine();
        char[] strArr ;
        int count = 0;
        List<Node> nodeList = new ArrayList<Node>();
        for (int i = 0; i < num; i++) {
			String str = cin.next();
			strArr = str.toCharArray();
			//暴力破解
//			for (int j = 0; j < strArr.length; j++) {
//				for(int k = j+1 ; k < strArr.length; k++){
//					if (strArr[j] > strArr[k]) {
//						 count ++ ;
//					}
//				}
//			}
			//归并排序求逆序数
			count = Merge_sort.mergeSort(strArr);
			Node node= new Node(count,str);
			
			nodeList.add(node);
			Collections.sort(nodeList, new NodeComparator());
			count =0;
		}
        for (Node node : nodeList) {
			//System.out.println(node.num);
			System.out.println(node.str);
		}
    }
}

class Merge_sort {
	//逆序数
	public static int nixuNum = 0;
	//归并排序
	public static int mergeSort(char[] IntArr){
		nixuNum = 0;
		mergeSort(IntArr, 0, IntArr.length-1);
		//System.out.println(Arrays.toString(IntArr));
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