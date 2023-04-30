//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine().trim());
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                a[i][0]=Integer.parseInt(s[0]);
                a[i][1]=Integer.parseInt(s[1]);
            }
            int k=Integer.parseInt(in.readLine().trim());
            Solution ob=new Solution();
            out.println(ob.powerfullInteger(n,a,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
// class Solution{
//     public static int powerfullInteger(int n,int interval[][],int k)
//     {
        
//         HashMap<Integer,Integer> hm=new HashMap<>();
        
//         for(int i=0;i<interval.length;i++){
//              for(int x=interval[i][0];x<=interval[i][1];x++){
//                   if(!hm.containsKey(x)){
//                   hm.put(x,1);
//               }
//               else{
//                   hm.put(x,hm.get(x)+1);
//               }
                 
//              }
            
//         }
        
        
//         ArrayList<Integer> al=new ArrayList<>();
        
//         for(Map.Entry<Integer,Integer> e:hm.entrySet()){
//             if(e.getValue()>=k){
//                 al.add(e.getKey());
//             }
//         }
        
//         if(al.size()==0){
//             return -1;
//         }
        
//         Collections.sort(al);
        
//         return al.get(al.size()-1);
        
//     }
// }


//             mp[x[0]]++;
//             mp[x[1]+1]--;
//         }
        
//         for(auto x:mp)
//         {
//             if(mp[range]>=k)
//             {
//                 ans=max(ans,x.first-1);
//             }
//             mp[x.first]=x.second+prev;
//             prev=mp[x.first];
            
//             range=x.first;

//             if(mp[x.first]>=k)
//                 ans=x.first;
//         }
        
//         if(mp[range]>=k)
//         {
//             ans=max(ans,range-1);
//         }
        
//         return ans;
//     }
// };
 



class Solution{
    public static int powerfullInteger(int n,int interval[][],int k)
    {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<n;i++){
            tm.put(interval[i][0],tm.getOrDefault(interval[i][0],0)+1);
            tm.put(interval[i][1]+1,tm.getOrDefault(interval[i][1]+1,0)-1);
        }
        int temp=0;
        int ans=0;
        for(Map.Entry<Integer,Integer> e:tm.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value>=0){
                temp+=value;
                if(temp>=k){
                    ans=key;
                }
            }else if(value<0){
                if(temp>=k){
                    ans=key-1;
                }
                temp+=value;
            }
        }
        return (ans==0?-1:ans);
    }
}

