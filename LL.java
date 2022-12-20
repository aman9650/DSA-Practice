public class Main {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head=newNode;
        
    }
    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        Node curr=head;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        
    }
    
    
    public int size(){
        Node curr=head;
        int x=1;
        while(curr.next!=null){
            x++;
            curr=curr.next;
        }
        System.out.println(x);
        return x;
    }
    
    public void InsertAtPos(int data,int key){
        Node newNode=new Node(data);
        if(key==0){
            addfirst(data);
            return;
        }
        else if(key>=size()-1){
            addLast(data);
            return;
        }
        
        else{
            Node prev=head;
            Node curr=head.next;
            
            int index=0;
            
            while(index<key){
                prev=prev.next;
                curr=curr.next;
                
                index++;
                
            }
            prev.next=newNode;
            newNode.next=curr;
            
        }
    }
    
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"=>");
            curr=curr.next;
        }
        
        System.out.println("Null");
        
    }
    
    public void delFirst(){
        if(head==null ){
            head=null;
            return;
        }
        else if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    
    public void delLast(){
        if(head==null ){
            head=null;
            return;
        }
        else if(head.next==null){
            head=null;
            return;
        }
        Node prev=head;
        Node curr=head.next;
        
        
        while(curr.next!=null){
            prev=prev.next;
            curr=curr.next;

    }
    prev.next=null;
}


    
    
    
    public static void main(String args[]) {
        Main list=new Main();
        
        
        list.addfirst(2);
        list.addfirst(1);
        list.addLast(3);
        list.addfirst(0);
        list.addfirst(-1);
        list.addLast(4);
        list.InsertAtPos(5,7);
        list.InsertAtPos(-2,0);
        
        list.printList();
        
        list.delLast();
        list.delLast();
        list.delFirst();
        list.printList();
        list.size();
        
    }
}
