//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
    
            String S[] = read.readLine().split(" ");
            
            Stack<Integer> st = new Stack<Integer>();
            ArrayList<Integer> copy = new ArrayList<>();
            
            for(int i=0; i<N; i++)
            {
                st.push(Integer.parseInt(S[i]));
                copy.add(Integer.parseInt(S[i]));
            }
            
            Collections.reverse(copy);
            
            Stack<Integer> cloned = new Stack<Integer>();
            
            Solution ob = new Solution();
            
            ob.clonestack(st,cloned);
            
            ArrayList<Integer> check = new ArrayList<>();
            while(cloned.size() != 0)
                check.add(cloned.pop());
            
            int flag = 0;
            
            if(copy.equals(check))
                flag = 0;
            else
                flag = 1;
            
            System.out.println(1-flag);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
       // code here
       int n = st.size();
       int k = st.size();
       int temp;
       for (int i = 0; i < n; i++) {
           while(!st.isEmpty()){
               cloned.push(st.pop());
           }
           temp = cloned.pop();
           k--;
           for (int j = 0; j < k; j++) {
               st.push(cloned.pop());
           }
           cloned.push(temp);

       }
   }
}