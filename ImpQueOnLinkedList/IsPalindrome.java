package ImpQueOnLinkedList;
import java.util.List;

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
public class IsPalindrome {
    public ListNode reverse(ListNode head){
        ListNode prevNode=null;
        ListNode currNode=head;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public ListNode findMiddle(ListNode head){
        ListNode hare=head;
        ListNode turtle=head;

        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(ListNode head){
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findMiddle(head);
        ListNode secondHalfStart=reverse(middle);

        ListNode firstHalfSatrt=head;
        while(secondHalfStart!=null){
            if(firstHalfSatrt.val!=secondHalfStart.val){
                return false;
            }
            firstHalfSatrt=firstHalfSatrt.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
}