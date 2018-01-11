/*
As 1942 dawned, World War II was not going well for America and her Allies. Japanese carrier-borne bombers and fighters had crippled the U.S. Navy's proud Pacific Fleet at Pearl Harbor on December 7, 1941; attacked American bases in the Philippines and on Guam; and were intent on seizing other island bases in the south and central Pacific. In Europe, France had fallen to Germany's blitzkrieg, and stalwart Britain was still staggering from the Nazis relentless nighttime bombing during the previous year. 


For the U.S. Armed Forces, communications, which had always been a complex issue, had now become a bewildering problem. Japanese cryptographers were proving themselves amazingly adept at breaking top secret military codes almost as rapidly as newer, more complicated procedures could be devised. Many of the Japanese code breakers had been educated in the United States where they had learned to speak English and had become familiar with American colloquialisms, including slang terms and profanity. As a result, American battle plans became known to the enemy almost immediately, often before they had become operational, and there appeared to be no immediate workable solution. The result was an appalling loss of American lives. 


Mark Johnston, a middle-aged civil engineer who lived in California, read a newspaper article on military security. During World War I, he had served with U.S. forces in France, and although too old to fight in World War II, Johnston wanted to aid the current war effort in some way. As he read, the concept of a secret military code based on the Navajo language flashed across his mind. In February 1942, after formulating his idea, Johnston traveled south to Camp Elliott near San Diego, where he tried to convince Lieutenant Colonel Nicholas Petras, the Marines Signal Corps Communications Officer, that a code based on the Navajo language could not be broken by the enemy. 

Johnston explained his idea as mentioned below

1. Encoding will start from left side i.e. first position of the string will be encoded to corresponding integer value in the base code table.
2. Longest substring will be identified from the string starting from the first position and matched with a alphabet/string in the code table.
3. Identified substring will be encoded to corresponding integer value in the current code table.
4. Now add next alphabet to the substring encoded above and put it in the code table with a succeeding integer value (If not already present in the code table).
5. Every encoded substring in the encoded message will be followed by 0.
6. Continuing with the next position in the string, identify the next longest substring and repeat steps 3 to 5 for the identified substring until complete string is encoded.


You are given the following base code table T which converts each English alphabet to an integer value:

1	a
2	b
3	c
.
.
.
.

26	z

Note: You are given a string which contains only the alphabets shown in the table.

 The encoded messages are received at the army base station where they need to be decoded and passed to the senior officers. As a programmer, you are asked to write a message decoding program which can decode an encoded message. 

Example:
Consider the following string:

aaababccabcaa

You start from left side i.e. 1 st position to convert it into a sequence of integers. You see that the longest substring starting from 1 st position which is in table T is 'a', so you convert this substring to an integer from the table T (here 1) and then add 0 to this sequence i.e. sequence becomes '10'. Now you add next alphabet to the substring 'a' and put it in the table with 27 as its value i.e. 'aa' is added to T with value 27. Now move to 2 nd position. Again see the longest substring starting from 2 nd position which is in T.

Here it is 'aa' with value 27 so 27 is added to the sequence and then 0 is added thus sequence becomes '10270'. Now add next alphabet to the substring 'aa' and put it in the table with 28 as its value i.e. 'aab' is added to T with value 28. Now you have considered 'aa' so move to fourth position and repeat the same process again. Notice that at each position the key idea is that you have to find the longest substring starting from there which is in the table T and convert this substring to a value by seeing the table and add that value to the sequence formed yet and then add a zero. Adding zero will help when you will be recovering the string from the sequence formed (Think how?). 

You can see the above string will be converted to sequence '10270201020303030033010' and the final table becomes:




You will be given this encoded sequence and original table T. You will have to find the original string using this sequence and original table T (Scratch your mind and notice that the similar idea will help in recovering the string).
Sample Problem with Solutions



*/

public static String decodeMessage(String s)
    {
        int i=0,j=27,var=0;
        String s1="",ans="",prev="",curr="",z="";
        char ch;
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        
	    while(i<s.length())
	    {
	        s1="";
	        while(true)
	        {
	            if(i==s.length()-1)
	                break;
	                
	            if(s.charAt(i)=='0' && s.charAt(i+1)!='0')
	                break;
	            
	            s1 = s1 + s.charAt(i);
	            i++;
	        }
	        
	        int x = Integer.parseInt(s1);
	        
	        //System.out.println(x);
	        
	        if(x>=1 && x<=26)
	        {
	            ans = ans + (char)(x+96);
	            ch = (char)(x+96);
	            curr = Character.toString(ch);
	            //if(prev=="")
	                //prev = curr;
	            if(prev!="")
	            {
	            if(!m.containsKey(prev+curr))
	            {
	                m.put(prev+curr,j);
	                //System.out.println("map "+ j + " " + prev+curr);
	                j++;
	            }
	            }
	            
	            prev = curr;
	        }
	        
	        else
	        {
	            var = 0;
	            z="";
	            for(String str1 : m.keySet())
	                if(m.get(str1)==x)
	                {
	                    if(str1.length()>z.length())
	                	    z = str1;
	                }
	            
	                
	            if(z=="" && j==x)
	            {
	                String dip = Character.toString(prev.charAt(0));
	                //if(prev.length()>1)
	                //    dip = prev.substring(0,prev.length()-1);
	                z = dip+prev;
	                if(!m.containsKey(z))
	                {
	                    m.put(z,j);
	                    //System.out.println("map z"+ j + " " + z);
	                    j++;
	                }
	                //System.out.println("z "+z);
	                //ans = ans + z;
	                var = 1;
	            }
	            
	            if(z=="" && j!=x)
	                return "invalid";
	            
				ans = ans + z;
				
				if(var==0)
				{
	            prev = curr;
	            ch = z.charAt(0);
	            //System.out.println("ch "+ch);
	            curr = Character.toString(ch);
	            if(!m.containsKey(prev+curr) && prev!="")
	            {
	                m.put(prev+curr,j);
	                //System.out.println("map "+ j + " " + prev);
	                //System.out.println("map "+ j + " " + curr);
	                j++;
	            }
				}
				
	            curr = z;
	            prev = curr;
	            //System.out.println("curr "+curr);
	        }
	        //System.out.println(ans);
	        i++;
	    }
	    return ans;
    }