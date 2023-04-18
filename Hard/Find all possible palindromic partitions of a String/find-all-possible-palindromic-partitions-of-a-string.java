//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
       // code here
       ArrayList<ArrayList<String>> res=new ArrayList<>();
       ArrayList<String> list=new ArrayList<>();
       
       helper(0 ,S , res ,list);
       
       return res;
   }
   
   static void helper( int index ,String s , ArrayList<ArrayList<String>> res , ArrayList<String> list)
   {
       if(index==s.length())
       {
           res.add(new ArrayList<>(list));
           return ;
       }
       
       for(int i=index;i<s.length();i++)
       {
           if(isPal(s , index , i))
           {
               list.add(s.substring(index , i+1));
               helper(i+1 , s , res , list);
               list.remove(list.size()-1);
           }
       }
   }
   
   static boolean isPal(String s , int start , int end)
   {
       while(start<=end)
       {
           if(s.charAt(start) != s.charAt(end))
           {
               return false;
           }
           start++;
           end--;
       }
       return true;
   }
}