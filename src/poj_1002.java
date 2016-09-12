import java.io.*;
import java.util.*;
/**
 * ¼òµ¥Ìâ-×Ö·û×ª»»
 * @author ypf
 *
 */
public class poj_1002 {
    public static void main(String args[]) throws Exception {
    	boolean hasDuplicates = false;
        Scanner cin=new Scanner(System.in);
        int count = cin.nextInt();
        cin.nextLine();
        HashMap<String,Integer> strMap = new HashMap<String,Integer>(100000);
        TreeSet<String> strSet = new TreeSet<String>();
        char ch;
        for (int i = 0; i < count; i++) {
        	String str = cin.nextLine();
        	str = praseStr(str);
			if (strMap.containsKey(str)) {
				strMap.put(str, strMap.get(str) + 1);
				hasDuplicates = true;
			}else {
				strMap.put(str, 1);
				strSet.add(str);
			}
		}
        if (hasDuplicates == false) {
			System.out.println("No duplicates. ");
		}else{
			Iterator<String> iterator = strSet.iterator();
			String outStr ;
			while(iterator.hasNext()) {
				outStr = iterator.next();
				if (strMap.get(outStr) > 1) {
					System.out.println(outStr + " " + strMap.get(outStr));
				}
			}
		}
    }

	private static String praseStr(String str) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (sBuffer.length() == 3) {
				sBuffer.append('-');
			}
			if(str.charAt(i) == '-'){
				continue;
			}
			sBuffer.append(praseChar(str.charAt(i)));
		}
		return sBuffer.toString();
	}

	private static char praseChar(char c) {
		if (c <= 67 && c >= 65) {  
            return '2';  
        } else if (c <= 70 && c >= 68) {  
            return '3';  
        } else if (c <= 73 && c >= 71) {  
            return '4';  
        } else if (c <= 76 && c >= 74) {  
            return '5';  
        } else if (c <= 79 && c >= 77) {  
            return '6';  
        } else if (c <= 83 && c >= 80) {  
            return '7';  
        } else if (c <= 86 && c >= 84) {  
            return '8';  
        } else if (c <= 89 && c >= 87) {  
            return '9';  
        } else {  
            return c;  
        }  
	}
}