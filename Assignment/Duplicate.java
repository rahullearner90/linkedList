public class Duplicate {
    // Implementation of Creation of Linked List
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    // Implementation of insertion of Node At Ending of Linked List
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    // Implementation of display function to disp data
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    // Implementation of Removing duplicate of the linked list
    public void removeDupli(){
        if(head==null){
            return;
        }
        Node curr=head;
        Node prev=null;
        while(curr.next != null){
            if((curr.data==curr.next.data) && curr.next.next!=null){
                curr.next=curr.next.next;
            }
            prev=curr;
            curr=curr.next;
        }
        if(prev.data == curr.data){
            prev.next=null;
        }       
    }

    public static void main(String[] args) {
        Duplicate llist=new Duplicate();
        llist.insertAtEnd(1);
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtEnd(3);

        llist.display();

        System.out.println("After Removing Duplicate from linked list :");
        llist.removeDupli();
        llist.display();
    }
}