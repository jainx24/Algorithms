/* Given a set, S, of n distinct integers, print the size of a maximal subset, S', 
of S where the sum of any 2 numbers in S' is not evenly divisible by k. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int nonDivisibleSubset(int k, int[] arr) {
        
        int i,j,count=0,ans=0,x;
        int [] res = new int [k];
        
        for(i=0;i<arr.length;i++)
            arr[i]=arr[i]%k;
        
        for(i=0;i<k;i++)
        {
            count=0;
            for(j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                    count++;
            }
            res[i] = count;
        }
        
        if(res[0]>0)
        ans = ans + 1;
        
        if(k%2!=0)
            x=k/2;
        else
        {    
            x=(k/2)-1;
            ans = ans + 1;
        }
        
        for(i=1;i<=x;i++)
        {
            if(res[i]>res[k-i])
                ans=ans+res[i];
            else
                ans=ans+res[k-i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int result = nonDivisibleSubset(k, arr);
        System.out.println(result);
        in.close();
    }
}

