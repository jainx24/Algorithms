/* Colleen is turning  years old! Therefore, she has n candles of various heights on her cake, and candle i has heighti. 
Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Given the heighti for each individual candle, find and print the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, n, denoting the number of candles on the cake. 
The second line contains  space-separated integers, where each integer i describes the height of candle i. 

Output Format

Print the number of candles Colleen blows out on a new line. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int i,count=1,max;
        
        max=ar[0];
        
        for(i=1;i<n;i++)
        {
            if(max==ar[i])
                count++;
            
            if(max<ar[i])
            {
                max=ar[i];
                count=1;
            }            
            //System.out.println(max+" "+count+" "+i);
        }
        //System.out.println(max);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

