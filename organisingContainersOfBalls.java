//https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String organizingContainers(int[][] container, int n) {
        
        int i,j;
        int [] a = new int [n];
        int [] b = new int [n];
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i]=a[i]+container[i][j];
                b[j]=b[j]+container[i][j];
            }
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(i=0;i<n;i++)
            if(a[i]!=b[i])
                return "Impossible";
        
        return "Possible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] container = new int[n][n];
            for(int container_i = 0; container_i < n; container_i++){
                for(int container_j = 0; container_j < n; container_j++){
                    container[container_i][container_j] = in.nextInt();
                }
            }
            String result = organizingContainers(container,n);
            System.out.println(result);
        }
        in.close();
    }
}
