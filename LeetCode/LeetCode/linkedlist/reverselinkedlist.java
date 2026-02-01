//time complexity O(n)
 //space complexity O(1)
 
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;        // previous node
        ListNode curr = head;        // current node
 
 
        while (curr != null) {
            ListNode nextNode = curr.next; // save next node
            curr.next = prev;              // reverse link
            prev = curr;                   // move prev forward
            curr = nextNode;               // move curr forward
        }

        return prev; 
    }
}