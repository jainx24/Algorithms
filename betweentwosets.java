/* Consider two sets of positive integers, A={a0,a1,a2,...,an-1} and B={b0,b1,b2,....,bm-1}. We say that a positive integer, x, 
is between sets A and B if the following conditions are satisfied:

All elements in A are factors of x.
x is a factor of all elements in B. */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int i,j,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,ans=0,temp=1;;
        
        for(i=0;i<a.length;i++)
            if(min>a[i])
                min = a[i];
        
        for(i=0;i<b.length;i++)
            if(max<b[i])
                max = b[i];
        
        for(i=min;i<=max;i++)
        {
            temp=1;
            for(j=0;j<a.length;j++)
                if(i%a[j]!=0)
                {
                    temp=0;
                    break;
                }
            for(j=0;j<b.length;j++)
                if(b[j]%i!=0)
                {
                    temp=0;
                    break;
                }
            if(temp==1)
            ans++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        
        int[] b = new int[m];
        for(int i = 0; i < m; i++)
            b[i] = in.nextInt();
        
        int total = getTotalX(a, b);
        
        System.out.println(total);
        in.close();
    }
}
