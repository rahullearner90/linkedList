public class Pallindrome {
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
    // Implementation of display for own checking reverse linked list
    public void display(Node lisNode){
        Node temp=lisNode;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    // implementation of findinin mid of the linked list
    public Node findMid(Node head){
        
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
    // implementation of reversal of linked list
    public Node reverseLL(Node mid){
        Node curr=mid;
        Node prev=null;
        Node nextPtr=null;
        while(curr != null){
            nextPtr=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=nextPtr;
        }
        return prev;
    }
    // Implementation of Pallindrome function
    public boolean findPallindrome(Node head){

        if(head==null || head.next==null || head.next.next==null){
            return false;
        }

        Node mid=findMid(head);
        Node last=reverseLL(mid);

        while(last.next!=null && head.next!=null){
            if(head.data!=last.data){
                return false;
            }
            last=last.next;
            head=head.next;
        }

        return true;
    }
    public static void main(String[] args) {
        Pallindrome llist=new Pallindrome();
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(2);
        llist.insertAtEnd(1);
        
        llist.display();

        boolean result=llist.findPallindrome(llist.head);
        System.out.println(result);

    }
}
