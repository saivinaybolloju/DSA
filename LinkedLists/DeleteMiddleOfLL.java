//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)  return null;
        if(head.next==null) return null;
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
