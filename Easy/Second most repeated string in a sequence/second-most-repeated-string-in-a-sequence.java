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
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        
        
        int max=1,second=0;
        String output="";
        
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(int i=0;i<N;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            
            else{
                hm.put(arr[i],1);
            }
            
            if((int)hm.get(arr[i])>max){
                max=hm.get(arr[i]);
            }
        }
        
        for(Map.Entry m:hm.entrySet()){
            if((int)m.getValue()>second && (int)m.getValue()<max){
                second=(int)m.getValue();
                output=m.getKey().toString();
            }
            
        }
        return output;
        
    }
}