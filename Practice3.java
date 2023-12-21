class Practice3{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    // implementation of insertion of node at End
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        
        // if Node is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        
        newNode.next=null;
        // if Node is not empty
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    // displaying the arrayList
    public void displayLL(){
        Node current=head;
        while(current.next != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(current.data+" \n");
    }

    // implementation of insertion of node at beginning
    public void insertAtBeginning(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    // implementation of insertion of Node After a Node
    public void insertAfterNode(Node pre_node,int newData){
        if(pre_node==null){
            System.out.println("Previous Node cannot contain null values.");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=pre_node.next;
        pre_node.next=newNode;
    }

    // implementation of Deletion of Node At any Position
    void delete(int position){
        // if linked list is empty
        if(head==null){
            return;
        }

        Node temp=head;
        // Deletion is in the beginning of the Node
        if(position==0){
            head=temp.next;
            return;
        }

        // Deletion is not in the beginning of the Node
        for(int i=0; temp!=null && i<position-1; i++){
            temp=temp.next;
        }

        if(temp==null && temp.next.next==null){
            return;
        }
        temp.next=temp.next.next;
        return;
    }
    // implementation of Reversal of a Node in a Linked List
    public void reverseLL(){
        Node current=head;
        Node prePtr=null;
        Node nextPtr=null;

        while(current != null){
            nextPtr=current.next;
            current.next=prePtr;
            prePtr=current;
            current=nextPtr;
        }
        head=prePtr;
        return;
    }
    // Implementation Using Recursion in LinkedList
    public void reverseRec(Node curr, Node pre){
        // Last Node of Linked List
        if(curr.next==null){
            head=curr;
            curr.next=pre;
            return;
        }

        Node nextPtr=curr.next;
        curr.next=pre;
        // Recursive Function call
        reverseRec(nextPtr, curr);
    }

    public static void main(String[] args) {
        Practice3 llist=new Practice3();
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtEnd(4);
        llist.insertAtEnd(5);

        llist.displayLL();
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(0);

        llist.insertAfterNode(llist.head.next.next, 99);
        llist.displayLL();

        System.out.println("Deletion operation :");
        llist.delete(2);
        llist.displayLL();

        System.out.println("Reversal Operation :");
        // Through Iterative approach
        // llist.reverseLL();

        // Through Recursion
        llist.reverseRec(llist.head,null);
        
        llist.displayLL();
    }
}