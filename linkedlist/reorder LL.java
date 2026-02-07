//time complexity O(n)
//space complexity O(1)


class Solution {
    void reorderlist(Node head) {
        // Your code here
        if(head==null || head.next==null)
        return;
        
        Node slow=head;
        Node fast= head;
        
        while(fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        Node prev = null;
        Node curr = slow.next;
        slow.next = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        Node first = head;
        Node second = prev;
        
        while(second != null){
            Node t1 = first.next;
            Node t2 = second.next;
            
            first.next = second;
            second.next = t1;
            
            first = t1;
            second = t2;
            
        }
        
    }
}