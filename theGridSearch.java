// https://www.hackerrank.com/challenges/the-grid-search/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gridSearch(String[] g, String[] p, int C, int c) {
        
        int i,j,k,ans=1;
        
        for(i=0;i<=g.length-p.length;i++)
        {
            for(j=0;j<=C-c;j++)
            {
                ans=1;
                for(k=0;k<p.length;k++)
                {
                    System.out.println(g[i+k].substring(j,j+c)+" "+p[k]);
                    System.out.println(g[i+k].substring(j,j+c)==p[k]);
                    if(g[i+k].substring(j,j+c)!=p[k])
                    {
                        System.out.println(g[i+k].substring(j,j+c)+" "+p[k]);
                        ans=0;
                        break;
                    }
                }
                if(ans==1)
                    return "YES";
                System.out.println();
            }
        }
        
        return "NO";   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i = 0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i = 0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            String result = gridSearch(G, P, C, c);
            System.out.println(result);
        }
        in.close();
    }
}
