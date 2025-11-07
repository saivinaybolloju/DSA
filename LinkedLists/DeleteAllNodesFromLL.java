//https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/

class Solution {
    ListNode deleteAllFromLL(HashSet<Integer> hs, ListNode head){
        while(head!=null&&hs.contains(head.val)){
            head=head.next;
        }
        ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(hs.contains(curr.next.val)){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums) hs.add(i);
        return deleteAllFromLL(hs,head);
    }
}
