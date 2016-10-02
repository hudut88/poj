import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
/**
 * 平均数 保留两位小数
 * @author ypf
 *
 */
public class poj_1004 {
    public static void main(String args[]) throws Exception {
    	//getRoundAfterPointTwo();
        Scanner cin=new Scanner(System.in);
        Double sum = new Double(0);
        for (int i = 0; i < 12; i++) {
        	sum += cin.nextDouble();
		}
        Double result = sum/12;
        BigDecimal bd = new BigDecimal(result);  
        System.out.println("$"+bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()); 
    }
    
    public static void getRoundAfterPointTwo() {  
        String str="86.64466666";  
        BigDecimal bd = new BigDecimal(Double.parseDouble(str));  
        System.out.println(bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());  
        System.out.println("=================");  
        DecimalFormat df = new DecimalFormat("#.00");   
        System.out.println(df.format(Double.parseDouble(str)));   
        System.out.println("=================");  
        System.out.println(String.format("%.2f", Double.parseDouble(str)));  
        System.out.println("=================");  
        NumberFormat nf = NumberFormat.getNumberInstance();   
        nf.setMaximumFractionDigits(2);   
        System.out.println(nf.format(Double.parseDouble(str)));   
    }  
}