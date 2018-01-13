/* Bob has a strange counter. At the first second, t=0, it displays the number 3. At each subsequent second, 
the number displayed by the counter decrements by 1. The counter counts down in cycles. In the second after 
the counter counts down to 1, the number becomes 2x the initial number for that countdown cycle and then continues 
counting down from the new initial number in a new cycle. The diagram below shows the counter values for each time t in the first three cycles:

time value	time value	time value
1	3	4	6	10	12
2	2	5	5	11	11
3	1	6	4	12	10
		7	3	13	9
		8	2	14	8
		9	1	15	7
				16	6		
				17	5
				18	4
				19	3
				20	2
				21	1 
Given a time, t, find and print the value displayed by the counter at time t.

Input Format
A single integer denoting the value of t.

Output Format
Print the value displayed by the strange counter at the given time t. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long strangeCode(long t) {
        
        long i,j,prev=3,next=6,count=0;
        
        while(t>count)
        {
            count = count + prev;
            prev = next;
            next = next*2;
        }
                 
        return 1+count-t;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long result = strangeCode(t);
        System.out.println(result);
        in.close();
    }
}
