//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);
            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        
        
        // Arrays.sort(arr);
        
        // for(int i=n-1;i>=0 && k>0;i-- ){                          
        //     al.add(arr[i]);
        //     k--;
        // }
        
        // return al;
        
        ArrayList<Integer> al=new ArrayList<>();
        
       PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add(arr[i]);

            if(pq.size()>k){
                pq.poll();
            }
        }
        
        while(pq.size()>0){
            al.add(pq.peek());pq.poll();
        }
        
      

		// reversing the sorted list into descending order
		Collections.reverse(al);
        
return al;
       
    }
}