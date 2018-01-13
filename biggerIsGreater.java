/* Given a word w, rearrange the letters of w to construct another word s in such a way that s is lexicographically
greater than w. In case of multiple possible answers, find the lexicographically smallest one among them.

Input Format
The first line of input contains t, the number of test cases. Each of the next t lines contains w.

Output Format
For each testcase, output a string lexicographically bigger than w in a separate line. 
In case of multiple possible answers, print the lexicographically smallest one, and if no answer exists, print no answer. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String biggerIsGreater(String s) {
        
        int i,j,min;
        String ans="";
        char x;
        
        char [] w = s.toCharArray();
        
        for(i=w.length-1;i>0;i--)
            if(w[i]>w[i-1])
                break;
        
        if(i==0)
            return "no answer";
        
        else
        {
            x = w[i-1];
            min = i;
           
            for(j=i+1;j<w.length;j++)
                if(w[j]>x && w[j]<w[min])
                    min = j;
            w[i-1] = w[min];
            w[min] = x;
        }
        
        Arrays.sort(w,i,w.length);
         
        for(j=0;j<w.length;j++)
          ans = ans + w[j];
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            String w = in.next();
            String result = biggerIsGreater(w);
            System.out.println(result);
        }
        in.close();
    }
}
