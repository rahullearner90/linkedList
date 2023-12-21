class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    // implementation of insertion of a node at the end
    public void insertionAtEnd(int newData){
        Node newNode=new Node(newData);

        // linkedList is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        // linkedList is not empty
        newNode.next=null;
        Node current=head;
        while(current.next != null){
            current = current.next;
        }

        current.next=newNode;
        return;
    }
    // implementation of displaying linkedList
    public void displayLL(){
        Node temp=head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+" ");
    }
    // Implementation of Reversal of linkedList
    public void reverseLL(){
        Node curr=head;
        Node nextPtr=null;
        Node prev=null;
        while(curr != null){
            nextPtr=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextPtr;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertionAtEnd(2);
        list.insertionAtEnd(4);
        list.insertionAtEnd(8);

        System.out.println("Before Insertion of 10");
        list.displayLL();
        System.out.println();

        list.insertionAtEnd(10);
        System.out.println("After Insertion of 10");
        list.displayLL();
        System.out.println();

        System.out.println("Reversal of the LinkedList");
        list.reverseLL();
        list.displayLL();
    }
}