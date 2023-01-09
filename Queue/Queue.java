class Queue{
	int size,cap;
	int[] arr;

	Queue(int c){
		cap=c;
		size=0;
		arr=new int[cap];
	}
	void enque(int x){
		if(isFull()){
			return;
		}
		arr[size]=x;
		size++;


	}

	void deque(){
		if(isEmpty()){
			return;
		}

		for(int i=0;i<size-1;i++){
			arr[i]=arr[i+1];
		}

		size--;

		


	}

	int getFront(){
		if(isEmpty()){
			return -1;
		}

		else {
			return 0;
		}
	}

	int getRear(){
		if(isEmpty()){
			return -1;
		}

		else{
			return size-1;
		}

	}

	boolean isFull(){
		return size==cap;

	}

	boolean isEmpty(){
		return size==0;

	}

	int size(){
		return size;

	}

	public static void main(String args[]){
		Queue q=new Queue(5);
		q.enque(1);
		q.enque(2);
		q.enque(5);
		q.enque(3);
		q.enque(6);

		System.out.println(q.getRear());

		System.out.println(q.getFront());

		System.out.println(q.isEmpty());
		System.out.println(q.isFull());

		System.out.println(q.size());


	}

}
