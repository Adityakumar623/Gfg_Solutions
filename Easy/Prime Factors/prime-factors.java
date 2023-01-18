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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
      
        
        for(int i=2;i*i<=N;i++){
            int flag=1; 
                while(N%i==0){
                   
                   if(flag==1){
                    al.add(i);
                       flag=0;
                   }
                    N=N/i;
                }
           
        } 
         if(N>1){
                    al.add(N);;
                }
                
        int[] arr=new int[al.size()];
        
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        
        // for()
        return arr;
        
    }
}