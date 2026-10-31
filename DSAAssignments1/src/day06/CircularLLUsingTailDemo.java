package day06;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
}

 class CircularLLUsingTail{

	 Node tail;
	 public void insertAtBegining(int data) {
		 Node newNode=new Node(data);
		if(tail==null) {
			tail=newNode;
			tail.next=tail;
		}
		else {
			newNode.next=tail.next;
			tail.next=newNode;
			
		}

		
	 }

	 public void insertAtEnd(int data) {
		 Node newNode=new Node(data);
		if(tail==null) {
			tail=newNode;
			tail.next = tail;
		}
		else {
			newNode.next=tail.next;
			tail.next=newNode;
			tail=newNode;
		}
	 }
	 public void insertAtPosition(int data,int position) {
		 Node newNode=new Node(data);
		if(tail==null) {
			tail=newNode;
			tail.next=tail;
			return;
		}
		else if(position<0) { System.out.println("The position is Negative");	return;}
		else if(position==0) {
			 insertAtBegining(data);	
		}
		else {
			Node temp=tail.next;
			
			for (int i = 0; i < position-1; i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			
		}
		
		
	 }
	 
	 public int deleteAtBegining() {
		 int data=0;
	  if(tail==null) {
		  return -1;
	  }
	  else if(tail.next==tail) {
		data=tail.data;
		  tail=null;
		  return data;
	  }
	  else{
		  Node toBeDeleted= tail.next;
		   data=toBeDeleted.data;
			 tail.next=toBeDeleted.next;
			 return data; 
	  }

	 }
	 
	 public int deleteAtEnd() {
		 int data=0;
		 if(tail==null) {
			  return -1;
		  } 
		 else if(tail.next==tail) {
				data=tail.data;
				  tail=null;
				  return data;
			  }
		 else {
			 Node temp=tail;
			 data =tail.data;
			 
			 while(temp.next!=tail){
				temp=temp.next; 
			 }
			 temp.next=tail.next;
			 tail=temp;

				return data;
		 }
		
		 }
	 
	 public int deleteAtPosition(int position) {

		if(tail==null) {
			return -1;
		}
		else if(position<0) { System.out.println("The position is Negative");	return -1;}
		else if(position==0) {
			 return deleteAtBegining();
			
		}
	
		else {
			int data=0;
			//start at 0 th position
			Node temp=tail.next;
			//if tail 
			
			for (int i = 0; i < position-1; i++) {
				temp=temp.next;
			}
			if(temp.next==tail) {
				data=temp.next.data;
				temp.next=temp.next.next;
				tail=temp;
			}
			else {
				data=temp.next.data;
				temp.next=temp.next.next;
			}
			
		
			return data;
		}
	
		
	 }
	 
	 public void display() {
		 Node temp=tail.next;
		 System.out.println("hello");
		   do{
			 System.out.print(temp.data+" ");
				temp=temp.next; 
			 } while(temp!=tail.next);	 
		 }
}
 public class CircularLLUsingTailDemo {
	 public static void main(String[] args) {
		 CircularLLUsingTail c=new CircularLLUsingTail(); 
		 c.insertAtBegining(50);
		 c.insertAtBegining(40);
		 c.insertAtPosition(55,1);
		 c.insertAtPosition(100,0);
//		 c.insertAtEnd(10); 
//		 c.deleteAtBegining();
//		 c.deleteAtEnd();
//		 System.out.println("hi");
		 c.display();
	 }
 }