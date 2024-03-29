//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long[] arr, long n) {
    long[] l = new long[(int)n];
    long[] r = new long[(int)n];
    Stack<Integer> st = new Stack<>();

    for(int i = 0; i < (int)n; i++) {
        while(!st.empty() && arr[st.peek()] >= arr[i]) st.pop();
        l[i] = st.empty() ? -1 : st.peek();
        st.push(i);
    }

    st.clear();

    for(int i =(int) n - 1; i >= 0; i--) {
        while(!st.empty() && arr[st.peek()] >= arr[i]) st.pop();
        r[i] = st.empty() ? n : st.peek();
        st.push(i);
    }

    long res = 0;

    for(int i = 0; i <(int) n; i++) {
        res = Math.max(res, arr[i] * (r[i] - l[i] - 1));
    }

    return res;
}

        
}



