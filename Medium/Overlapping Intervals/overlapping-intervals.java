//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        List<int[]> ans = new ArrayList<>();
        if(Intervals.length == 0)
            return ans.toArray(new int[0][]);
            
        Arrays.sort(Intervals, (a, b) -> {
           return a[0] - b[0]; 
        });
        int srange = Intervals[0][0], erange = Intervals[0][1];
        
        for(int[] Interval : Intervals) {
            if(erange >= Interval[0])
                erange = Math.max(erange, Interval[1]);
            else {
                ans.add(new int[] {srange, erange});
                srange = Interval[0];
                erange = Interval[1];
            }
        }
        
        ans.add(new int[] {srange, erange});
        return ans.toArray(new int[0][]);
    }
}