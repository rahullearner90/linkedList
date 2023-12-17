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
        System.out.print(temp.data+" ");
    }
    public static void main(String[] args) {
        Practice list=new Practice();
        list.insertionAtEnd(3);
        list.insertionAtEnd(6);
        list.insertionAtEnd(9);

        list.displayLL();
    }
}
