// Stack using Linked list

class Node
{
  int data;
  Node next;
    Node (int d)
  {
    data = d;
    next = null;
    }
}
public class Main
{
    Node head;
    int sz;
    Main(){
        head=null;
        sz=0;
    }
    
    int size(){
        return sz;
    }
    
    boolean isEmpty(){
        return head==null;
    }
    
    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        sz++;
    }
    
    int pop(){
        if(head==null)
            return Integer.MAX_VALUE;
        int res=head.data;
        head=head.next;
        return res;
    }
    int peek(){
        if(head==null)
            return Integer.MAX_VALUE;
        return head.data;
    }
    
    
    
	public static void main(String[] args) {
		Main list=new Main();
		list.push(1);
		list.push(2);
		list.push(3);
		list.pop();
		System.out.println(list.peek());
		
		
	}
}


