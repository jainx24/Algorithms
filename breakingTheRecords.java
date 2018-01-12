/* Maria plays n games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game 
sequentially in an array defined as score=[s0,s1,s2...].
After each game i, she checks to see if score si breaks her record for most or least points scored so far during that season.

Given Maria's array of scores for a season of n games, find and print the number of times she breaks her record for 
most and least points scored during the season. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void breakingRecords(int[] score) {
        int max=score[0],min=score[0],hs=0,ls=0,i;
        
        for(i=1;i<score.length;i++)
        {
            if(score[i]>max)
            {
                max=score[i];
                hs++;
            }
            
            if(score[i]<min)
            {
                min = score[i];
                ls++;
            }              
        }
        System.out.println(hs+" "+ls);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        breakingRecords(score);
        in.close();
    }
}
