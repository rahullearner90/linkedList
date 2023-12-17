public class Practice2 {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data=d;
            next=null;
        }
    }
    // insertion of node at end
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        newNode.next=null;

        // if ll is empty
        if(head==null){
            head=newNode;
            return;
        }
        // if ll is not empty
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    // implementation of insertion of node at beginning
    public void insertAtBeginning(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
// Displaying LinkedList
    public void displayLL(){
        Node current=head;
        while(current.next != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(current.data+"\n");
    }
    public static void main(String[] args) {
        Practice2 llist=new Practice2();

        llist.insertAtEnd(5);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);
        llist.insertAtEnd(20);

        llist.displayLL();

        System.out.println("After insertion of 50");
        llist.insertAtEnd(50);
        llist.displayLL();

        llist.insertAtBeginning(2);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(0);
        llist.displayLL();
    }
}
