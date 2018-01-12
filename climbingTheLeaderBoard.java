/* Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking as she beats each level? 
The game uses Dense Ranking, so its leaderboard works like this:

The player with the highest score is ranked number 1 on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

When Alice starts playing, there are already n people on the leaderboard. The score of each player i is denoted by si. 
Alice plays for m levels, and we denote her total score after passing each level j as alicej. After completing each level, Alice wants to know her current rank.

You are given an array, scores, of monotonically decreasing leaderboard scores, and another array, alice, of Alice's cumulative scores for each level of the game. 
You must print m integers. The jth integer should indicate the current rank of alice after passing the jth level. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void climbingLeaderboard(int[] scores, int[] alice) {
        int i,j,rank,prev=scores[0],count=1,index,temp=scores.length-1;
        
        for(i=1;i<scores.length;i++)
        {
            if(scores[i]!=prev)
                count++;
            prev = scores[i];
        }
      
        rank = count;
        prev = scores[scores.length-1];
        
        for(j=0;j<alice.length;j++)
        {
            index=temp;
            if(alice[j]<scores[scores.length-1])
            {
                System.out.println(count+1);
                continue;
            }
            
            for(i=index;i>=0;i--)
            {
                if(alice[j]>=scores[i] && scores[i]!=prev)
                    rank--;
                if(alice[j]<scores[i])
                    break;
                prev = scores[i];
                temp=i;
            }
            System.out.println(rank);    
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int i = 0; i < m; i++){
            alice[i] = in.nextInt();
        }
        climbingLeaderboard(scores, alice);
        in.close();
    }
}
