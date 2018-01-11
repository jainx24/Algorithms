/*
Sachin's sister loves chocolates a lot. So he decided to gift her N boxes of delicious chocolates. Every box has the capacity of 1000 chocolates. 
Filling more than 1000 chocolates in a box will break it and all the chocolates in it will fall down and will become uneatable. 
Sachin is also concerned about her health, so he advised her to eat as minimum as possible chocolates. 
So she decided that every day she will pick a box containing the minimum amount of chocolates and will eat half 
of its chocolates and will put remaining chocolates in the box having next minimum amount of chocolates. 
If there is no next box remaining then she will eat all of the chocolates from the current box. She will throw away all the empty and broken boxes every day. 
This will continue until all the boxes are gone. Being concerned about her health Sachin asked her to tell him the number of chocolates she eats every day. 
But she forgets the number every day. So help her to find out how many chocolates she eats every day. Basically, you have to output the total sum of chocolates she eats.

Input Format
Your function contains one argument- A One dimensional Integer array of Size N in which ith element denotes the number of chocolates in ith box.
First line of input contains an Integer N denoting the size of Array. (1<=N<=10^5) 
Next N lines of input contain a single integer from 1 to 1000.

Constraints
1<=N<=10^5

Output Format
You must return a integer 

Sample TestCase 1
Input
3
1
2
3
Output
6
*/

public static int totalchocolates(int[] a)
	{
	    int len=a.length;
	    int sum=0,sum1=0,i,temp;
	    
	    for(i=0;i<len;i++)
	    {
	        if(a[i]>1000)
	        {
	            a[i]=0;
	            sum1++;
	        }
	    }
	    
	    if(sum1==len)
	        return 0;
	  
	    Arrays.sort(a);
	    
	    for(i=sum1;i<len-1;i++)
	    {
	        
	       int j = i;
	       
	       while(j<len-1 && a[j]>a[j+1])
	       {
	           temp = a[j];
	           a[j] = a[j+1];
	           a[j+1] = temp;
	           j++;
	       }
	            
	        if(a[i]==0)
	            continue;
	            
	        else
	        {
	            if(a[i]%2==0)
	            {
	                sum = sum + a[i]/2;
	                a[i+1] = a[i+1] + (a[i]/2);
	                a[i]=0;
	            }
	            else
	            {
	                sum = sum + (a[i]/2);
	                a[i+1] = a[i+1] + (a[i]/2) + 1;
	                a[i]=0;
	            }
	            
	            if(a[i+1]>1000)
	                a[i+1]=0;
	        }
	    }
	    
	    if(a[len-1]<=1000)
	        sum = sum + a[len-1];
	    
	    return sum;
    }