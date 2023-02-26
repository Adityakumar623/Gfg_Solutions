//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        
        if(M>N) return -1;
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            min=Math.min(min,A[i]);
        }
        
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        int res=-1;
        int low=min; int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(isAllocate(A,mid,M)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return res;
        
        
    }
    
    static boolean isAllocate(int[] a,int barrier,int x){
        int pages=0;int student=1;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>barrier){
                return false;
            }
            
            if(pages+a[i]>barrier){
                student+=1;
                pages=a[i];
                
                
            }
            else{
                pages+=a[i];
            }
        }
        
        if(student>x){
            return false;
        }
        
        return true;
    }
};