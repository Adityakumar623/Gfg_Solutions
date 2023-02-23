//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n,q));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        
        // int x=(int)n;
        // int y=(int)q;
        
        // int [][] mat=new int[x][x];
        // int count=0;
        
        // for(int i=0;i<x;i++){
        //     for(int j=0;j<x;j++){
        //         mat[i][j]=i+j+2;
                
        //         if(mat[i][j]==y){
        //             count++;
        //         }
        //     }
        // }
        
        // return (long)count;
        
          long ans=0;
       if( n >= q){
              ans =(q-1);
       }
       else{
              ans = (n*2)-(q-1);
           }
           if(ans<0)ans =0;
          return ans;
        
        
    }
};