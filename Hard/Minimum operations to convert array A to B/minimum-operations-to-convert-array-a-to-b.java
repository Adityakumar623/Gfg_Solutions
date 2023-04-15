//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            
            int[] A = new int[N];
            int[] B = new int[M];
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);
                
            for(int i=0; i<M; i++)
                B[i] = Integer.parseInt(S2[i]);

            Solution ob = new Solution();
            System.out.println(ob.minInsAndDel(A,B,N,M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   static int minInsAndDel(int[] A, int[] B, int N, int M) {
       // code here
       List<Integer> a = new ArrayList<>();
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<M;i++)
       {
           set.add(B[i]);
       }
       for(int i=0;i<N;i++){
           if(set.contains(A[i]) ){
               a.add(A[i]);
           }
       }
       int l = LIS(a.stream().mapToInt(Integer::intValue).toArray());
       return N-l+M-l;
   }
     static int LIS(int arr[]) {
       if (arr.length == 0) {
           return 0;
           
       }
       int[] tail = new int[arr.length];
       int len = 1;
       tail[0] = arr[0];
       
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > tail[len - 1]) {
               tail[len++] = arr[i];
           } else {
               int id = Arrays.binarySearch(tail, 0, len-1, arr[i]);
               if (id < 0) {
                   id = -1*id - 1;
               }
               tail[id] = arr[i];
           }
       }
       return len;
   }
};