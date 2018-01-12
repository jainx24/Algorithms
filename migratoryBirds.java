/* A flock of n birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers 1, 2, 3, 4, and 5.

Given an array of n integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird.
If two or more types of birds are equally common, choose the type with the smallest ID number. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        
        int i,count1=0,count2=0,count3=0,count4=0,count5=0,ans=1,max;
        
        for(i=0;i<n;i++)
        {
            if(ar[i]==1)
                count1++;
            else if(ar[i]==2)
                count2++;
            else if(ar[i]==3)
                count3++;
            else if(ar[i]==4)
                count4++;
            else
                count5++;
        }
        max=count1;
        
        if(max<count2)
        {
            max=count2;
            ans=2;
        }
        
        if(max<count3)
        {
            max=count3;
            ans=3;
        }
        
        if(max<count4)
        {
            max=count4;
            ans=4;
        }
        
        if(max<count5)
        {
            max=count5;
            ans=5;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
