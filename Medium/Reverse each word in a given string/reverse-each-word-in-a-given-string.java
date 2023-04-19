//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   String reverseWords(String S)
   {
       String[] arr=S.split("\\.",S.length());
       StringBuilder sb;
       for(int i=0;i<arr.length;i++){
           sb=new StringBuilder(arr[i]);
           sb.reverse();
           arr[i]=String.valueOf(sb);
       }
       sb=new StringBuilder(arr[0]);
       for(int i=1;i<arr.length;i++){
           sb.append(".");
           sb.append(arr[i]);
       }
       return String.valueOf(sb);
   }
}