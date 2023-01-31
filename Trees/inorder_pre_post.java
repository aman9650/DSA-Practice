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
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    
    static void preorder(Node root){
        if(root!=null){
            
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
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
        
      
        System.out.print("Inorder : ");
        inorder(tree.root);
        System.out.println();
        System.out.print("Preorder : ");
        preorder(tree.root);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(tree.root);
        System.out.println();
        

        
        
        
    }
}
