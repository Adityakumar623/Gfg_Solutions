//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][], int n) 
    { 
        // code here
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        
        int low=0;int high=n-1;
        while(low<high){
            for(int i=0;i<n;i++){
                int temp=mat[low][i];
                mat[low][i]=mat[high][i];
                mat[high][i]=temp;
            }
            low++;high--;
        }
        
        
    }
}