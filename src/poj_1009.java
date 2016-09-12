import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 * A+B
 * @author ypf
 *
 */
public class poj_1009 {
    static int pixel = 0;
    static int repeat = 0;
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int width = cin.nextInt();
        int i = 0;
        int j = 0;
        int[][] image = new int[3][260];
        boolean readNext = false;
        while(width != 0){
        	getNextPixelParam(cin);
        	i = 0;
        	j = 0;
        	while (!(pixel == 0 && repeat == 0)) {
        		if (readNext) {
        			getNextPixelParam(cin);
        			readNext = false;
				}
        		image[i][j++] = pixel;
        		repeat --;
        		if (repeat <=0 ) {
        			readNext = true;
				}
        		if (j >= width) {
					j = 0;
					for (int k = 0; k < width; k++) {
						System.out.print(image[i][k] +" ");
					}
					System.out.println();
					i ++ ;
					if (i >= 3) {
						i = 0;
					}
				}
			}
        	
        	
        }
      
    }
    
    static void getNextPixelParam(Scanner cin){
  	  	pixel = cin.nextInt();
    	repeat = cin.nextInt();
    }
}