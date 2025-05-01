public class Solution {
    public int LengthOfLL(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    public ListNode findIntersectionVal(ListNode headA, ListNode headB, int L1len, int L2len){
        if(L2len>L1len){
           return findIntersectionVal(headB,headA,L2len,L1len);
        }
        int diff=L1len-L2len;
        ListNode temp=headA;
        while(diff>0){
            temp=temp.next;
            diff--;
        }
        while(temp!=null&&headB!=null){
            if(temp==headB){
                return temp;
            }
            temp=temp.next;
            headB=headB.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int L1len=LengthOfLL(headA);
        int L2len=LengthOfLL(headB);
        return (findIntersectionVal(headA,headB,L1len,L2len));
    }
}
