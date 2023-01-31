class Node {
    int key;
    Node left;
    Node right;
 
    public Node(int k)
    {
        key = k;
        left =null;
        right = null;
    }
}
 
public class Main {
    // Root of Binary Tree
    Node root;
 
    Main() { root = null; }
 
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node != null)
        {
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.key + " ");
 
        /* now recur on right child */
        printInorder(node.right);
        }
    }
 
    
    
    void printInorder() {
        printInorder(root); 
        
    }
 
   
    public static void main(String[] args)
    {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        tree.printInorder();
    }
}
