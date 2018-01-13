/* Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following 
the trail and notices that two consecutive stones have a difference of either a or b. 
Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, 
the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void stones(int n, int a, int b) {
        int temp,i,j,ans=0;
        
        if(b<a)
        {
            temp = b;
            b = a;
            a = temp;
        }
        
        for(i=1;i<n;i++)
            ans = ans + a;
        
        System.out.print(ans+" ");
        
        if(a==b)
            return;
                
        for(i=1;i<n;i++)
        {
            ans = ans + b - a;
            System.out.print(ans+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            stones(n, a, b);  
            System.out.println();
        }
        in.close();
    }
}
