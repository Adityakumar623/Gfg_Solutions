//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class DriverClass
{
	public static void main(String args[]) 
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   int range[];
	   while(t-- >0)
	   {
	     int n = sc.nextInt();
	     int k = sc.nextInt();
	     int arr[][] = new int[k][n];
	       for(int i = 0; i < k; i++)
	       {
	        for(int j = 0; j < n; j++)
	               arr[i][j] = sc.nextInt();
	       }
	       range = new Solution().findSmallestRange(arr, n, k);
	       System.out.println(range[0] + " " + range[1]);
	   }
	}
}

// } Driver Code Ends


class Solution
{
	static int[] findSmallestRange(int[][] arr,int n,int k)
	{
	    int[] ans = new int[2];
	    int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
	    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
	    for(int i = 0;i<k;i++){
	        pq.offer(new int[]{arr[i][0],i,0});
	        max = Math.max(max,arr[i][0]);
	        min = Math.min(min,arr[i][0]);
	    }
	    ans[0] = min;
	    ans[1] = max;
	    while(!pq.isEmpty()){
	        int[] tmp = pq.poll();
	        if((ans[1]-ans[0])>(max-tmp[0])){
	            ans[1] = max;
	            ans[0] = tmp[0];
	        }
	        tmp[2]++;
	        if(tmp[2]==n) break;
	        int newVal = arr[tmp[1]][tmp[2]];
	        max = Math.max(max,newVal);
	        pq.offer(new int[]{newVal,tmp[1],tmp[2]});    
	        
	    }
	    return ans;
	}
}