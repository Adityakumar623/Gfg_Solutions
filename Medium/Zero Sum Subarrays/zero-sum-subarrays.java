//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here  public static long findSubarray(long[] arr ,int n) 
   
      // make hashmap of  sum vs frequneccy
 HashMap<Long,Integer> map = new HashMap<>();
       long count=0;
                                                  // initially index is -1 and sum is 0
       int i = -1;
       long sum = 0;
                                                                     // initailly freq of sum is 1 
       map.put((long)0,1);

       while(i<arr.length-1){
           i++;
          sum=sum+arr[i];
          if(map.containsKey(sum)){
                                                                                       //    then add freq of sum
            count+= map.get(sum);
                                                                //   and inc freq
           map.put(sum,map.get(sum) +1);
          }else{
              map.put(sum,1);
          }
       }
       return count;
   }


    
}