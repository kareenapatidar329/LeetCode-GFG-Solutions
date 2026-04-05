//time complexity O(n)
//space complexity O(1)

class Solution {
    public Node reverse(Node head) {
        // code here
        if (head == null || head.next == null){
            return head;
        }
        Node rec = reverse(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        return rec;
    }
}