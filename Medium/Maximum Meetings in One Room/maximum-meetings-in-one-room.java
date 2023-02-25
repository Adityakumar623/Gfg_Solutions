//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
      ArrayList<Integer> al=new ArrayList<>();
      int[][] a=new int[N][3];
      
      for(int i=0;i<N;i++){
          a[i][0]=i+1;
          a[i][1]=S[i];
          a[i][2]=F[i];
      }
      
      Arrays.sort(a,Comparator.comparingInt(o->o[2]));
      int r=a[0][2];
      al.add(a[0][0]);
      
      for(int i=1;i<a.length;i++){
          if(a[i][1]>r){
              al.add(a[i][0]);
              r=a[i][2];
          }
      }
      
      Collections.sort(al);
      return al;
}
}
        
