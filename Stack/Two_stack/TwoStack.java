class TwoStack{
	int arr[];
	int cap;
	int top1;
	int top2;

	TwoStack(int n){
		cap=n;
		top1=-1;
		top2=-1;
		arr=new int[cap];

	}

	void push1(int x){
		top1++;
		arr[top1]=x;

	}

	void push2(int x){
		top2++;
		arr[top2]=x;


	}

	int pop1(){
		int y=arr[top1];
		top1--;
		return y;


	}

	int pop2(){
		int y=arr[top2];
		top2--;
		return y;

	}
	int size1(){
		return top1++;

	}
	int size2(){
		return top2++;

	}


	public static void main(String[] args){
		TwoStack stack1=new TwoStack(5);
		stack1.push1(1);
		stack1.push2(2);
		stack1.push1(3);
		stack1.push2(4);
		stack1.push1(5);
			
		System.out.println(stack1.pop1());
		System.out.println(stack1.pop2());


		


	}





	
}
