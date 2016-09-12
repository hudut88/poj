import java.io.*;
import java.math.BigDecimal;
import java.util.*;
/**
 * Ö±½Ó±©Á¦
 * @author ypf
 *
 */
public class poj_1003 {
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
        	 Double limit = cin.nextDouble();
        	 if (limit.compareTo(0.0) == 0) {
				break;
			 }
             int i = 2;
             Double sum = new Double(0);
             while(true){
             	sum = sum + 1.0/i;
             	//System.out.println("i-->"+i);
             	//System.out.println("sum-->"+sum);
             	if (sum.compareTo(limit) > 0) {
     				break;
     			}
             	i++;
             }
             System.out.println(i-1+" card(s)");
        }
    }
}