//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
       long res=0;
       
       int lmax[]=new int[n];
       int rmax[]=new int[n];
       
       lmax[0]=arr[0];
       for(int i=1;i<n;i++){
           lmax[i]=Math.max(arr[i],lmax[i-1]);
       }
       
       rmax[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--){
           rmax[i]=Math.max(arr[i],rmax[i+1]);
       }
       
       for(int i=0;i<n;i++){
           res+=Math.min(lmax[i],rmax[i])-arr[i];
       }
       
       return res;
    }  
}


