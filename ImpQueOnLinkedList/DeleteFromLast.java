package ImpQueOnLinkedList;
import LinkedListOperatonsUsingCollectionFramework.LL;

class ListNode{
    int val;
    ListNode next;

    ListNode(){

    }
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class DeleteFromLast {
    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
       // int indexToSearch=size-n;
        ListNode prevNode=head;
        int i=1 ;
        while(i<size-n){
            prevNode=prevNode.next;
            i++;
        }
        prevNode.next=prevNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        // LL list=new LL();
        // list.addFirst("a");
        // list.addFirst("is");

        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

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

        // System.out.println(list.getSize()); 
       
    }
}

