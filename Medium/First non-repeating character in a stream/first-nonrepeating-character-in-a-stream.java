//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int[] a = new int[26];
        int n=A.length();
        String str = "";
        Queue<Character> que = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            char ch = A.charAt(i);
            int val = ch - 'a';
            a[val]++;
    
            if(a[val] <= 1)
                que.add(ch);
            else
                que.remove(ch);
                
            if(que.isEmpty())
                str += '#';
            else    
                str += que.peek();
        }
        return str;
    }
}