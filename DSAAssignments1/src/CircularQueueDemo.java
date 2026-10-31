
 class CircularQueueByUsingArray {

	int front;
	int rear;
	int[] arr;
	int maxSize;
	
	public CircularQueueByUsingArray(int size) {
		arr=new int[size];
		 front=0;
		 rear=-1;
		maxSize=size;
	}
	//adding ele. to the end---> REAR-->enqueue
	public void enqueue(int data) {
	 rear=(rear+1) % maxSize;
	 arr[rear]=data;
	}
	//removing ele. from the start and return it ---> FRONT-->dequeue
	public int dequeue() {
	
		 front=(front+1) % maxSize;
		return arr[front];
	}
	//peek() from FRONT
	public int peek(int data) {
		return arr[front];
	}
}
 public class CircularQueueDemo{
		public static void main(String[] args) {
			CircularQueueByUsingArray q=new CircularQueueByUsingArray(5);
			
			q.enqueue(11);
			q.enqueue(90);
			System.out.println(	q.dequeue());
			
		}
	
		
}