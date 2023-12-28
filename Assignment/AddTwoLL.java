public class AddTwoLL {
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
    public Node reverseLL(Node startPtr){
        Node curr=startPtr;
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
    // implementation of addition of two input numbers of ll
    public Node sumOfTwoLL(Node list1, Node list2){
        Node first=reverseLL(list1);
        Node second=reverseLL(list2);

        Node dummy=new Node(0);
        Node temp=dummy;

        // int sum=0;
        int carry=0;

        while(first!=null || second!=null || carry==1){
            int sum=0;
            if(first!=null){
                sum+=first.data;
                first=first.next;
            }
            else if(second!=null){
                sum+=second.data;
                second=second.next;
            }
            sum+=carry;
            carry=sum%10;

            Node newNode=new Node(sum%10);
            temp=newNode;
            temp=temp.next;
        }

        return dummy ;
    }
    public static void main(String[] args) {
        AddTwoLL llist1=new AddTwoLL();
        AddTwoLL llist2=new AddTwoLL();
        llist1.insertAtEnd(5);
        llist1.insertAtEnd(6);
        llist1.insertAtEnd(3);

        llist2.insertAtEnd(8);
        llist2.insertAtEnd(4);
        llist2.insertAtEnd(2);

        llist1.display();
        llist2.display();

        Node result=llist1.sumOfTwoLL(llist1, llist2);
    }
}
