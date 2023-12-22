public class InsertDataAt {
    // Implementation of LinkedList creation
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    // Implementation of Insertion of NOde at ending in LinkedList
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=new Node(newData);
            return;
        }

        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
// Implementation of display the data of LinkedList
    public void displayLL(){
        Node curr=head;
        while(curr.next != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.print(curr.data+" \n");
    }
    // implementation of Insertion at given position
    public void insertAt(int num){
        int count=1;
        Node newNode=new Node(num);
        Node temp=head;
        for(int i=1; temp.next!=null && i<num-1; i++){
            temp=temp.next;
            count++;
        }
        if(count != 1){
            Node curr=temp.next;
            temp.next=newNode;
            newNode.next=curr;
        }
    }
    public static void main(String[] args) {
        InsertDataAt llist=new InsertDataAt();
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(5);
        llist.insertAtEnd(6);
        System.out.println("Before Inserting at position '3'");
        llist.displayLL();
        System.out.println("After Inserting at position '3'");
        llist.insertAt(3);
        llist.displayLL();
    }
}