//{ Driver Code Starts
import java.util.*;
import java.lang.Math;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class PalindromeLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Node head=null;
			head=insert(head,sc.nextInt());
			for(int i=1;i<n;i++)
				insert(head,sc.nextInt());
			GfG g=new GfG();
			System.out.println(g.maxPalindrome(head));
		}
	}
	public static Node insert(Node head,int val){
		if(head==null)
			return new Node(val);
		head.next=insert(head.next,val);
		return head;
	}
	/*public static void print(Node head){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}*/
}
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/
class GfG
{
        public static int maxPalindrome(Node head)
        {
          //add code here.
          Node h = head;
          ArrayList<Integer> rb = new ArrayList<Integer> ();
          int l=0;
          while(h!=null)
          {
              rb.add(h.data);
              h=h.next;
          }
          for(int i=0; i<rb.size()-1; i++)
          {
              for(int j=i+1; j<rb.size(); j++)
              {
                  if(ispalin(rb, i, j))
                  {
                      if(j-i+1>l)
                      l=j-i+1;
                  }
              }
          }
          if(l==0)
          return 1;
          
          return l;
        }
        static boolean ispalin( ArrayList<Integer> rb, int i, int j)
        {
            while(i<j)
            {
                if(rb.get(i)!=rb.get(j))
                return false;
                i++;
                j--;
            }
            return true;
        }
}