*/
//time complexity O(n+m)
//space complexity O(1)
class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
    int length1 = length(head1);
    int length2 = length(head2);
    Node curr1 = head1;
    Node curr2 = head2;
    while(length1 != length2){
        if(length1>length2){
            curr1 = curr1.next;
            length1--;
        }else{
            curr2 = curr2.next;
            length2--;
        }
    }
    while(curr1 != null && curr2 != null){
        if (curr1==curr2){
            return curr1;
        }
        curr1 = curr1.next;
        curr2 = curr2.next;
    }
    return null;
    }
    public static int length(Node head){
        int l=1;
        Node curr=head;
        while(curr != null){
            curr=curr.next;
            l++;
        }
        return l;
    }
}