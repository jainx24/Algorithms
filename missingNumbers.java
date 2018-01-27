// https://www.hackerrank.com/challenges/missing-numbers/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void missingNumbers(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0,j=0,k=0;
        int [] result = new int [a.length+b.length];
        
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
                result[k++]=a[i++];
            else if(b[j]<a[i])
                result[k++]=b[j++];
            else
            {
                i++;
                j++;
            }
        }
        
        while(i<a.length)
            result[k++]=a[i++];
        while(j<b.length)
            result[k++]=b[j++];
        
        System.out.print(result[0]+" ");
        for(i=1;i<k;i++)
            if(result[i]!=result[i-1])
                System.out.print(result[i]+" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        missingNumbers(arr, brr);
        
        in.close();
    }
}
