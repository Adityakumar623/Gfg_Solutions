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
			int n = Integer.parseInt(read.readLine());
			String S[] = read.readLine().split(" ");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(S[i]);
			int k = Integer.parseInt(read.readLine());

			Solution ob = new Solution();
			System.out.println(ob.countPairs(n, arr, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
	//	Arrays.sort(arr);
// 		long count=0;
		
// 		for(int i=0;i<n-1;i++){
// 		    for(int j=i+1;j<n;j++){
// 		        int dif=Math.abs(arr[j]-arr[i]+k);
// 		        if(dif%k==0){
// 		            count++;
// 		        }
// 		    }
// 		}
// 		return count;

 HashMap<Integer,Integer> map = new HashMap<>();

 long count =0;

 for(int i = 0; i<n; i++){

     arr[i]= arr[i]%k;

     count+= map.getOrDefault(arr[i],0);

     map.put(arr[i],map.getOrDefault(arr[i],0)+1);

 }

 return count;
	}
}