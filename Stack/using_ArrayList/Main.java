// Stack using ArrayList
import java.util.*;
import java.util.EmptyStackException
public class Main
{
    ArrayList <Integer> al=new ArrayList<>();
    
    void push(int x){
        
        al.add(x);
    }
    int pop(){
        
        int res=al.get(al.size()-1);
        return res;
    }
    
    int peek(){
        
        return al.get(al.size()-1);
    }
    
    int size(){
        return al.size();
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    
    
    
    
	public static void main(String[] args) {
		Main s=new Main();
		s.push(4);
		System.out.println(s.peek());
		
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		
	}
}
