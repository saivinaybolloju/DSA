class Solution {
    public ListNode oddEvenList(ListNode head) {
       ListNode odd=new ListNode(-1);
       ListNode even=new ListNode(-1);
       ListNode oddp=odd;
       ListNode evenp=even;
       int count=0;
       while(head!=null){
        if((count&1)==0){
            oddp.next=head;
            head=head.next;
            oddp=oddp.next;
            count++;
        }
        else{
            evenp.next=head;
            head=head.next;
            evenp=evenp.next;
            count++;
        }
       }
       evenp.next=null;
       oddp.next=even.next;
       return odd.next;      
    
    }
}
