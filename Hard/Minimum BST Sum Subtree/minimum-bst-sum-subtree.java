//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int target;
            target = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.minSubtreeSumBST(target, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int res = (int) 1e9;
    
    public static int minSubtreeSumBST(int t, Node root) {
        res = (int) 1e9;
        solve(t, root);
        return res == (int) 1e9 ? -1 : res;
    }
    
    public static int solve(int t, Node root) {
        if (root == null) return 0;
        
        int left = solve(t, root.left);
        int right = solve(t, root.right);
        int currSize = 0;
        
        if (left == t) {
            currSize = size(root.left);
            if (currSize < res && isBST(root.left)) {
                res = currSize;
            }
        }
        
        if (right == t) {
            currSize = size(root.right);
            if (currSize < res && isBST(root.right)) {
                res = currSize;
            }
        }
        
        if (left + right + root.data == t) {
            currSize = size(root);
            if (currSize < res && isBST(root)) {
                res = currSize;
            }
        }
        
        return left + right + root.data;
    }
    
    static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    
    static boolean isBST(Node root) {
        if (root == null) return true;
        
        boolean left = isBST(root.left);
        boolean right = isBST(root.right);
        
        if (findMax(root.left) < root.data && root.data < findMin(root.right)) {
            return left && right;
        }
        
        return false;
    }
    
    static int findMin(Node root) {
        if (root == null) return (int) 1e9;
        
        int left = findMin(root.left);
        int right = findMin(root.right);
        
        return Math.min(root.data, Math.min(left, right));
    }
    
    static int findMax(Node root) {
        if (root == null) return -(int) 1e9;
        
        int left = findMax(root.left);
        int right = findMax(root.right);
        
        return Math.max(root.data, Math.max(left, right));
    }
}
