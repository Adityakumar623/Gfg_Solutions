//{ Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
         int count=0;
        int maxCount=Integer.MIN_VALUE;
         
         for(int i=0;i<n;i++){
             count+=arr[i];
             
             if(count>maxCount){
               maxCount=count;  
             
             }
             
              if(count<0){
                 count=0;
             }
         }
         
    //   Arrays.sort(arr);
    //     int maxCount1=arr[n-1];
        
        // Your code here
        return (maxCount);
        
        // Your code here
        
    }
    
}

