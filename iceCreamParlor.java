/* https://www.hackerrank.com/challenges/icecream-parlor/problem

Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together m dollars for ice cream. On any given day, 
the parlor offers a line of n flavors. Each flavor, i, is numbered sequentially with a unique ID number from 1 to n 
and has a cost, ci, associated with it.

Given the value of m and the cost of each flavor for t trips to the Ice Cream Parlor, help Sunny and Johnny choose two flavors 
such that they spend their entire pool of money (m) during each visit. For each trip to the parlor, print the ID numbers for 
the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. 
You must print the smaller ID first and the larger ID second. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] icecreamParlor(int m, int[] arr) {
        int [] result = new int [2];
        int i,j,n = arr.length;
        
        for(i=0;i<n-1;i++)
            for(j=i+1;j<n;j++)
                if(arr[i]+arr[j]==m)
                {
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }       
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = in.nextInt(); 
            
            int[] result = icecreamParlor(m, arr);
            
            for (int i = 0; i < result.length; i++) 
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));   
            System.out.println("");
        }
        in.close();
    }
}
