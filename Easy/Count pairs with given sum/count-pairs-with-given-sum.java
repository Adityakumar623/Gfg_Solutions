//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
    //   Arrays.sort(arr);
    //   int i=0;
    //   int j=n-1;
    //   int count=0;
      
    //   while(i<j){
          
    //       int sum=arr[i]+arr[j];
          
    //       if(sum==k){
    //           count++;
    //       }
          
    //       else if(sum<k){
    //           i++;
    //       }
          
    //       else{
    //           j--;
    //       }
          
          
    //   }
    
    
    
    
      Map<Integer,Integer> map=new HashMap<>();
       int count =0;
       for (int i=0;i<n;i++){
           if (map.containsKey(k-arr[i])){
               count+=map.get(k-arr[i]);
           }
           map.putIfAbsent(arr[i], 0);
           map.put(arr[i],map.get(arr[i])+1);
       }
       
        
        
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==k){
        //             count++;
        //         }
        //     }
        // }
        return count;
    }
}
