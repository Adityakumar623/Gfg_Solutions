//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
      
        // int res=0;
        
        // for(int i=0;i<n;i++){
        //     int curr=0;
        //     for(int j=i;j<n;j++){
        //         curr+=arr[j];
        //         if(curr==0){
        //             res=Math.max(res,j-i+1);
        //         }
        //     }        }
            
        //     return res;
        
        
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        int presum=0;int res=0;
        int sum=0;
        for(int i=0;i<n;i++){
            presum+=arr[i];
            if(presum==0) {
                res=Math.max(res,i+1);
            }
            
           
                if(m.containsKey(presum)){
                    res=Math.max(res,i-m.get(presum));
                }
                 else{
                m.put(presum,i);
            }
            
        }
        return res;
    }
}