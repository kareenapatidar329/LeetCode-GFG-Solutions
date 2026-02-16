//time complexity O(1)
//space complexity O(1)

class Solution {
    public void deleteNode(Node del_node) {
        // code here
        if (del_node == null || del_node.next == null) {
            // can't delete if node is null or last node
            return;
        }

        // Copy next node's value into current node
        del_node.data = del_node.next.data;

        // Bypass the next node
        del_node.next = del_node.next.next;
    }
}