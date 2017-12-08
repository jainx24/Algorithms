/*

Extra Long Factorials

*/


import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++)
            f = f.multiply(BigInteger.valueOf(i));
        System.out.println(f);
    }
}