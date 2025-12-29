//time complexity O(n)
//space complexity O(n)

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        if(head == null) return null;
        
        HashSet <Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            if(seen.contains(curr.data)){
                prev.next = curr.next;
            }else{
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}