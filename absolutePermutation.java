/* We define P to be a permutation of the first N natural numbers in the range [1,N]. Let posi denote the position of i 
in permutation P (please use -based indexing). P is considered to be an absolute permutation if abs(posi-i)=k  holds true 
for every i in [1,N]. Given N and K, print the lexicographically smallest absolute permutation, P; 
if no absolute permutation exists, print -1.

Input Format
The first line of input contains a single integer, T, denoting the number of test cases. 
Each of the T subsequent lines contains 2 space-separated integers describing the respective N and K values for a test case.

Output Format
On a new line for each test case, print the lexicographically smallest absolute permutation; if no absolute permutation exists, print -1. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void print(int k, int n)
    {
        int i,j=1;
        for(i=1;i<=n;i++)
        {
            if(j%2==1)
                System.out.print(i+k+" ");
            else
                System.out.print(i-k+" ");
            
            if(k>0 && i%k==0)
                j++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();

            if(k==0)
            {
                print(k,n);
                continue;
            }
            
            if(n%k==0 && (n/k)%2==0)
                print(k,n);
            else
                System.out.println(-1);              
        }
    }
}
