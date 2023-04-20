//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<s1.length;i++)
        {
            String s="";
            for(int j=0;j<s1[i].length();j++)
            {
                s+=s1[i].charAt(j);
                hs.add(s);
            }
        }
        for(int i=0;i<s1.length;i++)
        {
            String s="";
            for(int j=s1[i].length()-1;j>=0;j--)
            {
                s=s1[i].charAt(j)+s;
                hs.add(s);
            }
        }
        int ct=0;
        for(int i=0;i<s2.length;i++)
        {
            if(hs.contains(s2[i]))
            ct++;
        }
        return ct;
    }
}