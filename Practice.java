public class Practice {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertionAtEnd(int newData){
        Node newNode=new Node(newData);

        if(head==null){
            head=new Node(newData);
            return;
        }

        newNode.next=null;
        Node current=head;
        while(current.next != null){
            current=current.next;
        }
        current.next=newNode;
        return;
    }

    public void displayLL(){
        Node temp=head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+" \n");
    }
    // Implemetation of Reversal of LinkedList
    public void reverseIterative(){
        Node curr=head;
        Node nextPtr=null;
        Node prevPtr=null;
        while(curr != null){
            nextPtr=curr.next;
            curr.next=prevPtr;

            prevPtr=curr;
            curr=nextPtr;
        }
        head=prevPtr;
        return;
    }
    public static void main(String[] args) {
        Practice list=new Practice();
        list.insertionAtEnd(1);
        list.insertionAtEnd(2);
        list.insertionAtEnd(3);
        list.insertionAtEnd(4);

        list.displayLL();

        list.reverseIterative();
        list.displayLL();
    }
}
