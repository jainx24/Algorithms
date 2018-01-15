/* Given two strings, a and b, determine if they share a common substring.

Input Format
The first line contains a single integer, p, denoting the number of (a,b) pairs you must check. 
Each pair is defined over two lines:

The first line contains string a.
The second line contains string b.

Output Format
For each (a,b) pair of strings, print YES on a new line if the two strings share a common substring; 
if no such common substring exists, print NO on a new line. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        int [] a = new int [26];
        int [] b = new int [26];
        
        int i,j;
        
        for(i=0;i<s1.length();i++)
            a[s1.charAt(i)-'a']++;
        
        for(i=0;i<s2.length();i++)
            b[s2.charAt(i)-'a']++;
        
        for(i=0;i<26;i++)
            if(a[i]>0 && b[i]>0)
                return "YES";
        return "NO";
    }

    public static void main(String[] args) {           
        Scanner in = new Scanner(System.in);
        
        int p = in.nextInt();
        for(int i=0;i<p;i++)
        {
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result); 
        }
    }
}
