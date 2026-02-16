//time complexity O(n)
 //space complexity O(1)



class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // STEP 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // break list

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // STEP 3: Merge both halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
  