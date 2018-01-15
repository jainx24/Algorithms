/* Find the number of ways that a given integer, X, can be expressed as the sum of the Nth powers of unique, natural numbers.

Input Format
The first line contains an integer X. 
The second line contains an integer N.

Output Format
Output a single integer, the answer to the problem explained above. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int count=0;   
    
    public static int powerSum(int x, int n, int start) {    
        if(x==0)
            return count+1;   
        for(int i=start;i<=x;i++)
        {
            Double d1=(double)i,d2=(double)n;
            int y = (int)Math.pow(d1,d2);
            if(x-y>=0)
                count = powerSum(x-y,n,i+1);
            else
                return count;
        }    
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N, 1);
        System.out.println(result);
        in.close();
    }
}
