//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int test = Integer.parseInt(in.readLine().trim());
        while(test-- > 0){
            int n = Integer.parseInt(in.readLine().trim());
            int m = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int [] seats = new int[m];
            for(int i = 0; i < m; i++){
                seats[i] = Integer.parseInt(s[i]);
            }
            Solution obj = new Solution();
            boolean res = obj.is_possible_to_get_seats(n, m, seats);
            
            String _result_val = (res) ? "Yes" : "No";
            out.println(_result_val);
        }
        out.close();
    }
}

// } Driver Code Ends



class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        int maxSeats = (m+1)/2;
        if(n > maxSeats){
            return false;
        }
        int index = 0;
        while(index < m && n > 0){
            if(seats[index] == 0 && 
            (index == 0 || seats[index-1] != 1) 
            && (index == m-1 || seats[index+1] != 1)){
                seats[index] = 1;
                n--;
                index += 2;
            } 
            else{
                index++;
            }
        }
        return n == 0;
    }
}
        
