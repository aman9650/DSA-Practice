import java.lang.Math.*;
class Node{
    int data;
    Node left=null;
    Node right =null;
    
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class Main{
    Node root;
    Main(){
        root=null;
        
    }
    
    // In order traersal
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    
    //Pre order traversal
    static void preorder(Node root){
        if(root!=null){
            
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    
    // Post Order Traversal
    static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    // Height of tree
    static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
    
    // Print Node of K distance
    static void printkdist(Node root,int k){
        if(root ==null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
        }
        else{
            printkdist(root.left,k-1);
            printkdist(root.right,k-1);
        }
    }
    
    public static void main(String[] args){
        Main tree=new Main();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        tree.root.right.right.right=new Node(8);
        
      
        System.out.print("Inorder : ");
        inorder(tree.root);
        System.out.println();
        System.out.print("Preorder : ");
        preorder(tree.root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(tree.root);
        System.out.println();
        System.out.println("Height of Tree is : "+height(tree.root));
        
        printkdist(tree.root,2);

        
        
        
    }
}
