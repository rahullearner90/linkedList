import java.util.Scanner;

class PresentOrNot{
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

// Implementation of Finding data in LinkedList(Feature for first assignment question)
    public int findDataX(int x){
        Node y=head;
        int flage=0;
        while(y.next != null){
            if(y.data==x){
                flage=1;
                return flage;
            }
            y=y.next;
        }
        if(y.data==x){
            flage=1;
            return flage;
        }
        return flage;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=1;
        PresentOrNot llist1=new PresentOrNot();
        llist1.insertAtEnd(14);
        llist1.insertAtEnd(21);
        llist1.insertAtEnd(11);
        llist1.insertAtEnd(30);
        llist1.insertAtEnd(10);
        llist1.displayLL();


        while(flag==1){
            System.out.print("Enter the number to find :");
            int x=sc.nextInt();
    
            int flage=llist1.findDataX(x);
            if(flage != 0){
                System.out.println("Yes\n"+x+" is present in the linked list.");
            }else{
                System.out.println("No\n"+x+" is not present in the linked list.");
            }
    
            System.out.println("Enter '1' for continue search.");
            flag=sc.nextInt();
        }

    }
}