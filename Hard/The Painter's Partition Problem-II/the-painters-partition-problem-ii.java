//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

  class Solution
 {
    
    private static boolean isPossible(int mid, int arr[], int n, int k)
    {
        int count = 1;
        int head = 0;
        for(int i=0; i<n; i++)
        {
            if(head+arr[i]<=mid)
            {
                head += arr[i];
            }
            else
            {
                
                head = arr[i];
                count++;
            }
            
        }
        
        return count<=k;
    }
     
    static long minTime(int[] arr,int n,int k)
    {
        long low = Integer.MIN_VALUE;
        long high = 0;
        
        for(int i=0; i<n; i++)
        {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        
        while(low<=high)
        {
            int mid = (int)(low+high)/2;
            
            if(isPossible(mid, arr, n, k))
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
            
        }
        
        return low;
    }
}


