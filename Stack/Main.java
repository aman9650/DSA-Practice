// Stack using Arrays
public class Main
{
    int arr[];
    int cap;
    int top;
    
    Main(int c){
        top=-1;
        cap=c;
        arr=new int[cap];
    }
    
    void push(int x){
        if(top==cap-1){
            System.out.println("Stack OverFlow");
        }
        top++;
        arr[top]=x;
    }
    int pop(){
        if(top==-1){
        System.out.println("satck underFlow");
        }
        int res=arr[top];
        top--;
        return arr[top];
    }
    
    int peek(){
        if(top==-1){
        System.out.println("satck underFlow");
        }
        return arr[top];
    }
    int size(){
        return top++;
    }
    boolean isEmpty(){
        return top==-1;
    }
    
    
    
    
	public static void main(String[] args) {
		Main s=new Main(5);
		s.push(4);
		System.out.println(s.peek());
		
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		
	}
}
