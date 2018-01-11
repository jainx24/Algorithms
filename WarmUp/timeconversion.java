/* Sample Input
07:05:45PM

Sample Output
19:05:45 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        if(s.charAt(8)=='A')
        {
            int h = Integer.parseInt(s.substring(0,2));
            if(h==12)
                return "00"+s.substring(2,8);
            return s.substring(0,8);
        }
        else
        {
            int h = Integer.parseInt(s.substring(0,2));
            if(h==12)
                return s.substring(0,8);
            return Integer.toString(Integer.parseInt(s.substring(0,2)) + 12)+s.substring(2,8);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
