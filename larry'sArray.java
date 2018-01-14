/* Larry has a permutation of N numbers, A, whose unique elements range from 1 to N (i.e.: A={a1,a2....,an}). 
He wants A to be sorted, so he delegates the task of doing so to his robot. 
The robot can perform the following operation as many times as it wants:

Choose any 3 consecutive indices and rotate their elements in such a way that ABC rotates to BCA, which rotates to CAB, which rotates back to ABC.
For example: if A={1,6,5,2,4,3} and the robot rotates (6,5,2),  becomes (1,5,2,6,4,3).

On a new line for each test case, print YES if the robot can fully sort ; otherwise, print NO. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String larrysArray(int[] a) {
        int i,j,count=0;
        for(i=0;i<a.length-1;i++)
            for(j=i+1;j<a.length;j++)
                if(a[j]<a[i])   
                    count++;
        if(count%2==0)
            return "YES"; 
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] A = new int[n];
            for(int i = 0; i < n; i++){
                A[i] = in.nextInt();
            }
            String result = larrysArray(A);
            System.out.println(result);
        }
        in.close();
    }
}
