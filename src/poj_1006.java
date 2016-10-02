import java.io.*;
import java.util.*;
/**
 * 中国剩余定理
 * @author ypf
 *
 */
public class poj_1006 {
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int count =1;
        while(cin.hasNext()){
        	int x=cin.nextInt();
            int y=cin.nextInt();
            int z=cin.nextInt();
            int d=cin.nextInt();
            if(x == -1 && y == -1 && z == -1){
            	break;
            }
            //�й�ʣ�ඨ��
            int days = (5544 * x + 14421 * y + 1288 * z - d) % (21252);
            if (days <= 0) {
                days = 23 * 28 * 33 + days;
            }
            System.out.println("Case "+ count++ +": the next triple peak occurs in "
					+days + " days.");
            //�����ƽ�
//            x = x % 23;
//            y = y % 28;
//            z = z % 33;
//            int bgeinidx = d;
//            d ++;
//            while(true){
//            	if (d % 23 == x) {
//					if (d % 28 == y) {
//						if (d % 33 == z) {
//							System.out.println("Case "+ count++ +": the next triple peak occurs in "
//									+(d-bgeinidx) + " days.");
//							break;
//						}
//					}
//				} 
//            	d++;
//            }
        }
        
    }
}