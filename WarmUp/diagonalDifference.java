/* Given a square matrix of size n*n, calculate the absolute difference between the sums of its diagonals.

Input Format
The first line contains a single integer, n. The next n lines denote the matrix's rows, with each line containing n
space-separated integers describing the columns.

Output Format
Print the absolute difference between the two sums of the matrix's diagonals as a single integer. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a, int n) {
        int i,j,one=0,two=0;
        
        for(i=0;i<n;i++)
            one = one + a[i][i];
        
        for(i=0;i<n;i++)
            two = two + a[i][n-i-1];
        
        return Math.abs(one-two);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
