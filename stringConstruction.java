/* Amanda has a string, s, of m lowercase letters that she wants to copy into a new string, p. She can perform the following 
operations any number of times to construct string p:
Append a character to the end of string p at a cost of 1 dollar.
Choose any substring of p and append it to the end of p at no charge.

Input Format
The first line contains a single integer, n, denoting the number of strings. 
Each line i of the n subsequent lines contains a single string, si.

Output Format
For each string si (where 0<=i<n), print the minimum cost of constructing string pi on a new line. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int stringConstruction(String s) {
        int i,cost=0;
        int [] a = new int [26];
        
        for(i=0;i<s.length();i++)
        {
            if(a[s.charAt(i)-'a']==0)
            {
                cost++;
                a[s.charAt(i)-'a']=1;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
