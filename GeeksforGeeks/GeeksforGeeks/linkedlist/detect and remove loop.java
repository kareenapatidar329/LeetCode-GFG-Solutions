//time complexity O(n)
//space complexity O(1)

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head == null || head.next == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        
        boolean loopExists = false;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loopExists = true;
                break;
            }
        }
        if (!loopExists){
            return;
        }
        
        slow = head;
        
        if (slow == fast){
            while (fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while (fast.next != slow.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}