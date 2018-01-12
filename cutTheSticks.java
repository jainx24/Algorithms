/* You are given N sticks, where the length of each stick is a positive integer.
A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
Sample Input 0
6
5 4 4 2 2 8
Sample Output 0
6
4
2
1 

Sample Input 1
8
1 2 3 4 3 3 2 1
Sample Output 1
8
6
4
1*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int x=0;
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        
        int i,j,prev=arr[0],count=1,ans=arr.length;        
        int [] result = new int [arr.length];
        
        result[x++]=ans;
        
        for(i=1;i<arr.length;i++)
        {
            if(prev==arr[i])
                count++;
            
            else
            {
                prev=arr[i];
                ans=ans-count;
                result[x++]=ans;
                count=1;
            } 
        }
       return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int [] result = cutTheSticks(arr);
        
        for(int i=0;i<x;i++)
            System.out.println(result[i]);
        
        in.close();
    }
}



