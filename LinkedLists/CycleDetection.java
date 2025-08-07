//https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem

public static boolean hasCycle(SinglyLinkedListNode head) {
         SinglyLinkedListNode slow=head;
        SinglyLinkedListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
