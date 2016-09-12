import java.io.*;
import java.util.*;
/**
 * A+B
 * @author ypf
 *
 */
public class poj_1008 {
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int count=cin.nextInt();
        cin.nextLine();
        for (int i = 0; i < count; i++) {
			String date = cin.nextLine();
			int point = date.indexOf(".");
			String day  = date.substring(0, point);
			String month  = date.substring(date.indexOf(" ", 1), date.indexOf(" ", 2));
			String year  = date.substring(date.indexOf(" ", 2), date.length());
			System.out.println(year + " " + month + " " + day);
		}
    }
}