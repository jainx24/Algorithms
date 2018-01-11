/*
Kiran has been a given a problem by his brother Narik .The problem is related to strings.
Now he gives Kiran a long String S which consists of lowercase English Alphabets 
and wants him to tell the minimum size of substring such that all the substrings of that size in S have at least K Consonants(Non-vowels) in them.
If none of the subArray size satisfy the above condition ,return -1.

Input Format
Your function contains two arguments a String S and an Integer K.
First line of input contains a String S.
Second line of input contains an Integer K.

Constraints
1 <= |S| <= 100000
1 <= K <= 10000

Output Format
You must return an Integer denoting the answer to the problem.

Sample TestCase 1
Input
ritikisagoodboy
4
Output
9
Explanation
All substrings of length 9 have greater or equal to 4 non-vowels in them and this is the minimum size that we can have.
In substring of size 8 .. the substring ''ikisagoo'' has only 3 non-vowels therefore it violates the condition.
Sample Problem with Solution
*/

public static int Consonant (String s,int x)
{
	    
	    int i,n,j,len=0,max=-1,count=0;
	    n = s.length();
	    
	    for(i=0;i<=n-x;i++)
	    {
	        count=0;
	        j=i;
	        while(j<n && count<x)
	        {
	            if(s.charAt(j)!='a' && s.charAt(j)!='e' && s.charAt(j)!='i' && s.charAt(j)!='o' && s.charAt(j)!='u')
	                count++;
	            j++;
	        }
	        
	        len = j - i;
	        //System.out.println(i+" "+j+" "+len+" "+count);
	        if(count==x && len>max)
	            max=len;
	    }
	    
	    return max;
        
}
