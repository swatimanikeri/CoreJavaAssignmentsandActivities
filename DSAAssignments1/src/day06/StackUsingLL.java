package day06;
class Stack{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	Node top;
	
	//to add ele. at start of LL [i.e to push]
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
	}
	//to remove  ele. from  start of LL [i.e to pop]
	public void pop() {
		Node temp=top;
		top=top.next;
		
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class StackUsingLL {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		System.out.println("After poppig the ele.");
		stack.pop();
		stack.display();
		
	}
	
}
