//time complexty O(n)
//space complexity O(n)
class Solution {
    Node compute(Node head) {
        // your code here
        if(head == null || head.next == null){
            return head;
        }
        Node re = reverse(head);
        Node prev=null;
        Node curr=re;
        int max = curr.data;
        while(curr != null){
            if(max>curr.data){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                max=Math.max(max,curr.data);
                prev=curr;
                curr=curr.next;
            }
        }
        return reverse(re);
    }
    public Node reverse(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node temp=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}