/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode midLL(ListNode head){
        if(head.next==null){return head;}
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseLL(ListNode mid){
        ListNode prev=null;
        ListNode currentNode=mid;
        ListNode nextNode;
        while(currentNode!=null){
            nextNode=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=nextNode;
        }
        return prev;
    }
    public boolean checkLLs(ListNode head1, ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
            
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode midNode =midLL(head);
        ListNode midNodeAtrRev=reverseLL(midNode);
        return (checkLLs(head,midNodeAtrRev));
    }
}
