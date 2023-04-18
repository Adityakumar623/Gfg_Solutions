//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            char ch=p.charAt(i);
            if(map.containsKey(ch))
            {
                int of=map.get(ch);
                map.put(ch,of+1);
            }
            else    map.put(ch,1);
        }
        
        
        int len=(int)1e9;
        int start=0;
        int count=map.size();
        int i=0,j=0;
        while(j<s.length())
        {
            char ch=s.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    count--;
            }
            if(count==0)
            {
                while(count==0)
                {
                    if(j-i+1<len)
                    {
                        len=Math.min(j-i+1,len);
                        start=i;
                    }
                    char now=s.charAt(i);
                    if(map.containsKey(now))
                    {
                        map.put(now,map.get(now)+1);
                        if(map.get(now)>0)
                            count++;
                    }
                    i++;
                }
            }
            j++;
        }
        if(len==(int)1e9)
            return "-1";
        return s.substring(start,start+len);
    }
}