//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
      //  it will made using Binary search or it is very similar to finding peak element
      
      int low=0; int high=n-1;
      
      while(low<=high){
          int mid=low+(high-low)/2;
          
          if(mid>0 && mid<n-1){
              if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                  return arr[mid];
              }
              
              else if(arr[mid]<arr[mid-1]){
                  high=mid-1;
              }
              
              else if(arr[mid]<arr[mid+1]){
                  low=mid+1;
              }
          }
          
          else if(mid==0){
              if(arr[mid]>arr[mid+1]){
                  return arr[mid];
              }
              else{
                  return arr[1];
              }
          }
          
          else if(mid==n-1){
              if(arr[mid]>arr[mid-1]){
                  return arr[mid];
              }
              
              else{
                  return arr[n-2];
              }
          }
      }
      
      return -1;
    }
}