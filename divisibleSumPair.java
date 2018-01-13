/* You are given an array of n integers, ar, and a positive integer, k. Find and print the number of (i,j) pairs where i<j and 
ai+aj  is divisible by k. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int i,j,sum=0;
        for(i=0;i<n-1;i++)
            for(j=i+1;j<n;j++)
                if((ar[i]+ar[j])%k==0)  
                    sum++;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
