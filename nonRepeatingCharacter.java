/* 
Input
The first line contains T denoting the number of testcases. Then follows description of testcases.
Each case begins with a single integer N denoting the length of string. The next line contains the string s.

Output
For each testcase, print the first non repeating character present in string.
Print -1 if there is no non repeating character. */


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);

	    int q,t;
	    t=scan.nextInt();
	    
	    for(q=0;q<t;q++)
	    {
	        int i,n;
	        n = scan.nextInt();
	        String s = scan.next();
	        char ans='1';
	        
		    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		    
		    for(i=0;i<n;i++)
		    {
		        if(map.containsKey(s.charAt(i)))
		        {
		            int count = map.get(s.charAt(i)) + 1;
		            map.put(s.charAt(i),count);
		        }
		        
		        else
		            map.put(s.charAt(i),1);
		    }
		    
		    for(i=0;i<n;i++)
		        if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1)
		        {
		            ans = s.charAt(i);
		            break;
		        }
		        
		if(ans!='1')        
		    System.out.println(ans);
		else
		    System.out.println(-1);
	    }
	}
}