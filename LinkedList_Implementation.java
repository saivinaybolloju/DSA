class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList {
    int size;
    Node head;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    public int get(int index) {
        if(index<0 || index>=size)   return -1;
        if(head==null)  return 0;
        int i=0;
        Node temp=head;
        while(temp!=null && i<index){
            temp=temp.next;
            i++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null || size==0){
            head=newNode;
            size++;
            return ;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null || size==0){
            head=newNode;
            size++;
            return ;
        }
        int i=0;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        temp.next=newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>size){return;}
        if(index==0||head==null){
            addAtHead(val);
            return;
        }
        int i=0;
        Node temp=head;
        while(temp.next!=null&& i<index-1){
            temp=temp.next;
            i++;
        }
        Node newNode=new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if((head==null)||index<0||index>=size){return;}
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        int i=0;
        Node temp=head;
        while(temp.next!=null&& i<index-1){
            temp=temp.next;
            i++;
        }
        // if(temp.next==null){return;}
        temp.next=temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
