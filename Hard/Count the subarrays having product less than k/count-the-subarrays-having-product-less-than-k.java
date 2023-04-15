//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
  public int countSubArrayProductLessThanK(long arr[], long n, long k)
    {
      
    long prod = 1;
    int i = 0, j = 0, ans = 0;
    while (i < n && j < n) {
        prod *= arr[j];
        while (prod >= k && i < j) {
            prod /= arr[i++];
        }
        if (prod < k) {
            ans += (j - i + 1);
        }
        j++;
    }
    return ans;


    }
}