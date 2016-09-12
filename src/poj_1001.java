import java.io.*;
import java.math.BigDecimal;
import java.util.*;
/**
 * √›‘ÀÀ„
 * @author ypf
 *
 */
public class poj_1001{
    public static void main(String args[]) throws Exception
    {
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()) {
        	BigDecimal bigDecimal =cin.nextBigDecimal();
            int n =cin.nextInt();
            bigDecimal = bigDecimal.pow(n);
            String result = bigDecimal.stripTrailingZeros().toPlainString();
            if (result.startsWith("0.")){
                result = result.substring(1);
            }
            System.out.println(result);
        }

    }
}
