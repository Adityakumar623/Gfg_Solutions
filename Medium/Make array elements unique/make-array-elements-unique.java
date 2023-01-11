//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            
            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());
        
            int arr[] = new int[(int)(N)];
            
            String inputLine2[] = br.readLine().trim().split(" ");
            for ( i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine2[i]);
            }
        
            Solution ob = new Solution();
            System.out.println(ob.minIncrements(arr,N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long minIncrements(int[] arr, int N) {
    //     // Code here
    //   HashMap<Integer,Integer> mp=new HashMap<>();
    //   int count=0;
      
    //   for(int i=0;i<N;i++){
    //       if(mp.containsKey(arr[i])){
    //           mp.put(arr[i],mp.get(arr[i])+1);
    //       }
    //       else{
    //           mp.put(arr[i],1);
    //       }
    //   }
      
    //   for(int i=0;i<N;i++){
    //       if(mp.get(arr[i])>1){
    //           count+=mp.get(arr[i])-1;
    //       }
    //   }
      
      
      
    //     return count;
    
    
    
    Arrays.sort(arr);
    int count=0;
    
    for(int i=1;i<N;i++){
        // if(arr[i]==arr[i-1]){
        //     arr[i]++;
        //     count++;
        // }
         if(arr[i]<=arr[i-1]){
            count+=(arr[i-1]-arr[i])+1;
            arr[i]=arr[i-1]+1;
        }
    }
    
    return count;
    
        
    }
}