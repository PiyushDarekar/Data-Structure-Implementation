package ImpQueOnLinkedList;
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
    
public class HasCycle {
    public boolean hasCycle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode hare=head;      //fast
        ListNode turtle=head;    //slow 

        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
}
