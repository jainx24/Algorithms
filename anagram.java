/* Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books.
He chooses strings s1 and s2 in such a way that |len(s1)-len(s2)|<=1.

Your task is to help him find the minimum number of characters of the first string he needs to change to enable him to make it 
an anagram of the second string. Robot can also re-arrange the alphabets in s1 to make it anagram of s2.
Note: A word x is an anagram of another word y if we can produce y by rearranging the letters of x.

Input Format
The first line will contain an integer, T, representing the number of test cases. Each test case will contain a string having 
length len(s1)+len(s2), which will be concatenation of both the strings described above in the problem.
The given string will contain only characters from a to z.

Output Format
An integer corresponding to each test case is printed in a different line, i.e. the number of changes required for each test case.
Print -1 if it is not possible. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int anagram(String s){
        if(s.length()%2!=0)
            return -1;
        
        String s1,s2;
        int i,count=0;
        int [] a = new int [26];
        int [] b = new int [26];
        
        s1 = s.substring(0,s.length()/2);
        s2 = s.substring(s.length()/2);
        
        for(i=0;i<s1.length();i++)
        {
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        
        for(i=0;i<26;i++)
           count=count+Math.abs(a[i]-b[i]);
        
        return count/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
