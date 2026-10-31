package day06;

import day06.Stack.Node;

class Queue{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	Node front;
	Node rear;
	
	public void enqueue(int data) {
		Node newNode=new Node(data);
		//WHEN REAR=FRONT=NULL ---> EMPTY
		if(rear==null)
			{
			front=newNode;
			rear=newNode;
			}
//		else if(front ==rear)
		rear.next=newNode;
		newNode.next=null;
		rear=newNode;
	}
	public int dequeue() {
	
		//in case of EMPTY Q
		//FRONT =NULL AND REAR!=NULL --->> SOMETHIGS ARE IN LL (Q)
		//WHEN REAR =NULL -------->> FRONT SHOULD BE NULL
		//REAR=NULL MEANS EMPTY
		if( rear==null) return -1;
		////IN CASE OF 1 ELE.
		else if(front==null && rear!=null) {

			return rear.data;
		}
		
		int data=front.data;
		front=front.next;
		return data;
	}
	public void display() {
      Node temp=front;
      System.out.println("The Queue elements are: ");
      while(front!=null) {
  
    	  System.out.print(front.data+" ");
    	  front=front.next;
      }
		
	}
	}

public class QueueUsingLL {
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		//10 20
//		queue.dequeue();
		queue.display();
	}
}
