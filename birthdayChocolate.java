/* Lily has a chocolate bar consisting of a row of n squares where each square has an integer written on it. 
She wants to share it with Ron for his birthday, which falls on month m and day d. 
Lily wants to give Ron a piece of chocolate only if it contains m consecutive squares whose integers sum to d.

Given m, d, and the sequence of integers written on each square of Lily's chocolate bar, how many different ways can 
Lily break off a piece of chocolate to give to Ron? */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        int i,j,sum=0,ans=0;
        
        for(i=0;i<m;i++)
            sum+=s[i];
        
        if(sum==d)
            ans++;
        
        for(i=m;i<n;i++)
        {
            sum = sum + s[i] - s[i-m];
            if(sum==d)
                ans++;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
