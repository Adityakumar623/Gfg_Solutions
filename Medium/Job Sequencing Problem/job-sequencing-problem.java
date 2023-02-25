//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
       //sorting according to profit so that max profit job will do first
       Arrays.sort(arr,(a,b)->(b.profit-a.profit));
       int max=0; //finding max deadline
       for(int i=0;i<n;i++){
           max=Math.max(arr[i].deadline,max);
       }
       int res[] = new int [max+1];
       for(int i=0;i<=max;i++){
           res[i]=-1; //-1 indicates slot is free
       }
       int countJobs=0,jobProfit=0;
       for(int i=0;i<n;i++){ //arr is sorted acc to max profit
           for(int j=arr[i].deadline;j>0;j--){
               if(res[j]==-1){ //free slot is found
                   res[j]=i;
                   countJobs++;
                   jobProfit+=arr[i].profit;
                   break;
               }
           }
       }
       int ans[] = new int[2];
       ans[0]=countJobs;
       ans[1]=jobProfit;
       return ans;
        
        
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/