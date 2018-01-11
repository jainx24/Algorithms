/* Input Format

Code that reads input from stdin is provided for you in the editor. There are  lines of input, and each line contains a single integer.

Output Format

Code that prints the sum calculated and returned by solveMeFirst is provided for you in the editor. */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {       
        return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
