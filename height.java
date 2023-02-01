import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int k){
        this.data=k;
        this.left=null;
        this.right=null;
    }
}
public class Main{
    Node root;
    Main(){
        root=null;
    }

    
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    static void preorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    // HEIGHT OF TREE
    static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
        
    }
    


	public static void main(String[] args) {
		 Main tree=new Main();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        inorder(tree.root);
        System.out.println();
        System.out.println(height(tree.root));
	}
 }

