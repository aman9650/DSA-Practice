package Data_Structures;




public class LL {
   
    Node head;
    private  int size;
    LL(){
        this.size=0;
    }
    
    class Node{
        String data; //data to be stored
        Node next; //pointer or next node

        Node(String data){ //constructor
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add operation- first
    public void addFirst(String data){
        Node newNode=new Node(data);
        
        if(head==null){ //if linkedlist doesn't exist or head is null
            head=newNode;  // adding new node to head
            return;
  
        }
        newNode.next=head; //if a linkedlist is already exist then add head to next or pointer
        head=newNode; // now head becomes new node
    }
     //add operation-Last

    public void addLast(String data){
        Node newNode=new Node(data);
        
        if(head==null){ //if linkedlist doesn't exist or head is null
            head=newNode;  // adding new node to head
            return;

        }

        Node currNode=head;
        while(currNode.next!=null){ //we used loop until next or pointer become null for last pointer
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }


    //Print 
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){ 
            System.out.print(currNode.data +"->");//we used loop until next or pointer become null for last pointer
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    //Delete First
    public void delFirst(){
        if(head==null){  //if list is empty
            System.out.println("List id empty");
            return;
        }
        size--;
        head=head.next; //if list is not empty then head will become next i.e second node and first will auromatically delete
    }

    //delete last
    public void delLast(){
        if(head==null){  //if list is empty
            System.out.println("List id empty");
            return;
        }

        size--;
        // if head.next is already null or list has only one node
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head; // starts from head
        Node lastNode=head.next;// starts from second node
        while(lastNode.next!=null){ // this loop for lastNode  will run from second node to last node
            lastNode=lastNode.next;
            secondLast=secondLast.next; // this loop for SecondNode  will run from Head to Second last node
        }
        secondLast.next=null;

    }

    public int getSize(){
        return size;
    }


    public void reverseIterate(){
        if(head==null || head.next== null){
            
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
       

        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prevNode;


    }


    public static void main(String[] args) {

        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();
        list.delFirst();
        list.printList();
        System.out.println(list.getSize());

        list.addFirst("Aman");
        System.out.println(list.getSize());
        list.printList();

        list.reverseIterate();
        




        
    }
}
