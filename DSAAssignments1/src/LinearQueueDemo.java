
 class LinearQueueByUsingArray {

	int front;
	int rear;
	int[] arr;
	int maxSize;
	
	public LinearQueueByUsingArray(int size) {
		arr=new int[size];
		 front=0;
		 rear=-1;
		maxSize=size;
	}
	//adding ele. to the end---> REAR-->enqueue
	public void enqueue(int data) {
	 rear++;
		arr[rear]=data;
	}
	//removing ele. from the start and return it ---> FRONT-->dequeue
	public int dequeue() {
		return arr[front++];
	}
	 
	//peek() from FRONT
	public int peek(int data) {
		return arr[front];
	}
}
 public class LinearQueueDemo{
		public static void main(String[] args) {
			LinearQueueByUsingArray q=new LinearQueueByUsingArray(5);
			
			q.enqueue(11);
			q.enqueue(90);
			System.out.println(	q.dequeue());
			
		}
	
		
}