/* Given an integer, we need to find the super digit of the integer.

We define super digit of an integer x using the following rules:
If x has only 1 digit, then its super digit is x.
Otherwise, the super digit of x is equal to the super digit of the digit-sum of x. Here, digit-sum of a number 
is defined as the sum of its digits.
For example, super digit of 9875 will be calculated as:
super_digit(9875) = super_digit(9+8+7+5) 
                  = super_digit(29) 
                  = super_digit(2+9)
                  = super_digit(11)
                  = super_digit(1+1)
                  = super_digit(2)
                  = 2.

You are given two numbers n and k. You have to calculate the super digit of p.
p is created when number n is concatenated k times. That is, if n=123 and k=3, then p=123123123.

Input Format
The first line contains two space separated integers, n and k.

Output Format
Output the super digit of p, where p is created as described above. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int digitSum(String s, int k) {
        int i;
        long sum=0;
        for(i=0;i<s.length();i++)
            sum = sum + (long)(s.charAt(i)-'0');
        sum = sum*(long)k;
        s=Long.toString(sum); 
        if(s.length()>1)
            return digitSum(s,1); 
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = digitSum(n, k);
        System.out.println(result);
        in.close();
    }
}
