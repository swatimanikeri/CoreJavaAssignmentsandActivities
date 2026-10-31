package Day07;



class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}


class LinkedList{
    Node head;
    public void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null)  head=newNode;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

//    public void reverseMe(LinkedList list){
////        if(temp==null) return;
////        reverseMe(list);
//
//        //kk
//        Node curr=head;
//        Node prev=null;
//        while(){
//        Node next=curr.next;
//        curr.next=prev;
//
//        prev=curr;
//        curr=next;
//
//        }
//
//    }
//    reverse(this.LinkedList,Node head);

//  1  2 3 4 5 6 7
//  0  1 2 3 4 5 6
//
//public Node reverseMe2(LinkedList list,Node temp){
//    if(temp.next==null) return temp;
////temp means last index ie 7,return 7 ,i want to 7.next=temp  ok
//    // Node swati=reverseMe(list,temp.next);
//    //temp.next=swati
//    //return temp;
//    temp.next.next=temp;
//     return  reverseMe2(list,temp.next);
//    }
    
    public Node reverseMe2(LinkedList list,Node temp){
        if(temp.next==null) return temp;
        System.out.println("inside reverse me 2 head data is this "+temp.data);
        System.out.println("inside linked reverseMe2");
    //temp means last index ie 7,return 7 ,i want to 7.next=temp  ok
         Node swati=reverseMe2(list,temp.next);
        swati.next=temp;
        return swati;
//        temp.next.next=temp;
//         return  reverseMe2(list,temp.next);
        }

    public void reverseMe(LinkedList list){
    	   System.out.println("inside reverse Me");
        Node p=reverseMe2(list,head);
     
        System.out.println(head.data);
        System.out.println("Helllllllo");
        System.out.println(p.data);
        //only returning head value 
        
    }

}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
//        list.insertAtLast(12);
        list.insertAtLast(88);
        list.insertAtLast(44);
        list.insertAtLast(87);

        list.display();
        list.reverseMe(list);
//        list.reverseMe();

//        list.display();
    }
}

