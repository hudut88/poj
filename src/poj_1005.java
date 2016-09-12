import java.io.*;
import java.util.*;
/**
 * 数学题，先写公式
 * @author ypf
 *
 */
public class poj_1005 {
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int n = cin.nextInt();
        Double xDouble;
        Double yDouble;
        Double yearDouble;
        for (int i = 0; i < n; i++) {
        	xDouble = cin.nextDouble();
        	yDouble = cin.nextDouble();
        	yearDouble =  Math.ceil(Math.PI*(xDouble*xDouble + yDouble*yDouble)/100);
        	System.out.println("Property "+(i+1)+": This property will begin eroding in year "+yearDouble.longValue()+".");
		}
        System.out.println("END OF OUTPUT.");
    }
}