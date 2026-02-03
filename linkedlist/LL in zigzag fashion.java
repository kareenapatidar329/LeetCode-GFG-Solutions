//time complexity O(n)
//space complexity O(1)

class Solution {
    Node zigZag(Node head) {
        if (head == null || head.next == null) return head;

        boolean flag = true; // true => < expected, false => > expected
        Node curr = head;

        while (curr.next != null) {
            if (flag) {
                // curr < curr.next hona chahiye
                if (curr.data > curr.next.data) {
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                }
            } else {
                // curr > curr.next hona chahiye
                if (curr.data < curr.next.data) {
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                }
            }
            flag = !flag;
            curr = curr.next;
        }
        return head;
    }
}
