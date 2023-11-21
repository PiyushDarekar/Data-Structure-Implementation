package LinkedListOperations;


//import java.util.Currency;

class LL{
    Node head;
    private int size;

    LL(){
        this.size=0;
    }

     class Node{
        String data;
        Node next;

         Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //Add at first position
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Add at last position
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
         Node newNode =head;
         while(newNode!=null){
            System.out.print(newNode.data+"-->");
            newNode=newNode.next;
         }
         System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }

    public void reverseIterator(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    //same method as above
    public Node reverse(Node head){
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public int getSize(){
        return size;
    }


        public static void main(String[] args) {
            LL list=new LL();
            list.addFirst("a");
            list.addFirst("is");

            list.printList();

            list.addLast("list");
            list.printList();

            list.addFirst("this");
            list.printList();

            // list.deleteFirst();
            // System.out.println("After deleting first element");
            // list.printList();

            // list.deleteLast();
            // System.out.println("After deleting last node");
            // list.printList();

            // list.reverseIterator();
            // System.out.println("List after reversing");
            // list.printList();
            
            // list.head=list.reverseRecursive(list.head);
            // System.out.println("Reverse Linked List using recursion");
            // list.printList();

            list.head=list.reverse(list.head);
            System.out.println("Reverse Linked List using another method");
            list.printList();

            System.out.println(list.getSize());   
        }
}